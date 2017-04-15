/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.10
 *
 * Dadas las siguientes expresiones aritméticas, calcule cuál es el resultado
 * de evaluarlas. Suponga que las variables a y b son del tipo int, a = 2 y
 * b = 4.
 *
 * a) -a + 5 % b - a * a (Resultado -5)
 * b) 5 + 3 % 7 * b * a - b % a (Resultado 29)
 * c) (a + 1) * (b + 1) - b / a (Resultado 13)
 *
 * @author Unai de la O
 */

public class Ejercicio1_10 {
  public static void main(String[] args) {
    int a = 2;
    int b = 4;

    int resultadoA = -a + 5 % b - a * a;
    int resultadoB = 5 + 3 % 7 * b * a - b % a;
    int resultadoC = (a + 1) * (b + 1) - b / a;

    System.out.println("a = " + resultadoA);
    System.out.println("b = " + resultadoB);
    System.out.println("c = " + resultadoC);
  }
}
