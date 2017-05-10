/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.13
 *
 * Escriba un programa que cree un punto en (4,3) e imprima la distancia del
 * punto al origen de coordenadas.
 *
 * @author Unai de la O
 */
 
 public class DistanciaPuntoOrigen {
   
   public static void main(String[] args) {
     // Punto con las coordenadas de origen
     Punto origen = new Punto(0.0, 0.0);
     // Punto de prueba
     Punto puntoPrueba = new Punto(4.0, 3.0);
     
     double distanciaPuntos = puntoPrueba.distancia(origen);
     System.out.println("La distancia es de " + distanciaPuntos);
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