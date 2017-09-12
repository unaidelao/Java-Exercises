/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.3
 *
 * Escriba un método, de nombre mostrarArrayPantalla2, que reciba por parámetro
 * un array de enteros y muestre sus valores por pantalla separados por comas.
 *
 * PLANTEAMIENTO: Para evitar que el último elemento aparezca seguido de una
 * coma, se escriben dentro de un bucle todos los elementos del array excepto
 * el último. Finalmente, se muestra el último elemento del array.
 */

 public class MostrarArrayPantalla2 {

   public static void mostrarArrayPantalla2(int[] array) {
     for (int i = 0; i < array.length -1; i++) {
       System.out.print(array[i] + ", ");
     }
     System.out.println(array[array.length -1]);
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] arrayEjemplo = {1, 54, 23, 12};

     mostrarArrayPantalla2(arrayEjemplo);
   }
 }
