/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.31
 *
 * Escriba un programa que lance y capture una excepción de la clase Exception
 *
 * Planteamiento: el programa abre un bucle try{} en el que comienza mostrando
 * un mensaje por pantalla. A continuación, crea un objeto de la clase
 * Exception indicando en su constructor un mensaje explicativo.
 *
 * Se procede a continuación a su lanzamiento utilizando la sentencia throw.
 * El bloque catch{} asociado al bloque try{} anterior constituye el manejador
 * de la excepción e incluye las sentencias necesarias para su tratamiento.
 *
 * En este caso el manejado se limita a mostrar por pantalla el mensaje
 * contenido en el objeto excepción capturado que es obtenido con ayuda del
 * método getMessage().
 */

 public class TryCatchException1 {
   public static void main(String[] args) {
     try {
       System.out.println("Mensaje mostrado por pantalla");
       // Construcción del objeto que representa la excepción
       Exception e = new Exception("Esto es un objeto Exception");
       // Lanzamiento de la excepción
       throw e;
     }
     // Manejador de la excepción
     catch(Exception e1) {
       System.out.println("Excepcion capturada con mensaje: " + e1.getMessage());
     }
     System.out.println("Programa terminado.");
   }
 }
