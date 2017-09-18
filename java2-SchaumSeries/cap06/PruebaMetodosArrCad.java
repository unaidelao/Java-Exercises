/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.14
 *
 * Escriba una clase de nombre PruebaMetodosArrCad y añada, como método
 * estático, el método realizado en el ejercicio anterior. Incluir en el método
 * main() de la clase las sentencias necesarias para comprobar el correcto
 * funcionamiento de dicho método.
 */

 public class PruebaMetodosArrCad {

   public static int[] obtenerLongCadenas(String[] arrayStr) {
     if (arrayStr == null) {
       throw new IllegalArgumentException("Argumento no válido!!");
     }
     int[] resultado = new int[arrayStr.length];

     for (int i = 0; i < arrayStr.length; i++) {
       resultado[i] = arrayStr[i].length();
     }
     return resultado;
   }

   public static void main(String[] args) {
     String[] arrCadPrueba = { new String(""),
                               new String("a"),
                               new String("bb"),
                               new String("ccc"),
                               new String("dddd") };

     int[] longitudes = obtenerLongCadenas(arrCadPrueba);
     System.out.println("La longitud de las cadenas es: ");

     for (int a : longitudes) {
       System.out.println(a);
     }
   }
 }
