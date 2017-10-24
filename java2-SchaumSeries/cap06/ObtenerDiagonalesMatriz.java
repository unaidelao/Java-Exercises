/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.28
 *
 * Escriba un método, de nombre obtenerDiagonales, que reciba por parámetro una
 * matriz de valores enteros y devuelva una matriz con los valores de las dos
 * diagonales principales de la matriz recibida.
 */
 
 import java.util.Arrays;
 
 public class ObtenerDiagonalesMatriz {
   
   public static int[][] obtenerDiagonales(int[][] array) {
     if ((array == null) || array.length != array[0].length) {
       throw new IllegalArgumentException("Argumento pasado no valido!!");
     }
     int[][] diagonales = new int[2][array.length];
     // i se usa para recorrer las filas, j para recorrer las columnas
     for (int i = 0, j = 0; i < array.length; i++, j++) {
       diagonales[0][j] = array[i][j];
       diagonales[1][j] = array[array.length -1 -i][j];
     }
     return diagonales;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] arrayPrueba = new int[][] { {1,2,1}, {2,4,1}, {3,2,1} };
     
     int[][] arrayDiagonalesPrueba = obtenerDiagonales(arrayPrueba);
     
     System.out.println("Resultado de diagonales:");
     for (int i = 0; i < arrayDiagonalesPrueba.length; i++) {
       System.out.println(Arrays.toString(arrayDiagonalesPrueba[i]));
     }
   }
 }