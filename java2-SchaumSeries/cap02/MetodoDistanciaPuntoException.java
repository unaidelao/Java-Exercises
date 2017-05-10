/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.12
 *
 * Modificar el método distancia del ejercicio anterior para que lance una
 * excepción si el punto que se le pasa es null. La excepción deberá contener
 * un mensaje descriptivo del problema.
 *
 * @author Unai de la O
 */
 
 /*
  * Método que mide la distancia entre dos puntos mediante la fórmula de la
  * distancia euclídea entre dos puntos. Lanza excepción en caso de que el
  * argumento requerido sea null.
  */
 public double distancia(Punto p) throws Exception {
   if (p == null)
     throw new Exception("Excepcion: p posee valor null.");
   
   double diferenciaX = x - p.x;
   double diferenciaY = y - p.y;

   return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
 }