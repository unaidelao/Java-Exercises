/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.18
 *
 * Escriba un método de nombre dibujaTriangulo, que reciba un entero como
 * parámetro. El método debe dibujar un triángulo como el que se muestra en el
 * siguiente dibujo después de comprobar que el valor del parámetro es menor
 * que 15.
 *
 * Por ejemplo, si el valor del argumento es 4, dibujará:
 *
 *    * * * *
 *    * * *
 *    * *
 *    *
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class DibujaTriangulo {
   public static void dibujaTriangulo(int n) {
     int lado = n;

     if (n < 15) {
       for (int i = 0; i < n; i++) {
         for (int j = 0; j < lado; j++) {
           System.out.print("* ");
         }
         System.out.println();
         lado--;
       }
     }
     else {
       System.out.println("ERROR: el lado es mayor que 15.");
     }
   }

   //MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Ingresa el lado del triangulo: ");
     int inputUsuario = in.nextInt();

     dibujaTriangulo(inputUsuario);
   }
 }
