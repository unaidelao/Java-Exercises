/*
 * Think Java v.6 - Exercise_4_3
 *
 * The purpose of this exercise is to take code from a previous exercise and
 * encapsulate it in a method that takes parameters. You should start with a
 * working solution to Exercise 2.2.
 *
 * 1. Write a method called printAmerican that takes the day, date, month and
 * year as parameters and that displays them in American format.
 *
 * 2. Test your method by invoking it from main and passing appropriate
 * arguments. The output should look something like this (except that the date
 * might be different):
 * Saturday, July 22, 2015
 *
 * 3. Once you have debugged printAmerican, write another method called
 * printEuropean that displays the date in European format.
 */

public class Exercise_4_3 {

  public static void printAmerican(String day, String date, String month, int year) {
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }

  public static void printEuropean(String day, String date, String month, int year) {
    System.out.println("European format:");
    System.out.println(day + ", " + date + " " + month + " " + year);
  }

  public static void main (String[] args) {

      String day, date, month;
      int year;

      day = "Thursday";
      date = "26th";
      month = "January";
      year = 2017;

      printAmerican(day, date, month, year);
      System.out.println();
      printEuropean(day, date, month, year);
  }
}
