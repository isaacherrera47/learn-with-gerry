package principal;

import clases.PerfilCarga;
import extras.PopupLogro;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import util.ColorFondo;
import util.UtilBD;
import util.UtilPerfil;

/**
 *
 * @author isaac_000
 */
public class PerfilJugador extends javax.swing.JFrame {

    Color verde = new Color(0, 204, 153);
    Color rojo = new Color(220, 94, 94);
    CardLayout cl;

    public PerfilJugador() {
        initComponents();
        cargarComplementos();
        cl = (CardLayout) pnlAvatars.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCambiarAvatar = new javax.swing.JDialog();
        pnlCambiarAvatar = new javax.swing.JPanel();
        pnlAvatars = new javax.swing.JPanel();
        spAvatarHombre = new javax.swing.JScrollPane();
        pnlAvatarHombre = new javax.swing.JPanel();
        btnH1 = new javax.swing.JButton();
        btnH2 = new javax.swing.JButton();
        btnH3 = new javax.swing.JButton();
        btnH4 = new javax.swing.JButton();
        spAvatarMujer = new javax.swing.JScrollPane();
        pnlAvatarMujer = new javax.swing.JPanel();
        btnM1 = new javax.swing.JButton();
        btnM2 = new javax.swing.JButton();
        btnM3 = new javax.swing.JButton();
        btnM4 = new javax.swing.JButton();
        pnlAvatarEspecial = new javax.swing.JPanel();
        btnAvatarHombre = new javax.swing.JToggleButton();
        btnAvatarEspecial = new javax.swing.JToggleButton();
        lblIconoAvatar = new javax.swing.JLabel();
        btnAvatarMujer = new javax.swing.JToggleButton();
        btnSalirAvatar = new javax.swing.JButton();
        dlgOpciones = new javax.swing.JDialog();
        pnlOpciones = new javax.swing.JPanel();
        lblOpciones = new com.xzq.osc.JocLabel();
        btnSonido = new javax.swing.JToggleButton();
        lblSonido = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dlgCambiarFondo = new javax.swing.JDialog();
        pnlCambiarFondo = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();
        btnNaranja = new javax.swing.JButton();
        btnRosa = new javax.swing.JButton();
        btnMorado = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnAzulCielo = new javax.swing.JButton();
        btnAzulOceano = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btgAvatar = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        btnOpciones = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnGrados = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnLogros = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnPruebas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        dlgCambiarAvatar.setLocationByPlatform(true);
        dlgCambiarAvatar.setMinimumSize(new java.awt.Dimension(750, 530));
        dlgCambiarAvatar.setModal(true);
        dlgCambiarAvatar.setUndecorated(true);
        dlgCambiarAvatar.setResizable(false);

        pnlCambiarAvatar.setBackground(new java.awt.Color(0, 153, 153));
        pnlCambiarAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlCambiarAvatar.setMinimumSize(new java.awt.Dimension(750, 530));
        pnlCambiarAvatar.setPreferredSize(new java.awt.Dimension(750, 530));

        pnlAvatars.setOpaque(false);
        pnlAvatars.setLayout(new java.awt.CardLayout());

        spAvatarHombre.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        spAvatarHombre.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spAvatarHombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlAvatarHombre.setBackground(new java.awt.Color(102, 102, 102));
        org.jdesktop.swingx.HorizontalLayout horizontalLayout1 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout1.setGap(10);
        pnlAvatarHombre.setLayout(horizontalLayout1);

        btnH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/1.png"))); // NOI18N
        btnH1.setContentAreaFilled(false);
        btnH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH1ActionPerformed(evt);
            }
        });
        pnlAvatarHombre.add(btnH1);

        btnH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/2.png"))); // NOI18N
        btnH2.setContentAreaFilled(false);
        btnH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH2ActionPerformed(evt);
            }
        });
        pnlAvatarHombre.add(btnH2);

        btnH3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/3.png"))); // NOI18N
        btnH3.setContentAreaFilled(false);
        btnH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH3ActionPerformed(evt);
            }
        });
        pnlAvatarHombre.add(btnH3);

        btnH4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/4.png"))); // NOI18N
        btnH4.setContentAreaFilled(false);
        btnH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH4ActionPerformed(evt);
            }
        });
        pnlAvatarHombre.add(btnH4);

        spAvatarHombre.setViewportView(pnlAvatarHombre);

        pnlAvatars.add(spAvatarHombre, "crdAHombre");

        spAvatarMujer.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnlAvatarMujer.setBackground(new java.awt.Color(102, 102, 102));
        org.jdesktop.swingx.HorizontalLayout horizontalLayout2 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout2.setGap(10);
        pnlAvatarMujer.setLayout(horizontalLayout2);

        btnM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/5.png"))); // NOI18N
        btnM1.setContentAreaFilled(false);
        btnM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM1ActionPerformed(evt);
            }
        });
        pnlAvatarMujer.add(btnM1);

        btnM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/6.png"))); // NOI18N
        btnM2.setContentAreaFilled(false);
        btnM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM2ActionPerformed(evt);
            }
        });
        pnlAvatarMujer.add(btnM2);

        btnM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/7.png"))); // NOI18N
        btnM3.setContentAreaFilled(false);
        btnM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM3ActionPerformed(evt);
            }
        });
        pnlAvatarMujer.add(btnM3);

        btnM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/8.png"))); // NOI18N
        btnM4.setContentAreaFilled(false);
        btnM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM4ActionPerformed(evt);
            }
        });
        pnlAvatarMujer.add(btnM4);

        spAvatarMujer.setViewportView(pnlAvatarMujer);

        pnlAvatars.add(spAvatarMujer, "crdAMujer");

        pnlAvatarEspecial.setLayout(new org.jdesktop.swingx.HorizontalLayout());
        pnlAvatars.add(pnlAvatarEspecial, "crdAEspecial");

        btnAvatarHombre.setBackground(new java.awt.Color(255, 255, 255));
        btgAvatar.add(btnAvatarHombre);
        btnAvatarHombre.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAvatarHombre.setForeground(new java.awt.Color(0, 153, 153));
        btnAvatarHombre.setText("Niños");
        btnAvatarHombre.setContentAreaFilled(false);
        btnAvatarHombre.setOpaque(true);
        btnAvatarHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatarHombreActionPerformed(evt);
            }
        });

        btnAvatarEspecial.setBackground(new java.awt.Color(102, 102, 102));
        btgAvatar.add(btnAvatarEspecial);
        btnAvatarEspecial.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAvatarEspecial.setForeground(new java.awt.Color(204, 204, 204));
        btnAvatarEspecial.setText("Especiales");
        btnAvatarEspecial.setContentAreaFilled(false);
        btnAvatarEspecial.setEnabled(false);
        btnAvatarEspecial.setOpaque(true);

        lblIconoAvatar.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblIconoAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerbtn.png"))); // NOI18N
        lblIconoAvatar.setText("Cambiar Avatar");
        lblIconoAvatar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIconoAvatar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAvatarMujer.setBackground(new java.awt.Color(255, 102, 102));
        btgAvatar.add(btnAvatarMujer);
        btnAvatarMujer.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnAvatarMujer.setForeground(new java.awt.Color(255, 255, 255));
        btnAvatarMujer.setText("Niñas");
        btnAvatarMujer.setContentAreaFilled(false);
        btnAvatarMujer.setOpaque(true);
        btnAvatarMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatarMujerActionPerformed(evt);
            }
        });

        btnSalirAvatar.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        btnSalirAvatar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAvatar.setText("x");
        btnSalirAvatar.setContentAreaFilled(false);
        btnSalirAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAvatarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCambiarAvatarLayout = new javax.swing.GroupLayout(pnlCambiarAvatar);
        pnlCambiarAvatar.setLayout(pnlCambiarAvatarLayout);
        pnlCambiarAvatarLayout.setHorizontalGroup(
            pnlCambiarAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAvatars, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlCambiarAvatarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAvatarHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAvatarMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAvatarEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSalirAvatar))
        );
        pnlCambiarAvatarLayout.setVerticalGroup(
            pnlCambiarAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCambiarAvatarLayout.createSequentialGroup()
                .addGroup(pnlCambiarAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCambiarAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAvatarHombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAvatarMujer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAvatarEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCambiarAvatarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconoAvatar))
                    .addComponent(btnSalirAvatar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAvatars, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgCambiarAvatar.getContentPane().add(pnlCambiarAvatar, java.awt.BorderLayout.CENTER);

        dlgOpciones.setLocationByPlatform(true);
        dlgOpciones.setMinimumSize(new java.awt.Dimension(420, 250));
        dlgOpciones.setModal(true);
        dlgOpciones.setUndecorated(true);
        dlgOpciones.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dlgOpcionesComponentShown(evt);
            }
        });

        pnlOpciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        lblOpciones.setAntialias(true);
        lblOpciones.setForeground(new java.awt.Color(102, 102, 102));
        lblOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/opc.png"))); // NOI18N
        lblOpciones.setText("Opciones - Learn with Gerry");
        lblOpciones.setFont(new java.awt.Font("Walkway UltraBold", 0, 18)); // NOI18N

        btnSonido.setBackground(new java.awt.Color(123, 211, 200));
        btnSonido.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnSonido.setForeground(new java.awt.Color(255, 255, 255));
        btnSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/dsl.png"))); // NOI18N
        btnSonido.setSelected(true);
        btnSonido.setText("Encendido");
        btnSonido.setBorder(null);
        btnSonido.setBorderPainted(false);
        btnSonido.setContentAreaFilled(false);
        btnSonido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSonido.setFocusPainted(false);
        btnSonido.setOpaque(true);
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });

        lblSonido.setFont(new java.awt.Font("whola", 0, 20)); // NOI18N
        lblSonido.setForeground(new java.awt.Color(102, 102, 102));
        lblSonido.setText("Sonido");

        lblColor.setFont(new java.awt.Font("whola", 0, 20)); // NOI18N
        lblColor.setForeground(new java.awt.Color(102, 102, 102));
        lblColor.setText("Color");

        btnColor.setBackground(new java.awt.Color(221, 68, 73));
        btnColor.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnColor.setForeground(new java.awt.Color(255, 255, 255));
        btnColor.setText("Salmón");
        btnColor.setBorderPainted(false);
        btnColor.setContentAreaFilled(false);
        btnColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColor.setFocusPainted(false);
        btnColor.setOpaque(true);
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnAcerca.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnAcerca.setForeground(new java.awt.Color(102, 102, 102));
        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sh.png"))); // NOI18N
        btnAcerca.setText("Acerca de...");
        btnAcerca.setBorderPainted(false);
        btnAcerca.setContentAreaFilled(false);
        btnAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcerca.setFocusPainted(false);
        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/chk.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlOpcionesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSonido)
                            .addComponent(btnSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor)))
                    .addGroup(pnlOpcionesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAcerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlOpcionesLayout.createSequentialGroup()
                        .addComponent(lblSonido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSonido))
                    .addGroup(pnlOpcionesLayout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcerca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        dlgOpciones.getContentPane().add(pnlOpciones, java.awt.BorderLayout.CENTER);

        dlgCambiarFondo.setLocationByPlatform(true);
        dlgCambiarFondo.setMinimumSize(new java.awt.Dimension(690, 260));
        dlgCambiarFondo.setModal(true);
        dlgCambiarFondo.setUndecorated(true);
        dlgCambiarFondo.setResizable(false);

        pnlCambiarFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCambiarFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        lblFondo.setFont(new java.awt.Font("Walkway UltraBold", 0, 18)); // NOI18N
        lblFondo.setForeground(new java.awt.Color(102, 102, 102));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pluma.png"))); // NOI18N
        lblFondo.setText("Color de fondo - Learn with Gerry");

        btnNaranja.setBackground(new java.awt.Color(255, 102, 51));
        btnNaranja.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnNaranja.setForeground(new java.awt.Color(255, 255, 255));
        btnNaranja.setText("Otoño");
        btnNaranja.setBorderPainted(false);
        btnNaranja.setContentAreaFilled(false);
        btnNaranja.setFocusPainted(false);
        btnNaranja.setOpaque(true);
        btnNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaranjaActionPerformed(evt);
            }
        });

        btnRosa.setBackground(new java.awt.Color(255, 102, 102));
        btnRosa.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnRosa.setForeground(new java.awt.Color(255, 255, 255));
        btnRosa.setText("Pasteles");
        btnRosa.setBorderPainted(false);
        btnRosa.setContentAreaFilled(false);
        btnRosa.setFocusPainted(false);
        btnRosa.setOpaque(true);
        btnRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRosaActionPerformed(evt);
            }
        });

        btnMorado.setBackground(new java.awt.Color(102, 102, 153));
        btnMorado.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnMorado.setForeground(new java.awt.Color(255, 255, 255));
        btnMorado.setText("Mora");
        btnMorado.setBorderPainted(false);
        btnMorado.setContentAreaFilled(false);
        btnMorado.setFocusPainted(false);
        btnMorado.setOpaque(true);
        btnMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoradoActionPerformed(evt);
            }
        });

        btnVerde.setBackground(new java.awt.Color(51, 153, 51));
        btnVerde.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnVerde.setForeground(new java.awt.Color(255, 255, 255));
        btnVerde.setText("Pastos");
        btnVerde.setBorderPainted(false);
        btnVerde.setContentAreaFilled(false);
        btnVerde.setFocusPainted(false);
        btnVerde.setOpaque(true);
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnAzulCielo.setBackground(new java.awt.Color(102, 204, 204));
        btnAzulCielo.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnAzulCielo.setForeground(new java.awt.Color(255, 255, 255));
        btnAzulCielo.setText("Cielo");
        btnAzulCielo.setBorderPainted(false);
        btnAzulCielo.setContentAreaFilled(false);
        btnAzulCielo.setFocusPainted(false);
        btnAzulCielo.setOpaque(true);
        btnAzulCielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulCieloActionPerformed(evt);
            }
        });

        btnAzulOceano.setBackground(new java.awt.Color(0, 153, 153));
        btnAzulOceano.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnAzulOceano.setForeground(new java.awt.Color(255, 255, 255));
        btnAzulOceano.setText("Océano");
        btnAzulOceano.setBorderPainted(false);
        btnAzulOceano.setContentAreaFilled(false);
        btnAzulOceano.setFocusPainted(false);
        btnAzulOceano.setOpaque(true);
        btnAzulOceano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzulOceanoActionPerformed(evt);
            }
        });

        btnRojo.setBackground(new java.awt.Color(204, 51, 51));
        btnRojo.setFont(new java.awt.Font("olivier", 0, 18)); // NOI18N
        btnRojo.setForeground(new java.awt.Color(255, 255, 255));
        btnRojo.setText("Salmón");
        btnRojo.setBorderPainted(false);
        btnRojo.setContentAreaFilled(false);
        btnRojo.setFocusPainted(false);
        btnRojo.setOpaque(true);
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCambiarFondoLayout = new javax.swing.GroupLayout(pnlCambiarFondo);
        pnlCambiarFondo.setLayout(pnlCambiarFondoLayout);
        pnlCambiarFondoLayout.setHorizontalGroup(
            pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFondo)
                    .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                        .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                                .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAzulOceano, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                                .addComponent(btnMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAzulCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlCambiarFondoLayout.setVerticalGroup(
            pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                .addComponent(lblFondo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCambiarFondoLayout.createSequentialGroup()
                        .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAzulOceano, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCambiarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAzulCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        dlgCambiarFondo.getContentPane().add(pnlCambiarFondo, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LwG - Perfil");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(204, 51, 51));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(1000, 600));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1000, 600));
        pnlPrincipal.setLayout(null);

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gerryper.png"))); // NOI18N
        avatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        avatar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                avatarPropertyChange(evt);
            }
        });
        pnlPrincipal.add(avatar);
        avatar.setBounds(360, 150, 330, 315);

        btnOpciones.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        btnOpciones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/gear.png"))); // NOI18N
        btnOpciones.setBorderPainted(false);
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones.setFocusPainted(false);
        btnOpciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseExited(evt);
            }
        });
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnOpciones);
        btnOpciones.setBounds(10, 520, 200, 70);

        btnEstadisticas.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/easel.png"))); // NOI18N
        btnEstadisticas.setBorderPainted(false);
        btnEstadisticas.setContentAreaFilled(false);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadisticas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEstadisticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseExited(evt);
            }
        });
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEstadisticas);
        btnEstadisticas.setBounds(710, 30, 140, 180);

        btnGrados.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnGrados.setForeground(new java.awt.Color(255, 255, 255));
        btnGrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/bookshelf.png"))); // NOI18N
        btnGrados.setBorderPainted(false);
        btnGrados.setContentAreaFilled(false);
        btnGrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrados.setFocusPainted(false);
        btnGrados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrados.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGrados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGradosMouseExited(evt);
            }
        });
        btnGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradosActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnGrados);
        btnGrados.setBounds(170, 230, 160, 170);

        btnRanking.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnRanking.setForeground(new java.awt.Color(255, 255, 255));
        btnRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/barchart.png"))); // NOI18N
        btnRanking.setBorderPainted(false);
        btnRanking.setContentAreaFilled(false);
        btnRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRanking.setFocusPainted(false);
        btnRanking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRanking.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRanking.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRankingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRankingMouseExited(evt);
            }
        });
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnRanking);
        btnRanking.setBounds(700, 240, 160, 190);

        btnLogros.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnLogros.setForeground(new java.awt.Color(255, 255, 255));
        btnLogros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/trophy.png"))); // NOI18N
        btnLogros.setBorderPainted(false);
        btnLogros.setContentAreaFilled(false);
        btnLogros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogros.setFocusPainted(false);
        btnLogros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogros.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLogros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogrosMouseExited(evt);
            }
        });
        btnLogros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogrosActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnLogros);
        btnLogros.setBounds(170, 430, 150, 160);

        btnInformacion.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/briefcase.png"))); // NOI18N
        btnInformacion.setBorderPainted(false);
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.setFocusPainted(false);
        btnInformacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInformacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformacionMouseExited(evt);
            }
        });
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnInformacion);
        btnInformacion.setBounds(560, 440, 310, 150);

        btnPruebas.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnPruebas.setForeground(new java.awt.Color(255, 255, 255));
        btnPruebas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/gamecontroller.png"))); // NOI18N
        btnPruebas.setBorderPainted(false);
        btnPruebas.setContentAreaFilled(false);
        btnPruebas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPruebas.setFocusPainted(false);
        btnPruebas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPruebas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPruebas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPruebasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPruebasMouseExited(evt);
            }
        });
        btnPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebasActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPruebas);
        btnPruebas.setBounds(170, 30, 260, 130);

        btnCerrarSesion.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/power.png"))); // NOI18N
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(10, 10, 180, 70);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        //Se alterna el color y la posicion del texto dependiendo del audio.
        Color pastel = new Color(123, 211, 200);
        Color salmon = new Color(220, 94, 94);
        if (btnSonido.isSelected()) {
            btnSonido.setHorizontalTextPosition(SwingConstants.RIGHT);
            btnSonido.setBackground(pastel);
            btnSonido.setText("Encendido");
        } else {
            btnSonido.setHorizontalTextPosition(SwingConstants.LEFT);
            btnSonido.setBackground(salmon);
            btnSonido.setText("Apagado");
        }
    }//GEN-LAST:event_btnSonidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dlgOpciones.setVisible(false);
        UtilPerfil.almacenarColorPerfil(PerfilCarga.getNick(), ColorFondo.obtenerIdPorColor(btnColor.getBackground()));
        if (!UtilBD.comprobarLogroUsuario(PerfilCarga.getNick(), 2) && ColorFondo.obtenerIdPorColor(btnColor.getBackground()) != 3) {
            UtilPerfil.mandarNotificacionLogro(avatar, new PopupLogro("perro", "A lo Leonardo Da Vinci", "Cambia los colores de la pantalla principal"));
            UtilBD.desatarLogroID(2, PerfilCarga.getNick());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        dlgCambiarFondo.setVisible(true);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        cambiarFondo(btnRojo);
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnAzulCieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulCieloActionPerformed
        cambiarFondo(btnAzulCielo);
    }//GEN-LAST:event_btnAzulCieloActionPerformed

    private void btnAzulOceanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzulOceanoActionPerformed
        cambiarFondo(btnAzulOceano);
    }//GEN-LAST:event_btnAzulOceanoActionPerformed

    private void btnMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoradoActionPerformed
        cambiarFondo(btnMorado);
    }//GEN-LAST:event_btnMoradoActionPerformed

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        cambiarFondo(btnVerde);
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRosaActionPerformed
        cambiarFondo(btnRosa);
    }//GEN-LAST:event_btnRosaActionPerformed

    private void btnNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaranjaActionPerformed
        cambiarFondo(btnNaranja);
    }//GEN-LAST:event_btnNaranjaActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        dlgOpciones.setVisible(true);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        dlgCambiarAvatar.setVisible(true);
    }//GEN-LAST:event_avatarMouseClicked

    private void btnGradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGradosMouseEntered
        muestraTextoBoton(btnGrados, "Grados");
    }//GEN-LAST:event_btnGradosMouseEntered

    private void btnGradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGradosMouseExited
        quitarTextoBoton(btnGrados);
    }//GEN-LAST:event_btnGradosMouseExited

    private void btnPruebasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPruebasMouseEntered
        muestraTextoBoton(btnPruebas, "Pruebas");
    }//GEN-LAST:event_btnPruebasMouseEntered

    private void btnPruebasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPruebasMouseExited
        quitarTextoBoton(btnPruebas);
    }//GEN-LAST:event_btnPruebasMouseExited

    private void btnEstadisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseEntered
        muestraTextoBoton(btnEstadisticas, "Estadísticas");
    }//GEN-LAST:event_btnEstadisticasMouseEntered

    private void btnEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseExited
        quitarTextoBoton(btnEstadisticas);
    }//GEN-LAST:event_btnEstadisticasMouseExited

    private void btnLogrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogrosMouseEntered
        muestraTextoBoton(btnLogros, "Logros");
    }//GEN-LAST:event_btnLogrosMouseEntered

    private void btnLogrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogrosMouseExited
        quitarTextoBoton(btnLogros);
    }//GEN-LAST:event_btnLogrosMouseExited

    private void btnInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseEntered
        muestraTextoBoton(btnInformacion, "Datos personales");
    }//GEN-LAST:event_btnInformacionMouseEntered

    private void btnInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseExited
        quitarTextoBoton(btnInformacion);
    }//GEN-LAST:event_btnInformacionMouseExited

    private void btnRankingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseEntered
        muestraTextoBoton(btnRanking, "Ranking");
    }//GEN-LAST:event_btnRankingMouseEntered

    private void btnRankingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseExited
        quitarTextoBoton(btnRanking);
    }//GEN-LAST:event_btnRankingMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        muestraTextoBoton(btnCerrarSesion, "Salir");
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        quitarTextoBoton(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseEntered
        muestraTextoBoton(btnOpciones, "Opciones");
    }//GEN-LAST:event_btnOpcionesMouseEntered

    private void btnOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseExited
        quitarTextoBoton(btnOpciones);
    }//GEN-LAST:event_btnOpcionesMouseExited

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        new Ranking(this, true).setVisible(true);
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnLogrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogrosActionPerformed
        new Logros(this, true).setVisible(true);
    }//GEN-LAST:event_btnLogrosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        new IniciarSesion().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        new DatosJugador(this, true, pnlPrincipal).setVisible(true);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        new Estadistica(this, true).setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradosActionPerformed
        new Grado(this, true).setVisible(true);
    }//GEN-LAST:event_btnGradosActionPerformed

    private void btnPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebasActionPerformed

    }//GEN-LAST:event_btnPruebasActionPerformed

    private void dlgOpcionesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dlgOpcionesComponentShown
        ajustarBotonColor(ColorFondo.obtenerIdPorColor(pnlPrincipal.getBackground()));
    }//GEN-LAST:event_dlgOpcionesComponentShown

    private void btnSalirAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAvatarActionPerformed
        dlgCambiarAvatar.setVisible(false);
    }//GEN-LAST:event_btnSalirAvatarActionPerformed

    private void btnAvatarMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatarMujerActionPerformed
        cambiarLayoutAvatar(btnAvatarMujer, btnAvatarHombre, ColorFondo.PASTELES.getColor(), ColorFondo.OCEANO.getColor(), "crdAMujer");
    }//GEN-LAST:event_btnAvatarMujerActionPerformed

    private void btnAvatarHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatarHombreActionPerformed
        cambiarLayoutAvatar(btnAvatarHombre, btnAvatarMujer, ColorFondo.OCEANO.getColor(), ColorFondo.PASTELES.getColor(), "crdAHombre");
    }//GEN-LAST:event_btnAvatarHombreActionPerformed

    private void btnH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH1ActionPerformed
        sincronizarAvatar(1);
    }//GEN-LAST:event_btnH1ActionPerformed

    private void btnH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH2ActionPerformed
        sincronizarAvatar(2);
    }//GEN-LAST:event_btnH2ActionPerformed

    private void btnH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH3ActionPerformed
        sincronizarAvatar(3);
    }//GEN-LAST:event_btnH3ActionPerformed

    private void btnH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH4ActionPerformed
        sincronizarAvatar(4);
    }//GEN-LAST:event_btnH4ActionPerformed

    private void btnM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM1ActionPerformed
        sincronizarAvatar(5);
    }//GEN-LAST:event_btnM1ActionPerformed

    private void btnM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM2ActionPerformed
        sincronizarAvatar(6);
    }//GEN-LAST:event_btnM2ActionPerformed

    private void btnM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM3ActionPerformed
        sincronizarAvatar(7);
    }//GEN-LAST:event_btnM3ActionPerformed

    private void btnM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM4ActionPerformed
        sincronizarAvatar(8);
    }//GEN-LAST:event_btnM4ActionPerformed

    private void avatarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_avatarPropertyChange
        if(!UtilBD.comprobarLogroUsuario(PerfilCarga.getNick(), 3) && PerfilCarga.getCodAvatar() != 0){
            UtilBD.desatarLogroID(3, PerfilCarga.getNick());
            UtilPerfil.almacenarAvatarPerfil(PerfilCarga.getNick(), PerfilCarga.getCodAvatar());
            UtilPerfil.mandarNotificacionLogro(avatar, new PopupLogro("cocodrilo", "¡Muy curioso!", "Cambia por primera vez el avatar"));
        }
    }//GEN-LAST:event_avatarPropertyChange
    // Cambia el fondo de la ventana de perfil
    private void cambiarFondo(JButton boton) {
        dlgCambiarFondo.setVisible(false);
        btnColor.setText(boton.getText());
        btnColor.setBackground(boton.getBackground());
        pnlPrincipal.setBackground(boton.getBackground());
    }

    private void sincronizarAvatar(int id) {
        UtilPerfil.almacenarAvatarPerfil(PerfilCarga.getNick(), id);
        avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/" + id + ".png")));
        dlgCambiarAvatar.setVisible(false);
        PerfilCarga.setCodAvatar(id);
    }

    private void cargarComplementos() {
        pnlPrincipal.setBackground(PerfilCarga.getCodColor());
        avatar.setIcon(new ImageIcon(getClass().getResource("/recursos/perfil/" + PerfilCarga.getCodAvatar() + ".png")));
    }

    private void muestraTextoBoton(JButton bt, String texto) {
        bt.setText(texto);
    }

    private void quitarTextoBoton(JButton bt) {
        bt.setText(null);
    }

    private void ajustarBotonColor(int codColor) {
        switch (codColor) {
            case 1:
                cambiarFondo(btnRosa);
                break;
            case 2:
                cambiarFondo(btnNaranja);
                break;
            case 3:
                cambiarFondo(btnRojo);
                break;
            case 4:
                cambiarFondo(btnAzulCielo);
                break;
            case 5:
                cambiarFondo(btnMorado);
                break;
            case 6:
                cambiarFondo(btnVerde);
                break;
            case 7:
                cambiarFondo(btnAzulOceano);
                break;
        }
    }

    private void cambiarLayoutAvatar(JToggleButton btnFoco, JToggleButton btnNoFoco, Color colorBtnFoco, Color colorBtnNoFoco, String layout) {
        if (btnFoco.isSelected()) {
            cl.show(pnlAvatars, layout);
            btnFoco.setBackground(Color.WHITE);
            btnFoco.setForeground(colorBtnFoco);
            pnlCambiarAvatar.setBackground(colorBtnFoco);
            btnNoFoco.setBackground(colorBtnNoFoco);
            btnNoFoco.setForeground(Color.WHITE);
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PerfilJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.ButtonGroup btgAvatar;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JToggleButton btnAvatarEspecial;
    private javax.swing.JToggleButton btnAvatarHombre;
    private javax.swing.JToggleButton btnAvatarMujer;
    private javax.swing.JButton btnAzulCielo;
    private javax.swing.JButton btnAzulOceano;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnGrados;
    private javax.swing.JButton btnH1;
    private javax.swing.JButton btnH2;
    private javax.swing.JButton btnH3;
    private javax.swing.JButton btnH4;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnLogros;
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnM2;
    private javax.swing.JButton btnM3;
    private javax.swing.JButton btnM4;
    private javax.swing.JButton btnMorado;
    private javax.swing.JButton btnNaranja;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnPruebas;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnRosa;
    private javax.swing.JButton btnSalirAvatar;
    private javax.swing.JToggleButton btnSonido;
    private javax.swing.JButton btnVerde;
    private javax.swing.JDialog dlgCambiarAvatar;
    private javax.swing.JDialog dlgCambiarFondo;
    private javax.swing.JDialog dlgOpciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoAvatar;
    private com.xzq.osc.JocLabel lblOpciones;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JPanel pnlAvatarEspecial;
    private javax.swing.JPanel pnlAvatarHombre;
    private javax.swing.JPanel pnlAvatarMujer;
    private javax.swing.JPanel pnlAvatars;
    private javax.swing.JPanel pnlCambiarAvatar;
    private javax.swing.JPanel pnlCambiarFondo;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane spAvatarHombre;
    private javax.swing.JScrollPane spAvatarMujer;
    // End of variables declaration//GEN-END:variables
}
