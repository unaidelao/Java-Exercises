/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.23
 *
 * Escriba un método, de nombre matrizCharComoString, que reciba por parámetro
 * un array bidimensional (matriz) de caracteres y devuelva una cadena con la
 * representación textual de la matriz recibida. La cadena dispondrá de los
 * elementos de la matriz de forma que la primera dimensión se corresponda con
 * las filas y la segunda con las columnas.
 */

 public class MatrizCharComoString {

   public static String matrizCharComoString(char[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Array introducida no válida!!");
     }
     // variable que irá concatenando los valores del array parámetro
     String strResultado = "";

     for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {
         strResultado += (array[i][j] + " ");
       }
       strResultado += "\n";
     }
     return strResultado;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     char[][] prueba = { {'H', 'o', 'l', 'a'},
                         {',', 'q', 'u', 'e'},
                         {'t', 'a', 'l', '.'} };

    String strPrueba = matrizCharComoString(prueba);
    System.out.println(strPrueba);
   }
 }
