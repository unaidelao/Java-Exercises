/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.5
 *
 * Escriba un método, de nombre completarArray1, que reciba un array de enteros
 * por parámetro y lo rellene de forma que asigne a cada posición el valor de
 * su índice.
 */

 public class CompletarArray1 {

   public static void completarArray1(int[] array) {
     for (int i = 0; i < array.length; i++) {
       array[i] = i;
     }
   }

   // se utiliza este método de un ejercicio anterior para imprimir el array
   public static void mostrarArrayPantalla1(int[] array) {
     for (int a : array) {
       System.out.println(a);
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] arrayEjemplo = new int[15];

     System.out.println("Antes de completar el array");

     mostrarArrayPantalla1(arrayEjemplo);

     completarArray1(arrayEjemplo);

     System.out.println("Tras completar el array");

     mostrarArrayPantalla1(arrayEjemplo);
   }
 }
