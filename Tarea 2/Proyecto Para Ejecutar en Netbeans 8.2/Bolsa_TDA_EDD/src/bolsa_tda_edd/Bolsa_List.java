
package bolsa_tda_edd;

import java.util.Scanner;
public class Bolsa_List {
    public static int ContadorDeElementos;
    Scanner leer=new Scanner(System.in);
    Bolsa PrimerElemento;
    Bolsa UltimoElemnto;
    
    
    
    public Bolsa_List(){
        
        PrimerElemento=null;
        UltimoElemnto=null;
        
        
    }
    
    
    public void Insertar(int x,int y){
        
        Bolsa NuevoElemento=new Bolsa();
        NuevoElemento.EnteroX=x;
        NuevoElemento.EnteroY=y;
        if (PrimerElemento==null) {
            
            PrimerElemento=NuevoElemento;
            UltimoElemnto=PrimerElemento;
            PrimerElemento.Siguiente=UltimoElemnto;// 
            ContadorDeElementos++;
        }
        
        else {
            UltimoElemnto.Siguiente=NuevoElemento;
            NuevoElemento.Siguiente=PrimerElemento;
            UltimoElemnto=NuevoElemento;
            ContadorDeElementos++;
        }
        
        
    }
    
    public boolean EsVacia(){
        boolean Respuesta=false;
        
        if (PrimerElemento==null) {//si el primer elemento es null entonces la bolsa esta vacia
            
            Respuesta=true;
            
        }
        
        return Respuesta;
    }
    
    public int Cuantos(int x,int y){
        
        int contadorElementos=0;//servira para contar los elementos que esten en la bolsa
        boolean RespuestaVacio=false;//servira para conocer la respuesta de si esta vacia o no la bolsa segun el metodo EsVacia
        Bolsa ElementoAux=new Bolsa();//servira para recorrer los elementos de la bolsa
        ElementoAux=PrimerElemento;
        
        RespuestaVacio=EsVacia();
        do {
            
            
            if (RespuestaVacio==false) //si mandan true esta vacia y si es false esta llena y puede entrar a buscar si aparece el elemento
                //que se desee encontrar

            {
            
            if (ElementoAux.EnteroX==x && ElementoAux.EnteroY==y) //si encuentra el elemento en la bolsa entoncces le suma uno al contador
            { 
                
                contadorElementos=ContadorDeElementos;//se ira incrementando con forme este recorriendo toda la bolsa
                // 
            }
            
            else
            {
                contadorElementos=0;
            }
           
          }
            
            
            else{//si es true que esta vacia entonces de una vez marca 0 elementos en la bolsa
                contadorElementos=0;
                return contadorElementos;
                
            }
           
            ElementoAux=ElementoAux.Siguiente;
            
            
        } while (ElementoAux!=PrimerElemento);
        
        return contadorElementos;//devolvera la cantidad de elementos que existan en la lista
    }
    
    
    public void MostrarElementos(){
        boolean SiImprimir=false;
        Bolsa ElementoAux=new Bolsa();
        SiImprimir=EsVacia();
        ElementoAux=PrimerElemento;
        do {
            if (SiImprimir==false) {
          
                System.out.println("|"+ElementoAux.EnteroX+"|"+ElementoAux.EnteroY+"|");
            ElementoAux=ElementoAux.Siguiente;
                  
            }
            
            else {
                System.out.println("N/A");
            }
          
        } while (ElementoAux!=PrimerElemento);
        
        
        
        
    }
    
    
}
