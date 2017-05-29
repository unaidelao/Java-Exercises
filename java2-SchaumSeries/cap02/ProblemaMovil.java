/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 2.22
 *
 * Escriba un programa que permita modelar el movimiento rectilíneo uniforme de
 * un móvil en un plano. El móvil puede seguir una trayectoria en cualquier
 * recta del plano.
 *
 * Se conoce la posición inicial del móvil, así como su velocidad lineal.
 * Escriba asímismo un programa que ejercite dichas clases, de forma que se
 * instancie un móvil que se mueva a una velocidad de 2,4 m/seg, que parte de
 * la posición (2.1, 5.2) y se mueve sobre la recta y = 2x + 1.
 *
 * El móvil se irá moviendo en incrementos de tiempo arbitrarios. El programa
 * ha de determinar las posiciones en las que se encuentra el móvil tras el
 * paso de 3.5, 4 y 6.2 unidades de tiempo respectivamente y las imprimirá por
 * pantalla. (Nota: Evidentemente, el punto de partida del móvil ha de
 * pertenecer a la recta que define el movimiento).
 */
 
 class Punto {
   private double x, y;
   
   Punto(double x, double y) {
     this.x = x;
     this.y = y;
   }
   
   double getX() {
     return x;
   }
   
   double getY() {
     return y;
   }
   
   String posicion() {
     return "(" + x + "," + y + ")";
   }
 }
 
 class MovUniforme {
   private double vel;
   
   MovUniforme(double vel) {
     this.vel = vel;
   }
   
   double recorrido(double t) {
     return vel * t;
   }
 }
 
 class Recta {
   private double a, b;
   
   Recta(double a, double b) {
     this.a = a;
     this.b = b;
   }
   
   double pendiente() {
     return Math.atan(a);
   }
 }
 
 class Movil {
   private Punto posInicial;
   private Punto posAnterior;
   private Punto posActual;
   
   private Recta trayectoria;
   private MovUniforme mov;
   
   Movil(Punto origen, Recta trayectoria, MovUniforme mov) {
     this.posAnterior = this.posActual =
     this.posInicial = origen;
     
     this.trayectoria = trayectoria;
     this.mov = mov;
   }
   
   // calcula la nueva posición pasados t segundos
   void avanza(double t) {
     // punto intermedio para actualizar el punto anterior cuando acaben los cálculos
     Punto intermedio = new Punto(posActual.getX(), posActual.getY());
     
     double dist = mov.recorrido(t);
     
     double alfa = trayectoria.pendiente();
     
     double incremX = dist * Math.cos(alfa);
     double incremY = dist * Math.sin(alfa);
     
     posActual = new Punto(posAnterior.getX() + incremX, posAnterior.getY() + incremY);
     
     posAnterior = intermedio;
   }
   
   Punto posActual() {
     return posActual;
   }
 }
 
 public class ProblemaMovil {
   public static void main(String[] args) {
     Punto inicial = new Punto (2.1, 5.2);
     
     Recta trayectoria = new Recta(2, 1);
     
     MovUniforme miMov = new MovUniforme(2.4);
     
     Movil m = new Movil(inicial, trayectoria, miMov);
     
     System.out.println("Me encuentro en " + m.posActual().posicion());
     
     // avanza e imprime la posición actual
     m.avanza(3.2);
     System.out.println("Me encuentro en " + m.posActual().posicion());
     
     m.avanza(4);
     System.out.println("Me encuentro en " + m.posActual().posicion());
     
     m.avanza(6.2);
     System.out.println("Me encuentro en " + m.posActual().posicion());
   }
 }