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

        pnlPrincipal = new javax.swing.JPanel();
        btnIniciarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Learn With Gerry");
        setResizable(false);

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

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
