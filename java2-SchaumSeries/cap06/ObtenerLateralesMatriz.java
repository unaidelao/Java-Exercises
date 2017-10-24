/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.31
 *
 * Escriba un método, de nombre obtenerLaterales, que reciba por parámetro una
 * matriz de valores enteros y devuelva una matriz con los valores de los
 * cuatro laterales - superior, izquierdo, derecho e inferior -, de la matriz
 * recibida.
 */
 
 public class ObtenerLateralesMatriz {
   
   public static int[][] obtenerLaterales(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Parametro no admitido!!");
     }
     int[][] laterales = { new int[array[0].length], // lateral superior
                           new int[array.length],    // lateral derecho
                           new int[array[0].length], // lateral inferior
                           new int[array.length] };   // lateral izquierdo
     
     // para los valores de los laterales superior e inferior
     for (int i = 0; i < array[0].length; i++) {
       laterales[0][i] = array[0][i];
       laterales[2][i] = array[array.length - 1][i];
     }
     
     // para los valores de los laterales izquierdo y derecho
     for (int i = 0; i < array.length; i++) {
       laterales[1][i] = array[i][array[0].length - 1];
       laterales[3][i] = array[i][0];
     }
     return laterales;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     
     int[][] arrayPrueba = { {1,2,1}, {2,4,1}, {3,1,2} };
     int[][] arrayLaterales = obtenerLaterales(arrayPrueba);
     
     // se imprime por pantalla el array con un bucle for
     for (int i = 0; i < arrayLaterales.length; i++) {
       for (int j = 0; j < arrayLaterales[i].length; j++) {
         System.out.print(arrayLaterales[i][j] + " ");
       }
       System.out.println();
     }
   }
 }