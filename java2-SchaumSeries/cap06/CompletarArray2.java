/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.6
 *
 * Escriba un método, de nombre completarArray2, que reciba un array de enteros
 * por parámetro y lo rellene de forma que asigne a todas sus posiciones un
 * valor que también se recibirá por parámetro.
 *
 * NOTA: también pudiese haberse usado el método Arrays.fill().
 */

 public class CompletarArray2 {

   public static void completarArray2(int[] array, int valor) {
     for (int i = 0; i < array.length; i++) {
       array[i] = valor;
     }
   }

   // se utiliza este método de un ejercicio anterior para imprimir el array
   // que también podría haberse usado el método Arrays.toString().
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

     completarArray2(arrayEjemplo, 2);

     System.out.println("Tras completar el array");

     mostrarArrayPantalla1(arrayEjemplo);
   }
 }
