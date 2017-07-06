/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.1
 *
 * Escriba un método, de nombre mayorDeEdad que reciba una edad como entero por
 * parámetro y muestre un mensaje por pantalla si es mayor de edad o no.
 *
 * @author Unai de la O
 */

 public class MayorDeEdad {
   public static void mayorDeEdad(int edad) {
     final int MAYORIA_DE_EDAD = 18;

     if (edad >= MAYORIA_DE_EDAD) {
       System.out.println("El usuario es mayor de edad.");
     }
     else {
       System.out.println("El usuario NO es mayor de edad.");
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     mayorDeEdad(14);
   }
 }
