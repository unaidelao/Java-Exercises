/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.5
 *
 * Escriba un método, de nombre escribeOrdenadosDosNumeros, que reciba por
 * parámetro dos números enteros y los escriba de menor a mayor.
 *
 * @author Unai de la O
 */

 public class OrdenaDosNumeros {
   public void escribeOrdenadosDosNumeros(int a, int b) {
     System.out.println(a < b ? a + " " + b : b + " " + a);
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     OrdenaDosNumeros ejemplo = new OrdenaDosNumeros();
     ejemplo.escribeOrdenadosDosNumeros(89, 4);
   }
 }
