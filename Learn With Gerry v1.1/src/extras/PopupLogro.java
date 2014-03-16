package extras;

import javax.swing.ImageIcon;
import util.AudioEfecto;

/**
 *
 * @author Isaac
 */
public class PopupLogro extends javax.swing.JPanel {

    AudioEfecto f;

    public PopupLogro(String nombreIconoLogro, String tituloLogro, String descLogro) {
        initComponents();
        f = new AudioEfecto();
        llenarPopup(nombreIconoLogro, tituloLogro, descLogro);
         f.darPlay("pop");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcono = new javax.swing.JLabel();
        lblTituloLogro = new javax.swing.JLabel();
        lblDescLogro = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 100));
        setPreferredSize(new java.awt.Dimension(400, 100));
        setLayout(null);

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/perfil/gatorec.png"))); // NOI18N
        add(lblIcono);
        lblIcono.setBounds(0, 0, 96, 100);

        lblTituloLogro.setFont(new java.awt.Font("Please write me a song", 0, 18)); // NOI18N
        lblTituloLogro.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloLogro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloLogro.setText("Conejito veeeelooooz");
        lblTituloLogro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        add(lblTituloLogro);
        lblTituloLogro.setBounds(106, 0, 290, 28);

        lblDescLogro.setForeground(new java.awt.Color(102, 102, 102));
        lblDescLogro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescLogro.setText("Inicia por primera vez una partida");
        lblDescLogro.setFont(new java.awt.Font("Are You Freakin' Serious ", 0, 14)); // NOI18N
        lblDescLogro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDescLogro.setLineWrap(true);
        lblDescLogro.setTextAlignment(org.jdesktop.swingx.JXLabel.TextAlignment.CENTER);
        add(lblDescLogro);
        lblDescLogro.setBounds(110, 30, 280, 60);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel lblDescLogro;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblTituloLogro;
    // End of variables declaration//GEN-END:variables

    private void llenarPopup(String nombreIconoLogro, String tituloLogro, String descLogro) {
        ImageIcon img = new ImageIcon(getClass().getResource("/recursos/perfil/"+ nombreIconoLogro+"rec.png"));
        lblIcono.setIcon(img);
        lblDescLogro.setText(descLogro);
        lblTituloLogro.setText(tituloLogro);
    }
}
