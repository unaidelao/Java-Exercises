/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.14
 *
 * Escriba un método llamado sumaTotal que, dada una lista arbitraria de
 * números enteros, devuelva la suma de todos ellos.

 * Además, escriba un programa que pruebe dicho método, calculando la suma de
 * las secuencias {3,5,2,4,6}, la secuencia {2,10,-1,2}, la secuencia {10} y la
 * secuencia {}.
 *
 * El programa imprimirá el valor de dichas sumas.
 *
 * @author Unai de la O
 */

 public class Suma {
   public static int sumaTotal(int[] matriz) {
     int sumatorio = 0;

     for (int valor : matriz) {
       sumatorio += valor;
     }
     return sumatorio;
   }

   public static void main(String[] args) {
     int[] secuencia1 = {3,5,2,4,6};
     int[] secuencia2 = {2,10,-1,2};
     int[] secuencia3 = {10};
     int[] secuencia4 = {};

     System.out.printf("%nLos valores de los sumatorios son: %nSumatorio 1: " +
     sumaTotal(secuencia1) + "%nSumatorio 2: " +
     sumaTotal(secuencia2) + "%nSumatorio 3: " +
     sumaTotal(secuencia3) + "%nSumatorio 4: " + sumaTotal(secuencia4) + "%n");
   }
 }
