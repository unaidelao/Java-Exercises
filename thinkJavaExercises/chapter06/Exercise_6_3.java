/**
 * Think Java v.6 - Exercise 6.3
 *
 * If you are given three sticks, you may or may not be able to arrange them in
 * a triangle. For example, if one of the sticks is 12 inches long and the other
 * two are one inch long, you will not be able to get the short sticks to meet
 * in the middle. For any three lengths, there is a simple test to see if it
 * is possible to form a triangle: If any of the three lengths is greater than
 * the sum of the other two, you cannot form a triangle.
 *
 * Write a method named isTriangle that takes three integers as arguments and
 * returns either true or false, depending on whether you can or cannot form a
 * triangle from sticks with the given lengths. The point of this exercise is to
 * use conditional statements to write a value method.
 */

import javax.swing.JOptionPane;

public class Exercise_6_3 {

  public static void main(String[] args) {

    int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first length to form a triangle:"));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second length to form a triangle:"));
    int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third length to form a triangle:"));

    if (isTriangle(a, b, c)) {
      System.out.println("Yes! You can form a triangle with those!");
    }
    else {
      System.out.println("Sorry, you cannot form a triangle!!");
    }
  }

  public static boolean isTriangle(int a, int b, int c) {
    if ( a > b + c || b > a + c || c > a + b) {
      return false;
    }
    else {
      return true;
    }
  }
}
