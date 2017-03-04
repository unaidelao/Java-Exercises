/**
 * Think Java v.6 - Exercise 8.3
 *
 * What is the output of the following program? Describe in a few words what
 * mus does. Draw a stack diagram just before mus returns.
 *
 * @author Unai de la O
 */

public static int[] make(int n) {
  int[] a = new int[n];
  for (int i = 0; i < n; i++) {
    a[i] = i + 1;
  }
  return a;
}

public static void dub(int[] jub) {
  for (int i = 0; i < jub.length; i++) {
    jub[i] *= 2;
  }
}

public static int mus(int[] zoo) {
  int fus = 0;
  for (int i = 0; i < zoo.length; i++) {
    fus += zoo[i];
  }
  return fus;
}

public static void main(String[] args) {
  int[] bob = make(5);
  dub(bob);
  System.out.println(mus(bob));
}

/*
 * mus() is a traversal that reduces the elements of the array into only one
 * element (temporal variable "int fus")that is the sum of all of the elements
 * of that array.
 *
 * The Stack Diagram just before mus returns is:
 *
 * zoo | array (index: 0, 1, 2, 3,  4)
 *              value: 2, 4, 6, 8, 10)
 * fus | 30
 * i (mus()) | 5
 */
