package principal;

import clases.Logro;
import clases.PerfilCarga;
import extras.DescripcionLogro;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import util.UtilLogro;
import util.UtilVentana;

/**
 *
 * @author Isaac
 */
public class Logros extends javax.swing.JDialog {

    ArrayList<Logro> l;
    Color c;
    Random r;
    UtilVentana ven;
    CardLayout cl;
    public Logros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cl = (CardLayout) pnlLogros.getLayout();
        r = new Random();
        l = new ArrayList<>();
        cargarDatosGrado();
    }

    private void cargarDatosGrado() {
        UtilLogro.llenarListaGrado(l, PerfilCarga.getGrado());
        DescripcionLogro objLogro;
        for (int i = 0; i < l.size(); i++) {
            objLogro = new DescripcionLogro();
            objLogro.lblTitulo.setText(l.get(i).getNombre());
            objLogro.lblDescripcion.setText(l.get(i).getDescripcion());
            objLogro.lblIdLogro.setText("Logro: " + (l.get(i).getIdLogro()));
            objLogro.lblDescripcion.setLineWrap(true);
            pnlLogros.add(objLogro);            
        }
        repaint();
        pnlLogros.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lwg = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        scrollLogros = new javax.swing.JScrollPane();
        pnlLogros = new javax.swing.JPanel();
        btnTodos = new javax.swing.JButton();
        btnDesbloqueados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LwG - Logros");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        pnlPrincipal.setBackground(new java.awt.Color(37, 142, 233));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(1200, 600));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1200, 600));

        lwg.setFont(new java.awt.Font("Lighthouse Personal Use", 0, 12)); // NOI18N
        lwg.setForeground(new java.awt.Color(255, 255, 255));
        lwg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lwg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/olympic.png"))); // NOI18N
        lwg.setText("Learn with Gerry");
        lwg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lwg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lwg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/gamepad.png"))); // NOI18N

        scrollLogros.setBorder(null);

        pnlLogros.setBackground(new java.awt.Color(37, 142, 233));
        pnlLogros.setLayout(new java.awt.CardLayout());
        scrollLogros.setViewportView(pnlLogros);

        btnTodos.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Mis logros");
        btnTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnTodos.setContentAreaFilled(false);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnDesbloqueados.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnDesbloqueados.setForeground(new java.awt.Color(255, 255, 255));
        btnDesbloqueados.setText("Todos los logros");
        btnDesbloqueados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDesbloqueados.setContentAreaFilled(false);
        btnDesbloqueados.setSelected(true);
        btnDesbloqueados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloqueadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgFondo)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lwg))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDesbloqueados, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(btnTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollLogros, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lwg)
                .addGap(12, 12, 12)
                .addComponent(btnDesbloqueados, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(imgFondo))
            .addComponent(scrollLogros)
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnDesbloqueadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloqueadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesbloqueadosActionPerformed


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
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Logros dialog = new Logros(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDesbloqueados;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel lwg;
    private javax.swing.JPanel pnlLogros;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollLogros;
    // End of variables declaration//GEN-END:variables
}
