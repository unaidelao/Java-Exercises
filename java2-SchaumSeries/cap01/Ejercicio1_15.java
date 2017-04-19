/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.15
 *
 * Dadas las siguientes expresiones aritmético-lógicas calcule el resultado.
 * Suponga que las variables a y b son del tipo int, a = 5, b = 3.
 *
 * a) !(a > b && 2 * a <= b)
 * b) b++ > 3 || a + b <= 8 && !(a > b)
 * c) a++ < 6 && (b += 2) < a
 * d) a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4))
 *
 * IMPORTANTE, recordar que la precedencia es: operaciones aritméticas,
 * operaciones relacionales y, por último, operaciones booleanas. Las
 * operaciones booleanas tienen la siguiente precedencia: primero la negación,
 * después && y por último ||. ¡¡Ojo con los incrementos de las variables!!
 *
 * @author Unai de la O
 */

public class Ejercicio1_15 {
  public static void main(String[] args) {
    int a = 5;
    int b = 3;

    boolean bool_a = !(a > b && 2 * a <= b);
    boolean bool_b = b++ > 3 || a + b <= 8 && !(a > b);
    boolean bool_c = a++ < 6 && (b += 2) < a;
    boolean bool_d = a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4));

    System.out.println("a = " + bool_a);
    System.out.println("b = " + bool_b);
    System.out.println("c = " + bool_c);
    System.out.println("d = " + bool_d);
  }
}
