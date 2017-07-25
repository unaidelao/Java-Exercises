/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.24
 *
 * Escriba un método que reciba como parámetro un String y devuelva el número
 * de palabras que contiene el String. Se consideran palabras los grupos de
 * caracteres separados por espacios en blanco.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CuentaPalabras {
   /*
    * El siguiente método utiliza el método trim() para eliminar los espacios
    * que haya al principio y al final del String parámetro.
    *
    * Utiliza el método split() para crear un array, utilizando la expresión
    * regular " +" que significa un espacio una o más veces.
    *
    * El valor que retorna es la longitud de ese array, porque cada elemento
    * de ese array va a ser una palabra.
    */
   public static int cuentaPalabras(String s) {
     return s.trim().split(" +").length;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Introduce texto: ");
     String texto = in.nextLine();

     System.out.println("Total de palabras: " + cuentaPalabras(texto));
   }
 }
