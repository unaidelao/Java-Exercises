/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.25
 *
 * Escriba un método, de nombre rellenarMatrizAsteriscos, que reciba por
 * parámetro un valor entero que especificará el número de filas de asteriscos
 * que albergará la matriz. La primera fila contendrá un solo asterisco situado
 * en la posición central según la segunda dimensión de la matriz. Cada nueva
 * fila contendrá dos asteristos más y también se encontrarán centrados según
 * la segunda dimensión de la matriz. El aspecto final que debe presentar la
 * matriz sería:
 *                               *
 *                             * * *
 *                           * * * * *
 *                         * * * * * * *
 *                       * * * * * * * * *
 *
 * @ author Unai de la O
 */
 
 import java.util.Arrays;
 import java.util.Scanner;
 
 public class RellenarMatrizAsteriscos {
   
   public static char[][] rellenarMatrizAsteriscos(int filas) {
     if (filas <= 0) {
       throw new IllegalArgumentException("Numero de filas no valido!!");
     }
     char[][] matrizResultado = new char[filas][filas * 2 - 1];
       
     for (int i = 0; i < filas; i++) {
       int asteriscos = 1;
       int posInicial = matrizResultado[0].length/2;
       
       for (int j = 0; j < posInicial; j++) {
         matrizResultado[i][j] = ' ';
       }
       for (int j = 0; j < asteriscos; j++) {
         int pos = posInicial;
         matrizResultado[i][pos++] = '*';
       }
       for (int j = posInicial + asteriscos; j < matrizResultado[i].length; j++) {
         matrizResultado[i][j] = ' ';
       }
       asteriscos += 2;
       posInicial--;
     }
     return matrizResultado;
   }
   
   // Método complementario para poder imprimir el array bidimensional
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
     Scanner in = new Scanner(System.in);
     System.out.print("Indique el numero de filas: ");
     int filasUsuario = in.nextInt();
     
     char[][] arrayUsuario = rellenarMatrizAsteriscos(filasUsuario);
     
     System.out.print(matrizCharComoString(arrayUsuario));
     in.close();
   }
 }