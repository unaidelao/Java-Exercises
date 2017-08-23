/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.38
 *
 * ¿Qué salida por pantalla mostrará la ejecución del siguiente programa?
 */

 import java.io.IOException;

 public class EjemploExcepciones3 {
   public static int devuelveEntero(int num) throws IOException {
     try {
       if (num % 2 == 0) {
         throw new Exception("Lanzando excepcion");
       }
       else {
         throw new IOException("Desde try");
       }
     }
     catch(Exception e) {
       return 2;
     }
     finally {
       throw new IOException("Desde finally");
     }
   }
   public static void main(String[] args) {
    int a = 0;
    try {
      a = devuelveEntero(1);
    }
    catch(IOException ioE) {
      System.out.println(ioE.getMessage());
    }
    System.out.println(a);
   }
 }

 /*
  * Solución: el mensaje que se mostrará por pantalla en el manejador de la
  * excepción del método main() será "Desde finally" y se mostrará el valor 0
  * para la variable a. La presencia del bloque finally{} dará lugar a que se
  * genere su excepción. La excepción lanzada desde el bloque try{} se perderá.
  */
