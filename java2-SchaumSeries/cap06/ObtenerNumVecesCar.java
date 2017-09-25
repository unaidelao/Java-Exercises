/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.17
 *
 * Escriba un método, de nombre obtenerNumVecesCar, que reciba por parámetro un
 * array de cadenas y un carácter. El método devolverá el número de veces que
 * el carácter especificado figure en todas las cadenas contenidas en el array.
 *
 * PLANTEAMIENTO: Una vez comprobado que el array recibido no es una referencia
 * nula, se recorren todas sus cadenas para ir obteniendo el número de veces
 * que el carácter especificado figura en ellas.
 *
 * Además del bucle que recorre las posiciones del array recibido, se incluye
 * otro bucle que pasa por todos los carácteres de cada una de las cadenas.
 * Cada vez que detecte la ocurrencia del carácter especificado en una de las
 * cadenas, se incrementará una variable contador.
 */
 public class ObtenerNumVecesCar {

   public static int obtenerNumVecesCar(String[] arrStr, char c) {
     if (arrStr == null) {
       throw new IllegalArgumentException("Parámetro pasado a función no válido");
     }
     int total = 0;
     for (String s : arrStr) {
       if (s != null) {
         for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == c) {
             total++;
           }
         }
       }
     }
     return total;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] arrStrPrueba = {"Babilonia", "boca", "abanicar"};

     System.out.println(obtenerNumVecesCar(arrStrPrueba, 'c'));
   }
 }
