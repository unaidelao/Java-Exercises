/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.20
 *
 * Escriba un método, de nombre rellenarMatrizSecuencia2D, que reciba una
 * matriz de enteros por parámetro y la rellene para que sus posiciones
 * almacenen un valor que se irá incrementando en una unidad por columnas. La
 * matriz se rellenará de manera que dos elementos consecutivos según la
 * primera dimensión almacenen dos valores también consecutivos. La matriz debe
 * ser de 5 elementos en la primera dimensión y 5 en la segunda.
 */

 import java.util.Arrays;

 public class RellenarMatrizSecuencia2D {

   public static void rellenarMatrizSecuencia2D(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Parámetro ingresado no válido!!");
     }
     for (int j = 0, valor = 0; j < array[0].length; j++) {
       for (int i = 0; i < array.length; i++) {
         array[i][j] = valor++;
       }
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] array1 = new int[5][5];
     rellenarMatrizSecuencia2D(array1);

     // imprimir la matriz bidimensional
     for (int i = 0; i < array1.length; i++) {
      System.out.println(Arrays.toString(array1[i]));
     }
   }
 }
