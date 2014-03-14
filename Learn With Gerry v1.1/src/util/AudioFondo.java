package util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Isaac
 */
public class AudioFondo {
    private static Clip sonido;

    public AudioFondo(String nombreAudio) {
        try {
            sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/recursos/audio/"+nombreAudio+".wav")));
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(AudioFondo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void reproducir(){
        sonido.start();
        sonido.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public static void detener(){
        try {
            sonido.stop();
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(AudioFondo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void eliminarHiloSonido(){
        detener();
        sonido.close();
    }
    
    
}
