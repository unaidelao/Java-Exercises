/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.21
 *
 * La función de Ackerman se define para valores enteros no negativos n y m:
 *     A(m,n) = n+1               m=0
 *              A(m-1,1)          n=0,m>0
 *              A(m-1, A(m,n-1))  n>0, m>0
 *
 * Se pide codificar un método que calcule la función de Ackerman y un programa
 * que imprima los valores de ackerman(0,0), ackerman(2,2) y ackerman(6,6).
 *
 * @author Unai de la O
 */

 public class Ackerman {
   // Método recursivo de la función de Ackerman
   public static int ackerman(int m, int n) {
     if (n < 0 || m < 0) {
       return -1;    // Porque n y m serían parámetros no válidos
     }

     if (m == 0) {
       return n + 1;
     }

     if (n == 0) {
       return ackerman(m - 1, 1);
     }
     return ackerman(m -1, ackerman(m, n - 1));
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.println("Valor Ackerman(0,0) = " + ackerman(0,0));
     System.out.println("Valor Ackerman(2,2) = " + ackerman(2,2));
     System.out.println("Valor Ackerman(3,3) = " + ackerman(3,3));
     // El valor (6,6) imprime error ya que el número excede la capacidad int
     System.out.println("Valor Ackerman(6,6) = " + ackerman(6,6));
   }
 }
