
package bolsa_tda_edd;

import java.util.Scanner;
public class Bolsa_List {
    
    Scanner leer=new Scanner(System.in);
    Bolsa PrimerElemento;
    Bolsa UltimoElemnto;
    
    
    
    public Bolsa_List(){
        
        PrimerElemento=null;
        UltimoElemnto=null;
        
        
    }
    
    
    public void Insertar(Object N_Elemento){
        
        Bolsa NuevoElemento=new Bolsa();
        NuevoElemento.Elemento=N_Elemento;
        
        if (PrimerElemento==null) {
            
          PrimerElemento=NuevoElemento;//como al inicio es null entonces primero apunta a nuevo
          PrimerElemento.Siguiente=null;//luego hacemos que nuevo que ahora es el primero apunte a null
          UltimoElemnto=PrimerElemento;// luego hacemos que ultimo apunte a primero y como primero es nuevo y nuevo apunta a null entonces quedo ya
            
        }
        else
        {
        UltimoElemnto.Siguiente=NuevoElemento;//como antes ultimo estaba apuntando a null entonces ahora el primero apuntara a uno nuevo y luego ese
        NuevoElemento.Siguiente=null;//nuevo apuntara a null
        UltimoElemnto=NuevoElemento;//y luego ultimo apuntara a el nuevo que apunta a null
        }
        
        
    }
    
    public boolean EsVacia(){
        boolean Respuesta=false;
        
        if (PrimerElemento==null) {//si el primer elemento es null entonces la bolsa esta vacia
            
            Respuesta=true;
            
        }
        
        return Respuesta;
    }
    
    public int Cuantos(Object Elemento){
        
        int contadorElementos=0;//servira para contar los elementos que esten en la bolsa
        boolean RespuestaVacio=false;//servira para conocer la respuesta de si esta vacia o no la bolsa segun el metodo EsVacia
        Bolsa ElementoAux=new Bolsa();//servira para recorrer los elementos de la bolsa
        ElementoAux=PrimerElemento;
        
        RespuestaVacio=EsVacia();
        
        while (ElementoAux!=null) 
        {
            if (RespuestaVacio==false) //si mandan true esta vacia y si es false esta llena y puede entrar a buscar si aparece el elemento
                //que se desee encontrar

            {
            
            if (ElementoAux.Elemento.equals(Elemento)) //si encuentra el elemento en la bolsa entoncces le suma uno al contador
            { 
                
                contadorElementos++;//se ira incrementando con forme este recorriendo toda la bolsa
                
            }
            
            else
            {
                contadorElementos=0;
            }
           
          }
            
            
            else{//si es true que esta vacia entonces de una vez marca 0 elementos en la bolsa
                contadorElementos=0;
            }
           
            ElementoAux=ElementoAux.Siguiente;
            
        }
        
        return contadorElementos;//devolvera la cantidad de elementos que existan en la lista
    }
    
    
    public void MostrarElementos(){
        
        Bolsa ElementoAux=new Bolsa();
        
        ElementoAux=PrimerElemento;
        while (ElementoAux!=null) {
            
            System.out.println(ElementoAux.Elemento);
            ElementoAux=ElementoAux.Siguiente;
            
            
            
        }
        
        
        
    }
    
    
}
