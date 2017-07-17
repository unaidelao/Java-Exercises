/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.17
 *
 * Escriba un método de nombre dibujaRectangulo que reciba dos valores enteros
 * como parámetros. El método debe dibujar un rectángulo en el que la base es
 * mayor que la altura, por lo que utilizará como base el mayor de los valores
 * proporcionados como parámetro y como altura, el menor.
 *
 * Por ejemplo, si se le pasa como argumentos los valores 3 y 5, dibujará:
 *
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *
 * @author Unai de la O
 */

 public class DibujaRectangulo {
   public void dibujaRectangulo(int a, int b) {
     if (a > b) {
       for (int i = 0; i < b; i++) {
         for (int j = 0; j < a; j++) {
           System.out.print("* ");
         }
         System.out.println();
       }
     }
     else {
       for (int i = 0; i < a; i++) {
         for (int j = 0; j < b; j++) {
           System.out.print("* ");
         }
         System.out.println();
       }
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     // Se crean varios objetos
     DibujaRectangulo ejemplo1 = new DibujaRectangulo();
     System.out.println("Argumentos (3,5)");
     ejemplo1.dibujaRectangulo(3,5);

     DibujaRectangulo ejemplo2 = new DibujaRectangulo();
     System.out.println("Argumentos (5,3)");
     ejemplo1.dibujaRectangulo(5,3);

     DibujaRectangulo ejemplo3 = new DibujaRectangulo();
     System.out.println("Argumentos (2,4)");
     ejemplo1.dibujaRectangulo(2,4);

     DibujaRectangulo ejemplo4 = new DibujaRectangulo();
     System.out.println("Argumentos (4,2)");
     ejemplo1.dibujaRectangulo(4,2);
   }
 }
