/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.19
 *
 * Escriba un método que cuente el número de palabras que tiene un texto.
 *
 * @author Unai de la O
 */

 class ContarPalabras {
   static String texto = "Texto de prueba para el ejercicio";

   /*
    * Este método para contar palabras consiste simplemente en crear un array
    * de strings del texto dado, usando el método split(" ") y haciendo
    * devolver el número de elementos que tiene ese array con su propiedad
    * length.
    */
   static int contarPalabras(String s) {
     String[] arrayTexto = texto.split(" ");
     return arrayTexto.length;
   }

   public static void main(String[] args) {
     System.out.println("El texto \"" + texto + "\" tiene " + contarPalabras(texto) + " palabras.");
   }
 }
