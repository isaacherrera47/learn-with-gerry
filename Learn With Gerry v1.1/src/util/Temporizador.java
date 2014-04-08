package util;


import javax.swing.JLabel;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Isaac
 */
public class Temporizador implements Runnable {
   
    int tipoTemp;// 1 es normal , 2 es regresivo
    boolean cronometroActivo;
    Integer minutos;
    Integer segundos;
    JLabel etiqueta;
    JProgressBar barra;
    int bonos, penalizaciones;
    final int TIPO_CONTEO; // Establece el tipo de conteo (Progressbar{2} o Label{1})

    public int getBonos() {
        return bonos;
    }

    public void setBonos(int bonos) {
        this.bonos = bonos;
    }

    public int getPenalizaciones() {
        return penalizaciones;
    }

    public void setPenalizaciones(int penalizaciones) {
        this.penalizaciones = penalizaciones;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    /**
     *
     * @return 1 - Para tipo normal , 2 para regresivo
     */
    public int getTipoTemp() {
        return tipoTemp;
    }
    

    /**
     * Obtiene el estado del cronometro.
     * @return boolean - true o false
     */
    public boolean isCronometroActivo() {
        return cronometroActivo;
    }

    /**
     * Modificador del estado del cronometro
     * @param cronometroActivo Estado del cronometro
     */
    public void setCronometroActivo(boolean cronometroActivo) {
        this.cronometroActivo = cronometroActivo;
    }

    /**
     * Temporizador reflejado en JLabel
     * @param et  Etiqueta donde se refleja el estado del temporizador
     * @param tipo  1 es normal , 2 temporizador regresivo
     * @param minutos  Establece los minutos para el temporizador (en tipo normal los valores son 0)
     * @param segundos  Establece los segundos para el temporizador (en tipo normal los valores son 0)
     */
    public Temporizador(JLabel et, int tipo, Integer minutos, Integer segundos) {
        etiqueta = et;
        tipoTemp = tipo;
        this.minutos = minutos;
        this.segundos = segundos;
        TIPO_CONTEO = 1;
        bonos= 0;
        penalizaciones =0;
    }

    /**
     *  Temporizador reflejado en JProgressbar
     * @param bar JProgressbar donde se refleja el estado del temporizador
     * @param tipo Sólo aplica el 2 -- regresivo -- 
     * @param minutos Establece los minutos para el temporizador
     * @param segundos Establece los segundos para el temporizador
     */
    public Temporizador(JProgressBar bar, int tipo, Integer minutos, Integer segundos) {
        barra = bar;
        tipoTemp = tipo;
        this.minutos = minutos;
        this.segundos = segundos;
        TIPO_CONTEO = 2;
        bonos=0;
        penalizaciones=0;
    }

    private void cuentaRegresiva() throws InterruptedException {
        if (minutos == 0) {
            switch (TIPO_CONTEO) {
                case 1:
                    etiqueta.setText(segundos.toString());
                    while (cronometroActivo) {
                        Thread.sleep(1000);
                        segundos--;
                        etiqueta.setText(segundos.toString());
                        if (segundos <= 0) {
                            etiqueta.setText("0");
                            cronometroActivo = false;
                        }
                    }
                    break;
                case 2:
                    barra.setMaximum(segundos);
                    barra.setValue(segundos);
                    barra.setMinimum(0);
                    while (cronometroActivo) {
                        Thread.sleep(1000);
                        segundos--;
                        barra.setValue(segundos);
                        if (segundos <= 1) {
                            cronometroActivo = false;
                        }
                    }
                    break;
            }
        } else {
            switch (TIPO_CONTEO) {
                case 1:
                    etiqueta.setText(minutos.toString() + "." + segundos.toString());
                    while (cronometroActivo) {
                        Thread.sleep(1000);
                        if (segundos <= 0) {
                            segundos = 59;
                            minutos--;
                        }
                        segundos--;
                        etiqueta.setText(minutos.toString() + "." + segundos.toString());
                        if (minutos <= 0 && segundos <= 0) {
                            etiqueta.setText("0.0");
                            cronometroActivo = false;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i <= minutos; i++) {
                        segundos += 60;
                    }
                    barra.setMaximum(segundos);
                    barra.setMinimum(0);
                    barra.setValue(segundos);
                    while (cronometroActivo) {
                        Thread.sleep(1000);
                        segundos--;
                        barra.setValue(segundos);
                        if (segundos <= 0) {
                            cronometroActivo = false;
                        }
                    }
                    break;
            }
        }
    }

    private void conteoNormal() throws InterruptedException {
        minutos = 0;
        segundos = 0;
        etiqueta.setText("0:00");
        while (cronometroActivo) {
            segundos++;
            Thread.sleep(1000);
            if (segundos < 10) {
                etiqueta.setText(minutos.toString() + ":0" + segundos.toString());
            } else {
                etiqueta.setText(minutos.toString() + ":" + segundos.toString());
            }
            if (segundos >= 59) {
                minutos++;
                segundos = 0;
            }
        }
    }

    @Override
    public void run() {
        switch (tipoTemp) {
            case 1:
                try {
                    conteoNormal();
                } catch (InterruptedException ex) {
                    System.out.println("No se pudo completar la accion de temporizador");
                }
                break;
            case 2:
                try {
                    cuentaRegresiva();
                } catch (InterruptedException ex) {
                    System.out.println("No se pudo completar la operacion de temporizador");
                }
                break;
        }
    }

    /**
     *  Añade una bonificación al juego implementado
     * @param bonificacion en segundos
     */
    public synchronized void agregarBonificacion(int bonificacion) {
        if (tipoTemp == 2) {
            switch (TIPO_CONTEO) {
                case 1:
                    segundos += bonificacion;
                    if(segundos >=60){
                        int tempbon= segundos-60;
                        segundos = tempbon;
                        minutos++;                        
                    }
                    bonos++;
                    break;
                case 2:
                    segundos += bonificacion;
                    barra.setValue(segundos);
                    barra.setMaximum(barra.getMaximum() + bonificacion);
                    bonos++;
                    break;
            }
        } else {
            if (segundos < bonificacion) {
                int penTemp = bonificacion;
                penTemp -= segundos;
                segundos = 60 - penTemp;
                minutos--;
                bonos++;
            } else {
                segundos -= bonificacion;
                bonos++;
            }
        }

    }

    /**
     * Añade una penalización en el juego implementado
     * @param penalizacion en segundos
     */
    public synchronized void agregarPenalizacion(int penalizacion) {
        if (tipoTemp == 2) {
            switch (TIPO_CONTEO) {
                case 1:
                    segundos -= penalizacion;
                    penalizaciones++;
                    break;
                case 2:
                    segundos -= penalizacion;
                    barra.setValue(segundos);
                    penalizaciones++;
                    break;
            }
        } else {
            segundos += penalizacion;
            penalizaciones++;
        }
    }

    public void iniciarCronometro() {
        Thread t;
        t = new Thread(this);      
        cronometroActivo = true;
        t.start();
    }
    
    public void detenerCronometro(){
        cronometroActivo = false;
    }

}

