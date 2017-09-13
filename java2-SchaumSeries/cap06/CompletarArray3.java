/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.7
 *
 * Escriba un método, de nombre completarArray3, que reciba un array de enteros
 * por parámetro y lo rellene de forma que contenga tantos números pares, a
 * partir de cero, como permita su capacidad.
 *
 */

 public class CompletarArray3 {

   public static void completarArray3(int[] array) {
     for (int i = 0, valor = 0; i < array.length; i++, valor += 2) {
       array[i] = valor;
     }
   }

   // se utiliza este método de un ejercicio anterior para imprimir el array
   // que también podría haberse usado un método como Arrays.toString().
   public static void mostrarArrayPantalla1(int[] array) {
     for (int a : array) {
       System.out.println(a);
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] arrayEjemplo = new int[5];

     System.out.println("Antes de completar el array");

     mostrarArrayPantalla1(arrayEjemplo);

     completarArray3(arrayEjemplo);

     System.out.println("Array completado con 0 y pares");

     mostrarArrayPantalla1(arrayEjemplo);
   }
 }
