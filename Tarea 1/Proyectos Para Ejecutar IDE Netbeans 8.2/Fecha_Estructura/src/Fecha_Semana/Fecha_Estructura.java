
package Fecha_Semana;

import java.util.Scanner;
import java.util.Calendar;//LIBRERIA QUE SIRVE PARA PODER INVOCAR LAS FECHAS INGRESADAS
import java.text.SimpleDateFormat;//LIBRERIA QUE SIRVE PARA DARLE FORMATO A LA FECHA EJEMPLO DD/MM/YYYY
import java.util.Date;
public class Fecha_Estructura {

   public static Scanner leer=new Scanner(System.in);
   public static String OtraEntrada;
    public static void main(String[] args) {
      
        Fecha f=new Fecha();//Clase que contiene el metodo que presentara el dia de la semana de una fecha establecida por el usuario
        
        do {
        
        f.fecha();//Objeto que llamara el metodo que servira para mostar el dia de la semana de una fecha establecida por el usuario
        System.out.println("Desea Ingresar Otra Fecha Presione [CUALQUIER TECLA ALFANUMERICA EXCEPTO (N ó n)] <para si> |ó| (N ó n) <Para no> y luego Enter");
        OtraEntrada=leer.nextLine();
        
       
        } while (!OtraEntrada.toLowerCase().equals("n"));
        
     
        
        
    }
    
    
}
