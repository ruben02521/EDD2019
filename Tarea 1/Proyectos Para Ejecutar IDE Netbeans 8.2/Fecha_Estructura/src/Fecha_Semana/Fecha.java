
package Fecha_Semana;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Calendar;//LIBRERIA QUE SIRVE PARA PODER INVOCAR LAS FECHAS INGRESADAS
import java.text.SimpleDateFormat;//LIBRERIA QUE SIRVE PARA DARLE FORMATO A LA FECHA EJEMPLO DD/MM/YYYY
import java.util.Date;
public class Fecha {
    
    public String VisualizarFecha;// Variable que almacenara la fecha ingresada
    public Date fecha;// servira para utilizar la clase calendar y buscar el dia de la fecha antes ingresada
    public Scanner Leer=new Scanner(System.in);//sirve para leer la entrada por teclado que el usuario ingreso
    public int Dia;//sirve para almacenar el dia que se desee visualizar
    public int Mes;//sirve para almacenar el mes que se desee visualizar
    public int Año;//sirve para almacenar el Año que se desee visualizar
    public int DiaSemana;//sirve para obtenes el numero del dia de la clase calendar 
    public char Correcto;//sirve para volver a solicitar dia,mes,Año si estuviera algo mal ingresado
    public String fechaBuscar;//sirve para almacenar la fecha en el siguiente formato dd/mm/yyyy
    public Calendar FechaMostrar=Calendar.getInstance();//clase Abtracta sirve para obtener fecha/hora 
    public Fecha(){
        
        Correcto='N';
        
    }
    
    public void fecha(){//metodo
        
       SimpleDateFormat formato=new SimpleDateFormat("dd/M/yyyy");//formato para la fecha impuesta en la clase Calendar
     try  {   
       
        do {
            
        System.out.println("Ingrese Dia de la Semana:");
        Dia=Leer.nextInt();
        System.out.println("Ingrese Mes:");
        Mes=Leer.nextInt();
        System.out.println("Ingrese Año:");
        Año=Leer.nextInt();
        
            
            if ((Dia<=31&& Dia>=1)&& (Mes<=12&&Mes>=1) && Año>=1700) {
              
              fechaBuscar=String.valueOf(Dia)+"/"+String.valueOf(Mes)+"/"+String.valueOf(Año);
              fecha=formato.parse(fechaBuscar);
              FechaMostrar.setTime(fecha);
              DiaSemana=FechaMostrar.get(Calendar.DAY_OF_WEEK);
              
              switch(DiaSemana)//dependiendo del numero que devuelva la clase calendar, los dias estan dados por los case siguientes en ese orden los devuelve
              {
                  case 1:
                      System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Domingo");
                      break;
                  case 2:
                      System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Lunes");
                      
                  break;
                  case 3:
                       System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Martes");
                  break;
                  case 4:
                       System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Miercoles");
                  break;
                  case 5:
                       System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Jueves");
                  break;
                  case 6:
                       System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Viernes");
                  break;
                 
                  case 7:
                       System.out.println("La Fecha Ingresada es: "+fechaBuscar);
                      System.out.println("El Dia De La Semana Es: Sabado");
                  break;
                      
              }
              
              Correcto='S';
            }
            
            else if (Dia<0) {
                System.out.println("Ingrese un numero entero positivo para el Dia");
                fechaBuscar="";
                Correcto='N';
            }
            else if (Mes<0) {
                System.out.println("Ingrese un numero entero positivo para el Mes");
                fechaBuscar="";
                Correcto='N';
            }
            
            else if (Año<0) {
                System.out.println("Ingrese un numero entero positivo para el Año");
                fechaBuscar="";
                Correcto='N';
            }
            
            else if (Mes>12) {
                  System.out.println("Ingrese un numero que este en el rango de 1 a 12 para el Mes");
                fechaBuscar="";
                Correcto='N';
            }
          
            else if (Año<1700) {
                System.out.println("Ingrese un Año superior o igual a 1700");
                fechaBuscar="";
                Correcto='N';
            }
            
            
            for (int i = 0; i < 4; i++) {//sirve para espaciado al final de cada ejecucion del programa
                System.out.println("");
            }
            
        } while (Correcto!='S');
        
     }
     catch(ParseException e){
         
     }
        
        
    }
    
    
   
    
    
    
    
    
    
    
    
}
