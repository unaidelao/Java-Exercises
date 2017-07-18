/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.19
 *
 * Escriba un método de nombre dibujaTriangulo2, que reciba un entero como
 * parámetro. El método debe dibujar un triángulo como el que se muestra en el
 * siguiente dibujo después de comprobar que el valor del parámetro se
 * encuentra entre 3 y 15, ambos incluidos.
 *
 * Por ejemplo, si el valor del argumento es 4, dibujará:
 *
 *          *
 *        * *
 *      * * *
 *    * * * *
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class DibujaTriangulo2 {
   public static void dibujaTriangulo2(int n) {
     int lado = n;

     if (n >= 3 && n <= 15) {
       for (int i = 0; i < n; i++) {
         for (int j = 0; j < lado -1; j++) {
           System.out.print(" ");
         }
         for (int k = 0; k < i+1; k++) {
           System.out.print("*");
         }
         System.out.println();
         lado--;
       }
     }
     else {
       System.out.println("ERROR: el lado debe ser >3 y <15.");
     }
   }

   //MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Ingresa el lado del triangulo: ");
     int inputUsuario = in.nextInt();

     dibujaTriangulo2(inputUsuario);
   }
 }
