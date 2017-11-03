/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.36
 *
 * Escriba una clase, de nombre PilaPalabras, para gestionar una estructura de
 * pila que permita apilar y desapilar objetos de la clase String. La clase
 * implementará el método apilarPalabra para poner una palabra en la cima de la
 * pila, el método desapilarPalabra para quitar el elemento de la cima de la
 * pila devolviéndolo y el método obtenerPalabraCima para obtener la palabra
 * situada en la cima de la pila sin quitarla de ella.
 *
 * También se implementará el método pilaPalabrasVacia para determinar si la
 * pila está o no vacía.
 *
 * Los métodos deben implementarse utilizando la clase LinkedList.
 */
 import java.util.LinkedList;

 public class PilaPalabras {
   LinkedList<String> linkList;

   public PilaPalabras() {
     linkList = new LinkedList<String>();
   }

   public void apilarPalabra(String palabra) {
     linkList.add(palabra);
   }

   public String obtenerPalabraCima() {
     return linkList.getLast();
   }

   public String desapilarPalabra() {
     return linkList.removeLast();
   }

   public boolean pilaPalabrasVacia() {
     return linkList.isEmpty();
   }
 }
