/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.17
 *
 * Dado el siguiente programa, indique qué escribe en pantalla.
 *
 * @author Unai de la O
 */

public class ExpresionesConIncrementos {
  public static void main(String[] args) {
    boolean expresion;
    int a = 7;

    expresion = 2 * 5 < 5 * 2 || a + 1 < 10 && ++a % 2 == 0;
    // 10 < 10 || 8 < 10 && 8 % 2 == 0
    // false || true && true
    // false || true
    // true
    System.out.println("El valor de la expresión es: " + expresion);

    expresion = 3 < 2 || ++a > 6;
    // false || 9 > 6
    // false || true
    // true
    System.out.println("El valor de la expresión es: " + expresion);

    expresion = a++ < 10 && a % 2 == 0 && a <= 10;
    // 9 < 10 && 10 % 2 == 0 && 10 <= 10
    // true && true && true
    // true && true
    // true
    System.out.println("El valor de la expresión es: " + expresion);

    expresion = a++ < 10 || a % 3 == 2;
    // 10 < 10 || 11 % 3 == 2
    // false || true
    // true
    System.out.println("El valor de la expresión es: " + expresion);

    System.out.println("El valor de a es: " + a); // a vale 11.
  }
}
