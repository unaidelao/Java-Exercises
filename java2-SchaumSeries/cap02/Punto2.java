/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.9
 *
 * Escriba un programa que instancie cuatro puntos: el primero situado en el
 * origen, el segundo situado en (5,3), el tercero en (2,-1) y para el cuarto
 * como punto medio entre el segundo y el tercero.
 *
 * @author Unai de la O
 */

 public class Punto2 {
   private double x, y;

   public Punto2(double x, double y) {
     this.x = x;
     this.y = y
   }

   public double getX() {
     return x;
   }

   public double getY() {
     return y;
   }

   public static void main(String[] args) {
     Punto2 punto1 = new Punto2(0.0, 0.0);
     Punto2 punto2 = new Punto2(5.0, 3.0);
     Punto2 punto3 = new Punto2(2.0, -1.0);
     Punto2 punto4 = new Punto2(punto2.getX() + punto3.getX() / 2,
                              punto2.getY() + punto3.getY() / 2);

   }
 }
