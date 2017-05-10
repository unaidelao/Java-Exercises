/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.15
 *
 * Escriba un método de nombre mediaAritmetica que, dada una lista de números
 * reales, calcule y devuelva su media aritmética. Escriba también un programa
 * que, utilizando dicho método, determine la media de los números -10,5,0,7,20.
 *
 * @author Unai de la O
 */

 public class MediaAritmetica {
   public static double mediaAritmetica(double ... numeros) {
     double sumatorio = 0.0;

     for (double valor : numeros) {
       sumatorio += valor;
     }
     return sumatorio / numeros.length;
   }

   public static void main(String[] args) {
     System.out.println("La media aritmetica de {-10,5,0,7,20} es " +
                        mediaAritmetica(-10,5,0,7,20));
   }
 }
