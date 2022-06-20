/*
 * Creador:cristian adair ramirez rodriguez
 * Materia: Paradigmas 1
*Fecah de creacion: 28 de mayor de 2022
 * fecha de actualizacion:19/06/2022
 */
package model;

public class ConsultaRFC {
  String Cadenafinal="",  Cadenafinalena="abcdefghijklmnopqrstuwxyz1234567890";
        int numero;
    //metodo para obtener 3 digitos Alfanumericos en aleaotorio retornando la variable Cadenafinal
    public String cadenaAleatoria(){
        for (int i = 0; i < 3; i++) {
            numero = (int) (Math.random()*36+1);
            Cadenafinal = Cadenafinal + Cadenafinalena.charAt(numero);  
        }
        return Cadenafinal.toUpperCase();    

    }
    //metodo main para la ejecucion de el metodo CadenafinalenaAleatoria
    public static void main(String[] args) 
    { 
        ConsultaRFC Azar=new ConsultaRFC();
        Azar.cadenaAleatoria();
    }
    }