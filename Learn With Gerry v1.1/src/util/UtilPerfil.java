/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import bd.ConexionBD;
import clases.PerfilCarga;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;
import net.java.balloontip.utils.TimingUtils;

/**
 *
 * @author isaac_000
 */
public class UtilPerfil {
    
    private static BalloonTip b;
    private static BalloonTipStyle bs;
    
    public static void mandarNotificacion(int tipoMensaje, JComponent componenteFoco, JLabel etiquetaNotif){
        bs = new MinimalBalloonStyle(ColorFondo.obtenerColorPorID(tipoMensaje), 0);
        b= new BalloonTip(componenteFoco, etiquetaNotif, bs, false);
        FadingUtils.fadeInBalloon(b, null, 300, 24);
        TimingUtils.showTimedBalloon(b, 2000);
    }
    
    public static void mandarNotificacionLogro(JComponent componenteFoco, JPanel popupLogro){
        bs= new MinimalBalloonStyle(Color.WHITE, 0);
        bs.setHorizontalOffset(0);
        bs.setVerticalOffset(0);
        b= new BalloonTip(componenteFoco, popupLogro, bs, false);
        FadingUtils.fadeInBalloon(b, null, 300, 24);
        TimingUtils.showTimedBalloon(b, 4000);
    }
    
    public static void almacenarColorPerfil(String nombreUsuario, int idColor){
        try {
            ConexionBD.abrirConexion();
            String sql= "UPDATE usuario SET color = ? WHERE user= ?";
            PreparedStatement ps =  ConexionBD.con.prepareStatement(sql);
            ps.setInt(1, idColor);
            ps.setString(2, nombreUsuario);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilPerfil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }
    
    public static void almacenarAvatarPerfil(String nombreUsuario, int idAvatar){
        try {
            ConexionBD.abrirConexion();
            String sql="UPDATE usuario SET avatar = ? WHERE user=?";
            PreparedStatement ps=  ConexionBD.con.prepareStatement(sql);
            ps.setInt(1, idAvatar);
            ps.setString(2, nombreUsuario);
            ps.executeUpdate();
            PerfilCarga.setCodAvatar(idAvatar);
        } catch (SQLException ex) {
            Logger.getLogger(UtilPerfil.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConexionBD.cerrarConexion();            
        }
    }
    
}
