/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import clases.PerfilCarga;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Grado extends javax.swing.JDialog {


    public Grado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGrado = new javax.swing.JPanel();
        lblTituloGrados = new javax.swing.JLabel();
        slptGrados = new javax.swing.JSplitPane();
        pnlIGrados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblGradoDGrados = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        pnlDGrados = new javax.swing.JPanel();
        btnPasarNivel3 = new javax.swing.JButton();
        btnPasarNivel4 = new javax.swing.JButton();
        btnPasarNivel5 = new javax.swing.JButton();
        btnPasarNivel6 = new javax.swing.JButton();
        btnPasarNivel7 = new javax.swing.JButton();
        btnPasarNivel2 = new javax.swing.JButton();
        btnPasarNivel8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        pnlGrado.setBackground(new java.awt.Color(52, 152, 219));
        pnlGrado.setPreferredSize(new java.awt.Dimension(1200, 600));
        pnlGrado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloGrados.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblTituloGrados.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloGrados.setText("Grados ");
        pnlGrado.add(lblTituloGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -10, 110, 96));

        slptGrados.setBackground(new java.awt.Color(255, 255, 255));
        slptGrados.setBorder(null);
        slptGrados.setDividerLocation(500);
        slptGrados.setMinimumSize(new java.awt.Dimension(1200, 550));
        slptGrados.setPreferredSize(new java.awt.Dimension(1200, 550));

        pnlIGrados.setBackground(new java.awt.Color(52, 152, 219));
        pnlIGrados.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlIGradosComponentShown(evt);
            }
        });
        pnlIGrados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblGradoDGrados.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblGradoDGrados.setText("Primero");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        jLabel4.setText("Grado Actual");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/game35.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblGradoDGrados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGradoDGrados)
                .addGap(35, 35, 35))
        );

        pnlIGrados.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 500, 190));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/redim/0.png"))); // NOI18N
        pnlIGrados.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 220, 230));

        slptGrados.setLeftComponent(pnlIGrados);

        pnlDGrados.setBackground(new java.awt.Color(52, 152, 219));
        pnlDGrados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPasarNivel3.setBackground(new java.awt.Color(102, 51, 153));
        btnPasarNivel3.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel3.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel3.setText("Primer Grado");
        btnPasarNivel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel3.setBorderPainted(false);
        btnPasarNivel3.setContentAreaFilled(false);
        btnPasarNivel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel3.setFocusPainted(false);
        btnPasarNivel3.setOpaque(true);
        btnPasarNivel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel3MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        btnPasarNivel4.setBackground(new java.awt.Color(245, 171, 53));
        btnPasarNivel4.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel4.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel4.setText("Segundo Grado");
        btnPasarNivel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel4.setBorderPainted(false);
        btnPasarNivel4.setContentAreaFilled(false);
        btnPasarNivel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel4.setFocusPainted(false);
        btnPasarNivel4.setOpaque(true);
        btnPasarNivel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel4MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 80));

        btnPasarNivel5.setBackground(new java.awt.Color(211, 84, 0));
        btnPasarNivel5.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel5.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel5.setText("Tercer Grado");
        btnPasarNivel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel5.setBorderPainted(false);
        btnPasarNivel5.setContentAreaFilled(false);
        btnPasarNivel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel5.setFocusPainted(false);
        btnPasarNivel5.setOpaque(true);
        btnPasarNivel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel5MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 700, 80));

        btnPasarNivel6.setBackground(new java.awt.Color(31, 58, 147));
        btnPasarNivel6.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel6.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel6.setText("Cuarto Grado");
        btnPasarNivel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel6.setBorderPainted(false);
        btnPasarNivel6.setContentAreaFilled(false);
        btnPasarNivel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel6.setFocusPainted(false);
        btnPasarNivel6.setOpaque(true);
        btnPasarNivel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel6MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 700, 80));

        btnPasarNivel7.setBackground(new java.awt.Color(246, 71, 71));
        btnPasarNivel7.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel7.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel7.setText("Quinto Grado");
        btnPasarNivel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel7.setBorderPainted(false);
        btnPasarNivel7.setContentAreaFilled(false);
        btnPasarNivel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel7.setFocusPainted(false);
        btnPasarNivel7.setOpaque(true);
        btnPasarNivel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel7MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 700, 80));

        btnPasarNivel2.setBackground(new java.awt.Color(44, 62, 80));
        btnPasarNivel2.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel2.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel2.setText("Sexto Grado");
        btnPasarNivel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel2.setBorderPainted(false);
        btnPasarNivel2.setContentAreaFilled(false);
        btnPasarNivel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasarNivel2.setFocusPainted(false);
        btnPasarNivel2.setOpaque(true);
        btnPasarNivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasarNivel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasarNivel2MouseExited(evt);
            }
        });
        pnlDGrados.add(btnPasarNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 700, 80));

        slptGrados.setRightComponent(pnlDGrados);

        pnlGrado.add(slptGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 470));

        btnPasarNivel8.setBackground(new java.awt.Color(199, 13, 13));
        btnPasarNivel8.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnPasarNivel8.setForeground(new java.awt.Color(255, 255, 255));
        btnPasarNivel8.setText("Pasar De Nivel");
        btnPasarNivel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPasarNivel8.setBorderPainted(false);
        btnPasarNivel8.setContentAreaFilled(false);
        btnPasarNivel8.setFocusPainted(false);
        btnPasarNivel8.setOpaque(true);
        pnlGrado.add(btnPasarNivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 550, 120, 40));

        getContentPane().add(pnlGrado, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPasarNivel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel3MouseEntered
       btnPasarNivel3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel3MouseEntered

    private void btnPasarNivel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel3MouseExited
       btnPasarNivel3.setBackground(new Color(102,51,153));
    }//GEN-LAST:event_btnPasarNivel3MouseExited

    private void btnPasarNivel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel4MouseEntered
       btnPasarNivel4.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel4MouseEntered

    private void btnPasarNivel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel4MouseExited
       btnPasarNivel4.setBackground(new Color(245,171,53));
    }//GEN-LAST:event_btnPasarNivel4MouseExited

    private void btnPasarNivel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel5MouseEntered
       btnPasarNivel5.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel5MouseEntered

    private void btnPasarNivel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel5MouseExited
       btnPasarNivel5.setBackground(new Color(211,84,0));
    }//GEN-LAST:event_btnPasarNivel5MouseExited

    private void btnPasarNivel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel6MouseEntered
       btnPasarNivel6.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel6MouseEntered

    private void btnPasarNivel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel6MouseExited
       btnPasarNivel6.setBackground(new Color(31,58,147));
    }//GEN-LAST:event_btnPasarNivel6MouseExited

    private void btnPasarNivel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel7MouseEntered
       btnPasarNivel7.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel7MouseEntered

    private void btnPasarNivel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel7MouseExited
       btnPasarNivel7.setBackground(new Color(246,71,71));
    }//GEN-LAST:event_btnPasarNivel7MouseExited

    private void btnPasarNivel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel2MouseEntered
       btnPasarNivel2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPasarNivel2MouseEntered

    private void btnPasarNivel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasarNivel2MouseExited
       btnPasarNivel2.setBackground(new Color(44,62,80));
    }//GEN-LAST:event_btnPasarNivel2MouseExited

    private void pnlIGradosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlIGradosComponentShown
       avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/redim/"+PerfilCarga.getCodAvatar()+".png")));
       lblGradoDGrados.setText(PerfilCarga.getGrado());
    }//GEN-LAST:event_pnlIGradosComponentShown

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
            java.util.logging.Logger.getLogger(Grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Grado dialog = new Grado(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel avatar;
    private javax.swing.JButton btnPasarNivel2;
    private javax.swing.JButton btnPasarNivel3;
    private javax.swing.JButton btnPasarNivel4;
    private javax.swing.JButton btnPasarNivel5;
    private javax.swing.JButton btnPasarNivel6;
    private javax.swing.JButton btnPasarNivel7;
    private javax.swing.JButton btnPasarNivel8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGradoDGrados;
    private javax.swing.JLabel lblTituloGrados;
    private javax.swing.JPanel pnlDGrados;
    private javax.swing.JPanel pnlGrado;
    private javax.swing.JPanel pnlIGrados;
    private javax.swing.JSplitPane slptGrados;
    // End of variables declaration//GEN-END:variables
}
