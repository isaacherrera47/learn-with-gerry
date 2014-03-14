
package util;
import java.awt.Color;
/**
 *
 * @author Isaac
 */
public enum ColorFondo {
    ROJO(new Color(204,51,51),3), PASTELES( new Color(255,102,102),1),NARANJA(new Color(255,102,51),2),
    AZUL(new Color(102,204,204),4),MORA(new Color(102,102,153),5),VERDE(new Color(51,153,51),6),OCEANO(new Color(0,153,153),7);
    
    private final Color codColor;
    private final int codColo;
    public static final int MENSAJE_ERROR=3;
    public static final int MENSAJE_BIEN=6;
    public static final int MENSAJE_ADVERTENCIA=2;

    private ColorFondo(Color codColor, int codColo) {
        this.codColor = codColor;
        this.codColo = codColo;
    }
    
    
    public Color getColor() {
        return codColor;
    }
    public int getColorNum(){
        return codColo;
    }        
    
    public static int obtenerIdPorColor(Color color){
        if(color.getRGB() == ColorFondo.AZUL.getColor().getRGB()){
            return ColorFondo.AZUL.getColorNum();
        }
        if(color.getRGB() == ColorFondo.MORA.getColor().getRGB()){
            return ColorFondo.MORA.getColorNum();
        }
        if(color.getRGB() == ColorFondo.NARANJA.getColor().getRGB()){
            return ColorFondo.NARANJA.getColorNum();
        }
        if(color.getRGB() == ColorFondo.OCEANO.getColor().getRGB()){
            return ColorFondo.OCEANO.getColorNum();
        }
        if(color.getRGB() == ColorFondo.PASTELES.getColor().getRGB()){
            return ColorFondo.PASTELES.getColorNum();
        }
        if(color.getRGB() ==  ColorFondo.ROJO.getColor().getRGB()){
            return ColorFondo.ROJO.getColorNum();
        }
        if(color.getRGB() == ColorFondo.VERDE.getColor().getRGB()){
            return ColorFondo.VERDE.getColorNum();
        }
        return 3;
    }
    public static Color obtenerColorPorID(int id){
        Color c;
        switch(id){
            case 1:
                c= PASTELES.codColor;
                return c;                
            case 2:
                c =  NARANJA.codColor;
                return c;                
            case 3:
                c= ROJO.codColor;
                return c;
            case 4: 
                c= AZUL.codColor;
                return c;
            case 5:
                c= MORA.codColor;
                return c;
            case 6:
                c= VERDE.codColor;
                return c;
            case 7:
                c= OCEANO.codColor;
                return c;
            default:
                c= ROJO.codColor;
                return c;
        }
    }   
}
