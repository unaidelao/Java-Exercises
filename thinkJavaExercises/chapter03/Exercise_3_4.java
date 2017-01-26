/*
 * Think Java v.6 - Exercise 3.4
 *
 * The goal of this exercise is to program a “Guess My Number” game. When it’s
 * finished, it will work like this:
 *
 * I ' m thinking of a number between 1 and 100
 * (including both). Can you guess what it is?
 * Type a number: 45
 * Your guess is: 45
 * The number I was thinking of is: 14
 * You were off by: 31
 *
 * To choose a random number, you can use the Random class in java.util.
 */
 
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

  public static void main (String[] args) {

    int userNumber;
    // pick a random number
    Random randomNumber = new Random();
    int machineNumber = randomNumber.nextInt(100) + 1;

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");

    System.out.print("Type a number: ");
    Scanner in = new Scanner(System.in);
    userNumber = in.nextInt();

    System.out.println("Your guess is: " + userNumber);
    System.out.println("The number I was thinking of is: " + machineNumber);
    System.out.println("You were off by: " + (userNumber - machineNumber));

  }
}
