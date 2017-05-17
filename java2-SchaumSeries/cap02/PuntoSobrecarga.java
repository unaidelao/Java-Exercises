/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.17
 *
 * Escriba la clase Punto con dos métodos llamados distancia. Uno de ellos
 * calcula la distancia a otro punto y el otro calcula la distancia al origen.
 *
 * @author Unai de la O
 */

 public class PuntoSobrecarga {
   // Variables de instancia
   private double x, y;

   // Constructor
   public PuntoSobrecarga(double x, double y) {
     this.x = x;
     this.y = y;
   }

   // Getters
   public double getX() {
     return x;
   }

   public double getY() {
     return y;
   }
   /*
    * Se utiliza la técnica de la sobrecarga en un método para tener un mismo
    * método para que pueda admitir distintos parámetros.
    */
   // Método distancia() "sobrecargado" que mide la distancia entre dos puntos
   public double distancia(PuntoSobrecarga p) {
     double diferenciaX = x - p.getX();
     double diferenciaY = y - p.getY();

     return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
   }

   // Método distancia()
   public double distancia() {
     return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
   }

   //MAIN y test del programa
   public static void main(String[] args) {
     PuntoSobrecarga p1 = new PuntoSobrecarga(2,2);
     PuntoSobrecarga p2 = new PuntoSobrecarga(5,2);

     double distancia1 = p1.distancia();
     System.out.println("La distancia de p1 al origen es: " + distancia1);

     double distancia2 = p1.distancia(p2);
     System.out.println("La distancia entre p1 y p2 es: " + distancia2);
   }
 }
