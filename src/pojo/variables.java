/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Usuario
 */
public class variables {

    static String nombres, apellidoP, apellidoM, Sexo;
    static char con_nomb, con_am, Con_ap;
    static String Estado, Fecha;
    static Integer Dia = 0, Año = 0, Mes = 0;

    public variables() {
    }

    public static String getNombres() {
        return nombres;
    }

    public static void setNombres(String nombres) {
        variables.nombres = nombres;
    }

    public static String getApellidoP() {
        return apellidoP;
    }

    public static void setApellidoP(String apellidoP) {
        variables.apellidoP = apellidoP;
    }

    public static String getApellidoM() {
        return apellidoM;
    }

    public static void setApellidoM(String apellidoM) {
        variables.apellidoM = apellidoM;
    }

    public static String getSexo() {
        return Sexo;
    }

    public static void setSexo(String Sexo) {
        variables.Sexo = Sexo;
    }

    public static char getCon_nomb() {
        return con_nomb;
    }

    public static void setCon_nomb(char con_nomb) {
        variables.con_nomb = con_nomb;
    }

    public static char getCon_am() {
        return con_am;
    }

    public static void setCon_am(char con_am) {
        variables.con_am = con_am;
    }

    public static char getCon_ap() {
        return Con_ap;
    }

    public static void setCon_ap(char Con_ap) {
        variables.Con_ap = Con_ap;
    }

    public static String getEstado() {
        return Estado;
    }

    public static void setEstado(String Estado) {
        variables.Estado = Estado;
    }

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        variables.Fecha = Fecha;
    }

    public static Integer getDia() {
        return Dia;
    }

    public static void setDia(Integer Dia) {
        variables.Dia = Dia;
    }

    public static Integer getAño() {
        return Año;
    }

    public static void setAño(Integer Año) {
        variables.Año = Año;
    }

    public static Integer getMes() {
        return Mes;
    }

    public static void setMes(Integer Mes) {
        variables.Mes = Mes;
    }

}
