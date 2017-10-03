/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.18
 *
 * Escriba un método, de nombre obtenerArrayOrdAlfab, que reciba por parámetro
 * un array de cadenas de caracteres y las ordene alfabéticamente. La
 * ordenación no se verá afectada por la expresión de los caracteres expresados
 * en mayúsculas o minúsculas. Es decir, las cadenas "ALBACETE", "antonio" y
 * "BURGOS" quedarán ordenadas en este mismo orden.
 *
 * PLANTEAMIENTO: El método comprueba que el array recibido no es una
 * referencia nula. A continuación, se recorre cada una de las posiciones del
 * array recibido. Para cada una de ellas se hace un nuevo recorrido comenzando
 * desde la posición siguiente hasta el final del array. Si se encuentra que
 * alguna de las posiciones siguientes almacena una cadena alfabéticamente
 * menor, se procede al intercambio de posiciones.
 */

 import java.util.Arrays;

 public class ObtenerArrayOrdAlfab {

   public static void obtenerArrayOrdAlfab(String[] arrStr) {
     if (arrStr == null) {
       throw new IllegalArgumentException("Parámetro pasado a la función no válido");
     }
     for (int i = 0; i < arrStr.length; i++) {
       if (arrStr != null) {
         for (int j = i+1; j < arrStr.length; j++) {
           if (arrStr[j] != null &&
               arrStr[j].toUpperCase().compareTo(
               arrStr[i].toUpperCase()) < 0) {
                 String tmpStr = arrStr[i];
                 arrStr[i] = arrStr[j];
                 arrStr[j] = tmpStr;
               }
         }
       }
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] prueba = {"ALBACETE", "toledo", "algeciras", "ZAMORA", "madrid"};
     System.out.println("Array sin ordenar");
     System.out.println("-----------------");
     System.out.println(Arrays.toString(prueba));
     System.out.println();

     obtenerArrayOrdAlfab(prueba);

     System.out.println("Array ordenado");
     System.out.println("--------------");
     System.out.println(Arrays.toString(prueba));
   }
 }
