/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.16
 *
 * Se desea calcular la distancia recorrida por un móvil. Se sabe que el móvil
 * sigue movimientos rectilíneos entre una serie de puntos. Se pide escribir un
 * método que reciba una serie de puntos y determine la distancia recorrida por
 * el móvil.
 *
 * Para probar el método, escriba un programa que calcule la distancia
 * recorrida entre los puntos (0,0), (2,4), (4,5), (4,6), (3,4) y (0,0)(vuelta
 * al origen). Pruebe también qué ocurre cuando se llama al método con un solo
 * punto.
 *
 * @author Unai de la O
 */

 public class Trayectoria {
   public static void main(String[] args) {
     // Declara referencias para cinco objetos de tipo Punto
     Punto p1, p2, p3, p4, p5;
     // Inicializa los distintos objetos Punto
     p1 = new Punto(0,0);
     p2 = new Punto(2,4);
     p3 = new Punto(4,5);
     p4 = new Punto(4,6);
     p5 = new Punto(3,4);

     // Imprime resultados por pantalla
     System.out.println("Del primer punto y vuelta al mismo, se ha recorrido "+
     recorrido(p1, p2, p3, p4, p5, p1));

     System.out.println("Llamada al metodo con un solo punto, recorre " +
     recorrido(p1));
   }

   // Este método pide un array de objetos puntos
   public static double recorrido(Punto ... puntos) {
     double distanciaAcumulada = 0.0;

     Punto previo = puntos[0];

     for (Punto actual : puntos) {
       distanciaAcumulada += actual.distancia(previo);
       previo = actual;
     }
     return distanciaAcumulada;

   }
 }

 class Punto {
   // Variables de instancia.
   private double x, y;

   // Constructor
   public Punto(double x, double y) {
     this.x = x;
     this.y = y;
   }

   //Getters
   public double getX() {
     return x;
   }

   public double getY() {
     return y;
   }

   // Método para medir la distancia entre puntos.
   public double distancia(Punto p) {
     double diferenciaX = x - p.getX();
     double diferenciaY = y - p.getY();

     return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
   }
 }
