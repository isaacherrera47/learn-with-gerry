package util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AudioEfecto {
    private Clip sonido;

    public AudioEfecto() {
        try {
            sonido= AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioEfecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void darPlay(String nombre){
        try {
            sonido.open(AudioSystem.getAudioInputStream(getClass().getResource("/recursos/audio/"+nombre+".wav")));
            sonido.start();
            Thread.sleep(200);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
            Logger.getLogger(AudioEfecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void detener(){
        sonido.stop();
        sonido.close();
    }
}
