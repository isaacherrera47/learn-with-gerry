/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import bd.ConexionBD;
import clases.Estadisticas;
import clases.PerfilCarga;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gero
 */
public class UtilDetalles {
    private final ArrayList<Estadisticas> listaDetalles;
    
    public UtilDetalles() {
        listaDetalles = new ArrayList<>();
    }
    
    public static void obtenerDetalles(ArrayList listaDetalles){
        try {
            ConexionBD.abrirConexion();
            String sql ="CALL detallesPrueba(?)";
            PreparedStatement ps = ConexionBD.con.prepareCall(sql);
            ps.setString(1, PerfilCarga.getNick());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Estadisticas esta = new Estadisticas();
                esta.setNombre(rs.getString("Nombre"));
                esta.setTipo(rs.getString("Tipo"));
                esta.setDescripcion(rs.getString("Descripcion"));
                esta.setNumeroIntentos(rs.getInt("Numero de Intentos"));
                listaDetalles.add(esta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
