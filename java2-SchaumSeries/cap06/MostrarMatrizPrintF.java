/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.22
 *
 * Escriba un método, de nombre mostrarMatriz1D, que reciba por parámetro un
 * array bidimensional (matriz) de enteros y muestre sus elementos por pantalla
 * de forma que la primera dimensión de la matriz se corresponda con las filas
 * y la segunda, con las columnas.
 */

 public class MostrarMatrizPrintF {

   public static void mostrarMatriz(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Array introducida no válida!!");
     }
     for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {
         System.out.printf("%2d ", array[i][j]);
       }
       System.out.println();
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] prueba = { { 1,  6,  2, 8 },
                        { 5, 42,  8, 8 },
                        { 2,  5, 13, 9 } };

    mostrarMatriz(prueba);
   }
 }
