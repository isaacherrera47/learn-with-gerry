package util;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author Isaac
 */
public class UtilVentana {
    
    Window ventana;

    public UtilVentana(Window ventana) {
        this.ventana = ventana;
    }


    
    
    public void maximizarPantalla(){
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d= tk.getScreenSize();
        ventana.setMinimumSize(d);
    }
    
    public void establecerIcono(){
        Image icono;
        icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/Oso.png"));
        ventana.setIconImage(icono);
    }
    
    public void establecerCursor(String nombreCursor){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cur = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/"+nombreCursor+".png"));
        Cursor cursor = toolkit.createCustomCursor(cur, new Point(0, 0), "Nombre");
        ventana.setCursor(cursor);
    }
    
    
}
