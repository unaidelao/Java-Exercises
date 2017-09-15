/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.10
 *
 * Escriba un método, de nombre arrayMultiplicado, que reciba por parámetro un
 * array de enteros y un factor de multiplicación. El método devolverá un nuevo
 * array cuyos elementos serán los contenidos en el array recibido
 * multiplicados por el factor especificado.
 */
 
 import java.util.Arrays;
 
 public class ArrayMultiplicado {
   
   public static int[] arrayMultiplicado(int[] array, int factor) {
     int[] nuevoArray = new int[array.length];
     
     for (int i = 0; i < array.length; i++) {
       nuevoArray[i] = array[i] * factor;
     }
     return nuevoArray;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] array1 = {1, 3, 5, 7};
     System.out.println("Array base --> " + Arrays.toString(array1));
     
     System.out.println("Array x3 --> " + Arrays.toString(arrayMultiplicado(array1, 3)));
   }
 }