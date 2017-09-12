/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.2
 *
 * Escriba un método, de nombre mostrarArrayPantalla1, que reciba un array de
 * enteros por parámetro y muestre sus valores por pantalla, cada uno en una
 * línea.
 */

 public class MostrarArrayPantalla1 {

   public static void mostrarArrayPantalla1(int[] array) {
     for (int a : array) {
       System.out.println(a);
     }

     /*
      * también podría haberse usado un bucle for del tipo:
      *
      *   for (int i = 0; i < array.length; i++) {
      *     System.out.println(array[i]);
      *   }
      */
   }

   // MAIN y prueba del método
   public static void main(String[] args) {
     int[] arrayEjemplo = {1, 54, 23, 12};

     mostrarArrayPantalla1(arrayEjemplo);
   }
 }
