/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.21
 *
 * Escriba un método, de nombre obtenerMatrizIdentidad, que reciba por
 * parámetro un valor entero para especificar el número de elementos para las
 * dos dimensiones de la matriz. El método creará la correspondiente matriz y
 * rellenará sus posiciones para que constituya la matriz identidad de la
 * dimensión especificada.
 *
 * Indicar que una matriz identidad es una matriz cuadrada donde los elementos
 * de la diagonal principal tienen valor 1 y el resto de elementos, valor 0.
 */

 import java.util.Arrays;

 public class ObtenerMatrizIdentidad {

   public static int[][] obtenerMatrizIdentidad(int size) {
     if (size <= 0) {
       throw new IllegalArgumentException("El parámetro debe ser > 0");
     }
     // se crea array usando como tamaño de filas y columnas el parámetro size
     int[][] matrizIdentidad = new int[size][size];

     // sólo se da valor 1 a los elementos de la diagonal principal
     for (int i = 0; i < matrizIdentidad.length; i++) {
       matrizIdentidad[i][i] = 1;
     }
     return matrizIdentidad;
   }

   // método para imprimir un array bidimensional usando Arrays.toString()
   public static void imprimirArray2D(int[][] array) {
     for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] prueba = obtenerMatrizIdentidad(5);

     imprimirArray2D(prueba);

   }
 }
