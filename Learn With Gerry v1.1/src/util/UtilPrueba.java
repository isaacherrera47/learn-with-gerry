/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import bd.ConexionBD;
import clases.Prueba;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import juegos.primero.Memorama;
import static util.UtilLogro.obtenGradoNumero;

/**
 *
 * @author Gero
 */
public class UtilPrueba {
    private final ArrayList<Prueba> listaPruebas;

    public UtilPrueba(String grado) {
        listaPruebas= new ArrayList<>();
    }
    
     public static void obtenerPrueba(String grado, ArrayList listaPruebas){
        try {
            ConexionBD.abrirConexion();
            String sql="CALL pruebasGrado(?)";
            PreparedStatement ps = ConexionBD.con.prepareCall(sql);
            ps.setInt(1, obtenGradoNumero(grado));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Prueba p = new Prueba();
                p.setIdPrueba(rs.getInt("ID"));
                p.setNombre(rs.getString("Nombre"));
                p.setTipo(rs.getString("Tipo"));
                p.setDescripcion(rs.getString("Descripcion"));
                listaPruebas.add(p);
            }
            ConexionBD.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(UtilPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
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
     
     public static void lanzarPrueba(int idprueba){
         switch(idprueba){
             case 1:
                 new Memorama("").setVisible(true);
         }
     }
    
}
