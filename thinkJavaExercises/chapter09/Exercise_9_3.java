/**
 * Think Java v.6 - Exercise 9.3
 *
 * The purpose of this exercise is to review encapsulation and generalization.
 * The following code fragment traverses a string and cheks whether it has the
 * same number of open and close parentheses:
 *
 *    String s = "((3 + 7) * 2)";
 *    int count = 0;
 *
 *    for (int i = 0; i < s.length(); i++) {
 *      char c = s.charAt(i);
 *      if (c == '(') {
 *        count++;
 *      } else if (c == ')') {
 *        count--;
 *      }
 *    }
 *    System.out.println(count);
 *
 * (1) Encapsulate this fragment in a method that takes a string argument and
 * returns the final value of count.
 *
 * (2) Now that you have generalized the code so that it works on any string,
 * what could you do to generalize it more?
 *
 * (3) Test your method with multiple strings, including some that are balanced
 * and some that are not.
 *
 * @author Unai de la O
 */

import java.util.Scanner;

public class Exercise_9_3 {

  // (1) Encapsulate the fragment of code
  public static int counter(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        count++;
      }
      else if (c == ')') {
        count--;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    // (2) and (3) In order to generalize it more, we can do this
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a text with parentheses, I'll check wheter it has more '(' or ')'");

    String text = in.nextLine();

    System.out.println(counter(text));
  }
}
