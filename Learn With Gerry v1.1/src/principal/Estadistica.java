/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import bd.ConexionBD;
import clases.PerfilCarga;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import clases.Estadisticas;
import extras.DescripcionDetalles;
import java.sql.CallableStatement;
import util.UtilDetalles;

/**
 *
 * @author Gero
 */
public class Estadistica extends javax.swing.JDialog {
    ArrayList<Estadisticas> l;
    public Estadistica(java.awt.Frame parent) {
        super(parent);
        initComponents();
        l = new ArrayList<>();
        cargarDetalles();
    }
    
    private void cargarDetalles(){
        UtilDetalles.obtenerDetalles(l);
        DescripcionDetalles d;
        for (int i = 0; i < l.size(); i++) {
            d = new DescripcionDetalles();
            d.txtNombre.setText(l.get(i).getNombre());
            d.txtTipo.setText(l.get(i).getTipo());
            d.txtDescripcion.setText(l.get(i).getDescripcion());
            d.txtNumeroIntentos.setText(String.valueOf(l.get(i).getNumeroIntentos()));
            pnlDetalles.add(d);
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

        dlgDetalles = new javax.swing.JDialog();
        pnlPrincipal = new javax.swing.JPanel();
        scpDetalles = new javax.swing.JScrollPane();
        pnlDetalles = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblImagenA = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pnlEstadistica = new javax.swing.JPanel();
        lblTituloE = new javax.swing.JLabel();
        avatar = new com.xzq.osc.JocLabel();
        lblNick = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();
        lblNickUser = new javax.swing.JLabel();
        lblAliasUser = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();

        dlgDetalles.setMinimumSize(new java.awt.Dimension(1000, 400));
        dlgDetalles.setUndecorated(true);
        dlgDetalles.setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(199, 13, 13));

        pnlDetalles.setBackground(new java.awt.Color(199, 13, 13));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(10);
        pnlDetalles.setLayout(verticalLayout1);
        scpDetalles.setViewportView(pnlDetalles);

        jLabel4.setFont(new java.awt.Font("Fairview Small Caps", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/olympic.png"))); // NOI18N
        jLabel4.setText("Learn With Gerry");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblImagenA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerryInfo.png"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("x");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpDetalles)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(55, 55, 55)
                .addComponent(lblImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dlgDetalles.getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LwG - Estadística");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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

        lblNickUser.setFont(new java.awt.Font("Odin Rounded", 0, 18)); // NOI18N
        lblNickUser.setForeground(new java.awt.Color(220, 94, 94));
        lblNickUser.setText("Issac_9423");
        pnlEstadistica.add(lblNickUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 180, 30));

        lblAliasUser.setFont(new java.awt.Font("Caviar Dreams", 0, 24)); // NOI18N
        lblAliasUser.setForeground(new java.awt.Color(220, 94, 94));
        lblAliasUser.setText("Pantera");
        pnlEstadistica.add(lblAliasUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 220, 30));

        lblEsNivel.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        lblEsNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblEsNivel.setText("Experiencia");
        pnlEstadistica.add(lblEsNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        lblEsNiveles.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsNiveles.setForeground(new java.awt.Color(220, 94, 94));
        lblEsNiveles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsNiveles.setText("80");
        pnlEstadistica.add(lblEsNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        lblEsPruebaHecha.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsPruebaHecha.setForeground(new java.awt.Color(255, 255, 255));
        lblEsPruebaHecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebaHecha.setText("Pruebas Hechas");
        pnlEstadistica.add(lblEsPruebaHecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 170, 50));

        lblEsPruebasHechas.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsPruebasHechas.setForeground(new java.awt.Color(220, 94, 94));
        lblEsPruebasHechas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebasHechas.setText("00");
        pnlEstadistica.add(lblEsPruebasHechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblEsPruebaTotal.setFont(new java.awt.Font("Fairview Small Caps", 0, 36)); // NOI18N
        lblEsPruebaTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblEsPruebaTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebaTotal.setText("Pruebas Totales");
        pnlEstadistica.add(lblEsPruebaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 170, 50));

        lblEsPruebasTotales.setBackground(new java.awt.Color(255, 255, 255));
        lblEsPruebasTotales.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblEsPruebasTotales.setForeground(new java.awt.Color(220, 94, 94));
        lblEsPruebasTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsPruebasTotales.setText("00");
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
        pnlEstadistica.add(lblEsLogroLogrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));

        lblLogrosLogrados.setFont(new java.awt.Font("Fairview Small Caps", 0, 48)); // NOI18N
        lblLogrosLogrados.setForeground(new java.awt.Color(220, 94, 94));
        lblLogrosLogrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogrosLogrados.setText("02");
        pnlEstadistica.add(lblLogrosLogrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/olympic.png"))); // NOI18N
        jLabel1.setText("Learn With Gerry");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlEstadistica.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 190, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/animal174.png"))); // NOI18N
        pnlEstadistica.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 390, 390));

        btnJugar.setBackground(new java.awt.Color(220, 94, 94));
        btnJugar.setFont(new java.awt.Font("Fairview Small Caps", 0, 24)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Detalles...");
        btnJugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setFocusPainted(false);
        btnJugar.setOpaque(true);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        pnlEstadistica.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 90, 30));

        getContentPane().add(pnlEstadistica, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        //Abre la ventana para cambiar el avatar

    }//GEN-LAST:event_avatarMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       cargarDatos();
       cargarTotales();
    }//GEN-LAST:event_formComponentShown

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
      dlgDetalles.setVisible(true);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dlgDetalles.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    public void cargarDatos(){
        try {
            avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/"+PerfilCarga.getCodAvatar()+".png")));
            lblNickUser.setText(PerfilCarga.getNick());
            lblAliasUser.setText(PerfilCarga.getAlias());
            if(PerfilCarga.getNivel()<=9){
                lblEsNiveles.setText("0"+Integer.toString(PerfilCarga.getNivel()));
            }else{
                lblEsNiveles.setText(Integer.toString(PerfilCarga.getNivel()));
            }
            if(PerfilCarga.getLogros()<=9){
                lblLogrosLogrados.setText("0"+Integer.toString(PerfilCarga.getLogros()));
            }else{
                lblLogrosLogrados.setText(Integer.toString(PerfilCarga.getLogros()));
            }
            ConexionBD.abrirConexion();
            int l;
            String sql="SELECT count(idPrueba) as 'Pruebas Hechas' FROM pruebausuario\n" +
                    "where Estado = 1;";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.first();
            l=rs.getInt("Pruebas Hechas");
            if(l<=9){
                lblEsPruebasHechas.setText(String.valueOf("0"+l));
            }else{
                lblEsPruebasHechas.setText(String.valueOf(l));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void cargarTotales(){
        try {
            ConexionBD.abrirConexion();
            String sql="SELECT COUNT(IDLogro) as 'Total Logros' FROM logros";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.first();
            int l = rs.getInt("Total logros");
            lblEsLogrosTotales.setText(String.valueOf(l));
            ConexionBD.cerrarConexion();
            
              ConexionBD.abrirConexion();
            String SQL="SELECT COUNT(ID) as 'Total Pruebas' FROM prueba";
            PreparedStatement pst = ConexionBD.con.prepareStatement(SQL);
            ResultSet rst = pst.executeQuery();
            rst.first();
            int dato = rst.getInt("Total Pruebas");
            if(dato<=9){
                lblEsPruebasTotales.setText(String.valueOf("0"+dato));
            }else{
                lblEsPruebasTotales.setText(String.valueOf(dato));
            }
              ConexionBD.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
                Estadistica dialog = new Estadistica(new javax.swing.JFrame());
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
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog dlgDetalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel lblImagenA;
    private javax.swing.JLabel lblLogrosLogrados;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblNickUser;
    private javax.swing.JLabel lblTituloE;
    private javax.swing.JPanel pnlDetalles;
    private javax.swing.JPanel pnlEstadistica;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scpDetalles;
    // End of variables declaration//GEN-END:variables
}
