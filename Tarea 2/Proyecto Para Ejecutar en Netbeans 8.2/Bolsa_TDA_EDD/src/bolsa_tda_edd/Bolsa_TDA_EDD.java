
package bolsa_tda_edd;

import java.util.Scanner;
public class Bolsa_TDA_EDD {
     
     static Scanner leer=new Scanner(System.in);
     static int opcion=0;
     static int x;
     static int y;
    public static void main(String[] args) {
        Bolsa_List Bolson=new Bolsa_List();
      
        
        
          do{
       try{
        System.out.println("MENU-ACCIONES-CON-LA-BOLSA");
        System.out.println("[1] Ingresar Elemento");//ESTE ES EL INGRESAR 
        System.out.println("[2] Verificar si la Bolsa Esta Vacia");//ESTE ES EL EsVacia
        System.out.println("[3] Numero De Nodos A Partir De Una Entrada De Un Entero X, Entero Y");//ESTE ES EL [CUANTOS] elementos hay en la bolsa
        System.out.println("[4] Mostrar Elementos De La Bolsa");//sirve para verificar que la cantidad que resulte de la opcion 3 es valida
        System.out.println("[5] salir");
        opcion=leer.nextInt();
       }
       catch(Exception e){
           System.out.println("Ingrese un parametro valido");
           leer.nextLine();//si hay una exepcion entonces leera la siguente linea y pedira un nuevo valor
           for (int i = 0; i < 4; i++) {//sirve solo para dar espaciado y que no se vea todo amontonado
               
           }
           
       }
        switch(opcion){
            
            case 1:
                try{
                System.out.println("Ingrese Entero X ");
                x=leer.nextInt();
                System.out.println("Ingrese Entero Y");
                y=leer.nextInt();
                Bolson.Insertar(x,y);//Manda a insertar a la bolsa elementos en su nodo
                System.out.println("Elemento Ingresado");
                }
                catch(Exception e){
                    System.out.println("Ingrese Numeros Enteros");
                    leer.nextLine();
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("");//sirve solo para dar espaciado y que no se vea todo amontonado
                }
                break;
    
            case 2:
                
                
                if (Bolson.EsVacia()==true) {
                    System.out.println("La Bolsa Esta Vacia");     
                }
                
                else{
                    System.out.println("La Bolsa No Esta Vacia");
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("");//sirve solo para dar espaciado y que no se vea todo amontonado
                }
               
                break;
                
            case 3:
             
                try{
                System.out.println("Ingrese Entero X");
                x=leer.nextInt();
                System.out.println("Ingrese Entero Y");
                y=leer.nextInt();
                System.out.println("La Bolsa Dispone De: "+Bolson.Cuantos(x,y)+" Elementos");
                }
                catch(Exception e){
                    System.out.println("Ingrese Numeros Enteros");
                    leer.nextLine();
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("");//sirve solo para dar espaciado y que no se vea todo amontonado
                }
                
                break;
                
                case 4:
                    System.out.println("Los Elementos Presentes en la bolsa son:");
                    Bolson.MostrarElementos();
                     for (int i = 0; i < 4; i++) {//sirve solo para dar espaciado y que no se vea todo amontonado
                    System.out.println("");
                }
               
                    break;
                    
                
            case 5:
                System.out.println("Fin Del Programa");
                break;
            default:
                System.out.println("Ingrese una opcion en el rango 1-5");
                     for (int i = 0; i < 4; i++) {//sirve solo para dar espaciado y que no se vea todo amontonado
                    System.out.println("");
                }
               
                break;
            
        }
        
       
        }while(opcion!=5);
        
    }
    
    
   
    
}
