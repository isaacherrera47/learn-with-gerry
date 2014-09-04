package util;

import bd.ConexionBD;
import clases.Logro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public abstract class UtilLogro implements Runnable {

    private boolean estadoServicio;
    public final HashMap<Integer,Logro> listaLogros;
    public final ArrayList<Integer> listaDesbloqueados;    
    Thread t;

    public UtilLogro(String grado, String usuario) {
        listaLogros = new HashMap();
        listaDesbloqueados = new ArrayList<>();
        llenarListaGrado(listaLogros, grado);
        llenarListaDesbloqueados(usuario);
    }

    @Override
    public void run() {
        while (estadoServicio) {
            try {
                desatarLogro();
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void llenarListaGrado(ArrayList listaLogros, String grado) {
        try {
            ConexionBD.abrirConexion();
            String sql = "CALL logrosgrado(?)";
            PreparedStatement ps = ConexionBD.con.prepareCall(sql);
            ps.setInt(1, obtenGradoNumero(grado));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Logro l = new Logro();
                l.setIdLogro(rs.getInt("idlogro"));
                l.setNombre(rs.getString("nombre"));
                l.setDescripcion(rs.getString("descripcion"));
                listaLogros.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    private void llenarListaDesbloqueados(String usuario) {
        try {
            ConexionBD.abrirConexion();
            String sql = "SELECT * FROM desbloqueado WHERE iduser= ? ORDER BY idlogros ASC;";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listaDesbloqueados.add(rs.getInt("idlogros"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    public static void llenarListaGrado(HashMap listaLogros, String grado) {
        try {
            ConexionBD.abrirConexion();
            String sql = "CALL logrosgrado(?)";
            PreparedStatement ps = ConexionBD.con.prepareCall(sql);
            ps.setInt(1, obtenGradoNumero(grado));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Logro l = new Logro();
                l.setIdLogro(rs.getInt("idlogro"));
                l.setNombre(rs.getString("nombre"));
                l.setDescripcion(rs.getString("descripcion"));
                listaLogros.put(l.getIdLogro(), l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    public static void llenarListaUsuario(ArrayList listaLogros, String nombreUsuario) {
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps = ConexionBD.con.prepareCall("call logrosusuario(?)");
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Logro l = new Logro();
                l.setIdLogro(rs.getInt("idlogro"));
                l.setNombre(rs.getString("nombre"));
                l.setDescripcion(rs.getString("descripcion"));
                listaLogros.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    public abstract void desatarLogro();

    public void iniciarServicio() {
        t = new Thread(this);
        estadoServicio = true;
        t.start();
    }

    public void detenerServicio() {
        estadoServicio = false;
        t.interrupt();
    }

    public static int obtenGradoNumero(String grado) {
        switch (grado) {
            case "Primero":
                return 1;
            case "Segundo":
                return 2;
            case "Tercero":
                return 3;
            case "Cuarto":
                return 4;
            case "Quinto":
                return 5;
            case "Sexto":
                return 6;
            default:
                return 1;
        }
    }

}
