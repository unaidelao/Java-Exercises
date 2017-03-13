/**
 * Think Java v.6 - Exercise 9.4
 *
 * (1) Write some code in main that tests each of these methods. Make sure
 * they work, and you understand what they do.
 *
 * (2) Using these methods, and without using any other String methods, write
 * a method called printString that takes a string as a parameter and displays
 * the letters of the string, one on each line. It should be a void method.
 *
 * (3) Again using only these methods, write a method called printBackward that
 * does the same thing as printString but that displays the string backward
 * (again, one character per line).
 *
 * (4) Now write a method called reverseString that takes a string as a
 * parameter and that returns a new string as a return value. The new string
 * should contain the same letters as the parameter, but in reverse order.
 *
 *    String backwards = reverseString("coffee");
 *    System.out.println(backwards);
 *
 * The output of this example code should be: eeffoc
 *
 * (5) A palindrome is a word that reads the same both forward and backward,
 * like "otto". Here's one way to test whether a string is a palindrome
 *
 *    A single letter is a palindrome, a two-letter word is a palindrome if the
 *    letters are the same, and any other word is a palindrome if the first
 *    letter is the same as the last and the middle is a palindrome.
 *
 * Write a recursive method named isPalindrome that takes a String and returns
 * a boolean indicating whether the word is a palindrome.
 *
 * @author Unai de la O
 */

public class Exercise_9_4 {

  /**
   * Returns the first character of the given String.
   */
  public static char first(String s) {
    return s.charAt(0);
  }

  /**
   * Returns all but the first letter of the given String.
   */
  public static String rest(String s) {
    return s.substring(1);
  }

  /**
   * Returns all but the first and last letter of the String.
   */
  public static String middle(String s) {
    return s.substring(1, s.length() - 1);
  }

  /**
   * Returns the length of the given String.
   */
  public static int length(String s) {
    return s.length();
  }

  // printString method
  // complex way of doing it
  public static void printString(String s) {
    System.out.println(first(s)); //prints the first char of the String s.
    String a = rest(s); // new String var. to allocate the rest of the String.
    for (int i = 1; i < length(s); i++) { // i=1 b/c the first char of String s is already printed
      System.out.println(first(a)); // prints the first char of the new String variable a
      a = rest(a); // redefines a, again, but ignoring the already printed char.
    }
  }

  // printBackward method
  // much more ease way of doing it as a recursive method
  public static void printBackward(String s) {
    // base case
    if (length(s) > 1) {
      printBackward(rest(s));
    }
    System.out.println(first(s));
  }

  // reverseString method
  public static String reverseString(String s) {
    // base case
    if (length(s) == 1){
      return s;
    }
    else {
      String reverse = reverseString(rest(s) + first(s));
      return reverse;
    }
  }
  // isPalindrome method
  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) {
      return true;
    }
    if (first (s) != s.charAt(s.length() - 1)) {
      return false;
    }
    else {
      return isPalindrome(middle(s));
    }
  }

  // main
  public static void main(String[] args) {
    String text = "No matter what";

    System.out.printf("\nSome code to test the given methods...\n\n");
    System.out.println("My example String is: " + text);
    System.out.println("First letter is: " + first(text));
    System.out.println("All but the first letter is: " + rest(text));
    System.out.println("All but the first and the last letter is: " + middle(text));
    System.out.println("The String length is: " + length(text));

    System.out.printf("\nTesting printString method:\n\n");
    printString(text);
    System.out.printf("\nTesting printBackward method:\n\n");
    printBackward(text);
    System.out.printf("\nTesting isPalindrome method:\n\n");
    String text2 = "Ale ela";
    System.out.println(isPalindrome(text2));
  }
}
