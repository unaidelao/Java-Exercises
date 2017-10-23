/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.27
 *
 * Escriba un método, de nombre obtenerMatrizProducto, que reciba por parámetro
 * dos matrices de valores enteros y devuelva la matriz resultante de
 * multiplicar matricialmente las dos recibidas por parámetro.
 *
 * @author Unai de la O
 */
 
 import java.util.Arrays;
 
 public class ObtenerMatrizProducto {
   
   public static int[][] obtenerMatrizProducto(int[][] m1, int[][] m2) {
     
     int m1rows = m1.length;
     int m1cols = m1[0].length;
     int m2rows = m2.length;
     int m2cols = m2[0].length;
     
     if ((m1 == null || m2 == null) || (m1[0].length != m2.length)) {
       throw new IllegalArgumentException("Error: parametros no validos!!");
     }
     int[][] arrayResultado = new int[m1rows][m2cols];
     for (int i = 0; i < m1rows; i++) {
       for (int j = 0; j < m2cols; j++) {
         for (int k = 0; k < m1cols; k++) {
           arrayResultado[i][j] += m1[i][k] * m2[k][j];
         }
       }
     }
     return arrayResultado;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] array1 = { {2,3,4}, {1,5,1} };
     int[][] array2 = { {1,2}, {7,1}, {2,2} };
     
     int[][] array3 = obtenerMatrizProducto(array1, array2);
     
     System.out.println("Array 1");
     System.out.println("-------");
     for (int i = 0; i < array1.length; i++) {
       System.out.println(Arrays.toString(array1[i]));
     }
     
     System.out.println("Array 2");
     System.out.println("-------");
     for (int i = 0; i < array2.length; i++) {
       System.out.println(Arrays.toString(array2[i]));
     }
     
     System.out.println("Producto (Array 1 * Array 2)");
     System.out.println("----------------------------");
     for (int i = 0; i < array3.length; i++) {
       System.out.println(Arrays.toString(array3[i]));
     }
   }
 }