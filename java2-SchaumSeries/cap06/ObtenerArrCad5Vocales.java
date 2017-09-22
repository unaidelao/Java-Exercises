/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.16
 *
 * Escriba un método, de nombre obtenerArrCad5Vocales, que reciba por parámetro
 * un array de cadenas y devuelva un array con las que contengan las 5 vocales.
 * Para la consideración de un carácter como vocal, no se tendrá en cuenta si
 * está en mayúsculas o en minúsculas.
 *
 * PLANTEAMIENTO: En primer lugar, se comprueba que el array recibido no sea
 * una cadena nula. A continuación, se declara y construye un array auxiliar
 * con el mismo tamaño que el array recibido, ya que es posible que todas sus
 * cadenas cumplan la condición de contener las 5 vocales.
 *
 * Se recorre el array recibido para comprobar si cada una de sus cadenas tiene
 * los caracteres correspondientes a las 5 vocales. Esta comprobación se hace
 * con la ayuda del método indexOf() de la clase String. Cuando la comprobación
 * es positiva, la cadena se guarda en el array auxiliar y, al mismo tiempo, se
 * actualiza un contador con el número de cadenas encontradas que satisfacen la
 * condición.
 *
 * El siguiente paso es construir un nuevo array para almacenar exactamente el
 * número de cadenas encontradas. Esta operación se realiza con ayuda del valor
 * contador utilizado en el bucle previo.
 *
 * El último bucle se encarga de copiar las cadenas de 5 vocales desde el array
 * auxiliar al último array creado que, finalmente, se devuelve.
 */

 public class ObtenerArrCad5Vocales {

   public static String[] obtenerArrCad5Vocales(String[] arrStr) {
     if (arrStr == null) {
       throw new IllegalArgumentException("Parámetro pasado a función no válido");
     }

     String[] arrayAux = new String[arrStr.length];
     int totalCadenas5Vocales = 0;
     int contador = 0;

     for (String s : arrStr) {
       if (s != null) {
         /*
          * Se utiliza este string auxiliar para no tener que llamar al método
          * toUpperCase() para la comprobación de cada vocal.
          */
         String strAux = s.toUpperCase();
         // indexOf() devuelve -1 si no se encuentra el carácter.
         if (strAux.indexOf('A') != -1 &&
             strAux.indexOf('E') != -1 &&
             strAux.indexOf('I') != -1 &&
             strAux.indexOf('O') != -1 &&
             strAux.indexOf('U') != -1) {
               arrayAux[contador++] = s;
               totalCadenas5Vocales++;
             }
       }
     }

     if (totalCadenas5Vocales != 0) {
       /*
        * Se crea un nuevo array para que el array devuelto tenga el mismo
        * tamaño que el número de cadenas con las 5 vocales.
        */
       String[] arrayStr5Vocales = new String[totalCadenas5Vocales];
       for (int i = 0; i < totalCadenas5Vocales; i++) {
         arrayStr5Vocales[i] = arrayAux[i];
       }
       return arrayStr5Vocales;
     }
     else {
       return null;
     }
   }
 }
