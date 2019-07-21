/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_numprimo;

import java.util.Scanner;

public class Algoritmo_NumPrimo {
public static String OtraEntrada;
public static Scanner leer=new Scanner(System.in);

public static void main(String[] args) {
        
        Numero_Primos num=new Numero_Primos();//Clase que contiene el Metodo que contiene el Algoritmo Criba de Eratostenes
        
        do {
        
            num.Numero_primos();//Objeto que llamara el metodo del algoritmo de Criba de Eratostenes
        System.out.println("Desea Ingresar Otro Numero Presione [CUALQUIER TECLA ALFANUMERICA EXCEPTO (N ó n)] <para si> |ó| (N ó n) <Para no> y luego Enter");
        OtraEntrada=leer.nextLine();
        
        } while (!OtraEntrada.toLowerCase().equals("n"));
        
       
    }
    
}
