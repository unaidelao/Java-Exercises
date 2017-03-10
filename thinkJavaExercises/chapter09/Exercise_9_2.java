/**
 * Think Java v.6 - Exercise 9.2
 *
 * Write a method called letterHist that takes a string as a parameter and
 * returns a histogram of the letters in the string. The zeroth element of the
 * histogram should contain the number of a's in the string (upper and
 * lowercase); the 25th element should contain the number of z's. Your solution
 * should only traverse the string once.
 *
 * @author Unai de la O
 */

import java.util.Arrays;

public class Exercise_9_2 {

  public static final int ALPHABET_SIZE = 26;

  public static int[] letterHist(String s) {

    int[] histogram = new int[ALPHABET_SIZE];

    for (int i = 0; i < s.length(); i++) {
      char traverseChar = s.toUpperCase().charAt(i);

      if (traverseChar >= 'A' && traverseChar <= 'Z') {
        histogram[traverseChar - 'A']++;
      }
    }
    return histogram;
  }

  public static void main(String[] args) {

    String text = "AbCdWxYz";

    System.out.println("The test String is: " + text);
    int[] textHistogram = letterHist(text);
    System.out.println("And the histogram is: " + Arrays.toString(textHistogram));
  }
}
