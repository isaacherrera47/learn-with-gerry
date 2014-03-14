/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;



/**
 *  Se implementa en todos los juegos. Determina todas las características posibles para clase tipo Juego.
 * @author isaac
 */
public interface Jugable { 

    
    /**
     * Avisa si el temporizador ha terminado.
     */
    void estadoTemporizador();
    
    /**
     * Método para implementar java.swing.timer. Por cada método debe existir un Timer.
     */
    void hilosFondo();
    
    /**
     * Detiene los servicios/hilos activos
     */
    void detenerServicios();
}
