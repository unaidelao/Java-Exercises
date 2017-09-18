/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.15
 *
 * Escriba un método, de nombre obtenerCadenaMasLarga, que reciba por parámetro
 * un array de cadenas y devuelva la que contenga el mayor número de caracteres
 */

 public class ObtenerCadenaMasLarga {

   public static String obtenerCadenaMasLarga(String[] arrStr) {
     // variable para la longitud del String más largo del parámetro arrStr
     int longStrMasLargo = 0;
     // variable para alojar el String más largo del parámetro arrStr
     String strMasLargo = null;

     for (int i = 0; i < arrStr.length; i++) {
       if (arrStr[i].length() > longStrMasLargo) {
         longStrMasLargo = arrStr[i].length();
         strMasLargo = arrStr[i];
       }
     }
     return strMasLargo;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] prueba = { "Tomillo", "Ajo", "Laurel", "Guindilla", "Sal"};

     System.out.println("String más largo: " + obtenerCadenaMasLarga(prueba));
   }
 }
