/*
 * Think Java v.6 - Exercise 3.1
 * When you use printf, the Java compiler does not check your format string.
 * See what happens if you try to display a value with type int using %f. And
 * what happens if you display a double using %d? What if you use two format
 * specifiers, but then only provide one value?
 */
 
public class Exercise_3_1 {

  public static void main (String[] args) {
    // this is a correct code
    int i = 7;
    double d = 8.45;

    System.out.printf("%d and %f\n", i, d);

    /*
     * If you try to display a value with type int using %f, or a double using
     * %d, or use two format specifiers but then only provide one value, you'll
     * have run-time errors (exceptions).
     */
  }
}
