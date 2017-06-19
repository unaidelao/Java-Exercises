/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.11
 *
 * Escriba un programa que declare una cadena de caracteres denominada nombre,
 * con valor inicial "Juan", primerApellido, con valor "Sotillo" y
 * segundoApellido con valor "Soto". Después, el programa concatena a nombre el
 * primer apellido y luego el segundo. Por último, el programa imprime el
 * nombre completo y su longitud.
 *
 * @author Unai de la O
 */

 class CadenasEj2 {
   public static void main(String[] args) {
     String nombre = "Juan";
     String primerApellido = "Sotillo";
     String segundoApellido = "Soto";
     
     nombre += primerApellido;
     nombre += segundoApellido;

     System.out.println(nombre + " tiene " + nombre.length() + " caracteres");
   }
 }