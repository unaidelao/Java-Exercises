/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.20
 *
 * Se define la serie de Fibonacci como 1,1,2,3,5,8,13,21... donde los dos
 * primeros términos son 1 y cada término restante es la suma de los dos
 * anteriores.
 *
 * Se pide escribir dos métodos que calculen el término i-ésimo de la serie de
 * Fibonacci, uno de ellos de forma recursiva y otro de forma iterativa.
 *
 * @author Unai de la O
 */

 public class Fibonacci {
   // Método iterativo. Requiere int con la cantidad de números de la serie
   public static int fibIter(int n) {
     if (n <= 0) {
       return -1;
     }

     int temp = 1;
     int ultimo = 1;
     int penultimo = 1;

     /*
      * El bucle empieza en 2 ya que, según esta serie, los dos primeros
      * resultados son 1.
      */
     for (int i = 2; i < n; i++) {
       if (i == 0 || i == 1) {
         return 1;
       }
       else {
         temp = ultimo + penultimo;
         penultimo = ultimo;
         ultimo = temp;
       }
     }
     return temp;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.println("Primer digito de la serie Fibonacci: " + fibIter(1));
     System.out.println("Segundo digito de la serie Fibonacci: " + fibIter(2));
     System.out.println("Tercer digito de la serie Fibonacci: " + fibIter(3));
     System.out.println("Cuarto digito de la serie Fibonacci: " + fibIter(4));
     System.out.println("Quinto digito de la serie Fibonacci: " + fibIter(5));
     System.out.println("Sexto digito de la serie Fibonacci: " + fibIter(6));
     System.out.println("Septimo digito de la serie Fibonacci: " + fibIter(7));
     System.out.println("Octavo digito de la serie Fibonacci: " + fibIter(8));
   }
 }
