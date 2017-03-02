/**
 * Think Java v.6 - Exercise 8.2
 *
 * The purpose of this exercise is to practice reading code and recognizing the
 * traversal patterns in this chapter. The following methods are hard to read,
 * because instead of using meaningful names for the variables and methods,
 * they use names of fruit.
 *
 * For each method write one sentence that describes what the method does,
 * without getting into the details of how it works. For each variable,
 * identify the role it plays.
 *
 * @author Unai de la O
 */

/*
 * This method does not modifiy the array because it multiplies each element
 * by one.
 */
public static int banana(int[] a) {
  int kiwi = 1; // kiwi is a temporal variable
  int i = 0;
  while (i < a.length) {
    kiwi = kiwi * a[i];
    i++
  }
  return kiwi;
}

/*
 * This method returns the index of the element in the matrix that matches the
 * second argument "int grape".
 */
public static int grapefruit(int[] a, int grape) {
  for (int i = 0; i < a.length; i++) {
    if (a[i] == grape) {
      return i;
    }
  }
  return -1;
}

/*
 * This method returns the value of an accumulator variable that counts the
 * number of times the integer that is set in the second parameter "int apple"
 * appears in the array.
 */
public static int pineapple(int[] a, int apple) {
  int pear = 0; // acumulator variable (counter)
  for (int pine : a) {
    if (pine == apple) {
      pear++;
    }
  }
  return pear;
}
