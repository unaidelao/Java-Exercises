/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.23
 *
 * Escriba un método que compruebe si una palabra o una frase es un palíndromo.
 *
 * Planteamiento: para comprobar que una frase es un palíndromo hay que
 * comprobar si se corresponden el carácter de su izquierda con el de su
 * derecha y así uno a uno hasta llegar a la mitad. Para no tener en cuenta si
 * los caracteres están en mayúsculas o minúsculas, antes de hacer la
 * comprobación se deben convertir los caracteres bien a mayúsculas, bien a
 * minúsculas.
 *
 * @author Unai de la O
 */

 public class CompruebaPalindromo {
   public static boolean esPalindromo(String s) {
     for (int i = 0; i < s.length() / 2; i++) {
       if (Character.toUpperCase(s.charAt(i)) !=
          Character.toUpperCase(s.charAt(s.length() -1 -i))) {
            return false;
       }
     }
     return true;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.println("esPalindromo(\"Madrid\"): " + esPalindromo("Madrid"));
     System.out.println("esPalindromo(\"Ana\"): " + esPalindromo("Ana"));
   }
 }
