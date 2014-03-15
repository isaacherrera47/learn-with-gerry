package extras;

/**
 *
 * @author isaac_000
 */
public class PerfilRanking extends javax.swing.JPanel {

    public PerfilRanking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLateral = new javax.swing.JPanel();
        lblLogros = new javax.swing.JLabel();
        btnAlias = new javax.swing.JButton();
        lblNivel = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();

        setBackground(new java.awt.Color(204, 51, 51));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        setMinimumSize(new java.awt.Dimension(480, 280));
        setPreferredSize(new java.awt.Dimension(480, 280));

        pnlLateral.setLayout(new org.jdesktop.swingx.VerticalLayout());

        lblLogros.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblLogros.setForeground(new java.awt.Color(204, 51, 51));
        lblLogros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/chalkboard.png"))); // NOI18N
        lblLogros.setText("80");
        lblLogros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Logros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        lblLogros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlLateral.add(lblLogros);

        btnAlias.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        btnAlias.setForeground(new java.awt.Color(204, 51, 51));
        btnAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/packman.png"))); // NOI18N
        btnAlias.setText("Pantera");
        btnAlias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Alias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        btnAlias.setContentAreaFilled(false);
        btnAlias.setFocusPainted(false);
        btnAlias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlLateral.add(btnAlias);

        lblNivel.setFont(new java.awt.Font("Patrick Hand SC", 0, 18)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(204, 51, 51));
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/glasses.png"))); // NOI18N
        lblNivel.setText("90");
        lblNivel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Nivel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Patrick Hand SC", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        lblNivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNivel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlLateral.add(lblNivel);

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

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/0.png"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(lblNick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlias;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblLogros;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlLateral;
    // End of variables declaration//GEN-END:variables
}
