/**
 * Think Java v.6 - Exercise 7.3
 *
 * In Exercise 6.9 we wrote a recursive version on power, which takes a double
 * x and an integer n and returns x^n. Now write an iterative method to perform
 * the same calculation.
 *
 * @author Unai de la O
 */

import java.util.Scanner;

public class Exercise_7_3 {

  public static double power(double x, int n) {
    // n^0 = 1
    int i = 1;
    double result = 1.0;

    // as n can be positive or negative, we better use absolute value
    while (i <= Math.abs(n)) {
      if (n > 0) {
        result *= x;
      }
      else {
        result /= x;
      }
      i++;
    }
    return result;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Let's make x^n...");
    System.out.print("Define x: ");
    double x = in.nextDouble();
    System.out.print("Define n: ");
    int n = in.nextInt();

    System.out.println("The result of " + x + " raised to " + n + " is " + power(x, n));
  }
}
