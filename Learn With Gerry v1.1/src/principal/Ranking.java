package principal;

import clases.Perfil;
import clases.PerfilCarga;
import extras.PerfilRanking;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import util.UtilPerfil;

/**
 *
 * @author isaac_000
 */
public class Ranking extends javax.swing.JDialog {

    ArrayList<Perfil> listaTodos;
    ArrayList<Perfil> listaGrado;
    CardLayout cl;

    public Ranking(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cl = (CardLayout) pnlRanking.getLayout();
        listaGrado = new ArrayList<>();
        listaTodos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        UtilPerfil.llenarRankingTodos(listaTodos);
        PerfilRanking pr;
        for (int i = 0; i < listaTodos.size(); i++) {
            pr = new PerfilRanking();
            String nombre = listaTodos.get(i).getNombre() + " " + listaTodos.get(i).getApPat() + " " + listaTodos.get(i).getApMat();
            pr.lblNombre.setText(nombre);
            pr.btnAlias.setText(listaTodos.get(i).getAlias());
            pr.lblGrado.setText(listaTodos.get(i).getGrado());
            pr.lblNick.setText(listaTodos.get(i).getUser());
            pr.lblNivel.setText(String.valueOf(listaTodos.get(i).getNivel()));
            pr.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/" + listaTodos.get(i).getCodAvatar() + ".png")));
            pr.setBackground(listaTodos.get(i).getColor());
            pnlTodos.add(pr);
        }
        UtilPerfil.llenarRankingGrado(listaGrado, PerfilCarga.getGrado());
        for (int i = 0; i < listaGrado.size(); i++) {
            pr = new PerfilRanking();
            String nombre = listaGrado.get(i).getNombre() + " " + listaGrado.get(i).getApPat() + " " + listaGrado.get(i).getApMat();
            pr.lblNombre.setText(nombre);
            pr.lblGrado.setText(listaGrado.get(i).getGrado());
            pr.lblNick.setText(listaGrado.get(i).getUser());
            pr.btnAlias.setText(listaGrado.get(i).getAlias());
            pr.lblNivel.setText(String.valueOf(listaGrado.get(i).getNivel()));
            pr.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/" + listaGrado.get(i).getCodAvatar() + ".png")));
            pr.setBackground(listaGrado.get(i).getColor());
            pnlGrado.add(pr);
        }
        pnlGrado.repaint();
        pnlTodos.repaint();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblRanking = new javax.swing.JLabel();
        LogoLWG = new javax.swing.JLabel();
        scrollRanking = new javax.swing.JScrollPane();
        pnlRanking = new javax.swing.JPanel();
        pnlTodos = new javax.swing.JPanel();
        pnlGrado = new javax.swing.JPanel();
        btnGrados = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LwG - Ranking");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(990, 615));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(990, 615));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(204, 51, 51));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(990, 610));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(990, 610));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/championb.png"))); // NOI18N

        lblRanking.setFont(new java.awt.Font("Moon Flower Bold", 0, 36)); // NOI18N
        lblRanking.setForeground(new java.awt.Color(255, 255, 255));
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRanking.setText("Ranking");
        lblRanking.setToolTipText("");

        LogoLWG.setFont(new java.awt.Font("olivier", 0, 14)); // NOI18N
        LogoLWG.setForeground(new java.awt.Color(255, 255, 255));
        LogoLWG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/olympic.png"))); // NOI18N
        LogoLWG.setText("Learn with Gerry");
        LogoLWG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogoLWG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        scrollRanking.setBorder(null);
        scrollRanking.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlRanking.setBackground(new java.awt.Color(204, 51, 51));
        pnlRanking.setLayout(new java.awt.CardLayout());

        pnlTodos.setOpaque(false);
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(5);
        pnlTodos.setLayout(verticalLayout1);
        pnlRanking.add(pnlTodos, "crdTodos");

        pnlGrado.setOpaque(false);
        org.jdesktop.swingx.VerticalLayout verticalLayout2 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout2.setGap(5);
        pnlGrado.setLayout(verticalLayout2);
        pnlRanking.add(pnlGrado, "crdGrado");

        scrollRanking.setViewportView(pnlRanking);

        btnGrados.setFont(new java.awt.Font("Patrick Hand SC", 0, 20)); // NOI18N
        btnGrados.setForeground(new java.awt.Color(255, 255, 255));
        btnGrados.setText("Por Grado");
        btnGrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnGrados.setContentAreaFilled(false);
        btnGrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradosActionPerformed(evt);
            }
        });

        btnTodos.setFont(new java.awt.Font("Patrick Hand SC", 0, 20)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Por Nivel");
        btnTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnTodos.setContentAreaFilled(false);
        btnTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos.setSelected(true);
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(scrollRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRanking)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(LogoLWG))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(11, 11, 11)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblRanking)
                        .addGap(476, 476, 476)
                        .addComponent(LogoLWG))))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradosActionPerformed
        cl.show(pnlRanking, "crdGrado");
    }//GEN-LAST:event_btnGradosActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
       cl.show(pnlRanking, "crdTodos");
    }//GEN-LAST:event_btnTodosActionPerformed

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
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ranking dialog = new Ranking(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LogoLWG;
    private javax.swing.JButton btnGrados;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JPanel pnlGrado;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRanking;
    private javax.swing.JPanel pnlTodos;
    private javax.swing.JScrollPane scrollRanking;
    // End of variables declaration//GEN-END:variables
}
