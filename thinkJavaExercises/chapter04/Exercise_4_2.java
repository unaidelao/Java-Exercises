/*
 * Think Java v.6 - Exercise 4.2
 *
 * The point of this exercise is to make sure you understand how to write and
 * invoke methods that take parameters.
 *
 * 1. Write the first line of a method named zool that takes three parameters:
 * an int and two Strings.
 *
 * 2. Write a line of code that calls zool, passing as arguments the value 11,
 * the name of your first pet, and the name of the street you grew up on.
 */

public class Exercise_4_2 {
  public static void zool (int x, String s, String t) {
    System.out.printf("Number: %d\nPet name: %s\nStreet name: %s\n", x, s, t);
  }
  public static void main (String[] args) {
    int number = 11;
    String pet = "Copi";
    String street = "Avenida";
    zool(number, pet, street);
  }
}
