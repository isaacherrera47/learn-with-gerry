package extras;

import clases.Alias;
import clases.PerfilCarga;
import principal.DatosJugador;
import util.UtilPerfil;

/**
 *
 * @author Isaac
 */
public class DescripcionAlias extends javax.swing.JPanel {
    DatosJugador parent;
    Alias objAlias;
    public DescripcionAlias(Alias objAlias, DatosJugador parent) {
        initComponents();
        this.parent = parent;
        this.objAlias = objAlias;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEscoger = new javax.swing.JButton();
        avatar = new jcMousePanel.jcMousePanel();
        lblDescripcion = new org.jdesktop.swingx.JXLabel();
        lblNombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(270, 350));
        setPreferredSize(new java.awt.Dimension(270, 350));
        setLayout(null);

        btnEscoger.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 18)); // NOI18N
        btnEscoger.setForeground(new java.awt.Color(102, 102, 102));
        btnEscoger.setText("Seleccionar");
        btnEscoger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnEscoger.setContentAreaFilled(false);
        btnEscoger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEscoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerActionPerformed(evt);
            }
        });
        add(btnEscoger);
        btnEscoger.setBounds(125, 296, 129, 50);

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/alias/1.png"))); // NOI18N
        avatar.setVisibleLogo(false);

        javax.swing.GroupLayout avatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(avatarLayout);
        avatarLayout.setHorizontalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        avatarLayout.setVerticalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        add(avatar);
        avatar.setBounds(116, 11, 138, 134);

        lblDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        lblDescripcion.setText("Aquí va una descripción breve del Alias que se va a mostrar");
        lblDescripcion.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 18)); // NOI18N
        lblDescripcion.setLineWrap(true);
        lblDescripcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(lblDescripcion);
        lblDescripcion.setBounds(10, 151, 250, 127);

        lblNombre.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Ornitorrinco");
        add(lblNombre);
        lblNombre.setBounds(0, 68, 106, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerActionPerformed
        UtilPerfil.almacenarAliasPerfil(PerfilCarga.getNick(), objAlias.getId());
        parent.btnAlias.setText(objAlias.getNombre());
        parent.dlgAliasDisp.setVisible(false);
    }//GEN-LAST:event_btnEscogerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public jcMousePanel.jcMousePanel avatar;
    private javax.swing.JButton btnEscoger;
    public org.jdesktop.swingx.JXLabel lblDescripcion;
    public javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
