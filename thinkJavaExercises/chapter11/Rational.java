/**
 * Think Java v.6 - Exercise 11.5
 *
 * A rational number is a number that can be represented as the ratio of two
 * integers. For example, 2/3 is a rational number, and you can think of 7 as a
 * rational number with an implicit 1 in the denominator.
 *
 * (1) Define a class called Rational. A Rational object should have two
 * integer instance variables that store the numerator and denominator.
 *
 * (2) Write a constructor that takes no arguments and that sets the numerator
 * to 0 and denominator to 1.
 *
 * (3) Write an instance method called printRational that displays a Rational
 * in some reasonable format.
 *
 * (4) Write a main method that creates a new object with type Rational, sets
 * its instance variables to some values, and displays the object.
 *
 * (5) At this stage, you have a minimal testable program. Test it and, if
 * necessary, debug it.
 *
 * (6) Write a toString method for Rational and test it using println.
 *
 * (7) Write a second constructor that takes two arguments and uses them to
 * initialize the instance variables.
 *
 * (8) Write an instance method called negate that reverses the sign of a
 * rational number. This method should be a modifier, so it should be void.
 * Add lines to main to test the new method.
 *
 * (9) Write an instance method called invert that inverts the number by
 * swapping the numerator and denominator. It should be a modifier. Add lines
 * to main to test the new method.
 *
 * (10) Write an instance method called toDouble that converts the rational
 * number to a double (floating-point number) and returns the result. This
 * method is a pure method; it does not modify the object. As always, test the
 * new method.
 *
 * (11) Write an instance method named reduce that reduces a rational number to
 * its lowest terms by finding the greatest common divisor (GCD) of the
 * numerator and denominator and dividing through. This method should be pure
 * method; it should not modify the instance variables of the object on which
 * it is invoked.
 *
 * Hint: Finding GCD only takes a few lines of code. Search the web for
 * "Euclidean algorithm".
 *
 * (12) Write an instance method called add that takes a Rational number as an
 * argument, adds it to this, and returns a new Rational object.
 *
 * There are several ways to add fractions. You can use any one you want, but
 * you should make sure that the result of the operation is reduced so that the
 * numerator and denominator have no common divisor (other than 1).
 *
 * The purpose of this exercise is to write a class definition that includes a
 * variety of methods, including constructors, static methods, instance methods
 * , modifiers, and pure methods.
 *
 * @author Unai de la O
 */

// (1) Rational class definition
public class Rational {
  private int numerator;
  private int denominator;

  // (2) constructor without arguments
  public Rational() {
    this.numerator = 0;
    this.denominator = 1;
  }

  // (7) constructor with arguments
  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  // (3) printRational() method
  public static void printRational(Rational r) {
    System.out.println(r.numerator + "/" + r.denominator);
  }

  // (6) toString() instance method
  public String toString() {
    return String.format("%d/%d", this.numerator, this.denominator);
  }

  // (8) negate instance method (modifier)
  public void negate() {
    this.numerator *= -1;
  }

  // (9) invert instance method (modifier)
  public void invert() {
    int numerator = this.numerator;
    int denominator = this.denominator;
    this.numerator = denominator;
    this.denominator = numerator;
  }

  // (10) toDouble() instance method (pure method)
  public double toDouble() {
    double numerator = this.numerator;
    double denominator = this.denominator;
    return numerator / denominator;
  }

  // (11) gcd() recursive method and reduce() instance method (pure method)
  public static int gcd(int number1, int number2) {
    if (number2 == 0) {
      return number1;
    }
    return gcd(number2, number1 % number2);
  }

  public Rational reduce() {
    int numerator = this.numerator;
    int denominator = this.denominator;
    int gcd = gcd(numerator, denominator);
    Rational reducedRational = new Rational(numerator / gcd, denominator / gcd);
    return reducedRational;
  }

  // (12) add() instance method
  public Rational add(Rational rationaltoBeAdded) {
    int newNumerator = (this.numerator * rationaltoBeAdded.denominator) +
                       (this.denominator * rationaltoBeAdded.numerator);
    int newDenominator = this.denominator * rationaltoBeAdded.denominator;

    Rational sumRational = new Rational(newNumerator, newDenominator);
    Rational finalRational = sumRational.reduce();
    return finalRational;
  }

  // (4) (5) MAIN method
  public static void main(String[] args) {
    // creating and printing rational "a" object
    Rational a = new Rational();
    System.out.print("This is rational a: ");
    printRational(a);

    // changing instance variable values of "a"
    a.numerator = 8;
    a.denominator = 4;

    // printing "a" again
    System.out.print("This is modified rational a: ");
    printRational(a);

    // printing with toString() method
    // when we use println method, int invokes our toString() method
    System.out.println("Rational a, using toString(): " + a);

    // creating a new Rational object and use negate() method.
    Rational b = new Rational(15, 5);
    System.out.print("New Rational object b: ");
    printRational(b);
    b.negate();
    System.out.print("Negate b: ");
    printRational(b);

    // creating another new Rational object and use invert() method.
    Rational c = new Rational(9, 3);
    System.out.print("New Rational object c: ");
    printRational(c);
    c.invert();
    System.out.print("Invert c: ");
    printRational(c);

    // testing toDouble() pure method
    double decimalValue = b.toDouble();
    System.out.println("Decimal value of Rational b: " + decimalValue);

    // testing  gcd() and reduce() pure methods
    Rational d = new Rational(210, 1365);
    System.out.print("New Rational object d: ");
    printRational(d);
    System.out.println("GCD of Rational object d values: " + gcd(d.numerator, d.denominator));
    System.out.print("Rational object d reduced: ");
    Rational reducedD = d.reduce();
    printRational(reducedD);

    // testing add() instance method
    // so, we are going to add 2/4 + 3/8
    Rational first = new Rational(2, 4);
    Rational second = new Rational(3, 8);
    System.out.print("What is " + first + " + " + second + "?: ");
    Rational sum = first.add(second);
    printRational(sum);
  }
}
 
