/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.4
 *
 * Escriba una clase Punto que complete la del Ejercicio 2.4 del Capítulo 2
 * para que, además de los constructores y los métodos getX(), getY() y
 * distancia(), contenga también los siguientes métodos:
 *
 *  a) Dos métodos para modificar los valores de los atributos.
 *  b) Un método toString() que devuelva la información del Punto de la
 *     siguiente manera (x,y).
 */

 public class Punto {
   private double x;
   private double y;

   // constructores
   public Punto(double valorX, double valorY) {
     x = valorX;
     y = valorY;
   }

   public Punto() {
     this(0,0);
   }

   // setters
   public void setX(double valor) {
     x = valor;
   }

   public void setY(double valor) {
     y = valor;
   }

   // getters
   public double getX() {
     return x;
   }

   public double getY() {
     return y;
   }

   /*
    * Método que pide la distancia entre dos puntos mediante la fórmila de la
    * distancia euclídea entre dos puntos: el que le pasamos como parámetro y
    * el que se haya creado como objeto con un constructor.
    */
    public double distancia(Punto p) {
      double diferenciaX = p.getX() - x;
      double diferenciaY = p.getY() - y;

      return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    // método toString()
    public String toString() {
      return "(" + x + "," + y + ")";
    }
 }
