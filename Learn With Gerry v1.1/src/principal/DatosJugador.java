package principal;

import clases.Alias;
import clases.PerfilCarga;
import extras.DescripcionAlias;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class DatosJugador extends javax.swing.JDialog {
    
    ArrayList<Alias> listaAlias;
    Color fondo;
    String nombre;
    public DatosJugador(java.awt.Frame parent, boolean modal, JPanel pnl) {
        super(parent, modal);
        initComponents();
        listaAlias = new ArrayList<>();
        fondo = pnl.getBackground();   
        cargarAlias();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAliasDisp = new javax.swing.JDialog();
        pnlSelAlias = new javax.swing.JPanel();
        scrollAlias = new javax.swing.JScrollPane();
        pnlAlias = new javax.swing.JPanel();
        btnSalirAlias = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        avatar = new org.jdesktop.swingx.JXLabel();
        pnlInferior = new javax.swing.JPanel();
        lblLogros = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        btnAlias = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        dlgAliasDisp.setMinimumSize(new java.awt.Dimension(1000, 500));
        dlgAliasDisp.setModal(true);
        dlgAliasDisp.setUndecorated(true);
        dlgAliasDisp.setResizable(false);

        pnlSelAlias.setBackground(new java.awt.Color(204, 51, 51));

        scrollAlias.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnlAlias.setBackground(new java.awt.Color(204, 51, 51));
        org.jdesktop.swingx.HorizontalLayout horizontalLayout1 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout1.setGap(10);
        pnlAlias.setLayout(horizontalLayout1);
        scrollAlias.setViewportView(pnlAlias);

        btnSalirAlias.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 24)); // NOI18N
        btnSalirAlias.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAlias.setText("X");
        btnSalirAlias.setBorderPainted(false);
        btnSalirAlias.setContentAreaFilled(false);
        btnSalirAlias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirAlias.setFocusPainted(false);
        btnSalirAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAliasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelAliasLayout = new javax.swing.GroupLayout(pnlSelAlias);
        pnlSelAlias.setLayout(pnlSelAliasLayout);
        pnlSelAliasLayout.setHorizontalGroup(
            pnlSelAliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollAlias, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelAliasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirAlias)
                .addContainerGap())
        );
        pnlSelAliasLayout.setVerticalGroup(
            pnlSelAliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelAliasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalirAlias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(scrollAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgAliasDisp.getContentPane().add(pnlSelAlias, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(340, 440));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(204, 51, 51));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerryInfo.png"))); // NOI18N

        pnlInferior.setLayout(new java.awt.GridLayout(1, 0));

        lblLogros.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        lblLogros.setForeground(new java.awt.Color(204, 51, 51));
        lblLogros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/chalkboard.png"))); // NOI18N
        lblLogros.setText("80");
        lblLogros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Logros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        lblLogros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlInferior.add(lblLogros);

        lblNivel.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(204, 51, 51));
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/glasses.png"))); // NOI18N
        lblNivel.setText("90");
        lblNivel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Nivel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        lblNivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNivel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlInferior.add(lblNivel);

        btnAlias.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAlias.setForeground(new java.awt.Color(204, 51, 51));
        btnAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/packman.png"))); // NOI18N
        btnAlias.setText("Pantera");
        btnAlias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Alias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        btnAlias.setContentAreaFilled(false);
        btnAlias.setFocusPainted(false);
        btnAlias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliasActionPerformed(evt);
            }
        });
        pnlInferior.add(btnAlias);

        lblNombre.setFont(new java.awt.Font("Please write me a song", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/pf.png"))); // NOI18N
        lblNombre.setText("Isaac Herrera Salcedo");

        lblNick.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblNick.setForeground(new java.awt.Color(233, 233, 233));
        lblNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/em.png"))); // NOI18N
        lblNick.setText("Isaac_9423");

        lblGrado.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(252, 252, 252));
        lblGrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/bk.png"))); // NOI18N
        lblGrado.setText("Sexto");

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
            .addComponent(pnlInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(35, 35, 35)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cambiarColores();
        cargarDatos();
    }//GEN-LAST:event_formComponentShown

    private void btnAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliasActionPerformed
        dlgAliasDisp.setVisible(true);
    }//GEN-LAST:event_btnAliasActionPerformed

    private void btnSalirAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAliasActionPerformed
        dlgAliasDisp.setVisible(false);
    }//GEN-LAST:event_btnSalirAliasActionPerformed

    private void cambiarColores() {
        pnlPrincipal.setBackground(fondo);
        lblLogros.setForeground(fondo);
        lblNivel.setForeground(fondo);
        btnAlias.setForeground(fondo);
        pnlSelAlias.setBackground(fondo);
    }
    private void cargarDatos(){
        nombre= PerfilCarga.getNombre().trim()+" "+PerfilCarga.getApPaterno().trim()+" "+PerfilCarga.getApMaterno();
        lblNombre.setText(nombre);
        lblGrado.setText(PerfilCarga.getGrado());
        lblLogros.setText(Integer.toString(PerfilCarga.getLogros()));
        lblNick.setText(PerfilCarga.getNick());
        lblNivel.setText(Integer.toString(PerfilCarga.getNivel()));
        btnAlias.setText(PerfilCarga.getAlias());
        avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/redim/"+PerfilCarga.getCodAvatar()+".png")));
    }
    private void cargarAlias(){
        DescripcionAlias desc;
        UtilPerfil.llenarListaAlias(listaAlias);
        for (int i = 0; i < listaAlias.size(); i++) {
            desc = new DescripcionAlias(listaAlias.get(i),this);
            desc.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/alias/"+listaAlias.get(i).getId()+".png")));
            desc.lblDescripcion.setText(listaAlias.get(i).getDescripcion());
            desc.lblNombre.setText(listaAlias.get(i).getNombre());
            pnlAlias.add(desc);
        }
        repaint();
        pnlAlias.repaint();
    }

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
            java.util.logging.Logger.getLogger(DatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosJugador dialog = new DatosJugador(new javax.swing.JFrame(), true, new JPanel());
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
    private org.jdesktop.swingx.JXLabel avatar;
    public javax.swing.JButton btnAlias;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirAlias;
    public javax.swing.JDialog dlgAliasDisp;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblLogros;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlAlias;
    private javax.swing.JPanel pnlInferior;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSelAlias;
    private javax.swing.JScrollPane scrollAlias;
    // End of variables declaration//GEN-END:variables
}
