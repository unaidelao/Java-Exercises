/**
 * Think Java v.6 - Exercise 10.4
 *
 * (1) Create a new program called Big.java and write (or reuse) an iterative
 * version of factorial.
 *
 * (2) Display a table of the integers from 0 to 30 along with their
 * factorials. At some point arount 15, you will probably see that the answers
 * are not right anymore. Why not?
 *
 * (3) BigInteger is a Java class that can represent arbitrarily big integers.
 * There is no upper bound except the limitations of memory size and processing
 * speed. Take a minute to read the documentation, which you can find by doing
 * a web search for "Java BigInteger".
 *
 * (4) To use BigInteger, you have to import java.math.BigInteger
 *
 * (5) There are several ways to create a BigInteger, but the simplest uses
 * valueOf. The following code converts an integer to a BigInteger:
 *
 *    int x = 17;
 *    BigInteger big = BigInteger.valueOf(x);
 *
 * (6) Since BigInteger are not primitive types, the usual math operators don't
 * work. Instead, we have to use methods like add. To add two BigInteger,
 * invoke add on one and pass the other as an argument.
 *
 *    BigInteger small = BigInteger.valueOf(17);
 *    BigInteger big = BigInteger.valueOf(1700000000);
 *    BigInteger total = small.add(big);
 *
 * Try out some of the other methods, like multiply and pow.
 *
 * (7) Convert factorial so that it performs its calculations using BigInteger
 * and returns a BigInteger as a result. You can leave the parameter alone; it
 * will still be an integer.
 *
 * (8) Try displaying the table again with your modified factorial method. Is
 * it correct up to 30? How high can you make it go?
 *
 * (9) Are BigInteger objects mutable or inmutable? How can you tell?
 *
 * @author Unai de la O
 */

import java.math.BigInteger;

public class Exercise_10_4 {

  public static BigInteger factorial(int n) {
    if (n == 0)
      return BigInteger.valueOf(1);
    else {
      return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
  }

  public static void factorialList(int n) {

    System.out.printf("Number\tFactorial\n");
    System.out.printf("------\t---------\n");

    for (int i = 0; i <= n; i++) {
      System.out.printf("%2d\t%d\n", i, factorial(i));
    }
  }

  public static void main(String[] args) {
    factorialList(35);
  }
}
