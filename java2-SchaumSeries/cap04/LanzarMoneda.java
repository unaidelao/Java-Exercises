/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.27
 *
 * Escriba un programa que permita determinar si utilizar los números
 * aleatorios de la clase Math son apropiados.
 *
 * Para ello, el programa debe simular que se lanza una moneda un número
 * elevado de veces, por ejemplo 1.000.000. A continuación, debe imprimir por
 * pantalla el porcentaje de caras y el de cruces que han salido.
 *
 * @author Unai de la O
 */

 public class LanzarMoneda {
   public static void main(String[] args) {
     int lanzamientos = 1000000;
     int caras = 0;
     int cruces = 0;

     for (int i = 0; i < lanzamientos; i++) {
       if (Math.random() < 0.50) {
         caras++;
       }
       else {
         cruces++;
       }
     }
     System.out.println("Moneda lanzada " + lanzamientos + " veces.");
     System.out.println("Total de caras: " + caras);
     System.out.println("Total de cruces: " + cruces);
   }
 }
