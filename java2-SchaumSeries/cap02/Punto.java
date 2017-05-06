/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.8
 *
 * Definir una clase que represente un punto en un espacio bidimensional. La
 * clase debe disponer de un constructor con las coordenadas del punto y
 * métodos accesores a las coordenadas.
 *
 * @author Unai de la O
 */

 public class Punto {
   private double x, y;

   public Punto(double x, double y) {
     this.x = x;
     this.y = y
   }

   public double getX() {
     return x;
   }

   public double getY() {
     return y;
   }
 }
