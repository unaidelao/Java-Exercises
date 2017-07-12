/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.10
 *
 * Escriba un método que calcule la potencia de un número real (a) elevado a un
 * número entero (b). Tenga en cuenta que tanto a como b pueden valer 0 o
 * pueden ser números negativos.
 *
 * Lo que se pretende con este ejercicio es que el método sea idéntico a
 * Math.pow().
 *
 * Ayuda: Cuidado con 0 elevado a un número negativo, pues vale infinito. Para
 * representar este valor se utilizará la constante Double.POSITIVE_INFINITY
 *
 * @author Unai de la O
 */

 public class CalcularPotencia {
   public static double potencia(double a, int b) {
     double total = 1;

     if (a == 0) {
       if (b == 0) {
         total = Double.NaN; // en verdad el resultado sería "Indefinido"
       }
       else if (b < 0) {
         total = Double.POSITIVE_INFINITY;
       }
       else if (b == 1) {
         total = 0;
       }
     }
     else if (b == 0) {
       total = 1;
     }
     else if (b < 0) {
       for (int i = 0; i < -b; i++) {
         total *= a;
       }
       total = 1 / total;
     }
     else {
       for (int i = 0; i < b; i++) {
         total *= a;
       }
     }
     return total;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.println("0^0 = " + potencia(0, 0));
     System.out.println("0^1 = " + potencia(0, 1));
     System.out.println("0^-1 = " + potencia(0, -1));
     System.out.println("1^0 = " + potencia(1, 0));
     System.out.println("2^3 = " + potencia(2, 3));
     System.out.println("2^-3 = " + potencia(2, -3));
   }
 }
