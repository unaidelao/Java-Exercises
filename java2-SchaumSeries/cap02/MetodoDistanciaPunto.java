/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.11
 *
 * Añada un método a la clase Punto que calcule la distancia a otro punto.
 *
 * @author Unai de la O
 */

 /*
  * Método que mide la distancia entre dos puntos mediante la fórmula de la
  * distancia euclídea entre dos puntos.
  */
 public double distancia(Punto p) {
   double diferenciaX = x - p.x;
   double diferenciaY = y - p.y;

   return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
 }
