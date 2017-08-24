/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.39
 *
 * Escriba un programa que genere números aleatorios hasta obtener primero un
 * array de 5 números pares y, después, un array de 5 números impares.
 */

 import java.util.Arrays;

 public class ArraysParesImpares {
   public static void main(String[] args) {
     int[] pares = new int[5];
     int[] impares = new int[5];
     int i = 0;
     int j = 0;

     while(i < 5 || j < 5) {
       int numero = (int)(Math.random()*100);
       if (numero % 2 == 0 && i < 5) {
         pares[i] = numero;
         i++;
       }
       if (numero % 2 != 0 && j < 5) {
         impares[j] = numero;
         j++;
       }
     }

     System.out.println("Array pares: " + Arrays.toString(pares));
     System.out.println("Array impares: " + Arrays.toString(impares));
   }
 }
