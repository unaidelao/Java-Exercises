/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.32
 *
 * Escriba una clase, de nombre APIManejoArrays1, cuyo método main() implemente
 * un programa que lleve a cabo las siguientes acciones:
 *
 *  a) Declarar y construir un array de 30 enteros, de nombre arrInt1. Hacer
 *     que el array almacene en las 10 primeras posiciones 10 ceros, en las 10
 *     siguientes 10 unos y en las 10 últimas de nuevo 10 ceros. Mostrar el
 *     contenido del array.
 *
 *  b) Declarar y construir un array de 6 caracteres, de nombre arrChar. El
 *     array almacenará en la primera mitad de las posiciones el carácter 'a' y
 *     en la segunda mitad el carácter 'b'. Mostrar el contenido del array.
 *
 *  c) Declarar y construir un array de 10 enteros, de nombre arrInt2. Hacer
 *     que el array almacene en sus posiciones los dígitos del 9 al 0 para
 *     mostrar después su contenido. Ordenar el array ascendentemente y mostrar
 *     de nuevo su contenido.
 *
 * PLANTEAMIENTO: para rellenar arrays se utilizará el método fill() de la
 * clase de utilidades Arrays; el método sort() para ordenar ascendentemente y
 * el método toString() para mostrar por pantalla el contenido de los arrays
 * sin necesiddad de recurrir al uso de un bucle.
 */
 
 import java.util.Arrays;
 
 public class APIManejoArrays1 {
   
   public static void main(String[] args) {
     
     int[] arrInt1 = new int[30];
     Arrays.fill(arrInt1, 0, 10, 0);
     Arrays.fill(arrInt1, 10, 20, 1);
     Arrays.fill(arrInt1, 20, 30, 0);
     System.out.println("arrInt1:");
     System.out.println("--------");
     System.out.println(Arrays.toString(arrInt1));
     System.out.println();
     
     char[] arrChar = new char[6];
     Arrays.fill(arrChar, 0, arrChar.length/2, 'a');
     Arrays.fill(arrChar, arrChar.length/2, arrChar.length, 'b');
     System.out.println("arrChar:");
     System.out.println("--------");
     System.out.println(Arrays.toString(arrChar));
     System.out.println();
     
     int[] arrInt2 = new int[10];
     for (int i = 0; i < arrInt2.length; i++) {
       arrInt2[i] = arrInt2.length -1 -i; // así rellena del 9 al 0
     }
     System.out.println("arrInt2 sin ordenar:");
     System.out.println("--------------------");
     System.out.println(Arrays.toString(arrInt2));
     System.out.println();
     
     Arrays.sort(arrInt2);
     System.out.println("arrInt2 ordenada:");
     System.out.println("-----------------");
     System.out.println(Arrays.toString(arrInt2));
   }
 }