/**
 * Think Java v.6 - Exercise 11.4
 *
 * Write a class definition for Date, an object type that contains three
 * integers: year, month and day. This class should provide two constructors.
 * The first should take no parameters and initialize a default date. The
 * second should take parameters named year, month and day, and use them to
 * initialize the instance variables.
 *
 * Write a main method that creates a new Date object named birthday. The new
 * object should contain your birth date. You can use either constructor.
 *
 * @author Unai de la O
 */

public class Date {
  private int year;
  private int month;
  private int day;

  public Date() {
    this.year = 1980;
    this.month = 1;
    this.day = 1;
  }

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public static void main(String[] args) {
    Date birthday = new Date();
    Date birthday2 = new Date(1993, 4, 23);

    System.out.println("" + birthday.year + "/" + birthday.month
      + "/" + birthday.day);
    System.out.println("" + birthday2.year + "/" + birthday2.month
      + "/" + birthday2.day);
  }
}
