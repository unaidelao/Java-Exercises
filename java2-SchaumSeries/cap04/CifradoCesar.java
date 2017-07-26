/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.26
 *
 * Escriba un método que permita realizar el cifrado César de un texto. Para
 * realizar el cifrado César se necesita el texto a cifrar y un número que
 * indica el desplazamiento que se emplea de los caracteres para cifrar. Si el
 * número es 2, la letra 'a' se sustituye por la letra 'c', la 'b' por la 'd',
 * etc.
 *
 * Utilice para el cifrado el alfabeto español que incluya la ñ.
 * Para simplificar el ejercicio suponga que los textos son en minúsculas. Los
 * caracteres que no pertenezcan al alfabeto en minúsculas permanecerán como en
 * el original.
 *
 * Planteamiento: Para hacer el cifrado César se necesita disponer del alfabeto
 * completo. Para ello puede utilizar un String que contenga todos los
 * caracteres a cifrar en orden, incluyendo la ñ en su posición.
 *
 * Para realizar el cifrado se buscará si la letra a cifrar se encuentra en el
 * alfabeto y, si es así, en qué posición está. Para cifrarla basta sumarle el
 * número dado de cifrado.
 *
 * Si al sumar se excede del tamaño del alfabeto, se puede volver al principio
 * del mismo utilizando el operador %.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CifradoCesar {
   /*
    * Los parámetros que requiere esta función son:
    *   una cadena de texto (s), que se le pedirá al usuario
    *   un número entero (k), que será la posición a mover en el alfabeto
    */
   public static String cifradoCesar(String s, int k) {
     final String ALFABETO = "abcdefghijklmnñopqrstuvwxyz";
     String textoCifrado = "";

     for (int i = 0; i < s.length(); i++){
       int posicion = ALFABETO.indexOf(s.charAt(i));
       if (posicion >= 0) {
         textoCifrado += ALFABETO.charAt((posicion + k) % ALFABETO.length());
       }
       else { // Si se trata de un carácter especial, no del alfabeto.
         textoCifrado += s.charAt(i);
       }
     }
     return textoCifrado;
   }

   // Main y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Introduzca texto a cifrar:");
     String textoUsuario = in.nextLine();
     System.out.print("Introduzca numero de posiciones a desplazar: ");
     int cifraLlave = in.nextInt();

     System.out.println(cifradoCesar(textoUsuario, cifraLlave));
   }
 }
