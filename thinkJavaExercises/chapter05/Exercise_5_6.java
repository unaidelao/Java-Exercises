/**
 * Think Java v.6 - Exercise 5.6
 *
 * This exercise reviews the flow of execution through a program with multiple
 * methods. Read the following code and answer the questions.
 */

 public class Buzz {

   public static void baffle(String blimp) {
     System.out.println(blimp); // 5
     zippo("ping", -5); // 6
   }

   public static void zippo(String quince, int flag) {
     if (flag < 0) { // 2, 7
       System.out.println(quince + " zoop"); // 8
     } else {
       System.out.println("ik"); // 3
       baffle(quince); // 4
       System.out.println("boo-wa-ha-ha"); // 9
     }
   }

   public static void main(String[] args) {
     zippo("rattle", 13); // 1
   }
}

/*
 * (1) Write the number 1 next to the first line of code in this program that
 * will execute.
 * Solution: See in code.
 *
 * (2) Write the number 2 next to the second line of code, and so on until the
 * end of the program. If a line is executed more than once, it might end up
 * with more than one number next to it.
 * Solution: See in code.
 *
 * (3) What is the value of the parameter blimp when baffle gets invoked?
 * Solution: "rattle"
 *
 * (4) What is the output of this program?
 * Solution:   ik
 *             rattle
 *             ping zoop
 *             boo-wa-ha-ha
 */
