/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.2
 *
 * Escriba un método, de nombre mayorQue25, que reciba un entero por parámetro
 * y muestre un mensaje por pantalla que indique si es mayor o menor que 25.
 *
 * En vez de utilizar la estructura if-else, utilizar el operador ternario (?:)
 *
 * @author Unai de la O
 */

 public class OperadorTernario {
   public static void mayorQue25(int edad) {
     final int EDAD_CONTROL = 25;
     System.out.print("La edad probada ");
     System.out.print(edad > EDAD_CONTROL ? "es " : "no es ");
     System.out.println("mayor que " + EDAD_CONTROL);
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     mayorQue25(21);
   }
 }
