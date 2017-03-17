/**
 * Think Java v.6 - Exercise 9.8
 *
 * In Scrabble each player has a set of tiles with letters on them. The object
 * of the game is to use those letters to spell words. The scoring system is
 * complex, but longer words are usually worth more than shorter words.
 *
 * Imagine you are given your set of tiles as a string, line "quijibo", and you
 * are given another string to test, like "jib".
 *
 * Write a method called canSpell that takes two strings and checks whether the
 * set of tiles can spell the word. You might have more than one tile with the
 * same letter, but you can only use each tile once.
 *
 * @author Unai de la O
 */

public class Exercise_9_8 {

  public static boolean canSpell(String s, String t) {

    return s.contains(t);
  }

  public static void main(String[] args) {

    String setOfTiles = "quijibo";
    String checkString = "jib";

    System.out.println("Does \"" + setOfTiles + "\" contains \"" + checkString + "\"?");
    System.out.println(canSpell(setOfTiles, checkString));
  }
}
