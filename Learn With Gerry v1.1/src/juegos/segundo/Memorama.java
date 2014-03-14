package juegos.segundo;

import juegos.primero.*;
import util.Jugable;
import util.Memorizable;
import static util.Memorizable.seleccionados;
import static util.Memorizable.todos;
import static util.Memorizable.todos2;
import extras.PanelCarta;
import util.Temporizador;
import util.UtilVentana;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;
import net.java.balloontip.utils.TimingUtils;
import nicon.notify.core.Notification;
import nicon.notify.gui.desktopNotify.DesktopNotify;

/**
 *
 * @author Isaac
 */
public class Memorama extends javax.swing.JFrame implements Memorizable, Jugable {

    UtilVentana extras;
    BalloonTipStyle bs;
    BalloonTip b;
    Timer t1;
    private boolean realizado;
    private int paresSeguidos = 0;
    private int bonSeguidas = 0;
    private int errores = 0;
    private final int LIMITE = 5; // Numero máximo de intentos
    private final int pares = 10; // Pares del Memorama
    int contadorGanador = 0;
    int contadorPerdedor = 0;
    Temporizador tm;

    public Memorama(String tipo) {
        initComponents();
        extras = new UtilVentana(this);
        tm = new Temporizador(pbTiempo, 2, 1, 20);
        agregarPaneles(tipo);
        hilosFondo();
        extras.maximizarPantalla();
        bs = new MinimalBalloonStyle(new Color(255, 255, 255), 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notif = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        pbTiempo.setForeground(new java.awt.Color(255, 102, 51));
        pbTiempo.setBorderPainted(false);
        pbTiempo.setString(" ");
        pbTiempo.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notif;
    private javax.swing.JProgressBar pbTiempo;
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
                ocultar();
                contadorGanador++;
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
                return 1;
            }
            return 0;
        }
    }

    public synchronized void desatarLogro() {
        if (bonSeguidas == 3) {
            Notification.desktopMessage(DesktopNotify.NICON_WEATHER_ICON, "Querido Doctor tiempo", "Obten 3 bonificaciones seguidas en el memorama");
        }
        if (tm.getTipoTemp() == 2 && tm.getSegundos() <= 6 && realizado) {
            Notification.desktopMessage(DesktopNotify.NICON_WEATHER_ICON, "¡Tic,Toc,Tic,Toc!", "Resuelve un memorama quedando 5 segundos o menos");
        }
        if (!tm.isCronometroActivo() && contadorGanador == pares - 1) {
            Notification.desktopMessage(DesktopNotify.NICON_WEATHER_ICON, "Nada que perder", "Quédate a un acierto de terminar el memorama");
        }
        if (tm.getTipoTemp() == 1 && (tm.getSegundos() <= 59 && tm.getMinutos() == 0)) {
            Notification.desktopMessage(DesktopNotify.NICON_WEATHER_ICON, "Conejito velooooooooooz", "Termina la prueba en menos de un minuto");
        }
        if (tm.getPenalizaciones() == 0 && !tm.isCronometroActivo()) {
            Notification.desktopMessage(DesktopNotify.NICON_WEATHER_ICON, "¡El mal nunca triunfa!", "Termina la prueba sin ninguna penalización");
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
        if (paresSeguidos == 2) {
            paresSeguidos = 0;
            tm.agregarBonificacion(3);
            mandarNotificacion("BONUUUUUUUUUUUUUUUUUUUUUS! +3");
        }
        if (errores == 4) {
            errores = 0;
            tm.agregarPenalizacion(3);
            mandarNotificacion("UHHHHHH! -3");
        }
    }

    private void mandarNotificacion(String texto) {
        notif.setText(texto);        
        b = new BalloonTip(pbTiempo, notif, bs, false);
        TimingUtils.showTimedBalloon(b, 2000);
        FadingUtils.fadeInBalloon(b, null, 300, 24);
    }

    @Override
    public void serviciosAlFondo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
