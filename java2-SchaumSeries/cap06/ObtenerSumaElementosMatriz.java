/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.26
 *
 * Escriba un método, de nombre obtenerSumaElementosMatriz, que reciba por
 * parámetro un array bidimensional de números enteros y devuelva la suma de
 * todos sus elementos.
 */
 
 public class ObtenerSumaElementosMatriz {
   
   public static int obtenerSumaElementosMatriz(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Argumento array incorrecto!!");
     }
     int sumaTotal = 0;
     for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {
         sumaTotal += array[i][j];
       }
     }
     return sumaTotal;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] arrayPrueba = { {1,5,5,9}, {3,4,7,6}, {10,3,5,2} };
     System.out.println(obtenerSumaElementosMatriz(arrayPrueba)); // 60
   }
 }