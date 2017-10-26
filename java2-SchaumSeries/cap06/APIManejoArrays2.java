/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.33
 *
 * Escriba una clase, de nombre APIManejoArrays2, cuyo método main() implemente
 * un programa que lleve a cabo las siguientes acciones:
 *
 * a) Declarar y construir un array de cadenas de objetos String de nombre
 *    arrStr que contenga las siguientes cadenas: "impresora", "peto", "mar",
 *    "orilla" y "Orihuela".
 *
 * b) Ordenar el array arrStr alfabéticamente teniendo en cuenta que las letras
 *    mayúsculas figuran en el código Unicode antes que las minúsculas. Mostrar
 *    por pantalla el resultado de la ordenación.
 *
 * c) Ordenar el array arrStr alfabéticamente sin distinguir entre letras
 *    minúsculas o mayúsculas. Mostrar el resultado de la ordenación.
 *
 * d) Ordenar el array arrStr con un comparador que determine que una cadena
 *    con más vocales sigue a otra que tenga menos. Mostrar por pantalla el
 *    resultado de la ordenación.
 *
 * PLANTEAMIENTO:
 *     El array de cadenas es construido de forma estática inicializando
 * directamente sus elementos. Se utilizará nuevamente el método sort() de la
 * clase Arrays que puede usarse también para ordenar arrays de objetos.
 *
 *     Para los apartados b) y c) se usa el método sin especificar un elemento
 * que defina un criterio de ordenación. Así, se utiliza el orden natural
 * establecido para los elementos del array que, por tratarse de cadenas de
 * caracteres, es el orden alfabético. El orden natural considera las letras
 * mayúsculas como anteriores a todas las minúsculas, situación que se puede
 * modificar indicando que la ordenación no tenga en cuenta las diferencias
 * entre letras mayúsculas y minúsculas.
 *
 *     El método sort() permite, además, realizar la ordenación basándose en un
 * comparador que deberá especificarse y que permite determinar cuándo un
 * objeto debe seguir a otro. Así, para los apartados d) y e) se crean dos
 * comparadores nuevos para los objetos de tipo String. El primero,
 * (ComparadorCadLen) considera que una cadena con más caracteres debe preceder
 * a otra que tenga menos; el segundo (ComparadorCadNumVocales), determina que
 * una cadena con más vocales debe seguir a otra cadena que tenga menos. Para
 * contabilizarlas no se descartarán las vocales repetidas. Estos comparadores
 * son creados como clases que implementan la interfaz Comparator<String>.
 *
 *     El método sort() permite ordenar tanto arrays numéricos como de objetos.
 * Para los segundos es posible hacerlo especificando un comparador que
 * determine cuándo un objeto debe seguir a otro.
 */
 
 import java.util.Arrays;
 import java.util.Comparator;
 
 public class APIManejoArrays2 {
   
   static class ComparadorCadLen implements Comparator<String> {
     public ComparadorCadLen() {}
     /* este método es propio de la interfaz comparator, y aquí lo que se hace
     es sobrecargarlo */
     public int compare(String a, String b) {
       return b.length() - a.length();
     }
   }
   
   static class ComparadorCadNumVocales implements Comparator<String> {
     // es privado pues sólo lo debe usar el método comparador
     private int cuentaVocales(String cad) {
       int numVocales = 0;
       for (int i = 0; i < cad.length(); i++) {
         switch (cad.toUpperCase().charAt(i)) {
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
             numVocales++;
             break;
         }
       }
       return numVocales;
     }
     
     public int compare(String a, String b) {
       return cuentaVocales(a) - cuentaVocales(b);
     }
   }
   
     public static void main(String[] args) {
       String[] arrStr = {"impresora",
                          "peto",
                          "mar",
                          "orilla",
                          "Orihuela"};
       
       /* la ordenación tiene en cuenta que las mayúsculas van en Unicode antes
       que las minúsculas */
       Arrays.sort(arrStr);
       System.out.println(Arrays.toString(arrStr));
       // se ordena sin tener en cuenta mayúsculas o minúsculas
       Arrays.sort(arrStr, String.CASE_INSENSITIVE_ORDER);
       System.out.println(Arrays.toString(arrStr));
       
       // se ordenan con el comparador por la longitud de las cadenas
       Arrays.sort(arrStr, new ComparadorCadLen());
       System.out.println(Arrays.toString(arrStr));
       
       // se ordenan con el comparador por número de vocales
       Arrays.sort(arrStr, new ComparadorCadNumVocales());
       System.out.println(Arrays.toString(arrStr));
     }
 }