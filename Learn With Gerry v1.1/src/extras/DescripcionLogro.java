package extras;

/**
 *
 * @author Isaac
 */
public class DescripcionLogro extends javax.swing.JPanel {


    public DescripcionLogro() {
        initComponents();        
    }
 
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcono = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new org.jdesktop.swingx.JXLabel();
        lblIdLogro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 190));
        setPreferredSize(new java.awt.Dimension(500, 190));
        setLayout(null);

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/star.png"))); // NOI18N
        add(lblIcono);
        lblIcono.setBounds(10, 10, 128, 128);

        lblTitulo.setFont(new java.awt.Font("Fairview Small Caps", 0, 23)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user44.png"))); // NOI18N
        lblTitulo.setText("¡Muy rápido!");
        lblTitulo.setIconTextGap(10);
        lblTitulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblTitulo);
        lblTitulo.setBounds(150, 10, 340, 33);

        lblDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        lblDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fire.png"))); // NOI18N
        lblDescripcion.setText("Holoa");
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDescripcion.setFont(new java.awt.Font("Patrick Hand SC", 0, 16)); // NOI18N
        lblDescripcion.setIconTextGap(10);
        lblDescripcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(lblDescripcion);
        lblDescripcion.setBounds(140, 50, 350, 130);

        lblIdLogro.setFont(new java.awt.Font("Patrick Hand SC", 0, 14)); // NOI18N
        lblIdLogro.setForeground(new java.awt.Color(102, 102, 102));
        lblIdLogro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode4.png"))); // NOI18N
        lblIdLogro.setText("Logro 10");
        add(lblIdLogro);
        lblIdLogro.setBounds(20, 150, 110, 34);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.jdesktop.swingx.JXLabel lblDescripcion;
    private javax.swing.JLabel lblIcono;
    public javax.swing.JLabel lblIdLogro;
    public javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
