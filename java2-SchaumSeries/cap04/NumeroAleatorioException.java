/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.32
 *
 * Escriba un programa que genere un número aleatorio e indique si el número
 * generado es par o impar.
 *
 * El programa utilizará para ello el lanzamiento de una excepción.
 */

 public class NumeroAleatorioException {
   public static void main(String[] args) {
     try {
       System.out.println("Generando numero aleatorio...");
       int numeroAleatorio = (int)(Math.random() * 100);

       if (numeroAleatorio % 2 == 0) {
         throw new Exception("Resultado par: " + numeroAleatorio);
       }
       else {
         throw new Exception("Resultado impar: " + numeroAleatorio);
       }
     }
     catch(Exception e) {
       System.out.println(e.getMessage());
     }
   }
 }
