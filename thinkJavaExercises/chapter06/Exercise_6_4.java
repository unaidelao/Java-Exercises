/**
 * Think Java v.6 - Exercise 6.4
 *
 * Many computations can be expressed more concisely using the "multadd"
 * operation, wich takes three operands and computes a*b+c. Some processors
 * even provide a hardware implementation of this operation for floating-point
 * numbers.
 *
 * (1) Create a new program called Multadd.java
 *
 * (2) Write a method called multadd that takes three doubles as parameters and
 * that returns a*b+c.
 *
 * (3) Write a main method that tests multadd by invoking it with a few simple
 * parameters, like 1.0, 2.0, 3.0.
 *
 * (4) Also in main, use multadd to compute the following values:
 *        sin PI/4 + (cos PI/4) / 2
 *        log10 + log 20
 *
 *(5) Write a method called expSum that takes a double as a parameter and that
 * uses multadd to calculate:
 *        xe^(-x) + sqrt(1 - e^(-x))
 *
 * HINT: the Math method for raising e to a power is Math.exp.
 *
 * @author Unai de la O
 */

public class Exercise_6_4 { // Multadd program

  public static double multadd(double a, double b, double c) {
    return a * b + c;
  }

  public static double expSum(double x) {

    double a = 1.0;
    double b = x * (Math.exp(-x));
    double c = Math.sqrt(1 - (Math.exp(-x)));

    return multadd(a, b, c);
  }

  public static void main(String[] args) {

    // Calculate multadd(1.0, 2.0, 3.0)
    System.out.println("Multadd 1.0 * 2.0 + 3.0: " + multadd(1.0, 2.0, 3.0));

    //Calculate Sine(PI/4) + cos(pi/4)/2 using multadd
    double a1 = Math.cos(Math.PI/4.0);
    double b1 = 1.0/2.0;
    double c1 = Math.sin(Math.PI/4.0);
    System.out.println ("sin(pi/4) + cos(pi/4)/2 = " + multadd(a1, b1, c1));

    // Calculate log10 + log20 using multadd
    double a2 = 1.0;
    double b2 = Math.log(10);
    double c2 = Math.log(20);
    double result2 = multadd(a2,b2,c2);
    System.out.println("log10 + log20 = " + multadd(a2, b2, c2));

    // Test expSum method
    System.out.println("expSum(2.0) = " + expSum(2.0));
  }
}
