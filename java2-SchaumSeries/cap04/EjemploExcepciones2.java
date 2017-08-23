/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.37
 *
 * Considere el siguiente programa. ¿Qué salida se obtiene por pantalla tras su
 * ejecución?
 */

 import java.io.IOException;

 public class EjemploExcepciones2 {
   public static int devuelveEntero(int num) throws IOException {
     try {
       if (num % 2 == 0) {
         throw new Exception("Lanzando excepcion");
       }
       else {
         throw new IOException("ioE");
       }
     }
     catch(Exception e) {
       return 2;
     }
     finally {
       return 3;
     }
   }
   public static void main(String[] args) {
    int a = 0;
    try {
      a = devuelveEntero(1);
    }
    catch(IOException ioE) {}
    System.out.println(a);
   }
 }

 /*
  * Solución: la llamada al método devuelveEntero() se invoca utilizando un
  * número impar como argumento. En el método main() habrá que capturar la
  * excepción aunque no se produzca.
  *
  * La inclusión del bloque finally{} hace que su bloque se ejecute. De esta
  * forma la variable a recibirá el valor 3 que será el que se muestre por
  * pantalla.
  */
