/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bd.ConexionBD;
import clases.PerfilCarga;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class UtilBD {

    public boolean cargarPerfil(String nombreUsuario, String password) {
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps = ConexionBD.con.prepareCall("CALL iniciarSesion(?,?)");
            ps.setString(1, nombreUsuario);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                ps = ConexionBD.con.prepareCall("CALL cargarPerfil(?,?)");
                ps.setString(1, nombreUsuario);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.first()) {
                    PerfilCarga.setNombre(rs.getString("nombre"));
                    PerfilCarga.setApPaterno(rs.getString("ApPaterno"));
                    PerfilCarga.setApMaterno(rs.getString("ApMaterno"));
                    PerfilCarga.setCodAlias(rs.getString("Alias"));
                    PerfilCarga.setCodAvatar(rs.getInt("avatar"));
                    PerfilCarga.setCodColor(ColorFondo.obtenerColorPorID(rs.getInt("color")));
                    PerfilCarga.setGrado(rs.getString("grado"));
                    PerfilCarga.setLogros(rs.getInt("Logros Desbloqueados"));
                    PerfilCarga.setNick(rs.getString("usuario"));
                    PerfilCarga.setNivel(rs.getInt("nivel"));
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return false;
    }

    public boolean consultaExisteUsuario(String usuario) {
        try {
            ConexionBD.abrirConexion();
            String sql = "SELECT user FROM usuario WHERE user= ?;";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            return rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return false;
    }

    public int llenarPerfil(String usuario, String animalFavorito, int idGrado, String nombre, String apPat, String apMat) {
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps = ConexionBD.con.prepareCall("CALL llenarPerfil(?,?,?,?,?,?)");
            ps.setString(1, usuario);
            ps.setString(2, animalFavorito);
            ps.setInt(3, idGrado);
            ps.setString(4, nombre);
            ps.setString(5, apPat);
            ps.setString(6, apMat);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return 0;
    }

    public static void desatarLogroID(int id, String idUsuario,int cantidad) {
        try {
            ConexionBD.abrirConexion();
            String sql = "INSERT INTO desbloqueado VALUES (?,?)";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setString(1, idUsuario);
            ps.setInt(2, id);
            ps.executeUpdate();
            PerfilCarga.setLogros(PerfilCarga.getLogros() + 1);
            aumentarNivel(idUsuario,cantidad);
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
    }

    public static boolean comprobarLogroUsuario(String user, int idLogro) {
        try {
            ConexionBD.abrirConexion();
            String sql = "CALL comprobarLogro(?,?)";
            PreparedStatement ps = ConexionBD.con.prepareCall(sql);
            ps.setString(1, user);
            ps.setInt(2, idLogro);
            ResultSet rs = ps.executeQuery();
            return rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return true;
    }

    public static void aumentarNivel(String idUsuario,int cantidad) {
        try {
            String sql = "update usuario set nivel = ? where user = ?";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setInt(1, (PerfilCarga.getNivel() + cantidad));
            ps.setString(2, idUsuario);
            if (ps.executeUpdate() == 1) {
                PerfilCarga.setNivel(PerfilCarga.getNivel() + cantidad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
