/**
 * Think Java v.6 - Exercise 6.6
 *
 * See exercise results below the code.
 *
 * @author Unai de la O
 */

public class Exercise_6_6 {

  public static void main(String[] args) {
    System.out.println(prod(1, 4));
  }

  public static int prod(int m, int n) {
    if (m == n) {
      return n;
    }
    else {
      /* Original else branch.
      int recurse = prod(m, n - 1);
      int result = n * recurse;
      return result
      */
      return n * prod(m, n - 1); // My else branch implementation.
    }
  }
}

/*
 * (1) Draw a stack diagram showing the state of the program just before the
 * last invocation of "prod" completes:
 *      Just use www.pythontutor.com and visualize all the flow execution.
 *
 * (2) What is the output of this program?:
 *      It's 24.
 *
 * (3) Explain in a few words what "prod" does:
 *      It's a method to calculate the factorial of a number.
 *
 * (4) Rewrite "prod" without the temporary variables "recurse" and "result".
 *      Done. See implementation.
 */
