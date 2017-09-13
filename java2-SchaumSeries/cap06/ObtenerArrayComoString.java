/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.4
 *
 * Escriba un método, de nombre obtenerArrayComoString, que reciba un array de
 * enteros por parámetro y devuelva una cadena de caracteres con su contenido.
 */
 public class ObtenerArrayComoString {

   public static String obtenerArrayComoString(int[] array) {
     // para concatenar valores a la cadena, es necesario inicializarla vacía
     String resultado = "";
     for (int a : array) {
       resultado += a;
     }
     return resultado;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     int[] arrayEjemplo = {5, 9, 32, 45, 67};

     System.out.println(obtenerArrayComoString(arrayEjemplo));
   }
 }
