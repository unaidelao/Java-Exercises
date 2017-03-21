/**
 * Think Java v.6 - Exercise 10.5
 *
 * Many encription algorithms depend on the ability to raise large integers to
 * a power. Here is a method that implements an efficient algorithm for integer
 * exponentiation:
 *
 *    public static int pow(int x, int n) {
 *      if (n == 0) return 1;
 *
 *      // find x to the n/2 recursively
 *      int t = pow(x, n/2);
 *
 *      // if n is even, the result is t squared
 *      // if n is odd, the result is t squared times x
 *      if (n % 2 == 0) {
 *        return t * t;
 *      } else {
 *        return t * t * x;
 *      }
 *    }
 *
 * The problem with this method is that is only works if the result is small
 * enough to be represented by an int. Rewrite it so that the result is a
 * BigInteger. The parameters should still be integers, though.
 *
 * You should use the BigInteger methods add and multiply. But don't use
 * BigInteger.pow; that would spoil the fun.
 *
 * @author Unai de la O
 */

import java.math.BigInteger;

public class Exercise_10_5 {

  public static BigInteger pow(int x, int n) {
    if (n == 0)
      return BigInteger.valueOf(1);

    BigInteger t = pow(x, n/2);
    BigInteger xBig = BigInteger.valueOf(x);

    if (n % 2 == 0) {
      return t.multiply(t);
    }
    else {
      return t.multiply(t).multiply(xBig);
    }
  }

  public static void main(String[] args) {
    System.out.println("BigInteger 20^150 = " + pow(20, 150));
  }
}
