/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.22
 *
 * Escriba un método de nombre escribeAlReves que reciba un String y escriba
 * dicho texto en la pantalla al revés.
 *
 * @author Unai de la O
 */

 public class TextoAlReves {
   public static void escribeAlReves(String s) {
     // Bucle que hace un recorrido desde el último al primer carácter
     for (int i = s.length() -1; i >= 0; i--) {
       System.out.print(s.charAt(i));
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     String textoPrueba = "Texto de prueba: 1 2 3 4 Madrid.";

     System.out.println("Original -> " + textoPrueba);
     System.out.print("Al Reves -> ");
     escribeAlReves(textoPrueba);
     System.out.println();
   }
 }
