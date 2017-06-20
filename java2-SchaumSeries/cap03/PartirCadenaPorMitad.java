/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.15
 *
 * Escriba un método que, dada una cadena de caracteres, devuelva la mitad
 * inicial de la cadena.
 *
 * Escriba un programa que pruebe el método con las cadenas "Hola que tal" y
 * "Adios".
 *
 * Consejo: Utilizar el método substring(inicio, final).
 *          Las cadenas comienzan en 0 y length()/2 da el punto medio.
 *
 * @author Unai de la O
 */
 
 class PartirCadenaPorMitad {
   // Método que devuelve la primera mitad de una cadena de texto.
   static String mitadCadena(String s) {
     return s.substring(0, s.length() / 2);
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     String texto1 = "Hola que tal";
     String texto2 = "Adios";
     
     System.out.println("Texto 1: " + texto1);
     System.out.println("mitadCadena(texto1) :" + mitadCadena(texto1));
     System.out.println("Texto 2: " + texto2);
     System.out.println("mitadCadena(texto2) :" + mitadCadena(texto2));
   }
 }