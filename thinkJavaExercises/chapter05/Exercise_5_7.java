/**
 * Think Java v.6 - Exercise 5.7
 *
 * Now that we have conditional statements, we can get back to the “Guess My
 * Number” game from Exercise 3.4. You should already have a program that
 * chooses a random number, prompts the user to guess it, and displays the
 * difference between the guess and the chosen number.
 *
 * Adding a small amount of code at a time, and testing as you go, modify the
 * program so it tells the user whether the guess is too high or too low, and
 * then prompts the user for another guess.
 *
 *The program should continue until the user gets it right. Hint: Use two
 * methods, and make one of them recursive.
 *
 * @author Unai de la O
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise_5_7 {

  public static void checkUserNumber(int userNumber, int machineNumber) {

    if (userNumber < machineNumber) {
      System.out.println("The number I was thinking is greater than yours!");
      System.out.println("Keep on trying!");

      // Debug println
      //System.out.println("*Machine Number: " + machineNumber + ", *User Number: " + userNumber);
      System.out.println();
      System.out.print("Type a number: ");
      Scanner in = new Scanner(System.in);
      userNumber = in.nextInt();

      checkUserNumber(userNumber, machineNumber);
    }
    else if (userNumber > machineNumber) {
      System.out.println("The number I was thinking is lower than yours!");
      System.out.println("Keep on trying!");

      // Debug println
      //System.out.println("*Machine Number: " + machineNumber + ", *User Number: " + userNumber);
      System.out.println();
      System.out.print("Type a number: ");
      Scanner in = new Scanner(System.in);
      userNumber = in.nextInt();

      checkUserNumber(userNumber, machineNumber);
    }
    else {
      System.out.println("Yeah! " + machineNumber + " is the number! Congrats!");
    }
  }

  public static void main (String[] args) {
    // pick a random number
    Random randomNumber = new Random();
    int machineNumber = randomNumber.nextInt(100) + 1;

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");

    System.out.print("Type a number: ");
    Scanner in = new Scanner(System.in);
    int userNumber = in.nextInt();

    checkUserNumber(userNumber, machineNumber);
  }
}
