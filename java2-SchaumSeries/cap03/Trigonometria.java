/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.21
 *
 * Escriba un método que dado un ángulo en radianes, lo escriba en pantalla en
 * grados, así como los valores del seno, coseno y tangente. Las funciones de
 * la clase Math han de importarse de forma estática. Haga un programa que
 * imprima los valores de esas tres funciones para los valores 0, PI/4, PI/2 y
 * PI en radianes.
 *
 * Consejo: el ángulo, cuando no se dice nada, se supone en radianes. El método
 * toDegrees() pasa de radianes a grados.
 *
 * @author Unai de la O
 */

 /*
  * Importación estática de toda la clase Math. Así, por ejemplo, si queremos
  * usar PI, no haría falta escribir Math.PI. O para el método del coseno, no
  * hay que escribir Math.cos(), simplemente cos().
  */
  import static java.lang.Math.*;

  public class Trigonometria {
    // Esta función recibe como parámetro un ángulo en radianes, de tipo double
    static void funcionesTrigon(double alfa) {
      System.out.println("Radianes: " + alfa);
      System.out.println("Grados: " + toDegrees(alfa));
      System.out.println("Seno: " + sin(alfa));
      System.out.println("Coseno: " + cos(alfa));
      System.out.println("Tangente: " + tan(alfa));
      System.out.println();
    }

    // MAIN y prueba del programa
    public static void main(String[] args) {
      funcionesTrigon(0);
      funcionesTrigon(PI/4);
      funcionesTrigon(PI/2);
      funcionesTrigon(PI);
    }
  }
