/**
 * Think Java v.6 - Exercise 8.1
 *
 * The goal of this exercise is to practice encapsulation with some of the
 * examples in this chapter.
 *
 * (1) Starting with the code in Section 8.6, write a method called powArray
 * that takes a double array, "a", and returns a new array that contains the
 * elements of "a" squared. Generalize it to take a second argument and raise
 * the elements of "a" to the given power.
 *
 * (2) Starting with the code in Section 8.10, write a method called histogram
 * that takes an int array of scores from 0 to (but not including) 100, and
 * returns a histogram of 100 counters. Generalize it to take the number of
 * counters as an argument.
 *
 * @author Unai de la O
 */

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_8_1 {

  public static void printArray(double[] a) {
    System.out.println(Arrays.toString(a));
  }

  public static double[] powArray(double[] a, double n) {
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], n);
    }
    return a;
  }

  /*
  public static int[] histogram(int[] a, ) {

  }
  */

  public static void main(String[] args) {
    Random random = new Random();
    double a[] = new double[30];
    // filling array elements with pseudoaleatory numbers
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }

    // print a[], with pseudoaleatory numbers
    printArray(a);
    Scanner in = new Scanner(System.in);
    // get users choice for n
    System.out.print("Enter n (a \"double\" that will be the power given to raise that array: )");
    double n = in.nextDouble();
    // raise a[] elements to n
    powArray(a, n);
    // print a[] modified
    printArray(a);

  }
}
