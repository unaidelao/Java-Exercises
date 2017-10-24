/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.29
 *
 * Escriba un programa que obtenga y muestre por pantalla una matriz de enteros
 * con el siguiente aspecto:
 *
 *         1  2  3  4  5
 *         1  2  3  4
 *         1  2  3
 *         1  2
 *         1
 */
 
 public class MatrizNoRegular1 {
   
   public static void main(String[] args) {
     // declaración e inicialización del array de enteros
     int[][] arrayPrueba = { {1,2,3,4,5}, {1,2,3,4}, {1,2,3}, {1,2}, {1} };
     // impresión por pantalla directamente con un bucle for
     for (int i = 0; i < arrayPrueba.length; i++) {
       for (int j = 0; j < arrayPrueba[i].length; j++) {
         System.out.print(arrayPrueba[i][j] + " ");
       }
       System.out.println();
     }
   }
  
 }