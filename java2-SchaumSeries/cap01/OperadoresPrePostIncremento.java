/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.16
 *
 * Dado el siguiente programa, indique qué escribe en pantalla.
 *
 * @author Unai de la O
 */

public class OperadoresPrePostIncremento {
  public static void main(String[] args) {
    int a = 3, b = 6, c;
    c = a / b;
    System.out.println("El valor de c es: " + c);
    // El valor de c es: 0
    c = a % b;
    System.out.println("El valor de c es: " + c);
    // El valor de c es: 3
    a++;
    System.out.println("El valor de a es: " + a);
    // El valor de a es: 4
    ++a;
    System.out.println("El valor de a es: " + a);
    // El valor de a es: 5
    c = ++a + b++;
    System.out.println("El valor de a es: " + a);
    // El valor de a es: 6
    System.out.println("El valor de b es: " + b);
    // El valor de b es: 7
    System.out.println("El valor de c es: " + c);
    // El valor de c es: 12 (hace la suma con b = 6)
    c = ++a + ++b;
    System.out.println("El valor de a es: " + a);
    // El valor de a es: 7
    System.out.println("El valor de b es: " + b);
    // El valor de b es: 8
    System.out.println("El valor de c es: " + c);
    // El valor de c es: 15
  }
}
