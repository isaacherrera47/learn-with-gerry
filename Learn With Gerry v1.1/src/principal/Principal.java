package principal;

import util.AudioFondo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yukarf10
 */
public class Principal extends javax.swing.JFrame {

    AudioFondo audioFondo;
    public Principal() {
        initComponents();
        audioFondo = new AudioFondo("audioPrincipal");
        AudioFondo.reproducir();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        btnIniciarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learn With Gerry");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/learn.png"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        btnIniciarJuego.setBackground(new java.awt.Color(204, 51, 51));
        btnIniciarJuego.setFont(new java.awt.Font("Please write me a song", 0, 24)); // NOI18N
        btnIniciarJuego.setForeground(new java.awt.Color(254, 254, 254));
        btnIniciarJuego.setContentAreaFilled(false);
        btnIniciarJuego.setOpaque(true);
        btnIniciarJuego.setText("Iniciar Juego");
        btnIniciarJuego.setContentAreaFilled(false);
        btnIniciarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarJuego.setFocusPainted(false);
        btnIniciarJuego.setOpaque(true);
        btnIniciarJuego.setRolloverEnabled(false);
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jcMousePanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed
        this.dispose();
        new IniciarSesion().setVisible(true);
    }//GEN-LAST:event_btnIniciarJuegoActionPerformed


    public static void main(String args[]) {             
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarJuego;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
