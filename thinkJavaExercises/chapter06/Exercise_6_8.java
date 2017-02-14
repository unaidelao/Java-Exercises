/**
 * Think Java v.6 - Exercise 6.8
 *
 * The Ackermann function is defined for non-negative integers as follows:
 *
 * A(m, n) = n + 1                    if m = 0
 *         = A(m - 1, 1)              if m > 0 and n = 0
 *         = A(m - 1, A(m, n - 1))    if m > 0 and n > 0
 *
 * Write a method called "ack" that takes two ints as parameters and that
 * computes and returns the value of the Ackermann function.
 *
 * Test your implementation of Ackermann by invoking it from main and
 * displaying the return value. Note the return value gets very big quickly.
 * You should try it only for small values of m and n (not bigger than 3).
 *
 * @author Unai de la O
 */

public class Exercise_6_8 {

  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    }
    else if (n == 0) {
      return ack(m - 1, 1);
    }
    else {
      return ack(m - 1, ack(m, n - 1));
    }
  }

  public static void main(String[] args) {

    // printing Ackermann function results from (0,0) to (3,3)
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 3; j++) {
        System.out.printf("ackerman(%d, %d) is: %d\n", i, j, ack(i,j));
      }
    }
  }
}
