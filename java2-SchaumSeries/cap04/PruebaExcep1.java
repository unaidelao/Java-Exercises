/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.40
 *
 * Escriba una clase de nombre ClaseExcep1 que incluya un método denominado
 * dividirEntreArray. Este método recibirá por parámetro un número entero y un
 * array de elementos del mismo tipo. El método mostrará por pantalla el
 * resultado de la división entre el número recibido y cada uno de los
 * elementos del array. A continuación, se escribirá un programa que invoque al
 * método con el número 2 y un array con los elementos -2, -1, 0, 1 y 2.
 */
 
 class ClaseExcep1 {
   public void dividirEntreArray(int num, int[] array) {
     for (int i : array) {
       System.out.println(num + " / " + i + " = " + num/i);
     }
   }
 }
 
 public class PruebaExcep1 {
   public static void main(String[] args) {
     int[] datos = { -2, -1, 0, 1, 2 };
     ClaseExcep1 prueba = new ClaseExcep1();
     prueba.dividirEntreArray(2, datos);
   }
 }