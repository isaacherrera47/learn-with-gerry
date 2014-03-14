package principal;

import extras.PopupLogro;
import util.AudioFondo;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;
import net.java.balloontip.utils.TimingUtils;
import util.ColorFondo;
import util.UtilBD;
import util.UtilPerfil;

/**
 *
 * @author yukarf10
 */
public class IniciarSesion extends javax.swing.JFrame {

    CardLayout cl;
    UtilBD util;
    BalloonTip b;
    BalloonTipStyle bs;

    public IniciarSesion() {
        initComponents();
        cl = (CardLayout) pnlContenedor.getLayout();
        util = new UtilBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notif = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JToggleButton();
        btnRegistrarse = new javax.swing.JButton();
        btnInicioSesion = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        pnlInicioSesion = new org.edisoncor.gui.panel.PanelLlamada();
        txtUsuario = new org.edisoncor.gui.textField.TextFieldRectBackground();
        btnIniciar = new javax.swing.JButton();
        cbxAnimalPref = new javax.swing.JComboBox();
        lblTituloSesion = new javax.swing.JLabel();
        pnlRegistro = new org.edisoncor.gui.panel.PanelLlamada();
        labelTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtApMaterno = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtApPaterno = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtNombreUsuario = new org.edisoncor.gui.textField.TextFieldRectBackground();
        cbxGrado = new javax.swing.JComboBox();
        cbxAnimalFavorito = new javax.swing.JComboBox();
        lblMensajeError = new org.jdesktop.swingx.JXLabel();
        pnlAyuda = new org.edisoncor.gui.panel.PanelLlamada();
        lblTitulo = new javax.swing.JLabel();
        lblH1 = new org.jdesktop.swingx.JXLabel();
        lblH2 = new org.jdesktop.swingx.JXLabel();
        lblH3 = new org.jdesktop.swingx.JXLabel();

        notif.setFont(new java.awt.Font("Metro", 0, 18)); // NOI18N
        notif.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LwG - Iniciar sesión");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(204, 51, 51));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/chat.png"))); // NOI18N
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        btnRegistrarse.setFont(new java.awt.Font("Walkway Bold", 0, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/profle.png"))); // NOI18N
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerbtn.png"))); // NOI18N
        btnInicioSesion.setContentAreaFilled(false);
        btnInicioSesion.setFocusPainted(false);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        pnlContenedor.setOpaque(false);
        pnlContenedor.setLayout(new java.awt.CardLayout());

        pnlInicioSesion.setAncho(15);
        pnlInicioSesion.setColorPrimario(new java.awt.Color(255, 255, 255));
        pnlInicioSesion.setColorSecundario(new java.awt.Color(230, 222, 222));
        pnlInicioSesion.setDistancia(15);
        pnlInicioSesion.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CIRCULAR);
        pnlInicioSesion.setOrientacion(org.edisoncor.gui.panel.PanelLlamada.Orientacion.RIGHT);

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setCaretColor(new java.awt.Color(173, 173, 173));
        txtUsuario.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtUsuario.setDescripcion("Usuario");
        txtUsuario.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        txtUsuario.setLeft(java.lang.Boolean.FALSE);

        btnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciar.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Jugar");
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setOpaque(true);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setFocusPainted(false);
        btnIniciar.setOpaque(true);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        cbxAnimalPref.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        cbxAnimalPref.setForeground(new java.awt.Color(102, 102, 102));
        cbxAnimalPref.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perro", "Gato", "Jirafa", "Pez", "Víbora", "Mono", "Oso", "Vaca", "Burro", "Caballo", "Pollo", "Pato", "Ganso", "Gallina", "Ratón", "Águila", "Conejo", "Delfín", "Camaleón", "Cocodrilo", "León", "Tigre", "Tucán" }));
        cbxAnimalPref.setBorder(null);

        lblTituloSesion.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblTituloSesion.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/key.png"))); // NOI18N
        lblTituloSesion.setText("¡Inicia ya!");

        javax.swing.GroupLayout pnlInicioSesionLayout = new javax.swing.GroupLayout(pnlInicioSesion);
        pnlInicioSesion.setLayout(pnlInicioSesionLayout);
        pnlInicioSesionLayout.setHorizontalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioSesionLayout.createSequentialGroup()
                            .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxAnimalPref, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55))
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblTituloSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        pnlInicioSesionLayout.setVerticalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioSesionLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(lblTituloSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAnimalPref, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pnlContenedor.add(pnlInicioSesion, "crdSesion");

        pnlRegistro.setAncho(15);
        pnlRegistro.setColorPrimario(new java.awt.Color(255, 255, 255));
        pnlRegistro.setColorSecundario(new java.awt.Color(230, 227, 227));
        pnlRegistro.setDistancia(15);
        pnlRegistro.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CIRCULAR);
        pnlRegistro.setOrientacion(org.edisoncor.gui.panel.PanelLlamada.Orientacion.TOP);
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Fairview Regular", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nvoUsuariohelp.png"))); // NOI18N
        labelTitulo.setText("Mi registro - Learn with Gerry");
        pnlRegistro.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 74, -1));

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setCaretColor(new java.awt.Color(173, 173, 173));
        txtNombre.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtNombre.setDescripcion("Nombre");
        txtNombre.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        pnlRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 60));

        txtApMaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApMaterno.setCaretColor(new java.awt.Color(173, 173, 173));
        txtApMaterno.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtApMaterno.setDescripcion("Segundo apellido");
        txtApMaterno.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        pnlRegistro.add(txtApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 60));

        txtApPaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApPaterno.setCaretColor(new java.awt.Color(173, 173, 173));
        txtApPaterno.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtApPaterno.setDescripcion("Primer apellido");
        txtApPaterno.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        pnlRegistro.add(txtApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 200, 60));

        txtNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setCaretColor(new java.awt.Color(173, 173, 173));
        txtNombreUsuario.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtNombreUsuario.setDescripcion("Nombre de usuario");
        txtNombreUsuario.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        txtNombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreUsuarioFocusLost(evt);
            }
        });
        pnlRegistro.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 200, 70));

        cbxGrado.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        cbxGrado.setForeground(new java.awt.Color(102, 102, 102));
        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grado", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        cbxGrado.setBorder(null);
        pnlRegistro.add(cbxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 200, 70));

        cbxAnimalFavorito.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        cbxAnimalFavorito.setForeground(new java.awt.Color(102, 102, 102));
        cbxAnimalFavorito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animal favorito", "Perro", "Gato", "Jirafa", "Pez", "Víbora", "Mono", "Oso", "Vaca", "Burro", "Caballo", "Pollo", "Pato", "Ganso", "Gallina", "Ratón", "Águila", "Conejo", "Delfín", "Camaleón", "Cocodrilo", "León", "Tigre", "Tucán" }));
        cbxAnimalFavorito.setBorder(null);
        pnlRegistro.add(cbxAnimalFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 200, 60));

        lblMensajeError.setForeground(new java.awt.Color(102, 102, 102));
        lblMensajeError.setFont(new java.awt.Font("Patrick Hand SC", 0, 20)); // NOI18N
        pnlRegistro.add(lblMensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 569, 71));

        pnlContenedor.add(pnlRegistro, "crdRegistro");

        pnlAyuda.setAncho(15);
        pnlAyuda.setColorPrimario(new java.awt.Color(255, 255, 255));
        pnlAyuda.setColorSecundario(new java.awt.Color(229, 225, 225));
        pnlAyuda.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CIRCULAR);
        pnlAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 153, 102));
        lblTitulo.setFont(new java.awt.Font("Odin Rounded", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/infohelp.png"))); // NOI18N
        lblTitulo.setText("Menú Ayuda");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlAyuda.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 758, 111));

        lblH1.setForeground(new java.awt.Color(102, 102, 102));
        lblH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/us.PNG"))); // NOI18N
        lblH1.setText("En este campo escribe tu nombre de usuario");
        lblH1.setFont(new java.awt.Font("Poetsen One", 0, 14)); // NOI18N
        pnlAyuda.add(lblH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 700, 111));

        lblH2.setForeground(new java.awt.Color(102, 102, 102));
        lblH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pass.PNG"))); // NOI18N
        lblH2.setText("En este campo debes seleccionar tu mascota favorita.\nRecuerda que debe ser la misma que escogiste al registrarte.");
        lblH2.setFont(new java.awt.Font("Poetsen One", 0, 14)); // NOI18N
        lblH2.setLineWrap(true);
        pnlAyuda.add(lblH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 670, 111));

        lblH3.setForeground(new java.awt.Color(102, 102, 102));
        lblH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/profle2.png"))); // NOI18N
        lblH3.setText("Selecciona esta opción para registrarte y disfrutar de la máxima experiencia de juego con Gerry y sus amigos.");
        lblH3.setFont(new java.awt.Font("Poetsen One", 0, 14)); // NOI18N
        lblH3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblH3.setIconTextGap(20);
        lblH3.setLineWrap(true);
        pnlAyuda.add(lblH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 610, 80));

        pnlContenedor.add(pnlAyuda, "crdAyuda");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(480, 480, 480))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(btnRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnAyuda)
                        .addGap(185, 185, 185))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicioSesion)
                .addGap(173, 173, 173))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        cl.show(pnlContenedor, "crdAyuda");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (util.cargarPerfil(txtUsuario.getText(), cbxAnimalPref.getSelectedItem().toString())) {
            this.dispose();
            new PerfilJugador().setVisible(true);
            AudioFondo.eliminarHiloSonido();
        } else {
            mandarNotificacion("Hubo un error, intenta de nuevo", btnIniciar, ColorFondo.MENSAJE_ERROR);
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        cl.show(pnlContenedor, "crdRegistro");
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarCampos();
        mandarNotificacion("Datos borrados", btnCancelar, ColorFondo.MENSAJE_ADVERTENCIA);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (comprobarCampos()) {
            if (util.llenarPerfil(txtNombreUsuario.getText(), cbxAnimalFavorito.getSelectedItem().toString(), cbxGrado.getSelectedIndex(), txtNombre.getText(), txtApPaterno.getText(), txtApMaterno.getText()) == 1) {
                UtilBD.desatarLogroID(1, txtNombreUsuario.getText());
                UtilPerfil.mandarNotificacionLogro(btnIniciar, new PopupLogro("oso", "¡Qué comience el juego!", "Inicia por primera vez una partida"));
                cl.show(pnlContenedor, "crdSesion");                
                UtilBD.desatarLogroID((cbxGrado.getSelectedIndex()+9), txtNombreUsuario.getText());
                UtilPerfil.mandarNotificacionLogro(btnInicioSesion, new PopupLogro("leon", "¡Empezando por aquí!", "Inicia un grado en el juego"));
                borrarCampos();
            }
        } else {
            mandarNotificacion("Hubo un error, por favor revisa tus datos :-(", btnCancelar, ColorFondo.MENSAJE_ERROR);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        cl.show(pnlContenedor, "crdSesion");
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void txtNombreUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuarioFocusLost
        comprobarExisteUsuario();
    }//GEN-LAST:event_txtNombreUsuarioFocusLost
    // Método para limpiar los campos del registro
    private void borrarCampos() {
        txtNombre.setText(null);
        txtApPaterno.setText(null);
        txtApMaterno.setText(null);
        txtNombreUsuario.setText(null);
        cbxGrado.setSelectedIndex(0);
        cbxAnimalFavorito.setSelectedIndex(0);
        lblMensajeError.setText(null);
        lblMensajeError.setIcon(null);
    }

    // Método para hacer la comprobacion de campos.
    private boolean comprobarCampos() {
        ImageIcon err = new ImageIcon(getClass().getResource("/recursos/err.png"));
        if (txtNombre.getText().trim().length() == 0) {
            lblMensajeError.setText("El nombre no puede ir vacío");
            lblMensajeError.setIcon(err);
            txtNombre.grabFocus();
            return false;
        }
        if (txtApPaterno.getText().trim().length() == 0) {
            lblMensajeError.setText("El apellido paterno no puede ir vacío");
            lblMensajeError.setIcon(err);
            txtApPaterno.grabFocus();
            return false;
        }
        if (txtApMaterno.getText().trim().length() == 0) {
            lblMensajeError.setText("El apellido materno no puede ir vacío");
            lblMensajeError.setIcon(err);
            txtApMaterno.grabFocus();
            return false;
        }
        if (txtNombreUsuario.getText().trim().length() == 0) {
            lblMensajeError.setText("El nombre de usuario no puede ir vacio");
            lblMensajeError.setIcon(err);
            txtNombreUsuario.grabFocus();
            return false;
        }
        if (cbxGrado.getSelectedIndex() == 0) {
            lblMensajeError.setText("Grado incorrecto");
            lblMensajeError.setIcon(err);
            cbxGrado.grabFocus();
            return false;
        }
        if (cbxAnimalFavorito.getSelectedIndex() == 0) {
            lblMensajeError.setText("Animal favorito incorrecto");
            lblMensajeError.setIcon(err);
            cbxAnimalFavorito.grabFocus();
            return false;
        }
        return true;
    }

    private void comprobarExisteUsuario() {
        if (!util.consultaExisteUsuario(txtNombreUsuario.getText())) {
            notif.setText("Este nombre de usuario está disponible");
            bs = new MinimalBalloonStyle(ColorFondo.VERDE.getColor(), 0);
            b = new BalloonTip(txtNombreUsuario, notif, bs, false);
            FadingUtils.fadeInBalloon(b, null, 300, 24);
            TimingUtils.showTimedBalloon(b, 3000);
        } else {
            notif.setText("Este nombre de usuario no está disponible");
            bs = new MinimalBalloonStyle(ColorFondo.ROJO.getColor(), 0);
            b = new BalloonTip(txtNombreUsuario, notif, bs, false);
            FadingUtils.fadeInBalloon(b, null, 300, 24);
            TimingUtils.showTimedBalloon(b, 3000);
            txtNombre.grabFocus();
            txtNombre.selectAll();
        }
    }

    private void mandarNotificacion(String texto, JComponent componente, int tipoMensaje) {
        notif.setText(texto);
        switch (tipoMensaje) {
            case 3:
                bs = new MinimalBalloonStyle(ColorFondo.ROJO.getColor(), 0);
                break;
            case 6:
                bs = new MinimalBalloonStyle(ColorFondo.VERDE.getColor(), 0);
                break;
            case 2:
                bs = new MinimalBalloonStyle(ColorFondo.NARANJA.getColor(), 0);
                break;
        }
        b = new BalloonTip(componente, notif, bs, false);
        FadingUtils.fadeInBalloon(b, null, 300, 24);
        TimingUtils.showTimedBalloon(b, 2000);
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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JComboBox cbxAnimalFavorito;
    private javax.swing.JComboBox cbxAnimalPref;
    private javax.swing.JComboBox cbxGrado;
    private javax.swing.JLabel labelTitulo;
    private org.jdesktop.swingx.JXLabel lblH1;
    private org.jdesktop.swingx.JXLabel lblH2;
    private org.jdesktop.swingx.JXLabel lblH3;
    private org.jdesktop.swingx.JXLabel lblMensajeError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloSesion;
    private javax.swing.JLabel notif;
    private org.edisoncor.gui.panel.PanelLlamada pnlAyuda;
    private javax.swing.JPanel pnlContenedor;
    private org.edisoncor.gui.panel.PanelLlamada pnlInicioSesion;
    private javax.swing.JPanel pnlPrincipal;
    private org.edisoncor.gui.panel.PanelLlamada pnlRegistro;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtApMaterno;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtApPaterno;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombreUsuario;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtUsuario;
    // End of variables declaration//GEN-END:variables
}
