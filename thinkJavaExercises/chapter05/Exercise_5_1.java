/**
 * Think Java v.6 - Exercise 5.1
 * Logical operators can simplify nested conditional statements.
 * For example, can you rewrite this code using a single if statement?
 *  if (x > 0) {
 *    if (x < 10) {
 *      System.out.prinln("positive single digit number.");
 *    }
 *  }
 */

public class Exercise_5_1 {

  public static void main(String[] args) {

    int x = 5;

    if (x > 0 && x < 10) {
      System.out.println("positive single digit number.");
    }
  }
}
