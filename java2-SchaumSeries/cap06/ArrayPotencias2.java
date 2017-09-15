/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.9
 *
 * Escriba un método, de nombre arrayPotencias2, que cree un array y lo rellene
 * con potencias de 2. Las potencias de 2 comenzarán en 2 y el número total de
 * ellas se recibirá por parámetro. El método devolverá el array creado.
 */
 
 import java.util.Arrays;
 
 public class ArrayPotencias2 {
   
   public static int[] arrayPotencias2(int n) {
     final int VALOR_BASE = 2;
     int[] arrayResultado = new int[n];
     
     arrayResultado[0] = VALOR_BASE;
     
     for (int i = 1; i < arrayResultado.length; i++) {
       arrayResultado[i] = arrayResultado[i-1] * VALOR_BASE;
     }
     return arrayResultado;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] ejemplo = arrayPotencias2(4); // output [2,4,8,16]
     
     System.out.println(Arrays.toString(ejemplo));
   }
 }