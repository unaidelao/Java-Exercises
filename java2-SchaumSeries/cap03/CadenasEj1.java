/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.10
 *
 * Escriba un programa que inicialice dos cadenas de caracteres, una llamada
 * nombre y otra llamada apellido.
 *
 * Los valores iniciales de las cadenas son "Juan" y "Sotillo". El programa
 * debe escribir ambas cadenas y su longitud por pantalla.
 *
 * @author Unai de la O
 */

 class CadenasEj1 {
   public static void main(String[] args) {
     String nombre = "Juan";
     String apellido = "Sotillo";

     System.out.println(nombre + " tiene " + nombre.length() + " caracteres");
     System.out.println(apellido + " tiene " + apellido.length() + " caracteres");
   }
 }
