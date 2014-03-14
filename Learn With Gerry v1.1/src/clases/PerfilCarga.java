/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Color;


public class PerfilCarga {
    static String nombre;
    static String nick;
    static String grado;
    static int logros;
    static String Alias;
    static int nivel;
    static int codAvatar;
    static Color codColor;
    static String apPaterno;
    static String apMaterno;

    public static String getApPaterno() {
        return apPaterno;
    }

    public static void setApPaterno(String apPaterno) {
        PerfilCarga.apPaterno = apPaterno;
    }

    public static String getApMaterno() {
        return apMaterno;
    }

    public static void setApMaterno(String apMaterno) {
        PerfilCarga.apMaterno = apMaterno;
    }
    

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        PerfilCarga.nombre = nombre;
    }

    public static String getNick() {
        return nick;
    }

    public static void setNick(String nick) {
        PerfilCarga.nick = nick;
    }

    public static String getGrado() {
        return grado;
    }

    public static void setGrado(String grado) {
        PerfilCarga.grado = grado;
    }

    public static int getLogros() {
        return logros;
    }

    public static void setLogros(int logros) {
        PerfilCarga.logros = logros;
    }

    public static String getAlias() {
        return Alias;
    }

    public static void setCodAlias(String Alias) {
        PerfilCarga.Alias = Alias;
    }

    public static int getNivel() {
        return nivel;
    }

    public static void setNivel(int nivel) {
        PerfilCarga.nivel = nivel;
    }

    public static int getCodAvatar() {
        return codAvatar;
    }

    public static void setCodAvatar(int codAvatar) {
        PerfilCarga.codAvatar = codAvatar;
    }

    public static Color getCodColor() {
        return codColor;
    }

    public static void setCodColor(Color codColor) {
        PerfilCarga.codColor = codColor;
    }
    
    
    
    
}