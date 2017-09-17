/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.13
 *
 * Escriba un método, de nombre obtenerLongCadenas, que reciba por parámetro
 * un array de cadenas y devuelva un array de enteros con los tamaños de las
 * cadenas contenidas en el array.
 */

 import java.util.Arrays;

 public class LongCadenas {

   public static int[] obtenerLongCadenas(String[] arrayStr) {
     if (arrayStr == null) {
       throw new IllegalArgumentException("Argumento no válido!!");
     }
     int[] resultado = new int[arrayStr.length];

     for (int i = 0; i < arrayStr.length; i++) {
       resultado[i] = arrayStr[i].length();
     }
     return resultado;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] arrCadPrueba = {"Madrid", "Toledo", "Vizcaya", "Burgos"};

     System.out.println("String Array: " + Arrays.toString(arrCadPrueba));
     System.out.println("Total caracteres: " + Arrays.toString(obtenerLongCadenas(arrCadPrueba)));
   }
 }
