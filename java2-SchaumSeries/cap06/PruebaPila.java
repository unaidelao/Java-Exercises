/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.37
 *
 * Escriba un programa que, utilizando la clase PilaPalabras del ejercicio
 * anterior, introduzca tres cadenas de caracteres en la pila y las desapile
 * mostrándolas por pantalla.
 */

 public class PruebaPila {
   public static void main(String[] args) {
     String cadA = "A";
     String cadB = "B";
     String cadC = "C";

     PilaPalabras prueba = new PilaPalabras();

     prueba.apilarPalabra(cadA);
     prueba.apilarPalabra(cadB);
     prueba.apilarPalabra(cadC);

     while (!prueba.pilaPalabrasVacia()) {
       System.out.println(prueba.desapilarPalabra());
     }
   }
 }
