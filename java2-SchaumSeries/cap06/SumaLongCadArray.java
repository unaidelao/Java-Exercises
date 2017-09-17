/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.12
 *
 * Escriba un método, de nombre obtenerSumaLongCadArray, que reciba por
 * parámetro un array de cadenas y devuelva el número total de caracteres de
 * todas las cadenas del array.
 */
 
 import java.util.Arrays;
 
 public class SumaLongCadArray {
   
   public static int obtenerSumaLongCadArray(String[] arrayStr) {
     
     if (arrayStr == null) {
       throw new IllegalArgumentException("Argumento no válido!!");
     }
     
     int totalCaracteres = 0;
     
     for (String s : arrayStr) {
       if (s != null) {
         totalCaracteres += s.length();
       }
     }
     return totalCaracteres;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] arrCadPrueba = {"Madrid", "Toledo", "Vizcaya", "Burgos"};
     
     System.out.println("String Array: " + Arrays.toString(arrCadPrueba));
     System.out.println("Total caracteres: " + obtenerSumaLongCadArray(arrCadPrueba));
   }
 }