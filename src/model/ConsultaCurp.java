package model;
/*
 * Creador:cristian adair ramirez rodriguez
 * Materia: Paradigmas 1
*Fecah de creacion: 28 de mayor de 2022
 * fecha de actualizacion:08/06/2022
 */
public class ConsultaCurp {

static String nombres,apellidoP,apellidoM,Sexo;
static char con_nomb,con_am, Con_ap;
static String Estado,Fecha; 
static Integer Dia=0, Año=0, Mes =0;
     
    public  String nombres(String nombre){
         nombres=nombre.toUpperCase();
         
          for (int  i = 1; i < nombres.length(); i++) {
            char l = nombres.charAt(i);
            //no tomaremos en cuenta las vocales para el nombre
            if(l !='A' && l !='E' && l !='I' && l !='O' && l !='U'){
                 con_nomb=l; 
                break;
            }
        }
          //retornamos la primer y segunda letra
        return nombres.substring(0,1);
    }
    
    public  String Apellido_materno(String Apellidom){
         
         Apellidom=Apellidom.toUpperCase();
          for (int i = 1; i < Apellidom.length(); i++) {
              char l = Apellidom.charAt(i);
            if(l !='A' && l !='E' && l !='I' && l !='O' && l !='U'){ // excluimos a las vocales
                con_am = l; // tomamos la consonante del Apellido materno
                break;
            }
        }
         
         
        return Apellidom.substring(0,1);// Primera letra del segundo Apellido...
    }
    
    
    public  void Fecha_nacimiento(String año, String mes, String dia){// Almacenamos la fecha de nacimiento del sujeto....
        
        Dia=Integer.parseInt(dia); // Permite permite la manipulacion de la cadena 
        Mes=Integer.parseInt(mes);
        Año=Integer.parseInt(año);
        
        
         String año1 = String.valueOf(Año);
            
        // almacena el año de nacimiento de la persona.....
        char c1_año = año1.charAt(2); //Se almacena el penultimo número
        char c2_año = año1.charAt(3);// Se almacena el último número
         String mes1 = String.valueOf(Mes);//obtendremos el valor de el mes
         char c3_mes, c4_mes;
         if(Mes < 10){ //m verificamos el mes de nacimiento.....
            c3_mes = '0';
            c4_mes = mes1.charAt(0);
        }
        else{// mes>10
              c3_mes = mes1.charAt(0);
            c4_mes = mes1.charAt(1);
        }
        
        
        String dia1= String.valueOf(Dia); // devuelve un String
        char c5_dia;
        char c6_dia;
        if(Dia < 10){
            c5_dia = '0';
             c6_dia = dia1.charAt(0);
        }else{ //dia>10
             c5_dia = dia1.charAt(0);
           c6_dia = dia1.charAt(1);
        }
        
        
        Fecha = String.valueOf(c1_año+""+c2_año   +"" + c3_mes+ ""  + "" +c4_mes +"" + c5_dia +""+ c6_dia);
        
    }
    
    public  String Genero(String sexo){
        
             sexo=sexo.toUpperCase();
         switch(sexo){ // conforme lo que selecciono es su genero
             
             case "HOMBRE":{
                 Sexo="H";
                 break;
                 
             }
             case "MUJER":{
                 Sexo="M";
                 
                 break;
             }
                 
         }
             
        return Sexo;
    }
    
    
      public  String Entidad_nacimiento(String estadoR){
     
          //pasamo el dato de el estado de el usuario
           estadoR= estadoR.toUpperCase(); 
           
         switch(estadoR){ //conforme la opcion que tomo se tomara las siglas
             
             case "AGUASCALIENTE":{                 
                 Estado="AS";                 
                 break;
             }
             
               case "BAJA CALIFORNIA SUR":{
                 Estado="BS";
                 break;
             }
               
               case "COAHUILA":{                
                 Estado="CL";                 
                 break;
             }
               case "CHIAPAS":{                 
                 Estado="CS";                 
                 break;
             }
               
               case "DISTRITO FEDERAL":{                 
                 Estado="DF";
                 break;                
             }
               
               case "GUANAJUATO":{                  
                   Estado="GT";
                   break;
               } 
               
               case "HIDALGO":{                   
                   Estado="HG";
                   break;
               } 
               
               case "MÉXICO":{                   
                   Estado="MC";
                   break;
               } 
               
               case "MORELOS":{                   
                   Estado="MS";
                   break;
               } 
               
               case "NUEVO LEÓN":{                   
                   Estado="NL";
                   break;
               } 
               
               case "PUEBLA":{
                Estado="PL";
                break;
                } 
               
               case "QUINTANA ROO":{   
                   Estado="QR";
                   break;
               } 
               
               case "SINALOA":{
                   Estado="SL";
                   break;
               } 
               
               case "TABASCO":{
                   Estado="TC";
                   break;
               } 
               
               case "TLAXCALA":{
                   Estado="TL";
                 break;  
               } 
               
               case "YUCATAN":{
                   Estado="YN";
                   break;
               } 
               
               case "BAJA CALIFORNIA":{
                   Estado="BC";
                   break;
               } 
               
               case "CAMPECHE":{
                   Estado="CC";
                   break;
               } 
               
               case "COLIMA":{
                   Estado="CM";
                   break;
               } 
               
               case "CHIHUAHUA":{
                   Estado="CH";
                   break;
               } 
               
               case "DURANGO":{
                   Estado="DG";
                   break;
               } 
               
               case "GUERRERO":{
                   Estado="GR";
                   break;
               } 
               
               case "MICHOACÁN":{
                   Estado="JC";
                   break;
               } 
               
               case "NAYARIT":{
                   Estado="NT";
                   break;
               } 
               case "OAXACA":{
                   
                   Estado="OC";
                  break; 
               } 
               
               case "QUERÉTARO":{
                   Estado="QT";
                  break; 
               } 
               
               case "SAN LUIS POTOSÍ":{
                   Estado="SP";
                   break;
               } 
               
               case "SONORA":{
                   Estado="SR";
                   break;
               }
               
                 case "TAMAULIPAS":{
                   Estado="TS";
                   break;
               }
                 
                 case "VERACRUZ":{
                   Estado="VZ";
                   break;
               }
                 
                 case "ZACATECAS":{
                   Estado="ZS";
                   break;
               }
                 
                 case "JALISCO":{
                   Estado="JC";
                   break;
               }
                 
                 case "MICHOHACAN":{
                   
                   Estado="MN";
                   break;
               }
         }
        return Estado;
    }
     
    
       public  String curp_g(String apellidop, String nombre, String apellidom, String sexo, String entidad){
            int i;
            
              apellidop=apellidop.toUpperCase();
              //usamos una secuencia para excluir las consonantes 
              for ( i = 1; i < apellidop.length(); i++) {
            char l = apellidop.charAt(i);
            if(l !='A' && l !='E' && l !='I' && l !='O' && l !='U'){ 
                 Con_ap = l; //obtendremos las consonates del apellido paterno.
                break;
            }
        }
       
            apellidoP = apellidop.substring(0,1);
           
            char j=0 ;
            for( i = 0; i<apellidop.length();i++){
                
                switch(apellidop.charAt(i)){
                    
                     case 'A':{
                         
                        j=apellidop.charAt(i);
                        i=apellidop.length();
                        
                        break;
                    } 
                    
                    case 'E':{
                        
                         j=apellidop.charAt(i);
                          i=apellidop.length();
                         break;
                    } 
                    case 'I':{
                        
                         j=apellidop.charAt(i);
                          i=apellidop.length();
                         break;
                    } 
                    case 'O':{
                        
                         j=apellidop.charAt(i);
                          i=apellidop.length();
                         break;
                    } 
                    case 'U':{
                        
                          j=apellidop.charAt(i);
                           i=apellidop.length();
                         break;
                    }          
            }
             
    }
            
          
        // usamos el metodo math.random para obtener 2 numeros al azar        
         int numero = (int)(Math.random()*9+1);
        String x = String.valueOf(numero); 
      
        numero = (int) (Math.random()*9+1);
        String y = String.valueOf(numero);
        
        String consonante = String.valueOf(Con_ap+"" + con_am +""+ con_nomb);//concatenamos Los elementos obtenidos. 
                                                                              
      apellidoP = apellidoP +j;
      //retornamos e imprimimos todos los valores obtenidos 
return apellidoP + Apellido_materno(apellidom)+ nombres(nombre)+ Fecha+Genero(sexo)+ Entidad_nacimiento(entidad)+consonante+x+y;
     }     
                 
    
    
}
