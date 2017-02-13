/**
 * Think Java v.6 - Exercise 6.7
 *
 * Write a recursive method named oddSum that takes a positive odd integer n
 * and returns the sum of odd integers from 1 to n. Start with a base case, and
 * use temporary variables to debug your solution. You might find it helpful to
 * print the value of n each time oddSum is invoked.
 *
 * @author Unai de la O
 */
import java.util.Scanner;

public class Exercise_6_7 {

  public static int oddSum(int n) {
    // base case
    if (n == 1) {
      return 1;
    }
    // recursive call
    else {
      return n + oddSum(n - 2);
    }
  }

  public static void main(String[] args) {

    System.out.println("Hello! I'll sum odd integers from 1 to n.");
    System.out.print("Please, enter a positive odd integer (n): ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    // if the user enters an even number...
    if (n % 2 == 0) {
      System.out.println("I told you an ODD number!!");

    }
    else {
      System.out.println("The result is: " + oddSum(n));
    }
  }
}
