/**
 * Think Java v.6 - Exercise 9.5
 *
 * A word is said to be "abecedarian" if the letters in the word appear in
 * alphabetical order. For example, the following are all six-letter English
 * abecedarian words:
 *
 *    abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow,
 *    bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy,
 *    dimpsy.
 *
 * Write a method called isAbecedarian that takes a String and returns a
 * boolean indicating whether the word is abecedarian. Your method can be
 * iterative or recursive.
 *
 * @author Unai de la O
 */

public class Exercise_9_5 {

  public static boolean isAbecedarian(String s) {
    boolean isAbecedarianFlag = false;

    for (int i = 0; i <= s.length() - 2; i++) {
      if (s.charAt(i) < s.charAt(i + 1)) {
        isAbecedarianFlag = true;
      }
      else {
        isAbecedarianFlag = false;
        return isAbecedarianFlag;
      }
    }
    return isAbecedarianFlag;
  }

  public static void main(String[] args) {
    String text = "befist";
    System.out.println("¿Is " + text + " \"abecedarian\"?");
    System.out.println(isAbecedarian(text));
  }
}
