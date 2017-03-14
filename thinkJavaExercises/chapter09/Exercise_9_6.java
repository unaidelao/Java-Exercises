/**
 * Think Java v.6 - Exercise 9.6
 *
 * A word is said to be a "doubloon" if every letter that appears in the word
 * appears exactly twice. Here are some example doubloons:
 *
 *    Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial,
 *    boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines,
 *    Isis, mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, sees,
 *    Shanghaiings, Toto.
 *
 * Write a method called isDoubloon that takes a string and checks whether it
 * is a doubloon. To ignore case, invoke the toLowerCase method before checking
 *
 * @author Unai de la O
 */

public class Exercise_9_6 {

  public static final int ALPHABET_SIZE = 26;

  public static boolean isDoubloon(String s) {
    String lowerText = s.toLowerCase();

    boolean isDoubloonFlag = false;

    int[] histogram = new int[ALPHABET_SIZE];

    // creates a histogram of the string
    for (int i = 0; i < s.length(); i++) {
      char traverseChar = lowerText.charAt(i);

      if (traverseChar >= 'a' && traverseChar <= 'z') {
        histogram[traverseChar - 'a']++;
      }
    }
    // checks, with the previous histogram, is there is any double letter
    for (int i = 0; i <= ALPHABET_SIZE - 1; i++) {
      if (histogram[i] == 2 || histogram[i] == 0){
        isDoubloonFlag = true;
      }
      else {
       isDoubloonFlag = false;
       /*
        * this return statement prevents a bug i.e with a word like "laptop"
        * that is not a doubloon but as it's last character appears twice, the
        * return value would be true.
        */
       return isDoubloonFlag;
      }
    }
    return isDoubloonFlag;
  }
  public static void main(String[] args) {
    String text = "appearer";
    System.out.println("Is the word " + text + " a doubloon?");
    System.out.println(isDoubloon(text));
  }
}
