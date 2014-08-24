/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.IniciarSesion;
import principal.PerfilJugador;
import util.AudioFondo;
import util.ColorFondo;

/**
 *
 * @author isaac_000
 */
public class PerfilSesion extends javax.swing.JPanel {

    /**
     * Creates new form PerfilSesion
     */
    IniciarSesion parent;

    public PerfilSesion(IniciarSesion parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar = new jcMousePanel.jcMousePanel();
        lblNick = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 51), 2));
        setMinimumSize(new java.awt.Dimension(540, 200));
        setPreferredSize(new java.awt.Dimension(540, 200));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/0.png"))); // NOI18N
        avatar.setVisibleLogo(false);

        javax.swing.GroupLayout avatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(avatarLayout);
        avatarLayout.setHorizontalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        avatarLayout.setVerticalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        lblNick.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblNick.setForeground(new java.awt.Color(102, 102, 102));
        lblNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/em.png"))); // NOI18N
        lblNick.setText("Isaac_9423");

        lblGrado.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(102, 102, 102));
        lblGrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/bk.png"))); // NOI18N
        lblGrado.setText("Sexto");

        lblNombre.setFont(new java.awt.Font("Please write me a song", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/pf.png"))); // NOI18N
        lblNombre.setText("Isaac Herrera Salcedo");

        btnEntrar.setBackground(new java.awt.Color(240, 51, 51));
        btnEntrar.setFont(new java.awt.Font("Mohave", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setOpaque(true);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNick, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)
                        .addGap(27, 27, 27)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String[] animales = new String[] { "Perro", "Gato", "Jirafa", "Pez", "Víbora", "Mono", "Oso", "Vaca", "Burro", "Caballo", "Pollo", "Pato", "Ganso", "Gallina", "Ratón", "Águila", "Conejo", "Delfín", "Camaleón", "Cocodrilo", "León", "Tigre", "Tucán" };
        String pass = (String) JOptionPane.showInputDialog(this, "Selecciona tu animal favorito", "Contraseña", JOptionPane.QUESTION_MESSAGE, null,animales,animales[0]);
        if (parent.util.cargarPerfil(lblNick.getText(), pass)) {
            parent.dispose();
            new PerfilJugador().setVisible(true);
            AudioFondo.eliminarHiloSonido();
        } else {
            parent.mandarNotificacion("Hubo un error, intenta de nuevo", btnEntrar, ColorFondo.MENSAJE_ERROR);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public jcMousePanel.jcMousePanel avatar;
    public javax.swing.JButton btnEntrar;
    public javax.swing.JLabel lblGrado;
    public javax.swing.JLabel lblNick;
    public javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}