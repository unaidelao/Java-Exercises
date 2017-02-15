/**
 * Think Java v.6 - Exercise 6.9
 *
 * Write a recursive method called power that takes a double x and an integer
 * n and that returns x^n.
 *
 * Hint: a recursive definition of this operation is
 * power (x,n) = x * power(x, n-1).
 *
 * Also, remember that anything raised to the zeroeth power is 1.
 *
 * @author Unai de la O
 */
import java.util.Scanner;

public class Exercise_6_9 {

  public static double power(double x, int n) {
    // anything raised to the zeroeth power is 1.
    if (n == 0) {
      return 1.0;
    }
    else if (n > 0) {
      return x * power(x, n - 1);
    }
    else { // in case ot negative power
      return 1.0/x * power(1.0/x, -n - 1);
    }
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
