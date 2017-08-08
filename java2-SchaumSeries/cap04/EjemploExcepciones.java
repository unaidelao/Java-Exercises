/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.36
 *
 * Indique la salida por pantalla que produciría el siguiente programa:
 */

 public class EjemploExcepciones {
   public static int devuelveEntero(int num) {
     try {
       if (num % 2 == 0) {
         throw new Exception("Lanzando excepcion");
       }
       return 1;
     }
     catch(Exception e) {
       return 2;
     }
     finally {
       return 3;
     }
   }
   public static void main(String[] args) {
    System.out.println(devuelveEntero(2));
   }
 }

 /*
  * Respuesta: da igual qué parámetro se introduce en el método
  * devuelveEntero(); ya que al existir un bloque finally{}, éste se ejecuta
  * siempre.
  */
