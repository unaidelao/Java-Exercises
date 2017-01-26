/*
 * Exercise 3.2 - Think Java
 *
 * Write a program that converts a temperature from Celsius to Fahrenheit.
 * It should (1) prompt the user for input, (2) read a double value from the
 * keyboard, (3) calculate the result, and (4) format the output to one decimal
 * place.
 *
 * For example, it should display "24.0 C = 75.2 F".
 */

import java.util.Scanner;

public class Exercise_3_2 {

    public static void main (String[] args) {

      double celsius;
      double fahrenheit;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter Celsius: ");
      celsius = in.nextDouble();

      fahrenheit = celsius * 9/5 + 32;
      System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
