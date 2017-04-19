/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.14
 *
 * Dadas las siguientes expresiones aritmético-lógicas calcule el resultado.
 *
 * a) 25 > 20 && 13 > 5 (Solución: true)
 * b) 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2 (Solución: true)
 * c) 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1 (Solución: true)
 * d) 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1 (Solución: true)
 *
 * IMPORTANTE, recordar que la precedencia es: operaciones aritméticas,
 * operaciones relacionales y, por último, operaciones booleanas. Las
 * operaciones booleanas tienen la siguiente precedencia: primero la negación,
 * después && y por último ||.
 *
 * @author Unai de la O
 */

public class Ejercicio1_14 {
  public static void main(String[] args) {
    boolean a = 25 > 20 && 13 > 5;
    boolean b = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
    boolean c = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
    boolean d = 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
  }
}
