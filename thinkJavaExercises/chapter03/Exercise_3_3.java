/*
 * Exercise 3.3 - Think Java
 *
 * Write a program that converts a total number of seconds to hours, minutes,
 * and seconds. It should (1) prompt the user for input, (2) read an integer
 * from the keyboard, (3) calculate the result, and (4) use printf to display
 * the output. For example, "5000 seconds = 1 hours, 23 minutes and 20 seconds"
 *
 * Hint: Use the modulus operator.
 */

import java.util.Scanner;

public class Exercise_3_3 {

  public static void main (String[] args) {

    int totalSeconds, seconds, minutes, hours;

    Scanner in = new Scanner(System.in);
    System.out.print("Type seconds: ");

    totalSeconds = in.nextInt();

    hours = totalSeconds / 3600;
    minutes = (totalSeconds % 3600) / 60;
    seconds = (totalSeconds % 3600) % 60;

    System.out.printf("%d seconds = %d hours, %d minutes and %d seconds\n",
                        totalSeconds, hours, minutes, seconds);
  }
}
