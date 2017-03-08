/**
 * Think Java v.6 - Exercise 8.7
 *
 * Write a method named arePrimeFactors that takes an integer n and an array
 * of integers, and that returns true if the numbers in the array are all
 * prime and their product is n.
 *
 * @author Unai de la O
 */

public class Exercise_8_7 {

  public static boolean arePrimeFactors(int n, int[]) {
    Boolean notPrime = false;
    int result = 1;

    // Makes the product of the array elements
    for (int a : array) {
      result *= a;
    }
    //Checks if the array elements are prime numbers
    for (int i = 0; i < array.length; i++) {
      for (int j = 2; j < array[i]; j++) {
        if (array[i] % j == 0) // so, if it's divisible...
          notPrime = true;
      }
    }

    // Checks the exercise requisites
    if (notPrime == true || result != n) {
      return false;
    }
    else {
      return true;
    }
  }

  public static void main(String[] args) {
    int[] array = { 2, 6, 5, 7};
    System.out.println(arePrimeFactors(420, array));
  }
}
