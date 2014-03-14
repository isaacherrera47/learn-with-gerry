/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import bd.ConexionBD;
import clases.Logro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public abstract class UtilLogro implements Runnable{
    private boolean estadoServicio;
    private final ArrayList<Logro> listaLogros;
    Thread t;

    public UtilLogro(String grado) {
        listaLogros = new ArrayList<>();
        llenarListaGrado(listaLogros,grado);
    }
    
    
    @Override
    public void run() {
        while(estadoServicio){
            try {
                desatarLogro();
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void llenarListaGrado(ArrayList listaLogros, String grado){
        try {
            ConexionBD.abrirConexion();
            String sql="CALL logrosgrado(?)";
            PreparedStatement ps= ConexionBD.con.prepareCall(sql);
            ps.setInt(1, obtenGradoNumero(grado));
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Logro l = new Logro();
                l.setIdLogro(rs.getInt("idlogro"));
                l.setNombre(rs.getString("nombre"));
                l.setDescripcion(rs.getString("descripcion"));
                listaLogros.add(l);
            }
            ConexionBD.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void llenarListaDesbloqueado(ArrayList listaLogros, String user){
        
    }
    
    public abstract void desatarLogro();
    
    public void insertarLogroUsuario(String nombreUsuario , int idLogro){
        try {
            ConexionBD.abrirConexion();
            String sql = "INSERT INTO desbloqueado VALUES(?,?)";
            PreparedStatement ps= ConexionBD.con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setInt(2, idLogro);
            ps.execute();
            ConexionBD.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(UtilLogro.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void iniciarServicio(){
        t= new Thread(this);
        estadoServicio = true;
        t.start();
    }
    
    public void detenerServicio(){
        estadoServicio = false;        
        t.interrupt();
    }
    
    public static int obtenGradoNumero(String grado){
        switch(grado){
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
