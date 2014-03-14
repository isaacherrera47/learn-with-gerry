package extras;

import util.Memorizable;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import util.AudioEfecto;

/**
 *
 * @author Isaac
 */
public class PanelCarta extends JButton {
    AudioEfecto efectoAudioSeleccion;
    Image img;
    Image bocaArriba;
    public boolean sw = false;
    public boolean bloqueado = false;
    public int clave;
    Memorizable objVentanaPrin;

    public PanelCarta(Image img, Memorizable objVentanaPrin, int clave, Image bocaArriba) {
        initEvents();
        this.img = img;
        this.objVentanaPrin = objVentanaPrin;
        this.clave = clave;
        this.bocaArriba = bocaArriba;
        efectoAudioSeleccion = new AudioEfecto();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bocaArriba, 0, 0, getWidth(), getHeight(), this);
        if (sw || bloqueado) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    private void btnIniciarActionPerformed(ActionEvent evt) {
        efectoAudioSeleccion.darPlay("water");
        if (bloqueado == false) {
            if (!sw) {
                sw = true;
                Memorizable.seleccionados.add(this);
                objVentanaPrin.verificar();
            }
        }
        efectoAudioSeleccion.detener();
        repaint();
    }

    private void initEvents() {
        this.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        this.setContentAreaFilled(false);
        this.setOpaque(false);
        this.setFocusPainted(false);
    }

}
