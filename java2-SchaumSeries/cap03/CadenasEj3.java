/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.12
 *
 * Haga un programa que contenga la cadena "Juan Sotillo Soto". El programa ha
 * de imprimir por pantalla ambas cadenas con todos los caracteres en minúscula
 * y luego en mayúscula.
 *
 * @author Unai de la O
 */

 class CadenasEj3 {
   public static void main(String[] args) {
     String nombre = "Juan Sotillo Soto";

     System.out.println("Minusculas: " + nombre.toLowerCase());
     System.out.println("Mayusculas: " + nombre.toUpperCase());
   }
 }