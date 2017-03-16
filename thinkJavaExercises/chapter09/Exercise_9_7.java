/**
 * Think Java v.6 - Exercise 9.7
 *
 * Two words are anagrams if they contain the same letters and the same number
 * of each letter. For example, "stop" is an anagram of "pots" and
 * "allen downey" is an anagram of "well annoyed".
 *
 * Write a method that takes two strings and checks whether they are anagrams
 * of each other.
 *
 * @author Unai de la O
 */
import java.util.Arrays;

public class Exercise_9_7 {

  public static final int ALPHABET_SIZE = 26;

  public static boolean areAnagrams(String s, String t) {
    String lowerText1 = s.toLowerCase();
    String lowerText2 = t.toLowerCase();

    boolean areAnagramsFlag = false;

    // A histogram for each string
    int[] histogram1 = new int[ALPHABET_SIZE];
    int[] histogram2 = new int[ALPHABET_SIZE];

    // Creates a histogram of the FIRST string
    for (int i = 0; i < s.length(); i++) {
      char traverseChar = lowerText1.charAt(i);

      if (traverseChar >= 'a' && traverseChar <= 'z') {
        histogram1[traverseChar - 'a']++;
      }
    }
    // Creates a histogram of the SECOND string
    for (int i = 0; i < t.length(); i++) {
      char traverseChar = lowerText2.charAt(i);

      if (traverseChar >= 'a' && traverseChar <= 'z') {
        histogram2[traverseChar - 'a']++;
      }
    }

    /* DEBUG CODE
    System.out.println(Arrays.toString(histogram1));
    System.out.println(Arrays.toString(histogram2));
    */

    // Comparison of the two histograms to determine if they are anagrams
    for (int i = 0; i < ALPHABET_SIZE; i++) {

      if (histogram1[i] == histogram2[i] && s.length() == t.length()){
        areAnagramsFlag = true;
      }
      else {
        areAnagramsFlag = false;
        return areAnagramsFlag;
      }
    }
    return areAnagramsFlag;
  }

  public static void main(String[] args) {
    String s = "arrowe";
    String t = "arrow";

    System.out.println("Are " + s + " and " + t + " anagrams?");
    System.out.println(areAnagrams(s, t));
  }
}
