/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.2
 *
 * Se desea imprimir el modelo y el color de un coche dado. Para ello, se pide
 * escribir un método que acepte un objeto de la clase Coche. Si dicha
 * referencia no es null, el método deberá imprimir el modelo y el color. Si es
 * null, el método no hará nada.
 *
 * @author Unai de la O
 */

 /*
  * En este ejemplo el método es estático
  * Para invocarlo habría que utilizar la sentencia:
  *  imprimirDatosCoche(coche);
  */
 public static void imprimirDatosCoche(Coche coche) {
   if (coche != null) {
     System.out.printf("Modelo: %s%nColor: %s%n", coche.modelo, coche.color);
   }
 }
