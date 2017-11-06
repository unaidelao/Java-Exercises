/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.38
 *
 * Escriba un método, de nombre obtenerArrCad5VocalesAL, que reciba por
 * parámetro un array de cadenas y devuelva un array con las que contengan las
 * 5 vocales.
 *
 * Deberá utilizarse como elemento de almacenamiento temporal un objeto de la
 * clase ArrayList<String>. Para la consideración de un carácter como vocal no
 * se tendrá en cuenta si está en mayúsculas o en minúsculas.
 */
 import java.util.Arrays;
 import java.util.ArrayList;

 public class ObtenerArrCad5VocalesAL {
   public static String[] obtenerArrCad5VocalesAL(String[] arrayStr) {
     if (arrayStr == null) {
       throw new IllegalArgumentException("Parametro pasado no valido!!");
     }
     // Se construye el objeto ArrayList para objetos String.
     ArrayList<String> arrListCad5Vocales = new ArrayList<String>();

     for (String str : arrayStr) {
       if (str != null) {
         String tempStr = new String(str.toUpperCase());
         if (tempStr.indexOf('A') != -1 &&
             tempStr.indexOf('E') != -1 &&
             tempStr.indexOf('I') != -1 &&
             tempStr.indexOf('O') != -1 &&
             tempStr.indexOf('U') != -1) {
               arrListCad5Vocales.add(str);
             }
       }
     }
     if (arrListCad5Vocales.size() != 0) {
       /*
        * Mediante este método se obtiene el contenido de la lista en forma de
        * array. Hay que pasar un array con capacidad suficiente para almacenar
        * los elementos de la lista.
        */
       return ((String[])arrListCad5Vocales.toArray(new String[arrListCad5Vocales.size()]));
     }
     else {
       return null;
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] strPrueba = { "Campana", "aeiou", "UoIeA", "fregona"};

     String[] resultado = obtenerArrCad5VocalesAL(strPrueba);
     System.out.println(Arrays.toString(resultado));
   }
 }
