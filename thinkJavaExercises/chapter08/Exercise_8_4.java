/**
 * Think Java v.6 - Exercise 8.4
 *
 * Write a method called indexOfMax that takes an array of integers and
 * returns the index of the largest element. Can you write this method using
 * an enhanced for loop? Why or why not?
 *
 * @author Unai de la O
 */

import java.util.Random;
import java.util.Arrays;

public class Exercise_8_4 {

  public static void printArray(int[] array) {
    System.out.println(Arrays.toString(array));
    System.out.println();
  }

  /*
   * Enhanced for loops often make the code more readable, especially for
   * accumulating values. But they are not helpful when you need to refer to
   * the index, as in search operations.
   */
  public static int indexOfMax(int[] array) {
    int maxIndex = 0;
    int largest = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > largest) {
        largest = array[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void main(String[] args) {

    // creating an array with some random element values
    Random random = new Random();
    int[] randomArray = new int[15];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = random.nextInt(50);
    }
    System.out.println("This is a simple array with some values:");
    printArray(randomArray);
    System.out.println("The index of the largest element is: " + indexOfMax(randomArray));
  }
}
