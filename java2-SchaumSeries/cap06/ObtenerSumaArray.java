/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.8
 *
 * Escriba un método, de nombre obtenerSumaArray, que reciba por parámetro un
 * array de enteros y devuelva la suma de sus elementos.
 */
 
 public class ObtenerSumaArray {
   
   public static int obtenerSumaArray(int[] array) {
     int total = 0;
     
     for (int a : array) {
       total += a;
     }
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] arrayPrueba = {1, 2, 7, 5, 5, 10};
     
     System.out.println(obtenerSumaArray(arrayPrueba));
   }
 }