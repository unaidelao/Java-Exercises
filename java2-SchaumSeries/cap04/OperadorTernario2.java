/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.3
 *
 * Escriba un método, de nombre mayorDeEdad, que reciba una edad como entero
 * por parámetro y devuelva si la persona es mayor de edad o no, utilizando un
 * método que devuelva un valor de tipo boolean.
 *
 * @author Unai de la O
 */

 public class OperadorTernario2 {
   public static boolean mayorDeEdad(int edad) {
     final int MAYOR_EDAD = 18;

     return (edad >= MAYOR_EDAD) ? true : false;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.println(mayorDeEdad(57));
   }
 }
