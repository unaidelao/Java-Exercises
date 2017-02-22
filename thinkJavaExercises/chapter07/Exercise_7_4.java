/**
 * Think Java v.6 - Exercise 7.4
 *
 * Section 6.7 presents a recursive method that computes the factorial
 * function. Write an iterative version of factorial.
 *
 * @author Unai de la O
 */

 import javax.swing.JOptionPane;

 public class Exercise_7_4 {

   public static void main(String[] args) {

     Long result = 1L; // long type because factorials are huge

     int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number, please"));

     for (int i = number; i > 0; i--) {
       result *= i;
     }
     System.out.println("Factorial of " + number + " is " + result + ".");
   }
 }
