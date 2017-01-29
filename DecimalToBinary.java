/**
 * Program that converts a decimal number, typed by the user, into a binary number.
 * Recursive method.
 */

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a positive integer, please: ");
    printBinary(in.nextInt());
    System.out.println();
  }

  public static void printBinary(int x) {
    if (x > 0) {
      printBinary(x / 2);
      System.out.print(x % 2);
    }
  }
}
