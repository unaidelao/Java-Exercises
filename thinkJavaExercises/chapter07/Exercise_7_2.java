/**
 * Think Java v.6 - Exercise 7.2
 *
 * Let's say you are given a number, a, and you want to find its square root.
 * One way to do that is to start with a rough guess about the answer, x0, and
 * then improve the guess using this formula:
 *        x1 = (x0 + a / x0) / 2
 * Write a method called squareRoot that takes a double and returns an
 * approximation of the square root of the parameter, using this technique.
 * You should not use Math.sqrt
 *
 * As your initial guess, you should use a/2. Your method should iterate until
 * it gets two consecutive estimates that differ by less than 0.0001. You can
 * use Math.abs to calculate the absolute value of the difference.
 *
 * @author Unai de la O
 */
import java.util.Scanner;

public class Exercise_7_2 {

  public static double squareRoot(double a) {

    double x0 = 0;
    double x1 = a / 2;
    while (Math.abs(x1 - x0) > 0.0001) {
      x0 = x1;
      x1 = (x0 + a / x0) / 2;
    }
    return x1;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number to calculate its approximate square root: ");
    double userNumber = in.nextDouble();

    System.out.println("The approximate square root of " + userNumber + " is " +
    squareRoot(userNumber));
  }
}
