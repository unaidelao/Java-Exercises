/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.39
 *
 * Escriba un método, de nombre obtenerArrListCad5Vocales, que reciba por
 * parámetro un array de cadenas y devuelva un objeto ArrayList<String> con las
 * que contengan las 5 vocales.
 */

 import java.util.Arrays;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.ListIterator;

 public class ObtenerArrListCad5Vocales {
   
   public ArrayList<String> obtenerArrListCad5Vocales(String[] arrCad) {
     if (arrCad == null) {
       throw new IllegalArgumentException("Parametro no valido.");
     }
     // Se crea el objeto ArrayList para los objetos String.
     ArrayList<String> arrListCad5Vocales = new ArrayList<String>();
     // El método addAll() añade a la lista todos los objetos String del array.
     arrListCad5Vocales.addAll(((List<String>)Arrays.asList(arrCad)));
     ListIterator<String> listaIt;
     listaIt = arrListCad5Vocales.listItrator();
     while (listaIt.hasNext()) {
       String cadena;
       if ((cadena = listaIt.next()) != null) {
         cadena = cadena.toUpperCase();
         if (cadena.indexOf('A') == -1 ||
             cadena.indexOf('E') == -1 ||
             cadena.indexOf('I') == -1 ||
             cadena.indexOf('O') == -1 ||
             cadena.indexOf('U') == -1) {
               listaIt.remove();
             }
       }
       else {
         // Las referencias nulas de la lista se pueden eliminar directamente.
         listaIt.remove();
       }
     }
     return arrListCad5Vocales;
   }
 }
