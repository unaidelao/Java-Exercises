/**
 * Think Java v.6 - Exercise 8.6
 *
 * Write a method named areFactors that takes an integer n and array of
 * integers, and that returns true if the numbers in the array are all factors
 * of n (which is to say that n is divisible by all of them).
 *
 * @author Unai de la O
 */

public class Exercise_8_6 {

  public static boolean areFactors(int n, int[] array) {
    Boolean divisible = false;
    Boolean notDivisible = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % n == 0) {
        divisible = true;
      }
      else {
        notDivisible = true;
      }
    }
    if (notDivisible == false && divisible == true) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    int[] array = { 8, 10, 34, 40};
    System.out.prinln(areFactors(2, array));
  }
}
