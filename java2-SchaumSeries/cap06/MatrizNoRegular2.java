/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.30
 *
 * Escriba un programa que obtenga y muestre por pantalla una matriz de cadenas
 * de caracteres con el siguiente aspecto. Indicar que el único elemento de la
 * primera fila contiene una cadena con una "A", los dos elementos de la
 * segunda fila contienen, cada uno, una cadena con dos "A", y así
 * sucesivamente.
 *
 *         A
 *         AA     AA
 *         AAA    AAA    AAA
 *         AAAA   AAAA   AAAA   AAAA
 *         AAAAA  AAAAA  AAAAA  AAAAA
 */
 
 public class MatrizNoRegular2 {
   
   public static void main(String[] args) {
     // importante: la segunda dimensión se deja vacía
     String[][] arrayStr = new String[5][];
     
     /* y es ahora cuando la segunda dimensión se va declarando, cada fila con
        un elemento más que la anterior. */
     for (int i = 0; i < arrayStr.length; i++) {
       arrayStr[i] = new String[i + 1];
     }
     
     String strA = "A";
     
     // se inicializa el array con los valores "A" pedidos
     for (int i = 0; i < arrayStr.length; i++) {
       for (int j = 0; j < arrayStr[i].length; j++) {
         arrayStr[i][j] = strA;
       }
       // al final de cada iteración de i, se concatena strA con otra "A"
       strA += "A";
     }
     
     // se imprime por pantalla el array con un bucle for
     for (int i = 0; i < arrayStr.length; i++) {
       for (int j = 0; j < arrayStr[i].length; j++) {
         System.out.print(arrayStr[i][j] + " ");
       }
       System.out.println();
     }
   }
 }