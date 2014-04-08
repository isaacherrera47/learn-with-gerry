package juegos.primero;

import clases.PerfilCarga;
import util.Jugable;
import util.Memorizable;
import static util.Memorizable.seleccionados;
import static util.Memorizable.todos;
import static util.Memorizable.todos2;
import extras.PanelCarta;
import extras.PopupLogro;
import util.Temporizador;
import util.UtilVentana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import util.ColorFondo;
import util.UtilLogro;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class Memorama extends javax.swing.JFrame implements Memorizable, Jugable {

    public Memorama(String tipo) {
        initComponents();
        extras = new UtilVentana(this);
        tm = new Temporizador(pbTiempo, 2, 1, 20);
        agregarPaneles(tipo);
        hilosFondo();
        serviciosAlFondo();
        extras.maximizarPantalla();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notif = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        pbTiempo = new javax.swing.JProgressBar();

        notif.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        notif.setForeground(new java.awt.Color(102, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlFondo.setBackground(new java.awt.Color(255, 102, 102));

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        pbTiempo.setForeground(new java.awt.Color(255, 102, 102));
        pbTiempo.setBorderPainted(false);
        pbTiempo.setString(" ");
        pbTiempo.setStringPainted(true);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tm.iniciarCronometro();
    }//GEN-LAST:event_formComponentShown

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Memorama(new String()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel notif;
    private javax.swing.JProgressBar pbTiempo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public final void verificar() {
        switch (estadoMemorama()) {
            case -1:
                break;
            case 1:
                break;
        }
    }

    @Override
    public final void ocultar() {
        for (int i = 0; i < todos2.size(); i++) {
            todos2.get(i).sw = false;
            todos2.get(i).repaint();
            pnlPrincipal.repaint();
        }
    }

    @Override
    public final void agregarPaneles(String tipo) {
        todos.clear();
        todos2.clear();
        seleccionados.clear();
        for (int i = 0; i < pares; i++) {
            ImageIcon img = new ImageIcon(getClass().getResource("/recursos/juegos/" + (i + 1) + ".png"));
            ImageIcon bocaArriba = new ImageIcon(getClass().getResource("/recursos/juegos/LWG.png"));
            PanelCarta pc = new PanelCarta(img.getImage(), this, i + 1, bocaArriba.getImage());
            PanelCarta pc2 = new PanelCarta(img.getImage(), this, i + 1, bocaArriba.getImage());
            todos.add(pc);
            todos.add(pc2);
            todos2.add(pc);
            todos2.add(pc2);
        }
        while (!todos.isEmpty()) {
            Random r = new Random();
            int x = (int) (r.nextDouble() * todos.size());
            pnlPrincipal.add(todos.get(x));
            todos.remove(x);
        }
        pnlPrincipal.repaint();
        pnlPrincipal.updateUI();
    }

    @Override
    public int estadoMemorama() {
        if (seleccionados.size() == 3) {
            if (seleccionados.get(0).clave == seleccionados.get(1).clave) {
                añadeAciertoSeguido();
                desatarBonoPenalizacion();
                seleccionados.get(0).bloqueado = true;
                seleccionados.get(1).bloqueado = true;
                seleccionados.clear();
                contadorGanador++;
                ocultar();
                return 0;
            } else {
                quitaAciertoSeguido();
                desatarBonoPenalizacion();
                seleccionados.clear();
                contadorPerdedor++;
                ocultar();
                if (contadorPerdedor == LIMITE) {
                    return -1;
                }
                return 0;
            }
        } else {
            if (contadorGanador == pares - 1 && seleccionados.size() == 2) {
                añadeAciertoSeguido();
                desatarBonoPenalizacion();
                return 1;
            }
            return 0;
        }
    }

    @Override
    public final void hilosFondo() {
        t1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estadoTemporizador();
            }
        });
        t1.start();
    }

    @Override
    public void estadoTemporizador() {
        if (!tm.isCronometroActivo()) {
            detenerServicios();
        }
    }

    @Override
    public void detenerServicios() {
        t1.stop();
        this.dispose();
    }

    private void añadeAciertoSeguido() {
        paresSeguidos++;
        errores = 0;
        if (paresSeguidos == 2) {
            bonSeguidas++;
            paresSeguidos = 0;
        }
    }

    private void quitaAciertoSeguido() {
        errores++;
        paresSeguidos = 0;
        bonSeguidas = 0;
    }

    private void desatarBonoPenalizacion() {
        if (bonSeguidas >= 1 && paresSeguidos == 0) {
            paresSeguidos = 0;
            tm.agregarBonificacion(3);
            notif.setText("BONUUUUUUUUUUUS! +3");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_BIEN, pbTiempo, notif);
        }
        if (errores == 4) {
            errores = 0;
            tm.agregarPenalizacion(3);
            notif.setText("UUUUUUH! -3");
            UtilPerfil.mandarNotificacion(ColorFondo.MENSAJE_ADVERTENCIA, pbTiempo, notif);
        }
    }


    @Override
    public final void serviciosAlFondo() {
        servicioLogro = new UtilLogro(PerfilCarga.getGrado(), PerfilCarga.getNick()) {
            @Override
            public void desatarLogro() {

                if (bonSeguidas == 3) {
                    if (!servicioLogro.listaDesbloqueados.contains(17)) {
                        servicioLogro.insertarLogroUsuario(PerfilCarga.getNick(), 17);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala",
                                servicioLogro.listaLogros.get(17).getNombre(), servicioLogro.listaLogros.get(17).getDescripcion()));
                    }
                }
                if (tm.getTipoTemp() == 2 && tm.getSegundos() <= 6 && realizado) {
                    if (!servicioLogro.listaDesbloqueados.contains(16)) {
                        servicioLogro.insertarLogroUsuario(PerfilCarga.getNick(), 16);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(16).getNombre(),
                                servicioLogro.listaLogros.get(16).getDescripcion()));
                    }
                }
                if (!tm.isCronometroActivo() && contadorGanador == pares - 1) {
                    if (!servicioLogro.listaDesbloqueados.contains(18)) {
                        servicioLogro.insertarLogroUsuario(PerfilCarga.getNick(), 18);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(18).getNombre(), 
                                servicioLogro.listaLogros.get(18).getDescripcion()));
                    }
                }
                if (tm.getTipoTemp() == 1 && (tm.getSegundos() <= 59 && tm.getMinutos() == 0)) {
                    if (!servicioLogro.listaDesbloqueados.contains(19)) {
                        servicioLogro.insertarLogroUsuario(PerfilCarga.getNick(), 19);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(19).getNombre(), 
                                servicioLogro.listaLogros.get(19).getDescripcion()));
                    }
                }
                if (tm.getPenalizaciones() == 0 && !tm.isCronometroActivo()) {
                    if (!servicioLogro.listaDesbloqueados.contains(21)) {
                        servicioLogro.insertarLogroUsuario(PerfilCarga.getNick(), 21);
                        UtilPerfil.mandarNotificacionLogro(pbTiempo, new PopupLogro("koala", servicioLogro.listaLogros.get(21).getNombre(),
                                servicioLogro.listaLogros.get(21).getDescripcion()));
                    }
                }
            }
        };
        servicioLogro.iniciarServicio();
    }

    UtilVentana extras;
    Timer t1;
    UtilLogro servicioLogro;
    private boolean realizado;
    private int paresSeguidos = 0;
    private int bonSeguidas = 0;
    private int errores = 0;
    private final int LIMITE = 5; // Numero máximo de intentos
    private final int pares = 10; // Pares del Memorama
    int contadorGanador = 0;
    int contadorPerdedor = 0;
    Temporizador tm;
    

}
