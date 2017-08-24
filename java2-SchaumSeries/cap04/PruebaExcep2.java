/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.41
 *
 * Reescriba el método anterior para capturar la excepción derivada del intento
 * de división entre 0, de forma que no se interrumpa la ejecución del programa
 * y se continúe dividiendo entre los otros elementos del array.
 */
 
 class ClaseExcep1 {
   public void dividirEntreArray(int num, int[] array) {
     for (int i : array) {
       try {
        System.out.println(num + " / " + i + " = " + num/i); 
       }
       catch(ArithmeticException aE) {
         System.out.println("No es posible dividir entre 0");
       }
     }
   }
 }
 
 public class PruebaExcep2 {
   public static void main(String[] args) {
     int[] datos = { -2, -1, 0, 1, 2 };
     ClaseExcep1 prueba = new ClaseExcep1();
     prueba.dividirEntreArray(2, datos);
   }
 }