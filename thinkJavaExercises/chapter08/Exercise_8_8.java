/**
 * Think Java v.6 - Exercise 8.8
 *
 * Many of the patterns we have seen for traversing arrays can also be written
 * recursively. It is not common, but it is useful exercise.
 *
 * (1) Write a method called maxInRange that takes an array of integers and two
 * indexes, lowIndex and highIndex, and finds the maximum value in the array,
 * but only considering the elements between lowIndex and highIndex, including
 * both.
 *
 * This method should be recursive. If the length of the range is 1, that is,
 * if lowIndex == highIndex, we know immediately that the sole element in the
 * range must be the maximum. So that's the base case.
 *
 * If there is more than one element in the range, we can break the array into
 * two pieces, find the maximum in each of the pieces, and then find the
 * maximum of the maxima.
 *
 * (2) Methods like maxInRange can be awkward to use. To find the largest
 * element in an array, we have to provide the range for the entire array.
 *         double max = maxInRange(a, 0, a.length - 1);
 * Write a method called max that takes an array and uses maxInRange to find
 * and return the largest element.
 *
 * @author Unai de la O
 */
import java.util.Arrays;

public class Exercise_8_8 {

  public static int maxInRange(int[] array, int lowIndex, int highIndex) {
    // Base case
    if (lowIndex == highIndex) {
      return array[lowIndex];
    }

    int midIndex = (lowIndex + highIndex) / 2;
    int lowValue = maxInRange(array, lowIndex, midIndex);
    int highValue = maxInRange(array, midIndex + 1, highIndex);

    if (lowValue > highValue) {
      return lowValue;
    }
    else {
      return highValue;
    }
  }

  public static int max(int[] array) {
    return maxInRange(array, 0, array.length - 1);
  }

  public static void main(String[] args) {

    // Testing the code...
    int[] array = { 3, 12, 23, 54, 17, 16, 19 };

    System.out.println(Arrays.toString(array));
    System.out.println();

    System.out.print("First part of the exercise: ");
    System.out.println(maxInRange(array, 4, 6));
    System.out.println();

    System.out.print("Second part of the exercise: ");
    System.out.println(max(array));
  }
}
