/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.19
 *
 * Escriba un método, de nombre rellenarMatrizSecuenciaID, que reciba una
 * matriz de enteros por parámetro y la rellene para que sus posiciones
 * almacenen un valor que se irá incrementando en una unidad por filas. La
 * matriz se rellenará de manera que dos elementos consecutivos según la
 * segunda dimensión almacenen dos valores también consecutivos. La matriz debe
 * ser de 5 elementos en la primera dimensión y 5 en la segunda.
 */

 import java.util.Arrays;

 public class RellenarMatrizSecuenciaID {

   public static void rellenarMatrizSecuenciaID(int[][] array) {
     if (array == null) {
       throw new IllegalArgumentException("Parámetro ingresado no válido!!");
     }
     for (int i = 0, valor = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {
         array[i][j] = valor++;
       }
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[][] array1 = new int[5][5];
     rellenarMatrizSecuenciaID(array1);

     // imprimir la matriz bidimensional
     for (int i = 0; i < array1.length; i++) {
      System.out.println(Arrays.toString(array1[i])); 
     }
   }
 }
