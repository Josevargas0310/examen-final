
package registrodedepartamentos;


public class Nodo {
   public String dato;
   public Nodo siguiente;//puntero
   
   //constructor 
   public Nodo(String d){ //para ingresar datos al final
       dato=d;
       siguiente=null;
   }
   
}
