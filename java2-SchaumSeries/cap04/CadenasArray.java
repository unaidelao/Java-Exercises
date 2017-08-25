/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.42
 *
 * Escriba un método, de nombre mostrarCadenasArray, que reciba por parámetro
 * un array con cadenas de caracteres. El método mostrará por pantalla el
 * primer carácter de cada una de las cadenas contenidas en el array.
 */

 public class CadenasArray {
   public void mostrarCadenasArray(String[] arrayString) {
     for (String s : arrayString) {
       // Comprueba que la cadena no es nula para evitar NullPointerException
       if (s != null) {
         System.out.println(s.charAt(0));
       }
     }
   }

   public static void main(String[] args) {
     String[] texto = { "El", "primero", "de", "mayo."};
     CadenasArray prueba = new CadenasArray();
     prueba.mostrarCadenasArray(texto); // Resultado: E,p,d,m
   }
 }
