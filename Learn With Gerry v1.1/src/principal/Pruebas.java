/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import clases.PerfilCarga;
import clases.Prueba;
import extras.DescripcionPrueba;
import java.util.ArrayList;
import util.UtilPrueba;

/**
 *
 * @author Gero
 */
public class Pruebas extends javax.swing.JDialog {
    ArrayList<Prueba> lista;
    
    public Pruebas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lista = new ArrayList<>();
        cargarPruebas();
    }
    
    private void cargarPruebas(){
        UtilPrueba.obtenerPrueba(PerfilCarga.getGrado(), lista);
        DescripcionPrueba prueba;
        for (int i = 0; i < lista.size(); i++) {
            prueba = new DescripcionPrueba(lista.get(i).getIdPrueba());
            prueba.lblTitulo.setText(lista.get(i).getNombre());
            prueba.lblDescripcion.setText(lista.get(i).getDescripcion());
            pnlPrueba.add(prueba);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        txtImagen = new javax.swing.JLabel();
        lblImagenLog = new javax.swing.JLabel();
        scrollPrueba = new javax.swing.JScrollPane();
        pnlPrueba = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(102, 102, 153));

        txtImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/joystick5.png"))); // NOI18N

        lblImagenLog.setFont(new java.awt.Font("Lavanderia Regular", 0, 14)); // NOI18N
        lblImagenLog.setForeground(new java.awt.Color(255, 255, 255));
        lblImagenLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/olympic.png"))); // NOI18N
        lblImagenLog.setText("Learn with Gerry");
        lblImagenLog.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblImagenLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagenLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        scrollPrueba.setBackground(new java.awt.Color(255, 255, 255));

        pnlPrueba.setBackground(new java.awt.Color(102, 102, 153));
        pnlPrueba.setLayout(new org.jdesktop.swingx.VerticalLayout());
        scrollPrueba.setViewportView(pnlPrueba);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagenLog))
                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(txtImagen))
            .addComponent(scrollPrueba)
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pruebas dialog = new Pruebas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblImagenLog;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrueba;
    private javax.swing.JScrollPane scrollPrueba;
    private javax.swing.JLabel txtImagen;
    // End of variables declaration//GEN-END:variables
}
