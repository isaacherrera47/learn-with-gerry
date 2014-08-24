package principal;

import clases.Perfil;
import extras.PerfilSesion;
import extras.PopupLogro;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.styles.ToolTipBalloonStyle;
import net.java.balloontip.utils.FadingUtils;
import net.java.balloontip.utils.TimingUtils;
import util.AudioFondo;
import util.ColorFondo;
import util.UtilBD;
import util.UtilPerfil;

/**
 *
 * @author yukarf10
 */
public class IniciarSesion extends javax.swing.JFrame {

    CardLayout cl;
    public UtilBD util;
    BalloonTip b;
    BalloonTipStyle bs;
    BalloonTip bT;
    BalloonTipStyle bsT;
    ArrayList<Perfil> listaSesiones;

    public IniciarSesion() {
        initComponents();
        cl = (CardLayout) pnlContenedor.getLayout();
        util = new UtilBD();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notif = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JToggleButton();
        btnRegistrarse = new javax.swing.JButton();
        btnInicioSesion = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();
        scrollSesion = new javax.swing.JScrollPane();
        pnlInicioSesion = new javax.swing.JPanel();
        lblTituloSesion = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
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
        pnlAyuda = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblH1 = new org.jdesktop.swingx.JXLabel();
        lblH2 = new org.jdesktop.swingx.JXLabel();
        lblH3 = new org.jdesktop.swingx.JXLabel();

        notif.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        notif.setForeground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Please write me a song", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("jLabel1");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LwG - Iniciar sesión");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(204, 51, 51));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/chat.png"))); // NOI18N
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAyudaMouseEntered(evt);
            }
        });

        btnRegistrarse.setFont(new java.awt.Font("Walkway Bold", 0, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/profle.png"))); // NOI18N
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
        });

        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerbtn.png"))); // NOI18N
        btnInicioSesion.setContentAreaFilled(false);
        btnInicioSesion.setFocusPainted(false);
        btnInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseEntered(evt);
            }
        });

        pnlContenedor.setOpaque(false);
        pnlContenedor.setLayout(new java.awt.CardLayout());

        scrollSesion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollSesion.setPreferredSize(new java.awt.Dimension(700, 458));

        pnlInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(5);
        pnlInicioSesion.setLayout(verticalLayout1);

        lblTituloSesion.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        lblTituloSesion.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/key.png"))); // NOI18N
        lblTituloSesion.setText("¡Inicia ya!");
        lblTituloSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTituloSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlInicioSesion.add(lblTituloSesion);

        scrollSesion.setViewportView(pnlInicioSesion);

        pnlContenedor.add(scrollSesion, "crdSesion");

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Give It Your Heart", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nvoUsuariohelp.png"))); // NOI18N
        labelTitulo.setText("Mi registro - Learn with Gerry");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlRegistro.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 410, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtNombre.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        pnlRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 60));

        txtApMaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApMaterno.setCaretColor(new java.awt.Color(173, 173, 173));
        txtApMaterno.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtApMaterno.setDescripcion("Segundo apellido");
        txtApMaterno.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        pnlRegistro.add(txtApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 60));

        txtApPaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApPaterno.setCaretColor(new java.awt.Color(173, 173, 173));
        txtApPaterno.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtApPaterno.setDescripcion("Primer apellido");
        txtApPaterno.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        pnlRegistro.add(txtApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 200, 60));

        txtNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setCaretColor(new java.awt.Color(173, 173, 173));
        txtNombreUsuario.setColorDeTextoBackground(new java.awt.Color(153, 153, 153));
        txtNombreUsuario.setDescripcion("Nombre de usuario");
        txtNombreUsuario.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        txtNombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreUsuarioFocusLost(evt);
            }
        });
        pnlRegistro.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 200, 70));

        cbxGrado.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        cbxGrado.setForeground(new java.awt.Color(102, 102, 102));
        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grado", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        cbxGrado.setBorder(null);
        pnlRegistro.add(cbxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 200, 70));

        cbxAnimalFavorito.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        cbxAnimalFavorito.setForeground(new java.awt.Color(102, 102, 102));
        cbxAnimalFavorito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animal favorito", "Perro", "Gato", "Jirafa", "Pez", "Víbora", "Mono", "Oso", "Vaca", "Burro", "Caballo", "Pollo", "Pato", "Ganso", "Gallina", "Ratón", "Águila", "Conejo", "Delfín", "Camaleón", "Cocodrilo", "León", "Tigre", "Tucán" }));
        cbxAnimalFavorito.setBorder(null);
        pnlRegistro.add(cbxAnimalFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 200, 60));

        lblMensajeError.setForeground(new java.awt.Color(102, 102, 102));
        lblMensajeError.setFont(new java.awt.Font("Patrick Hand SC", 0, 20)); // NOI18N
        pnlRegistro.add(lblMensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 569, 71));

        pnlContenedor.add(pnlRegistro, "crdRegistro");

        pnlAyuda.setBackground(new java.awt.Color(255, 255, 255));
        pnlAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 153, 102));
        lblTitulo.setFont(new java.awt.Font("Please write me a song", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/infohelp.png"))); // NOI18N
        lblTitulo.setText("Menú Ayuda");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlAyuda.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 350, 50));

        lblH1.setForeground(new java.awt.Color(102, 102, 102));
        lblH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/us.PNG"))); // NOI18N
        lblH1.setText("En este campo escribe tu nombre de usuario");
        lblH1.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 20)); // NOI18N
        pnlAyuda.add(lblH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 540, 111));

        lblH2.setForeground(new java.awt.Color(102, 102, 102));
        lblH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pass.PNG"))); // NOI18N
        lblH2.setText("En este campo debes seleccionar tu mascota favorita.\nRecuerda que debe ser la misma que escogiste al registrarte.");
        lblH2.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 20)); // NOI18N
        lblH2.setLineWrap(true);
        pnlAyuda.add(lblH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 610, 111));

        lblH3.setForeground(new java.awt.Color(102, 102, 102));
        lblH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/profle2.png"))); // NOI18N
        lblH3.setText("Selecciona esta opción para registrarte y disfrutar de la máxima experiencia de juego con Gerry y sus amigos.");
        lblH3.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 20)); // NOI18N
        lblH3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblH3.setIconTextGap(20);
        lblH3.setLineWrap(true);
        pnlAyuda.add(lblH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 610, 80));

        pnlContenedor.add(pnlAyuda, "crdAyuda");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(473, 473, 473))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarCampos();
        mandarNotificacion("Datos borrados", btnCancelar, ColorFondo.MENSAJE_ADVERTENCIA);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (comprobarCampos()) {
            if (util.llenarPerfil(txtNombreUsuario.getText(), cbxAnimalFavorito.getSelectedItem().toString(), cbxGrado.getSelectedIndex(), txtNombre.getText(), txtApPaterno.getText(), txtApMaterno.getText()) == 1) {
                UtilBD.desatarLogroID(1, txtNombreUsuario.getText());
                UtilPerfil.mandarNotificacionLogro(btnRegistrarse, new PopupLogro("oso", "¡Qué comience el juego!", "Inicia por primera vez una partida"));
                cl.show(pnlContenedor, "crdSesion");
                UtilBD.desatarLogroID((cbxGrado.getSelectedIndex() + 9), txtNombreUsuario.getText());
                UtilPerfil.mandarNotificacionLogro(btnInicioSesion, new PopupLogro("leon", "¡Empezando por aquí!", "Inicia un grado en el juego"));
                borrarCampos();
                pnlInicioSesion.removeAll();
                pnlInicioSesion.add(lblTituloSesion);
                cargarDatos();
            }
        } else {
            mandarNotificacion("Hubo un error, por favor revisa tus datos :-(", btnCancelar, ColorFondo.MENSAJE_ERROR);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreUsuarioFocusLost
        comprobarExisteUsuario();
    }//GEN-LAST:event_txtNombreUsuarioFocusLost

    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseEntered
        cl.show(pnlContenedor, "crdRegistro");
        seleccionOpcion("Registro", ColorFondo.VERDE.getColor());
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    private void btnInicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMouseEntered
        cl.show(pnlContenedor, "crdSesion");
        seleccionOpcion("Iniciar", ColorFondo.ROJO.getColor());
    }//GEN-LAST:event_btnInicioSesionMouseEntered

    private void btnAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseEntered
        cl.show(pnlContenedor, "crdAyuda");
        seleccionOpcion("Ayuda", ColorFondo.NARANJA.getColor());
    }//GEN-LAST:event_btnAyudaMouseEntered
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

    public void mandarNotificacion(String texto, JComponent componente, int tipoMensaje) {
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

    private void seleccionOpcion(String texto, Color color) {
        if (bT != null) {
            TimingUtils.showTimedBalloon(bT, 1);
        }
        titulo.setText(texto);
        bsT = new ToolTipBalloonStyle(color, color);
        bT = new BalloonTip(btnAyuda, titulo, bsT, BalloonTip.Orientation.RIGHT_ABOVE, BalloonTip.AttachLocation.NORTHEAST, 50, 180, false);
        FadingUtils.fadeInBalloon(bT, null, 300, 10);
        pnlPrincipal.setBackground(color);
    }
    
    private void cargarDatos(){
        listaSesiones = UtilPerfil.llenarListaSesiones();
        PerfilSesion ps;
        for (int i = 0; i < listaSesiones.size(); i++) {
            ps = new PerfilSesion(this);
            String nombre= listaSesiones.get(i).getNombre()+" "+listaSesiones.get(i).getApPat()+" "+listaSesiones.get(i).getApMat();
            ps.lblNombre.setText(nombre);
            ps.lblNick.setText(listaSesiones.get(i).getUser());
            ps.lblGrado.setText(listaSesiones.get(i).getGrado());
            ps.avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/"+listaSesiones.get(i).getCodAvatar()+".png")));
            ps.setBorder(new LineBorder(listaSesiones.get(i).getColor(), 2));
            ps.btnEntrar.setBackground(listaSesiones.get(i).getColor());
            pnlInicioSesion.add(ps);
        }
        pnlInicioSesion.repaint();
        repaint();
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
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JComboBox cbxAnimalFavorito;
    private javax.swing.JComboBox cbxGrado;
    private javax.swing.JLabel labelTitulo;
    private org.jdesktop.swingx.JXLabel lblH1;
    private org.jdesktop.swingx.JXLabel lblH2;
    private org.jdesktop.swingx.JXLabel lblH3;
    private org.jdesktop.swingx.JXLabel lblMensajeError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloSesion;
    private javax.swing.JLabel notif;
    private javax.swing.JPanel pnlAyuda;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlInicioSesion;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JScrollPane scrollSesion;
    private javax.swing.JLabel titulo;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtApMaterno;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtApPaterno;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
