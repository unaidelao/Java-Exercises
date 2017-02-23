/**
 * Think Java v.6 - Exercise 6.6
 *
 * One way to calculate e^x is to use the infinite series expansion
 *     e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ...
 *
 * The ith term in this series is x^i/i!.
 *
 * 1. Write a method named myexp that takes x and n as parameters and estimates
 *    e^x by adding the first n terms of this series. You can use the factorial
 *    method from Section 6.7 or your iterative version from the previous
 *    exercise.
 *
 * 2. You can make this method more efficient if you realize that the numerator
 *    of each term is the same as its predecessor multiplied by x, and the
 *    denominator is the same as its predecessor multiplied by i. Use this
 *    observation to eliminate the use of Math.pow and factorial, and check
 *    that you get the same result.
 *
 * 3. Write a method called check that takes a parameter, x, and displays x,
 *    myexp(x), and Math.exp(x). The output should look something like:
 *     1.0       2.708333333333333       2.718281828459045
 *    You can use the String "\t" to print a tab character between columns of
 *    a table.
 *
 * 4. Vary the number of terms in the series (the second argument that check
 *    sends to myexp) and see the effect of the accuracy n the result. Adjust
 *    this value until the estimated value agrees with the "correct" answer
 *    when x is 1.
 *
 * 5. Write a loop in main that invokes check with the values 0.1, 1.0, 10.0
 *    and 100.0.  How does the accuracy of the result vary as x varies?
 *    Compare the number of digits of agreement rather than the difference
 *    between the actual and estimated values.
 *
 * 6. Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0,
 *    and -100.0.  Comment on the accuracy.
 *
 */
public class Exercise_7_5 {

	public static double myexp(double x, int n) {
		double result = 1.0;
		double term  = 1.0;
		int i = 1;
		while (i <= n) {
			term = term * x / i;
			result += term;
			i++;
		}
		return result;
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
    else {
			return n * factorial(n - 1);
		}
	}

	public static void check(double x) {
    System.out.printf("\nX value\tMath.exp(x)\t\tmyexp(x)\n");
		System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x, 17));
	}

	public static void main(String[] args) {
     // As the absolute value o x increases, the precission decrements.

		double x = 0.1;
		while (x <= 100.0) {
			check(x);
			x *= 10;
		}

		x = -0.1;
		while (x >= -100.0) {
			check(x);
			x *= 10;
		}
	}
}
