/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.6
 *
 * Escriba un método, de nombre escribeOrdenadosTresNumeros, que reciba por
 * parámetro dos números reales y los escriba de menor a mayor.
 *
 * @author Unai de la O
 */

 public class OrdenaTresNumeros {
   /*
    * Con este método lo que se hace es ordenar los valores de dos en dos,
    * intercambiando sus valores mediante una variable auxiliar en caso
    * necesario.
    */
   public void escribeOrdenadosTresNumeros(double a, double b, double c) {
     double tmp;

     if (a > b) {
       tmp = a;
       a = b;
       b = tmp;
     }
     if (a > c) {
       tmp = a;
       a = c;
       c = tmp;
     }
     if (b > c) {
       tmp = b;
       b = c;
       c = tmp;
     }
     System.out.printf("%.2f %.2f %.2f%n", a, b, c);
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     OrdenaTresNumeros ejemplo = new OrdenaTresNumeros();
     ejemplo.escribeOrdenadosTresNumeros(3.14, 2.7, 78.0);
     ejemplo.escribeOrdenadosTresNumeros(2.32, 6.0, 1.5);
     ejemplo.escribeOrdenadosTresNumeros(12.0, 7.54, 3.16);
   }
 }
