/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.13
 *
 * Escriba un programa que determine si los dos primeros argumentos pasados en
 * línea son iguales o no.
 *
 * @author Unai de la O
 */

 class CadenasEj4 {
   public static void main(String[] args) {
     if (args.length == 2) {
       if (args[0].equals(args[1])) {
         System.out.println("Los dos primeros argumentos SI son iguales.");
       }
       else {
         System.out.println("Los dos primeros argumentos NO son iguales.");
       }
     }
     else {
       System.out.println("OJO! la cantidad de argumentos pasados no es 2.");
     }
   }
 }