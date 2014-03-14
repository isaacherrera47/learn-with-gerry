package util;

import extras.PanelCarta;
import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public interface Memorizable {

    ArrayList<PanelCarta> seleccionados = new ArrayList<>();
    ArrayList<PanelCarta> todos2 = new ArrayList<>();
    ArrayList<PanelCarta> todos = new ArrayList<>();

    void verificar();

    void ocultar();
    
    /**
     *  Agrega las tarjetas de memorama al panel principal
     * @param tipo Tipo de tarjetas de memorama
     */
    void agregarPaneles(String tipo);
    
    /**
     * Método que comprueba el estado del memorama.
     * @return int Retorna 0 en estado normal. 1 cuando se ha ganado. -1 cuando se ha perdido
     * 
     */
    int estadoMemorama();
    
    void serviciosAlFondo();
}
