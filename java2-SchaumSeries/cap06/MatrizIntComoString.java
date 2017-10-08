/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.24
 *
 * Escriba un método, de nombre matrizIntComoString, que reciba por parámetro
 * un array bidimensional (matriz) de enteros y devuelva una cadena con la
 * representación textual de la matriz recibida. La cadena dispondrá de los
 * elementos de la matriz de forma que la primera dimensión se corresponda con
 * las filas y la segunda con las columnas.
 */

 public class MatrizIntComoString {

   public static String matrizIntComoString(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Array introducida no válida!!");
     }
     // variable que irá concatenando los valores del array parámetro
     String strResultado = "";

     for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {
         /*
          * Los enteros de una sola cifra se concatenan precedidos de un
          * espacio en blanco. Así la matriz queda cuadrada y simétrica.
          */
         strResultado += (array[i][j] + (array[i][j] < 10 ? " " : "") + " ");
       }
       strResultado += "\n";
     }
     return strResultado;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] prueba = { { 2, 3, 15, 78},
                        { 5, 1, 9, 4},
                        {56, 43, 14, 2} };

    String strPrueba = matrizIntComoString(prueba);
    System.out.println(strPrueba);
   }
 }
