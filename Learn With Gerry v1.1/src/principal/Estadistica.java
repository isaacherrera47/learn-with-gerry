/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 *
 * @author Gero
 */
public class Estadistica extends javax.swing.JDialog {

    /**
     * Creates new form Estadistica
     */
    public Estadistica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgVentanaLogros = new javax.swing.JDialog();
        pnlVentanaLogros = new javax.swing.JPanel();
        dlgVentanaPruebas = new javax.swing.JDialog();
        pnlVentanaPruebas = new javax.swing.JPanel();
        pnlEstadistica = new javax.swing.JPanel();
        lblTituloE = new javax.swing.JLabel();
        avatar = new com.xzq.osc.JocLabel();
        lblNick = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();
        lblNickUser = new javax.swing.JLabel();
        lblAliasUser = new javax.swing.JLabel();
        btnEDetalles = new javax.swing.JButton();
        lblEsNivel = new javax.swing.JLabel();
        lblEsNiveles = new javax.swing.JLabel();
        lblEsPruebaHecha = new javax.swing.JLabel();
        lblEsPruebasHechas = new javax.swing.JLabel();
        lblEsPruebaTotal = new javax.swing.JLabel();
        lblEsPruebasTotales = new javax.swing.JLabel();
        lblEsLogroTotal = new javax.swing.JLabel();
        lblEsLogrosTotales = new javax.swing.JLabel();
        lblEsLogroLogrado = new javax.swing.JLabel();
        lblLogrosLogrados = new javax.swing.JLabel();
        btnEDetalles1 = new javax.swing.JButton();
        btnEsSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        dlgVentanaLogros.setLocationByPlatform(true);
        dlgVentanaLogros.setModal(true);

        pnlVentanaLogros.setBackground(new java.awt.Color(37, 171, 137));
        dlgVentanaLogros.getContentPane().add(pnlVentanaLogros, java.awt.BorderLayout.CENTER);

        dlgVentanaPruebas.setLocationByPlatform(true);
        dlgVentanaPruebas.setModal(true);

        pnlVentanaPruebas.setBackground(new java.awt.Color(37, 171, 137));
        dlgVentanaPruebas.getContentPane().add(pnlVentanaPruebas, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LwG - Estadística");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        pnlEstadistica.setBackground(new java.awt.Color(37, 171, 137));
        pnlEstadistica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloE.setFont(new java.awt.Font("Walkway UltraBold", 0, 36)); // NOI18N
        lblTituloE.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloE.setText("Estadisticas");
        pnlEstadistica.add(lblTituloE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 230, 90));

        avatar.setBackground(new java.awt.Color(204, 204, 204));
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerryper.png"))); // NOI18N
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        pnlEstadistica.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 363, 330));

        lblNick.setBackground(new java.awt.Color(255, 255, 255));
        lblNick.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        lblNick.setText("Nick:");
        pnlEstadistica.add(lblNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 40, 30));

        lblAlias.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        lblAlias.setForeground(new java.awt.Color(255, 255, 255));
        lblAlias.setText("Alias:");
        pnlEstadistica.add(lblAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 40, 20));

        lblNickUser.setFont(new java.awt.Font("Lavanderia Sturdy", 0, 24)); // NOI18N
        lblNickUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNickUser.setText("Issac_9423");
        pnlEstadistica.add(lblNickUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 90, 30));

        lblAliasUser.setFont(new java.awt.Font("Caviar Dreams", 0, 24)); // NOI18N
        lblAliasUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAliasUser.setText("Pantera");
        pnlEstadistica.add(lblAliasUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, 30));

        btnEDetalles.setBackground(new java.awt.Color(220, 94, 94));
        btnEDetalles.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnEDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnEDetalles.setText("Detalles...");
        btnEDetalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEDetalles.setBorderPainted(false);
        btnEDetalles.setContentAreaFilled(false);
        btnEDetalles.setFocusPainted(false);
        btnEDetalles.setOpaque(true);
        btnEDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDetallesActionPerformed(evt);
            }
        });
        pnlEstadistica.add(btnEDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 100, 30));

        lblEsNivel.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        lblEsNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblEsNivel.setText("Nivel");
        pnlEstadistica.add(lblEsNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        lblEsNiveles.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsNiveles.setForeground(new java.awt.Color(220, 94, 94));
        lblEsNiveles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsNiveles.setText("80");
        pnlEstadistica.add(lblEsNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        lblEsPruebaHecha.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsPruebaHecha.setForeground(new java.awt.Color(255, 255, 255));
        lblEsPruebaHecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebaHecha.setText("Pruebas Hechas");
        pnlEstadistica.add(lblEsPruebaHecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 170, 50));

        lblEsPruebasHechas.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsPruebasHechas.setForeground(new java.awt.Color(220, 94, 94));
        lblEsPruebasHechas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebasHechas.setText("08");
        pnlEstadistica.add(lblEsPruebasHechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        lblEsPruebaTotal.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsPruebaTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblEsPruebaTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebaTotal.setText("Pruebas Totales");
        pnlEstadistica.add(lblEsPruebaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 170, 50));

        lblEsPruebasTotales.setBackground(new java.awt.Color(255, 255, 255));
        lblEsPruebasTotales.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsPruebasTotales.setForeground(new java.awt.Color(220, 94, 94));
        lblEsPruebasTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebasTotales.setText("10");
        pnlEstadistica.add(lblEsPruebasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        lblEsLogroTotal.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsLogroTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblEsLogroTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsLogroTotal.setText("Logros Totales");
        pnlEstadistica.add(lblEsLogroTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 170, 50));

        lblEsLogrosTotales.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsLogrosTotales.setForeground(new java.awt.Color(220, 94, 94));
        lblEsLogrosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsLogrosTotales.setText("20");
        pnlEstadistica.add(lblEsLogrosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        lblEsLogroLogrado.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsLogroLogrado.setForeground(new java.awt.Color(255, 255, 255));
        lblEsLogroLogrado.setText("Logros Realizados");
        pnlEstadistica.add(lblEsLogroLogrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        lblLogrosLogrados.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblLogrosLogrados.setForeground(new java.awt.Color(220, 94, 94));
        lblLogrosLogrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogrosLogrados.setText("02");
        pnlEstadistica.add(lblLogrosLogrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        btnEDetalles1.setBackground(new java.awt.Color(220, 94, 94));
        btnEDetalles1.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnEDetalles1.setForeground(new java.awt.Color(255, 255, 255));
        btnEDetalles1.setText("Detalles...");
        btnEDetalles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEDetalles1.setBorderPainted(false);
        btnEDetalles1.setContentAreaFilled(false);
        btnEDetalles1.setFocusPainted(false);
        btnEDetalles1.setOpaque(true);
        btnEDetalles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDetalles1ActionPerformed(evt);
            }
        });
        pnlEstadistica.add(btnEDetalles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 100, 30));

        btnEsSalir.setBackground(new java.awt.Color(220, 94, 94));
        btnEsSalir.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnEsSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnEsSalir.setText("Salir");
        btnEsSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEsSalir.setBorderPainted(false);
        btnEsSalir.setContentAreaFilled(false);
        btnEsSalir.setFocusPainted(false);
        btnEsSalir.setOpaque(true);
        btnEsSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsSalirActionPerformed(evt);
            }
        });
        pnlEstadistica.add(btnEsSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 100, 30));

        jLabel1.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/olympic.png"))); // NOI18N
        jLabel1.setText("Learn With Gerry");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlEstadistica.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 130, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/animal174.png"))); // NOI18N
        pnlEstadistica.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 390, 390));

        getContentPane().add(pnlEstadistica, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        //Abre la ventana para cambiar el avatar

    }//GEN-LAST:event_avatarMouseClicked

    private void btnEsSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsSalirActionPerformed
        this.dispose();
        PerfilJugador perfil = new PerfilJugador();
        perfil.setVisible(true);
    }//GEN-LAST:event_btnEsSalirActionPerformed

    private void btnEDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDetallesActionPerformed
        dlgVentanaPruebas.setVisible(true);
    }//GEN-LAST:event_btnEDetallesActionPerformed

    private void btnEDetalles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDetalles1ActionPerformed
        dlgVentanaLogros.setVisible(true);
    }//GEN-LAST:event_btnEDetalles1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estadistica dialog = new Estadistica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocLabel avatar;
    private javax.swing.JButton btnEDetalles;
    private javax.swing.JButton btnEDetalles1;
    private javax.swing.JButton btnEsSalir;
    private javax.swing.JDialog dlgVentanaLogros;
    private javax.swing.JDialog dlgVentanaPruebas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblAliasUser;
    private javax.swing.JLabel lblEsLogroLogrado;
    private javax.swing.JLabel lblEsLogroTotal;
    private javax.swing.JLabel lblEsLogrosTotales;
    private javax.swing.JLabel lblEsNivel;
    private javax.swing.JLabel lblEsNiveles;
    private javax.swing.JLabel lblEsPruebaHecha;
    private javax.swing.JLabel lblEsPruebaTotal;
    private javax.swing.JLabel lblEsPruebasHechas;
    private javax.swing.JLabel lblEsPruebasTotales;
    private javax.swing.JLabel lblLogrosLogrados;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblNickUser;
    private javax.swing.JLabel lblTituloE;
    private javax.swing.JPanel pnlEstadistica;
    private javax.swing.JPanel pnlVentanaLogros;
    private javax.swing.JPanel pnlVentanaPruebas;
    // End of variables declaration//GEN-END:variables
}
