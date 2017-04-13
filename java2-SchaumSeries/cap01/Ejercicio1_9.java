/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.9
 *
 * Dadas las siguientes expresiones aritméticas, calcule cuál es el resultado
 * de evaluarlas.
 *
 * a) 25+20-15
 * b) 20*10+15*10
 * c) 20*10/2-20/5*3
 * d) 15/10*2+3/4*8
 *
 * @author Unai de la O
 */

public class Ejercicio1_9 {
  public static void main(String[] args) {
    int a = 25 + 20 - 15; // 30
    int b = 20 * 10 + 15 * 10; // 350
    int c = 20 * 10 / 2 - 20 / 5 * 3; // 88
    int d = 15 / 10 * 2 + 3 / 4 * 8; // 2

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
  }
}
