/**
 * Think Java v.6 - Exercise 8.5
 *
 * The Sieve of Eratosthenes is a simple, ancient algorithm for finding all
 * prime numbers up to any given limit.
 *
 * Write a method called sieve that takes an integer parameter, n, and returns
 * a boolean array that indicates, for each number from 0 to n-1, whether the
 * number is prime.
 *
 * @author Unai de la O
 */

import java.util.Scanner;

public class Exercise_8_5 {

  public static void sieve(int n) {

    int nSqrt = (int) Math.sqrt(n);
    boolean[] primesArray = new boolean[n + 1];

    for (int j = 2; j <= nSqrt; j++) {
      if (!primesArray[j]) {
        System.out.print(j + " ");
        for (int k = j * j; k <= n; k += j) {
          primesArray[k] = true;
        }
      }
    }
    for (int l = nSqrt; l <= n; l++) {
      if (!primesArray[l])
        System.out.print(l + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.printf("--- The Sieve of Eratosthenes ---\n\nPlease, enter size: ");
    int n = in.nextInt();
    sieve(n);
  }
}
