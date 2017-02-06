/**
 * Think Java v.6 - Exercise 6.2
 *
 * Write a method named isDivisible that takes two integers, n and m, and that
 * returns true if n is divisible by m, and false otherwise.
 *
 * @author Unai de la O
 */

public class Exercise_6_2 {

  public static void main(String[] args) {

    int n = 9;
    int m = 3;

    System.out.println("Does it n = " + n + ", divisible by m = " + m + "?");
    System.out.println("Answer: " + isDivisible(n, m));
  }

  public static boolean isDivisible(int n, int m) {
    return (n % m == 0);
  }
}
