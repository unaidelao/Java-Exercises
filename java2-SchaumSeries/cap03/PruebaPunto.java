/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.4
 *
 * Añada a la clase Punto una constante llamada ORIGEN que sea el origen de
 * coordenadas. La constante debe ser accesible de forma estática. Escriba un
 * programa, de nombre PruebaPunto, que determine la distancia de los puntos
 * (3,4), (0,4) y (2,-1) al origen usando la constante ORIGEN.
 *
 * @author Unai de la O
 */

class Punto {
  /*
   * Constante para el punto de origen. Fijarse que se crea un objeto nuevo.
   * Al ser esta constante estática, se puede usar escribiendo Punto.ORIGEN sin
   * necesidad de tener objetos de la clase Punto.
   */
  public static final Punto ORIGEN = new Punto(0.0, 0.0);

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

class PruebaPunto {
  public static void main(String[] args) {
    Punto punto1 = new Punto(3.0, 4.0);
    Punto punto2 = new Punto(0.0, 4.0);
    Punto punto3 = new Punto(2.0, -1.0);

    System.out.println("punto1 a ORIGEN = " + punto1.distancia(Punto.ORIGEN));
    System.out.println("punto2 a ORIGEN = " + punto2.distancia(Punto.ORIGEN));
    System.out.println("punto3 a ORIGEN = " + punto3.distancia(Punto.ORIGEN));
  }
}
