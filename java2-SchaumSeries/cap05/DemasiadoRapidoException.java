/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.18 parte 5 de 5
 *
 * Excepción DemasiadoRapidoException, que hereda de Exception.
 */

 public class DemasiadoRapidoException extends Exception {
   public DemasiadoRapidoException() {

   }

   public DemasiadoRapidoException(String mensaje) {
     super(mensaje);
   }
 }
