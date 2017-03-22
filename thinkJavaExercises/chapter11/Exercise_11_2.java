/**
 * Think Java v.6 - Exercise 11.2
 *
 * The implementation of "increment" in this chapter is not very efficient. Can
 * you rewrite it so it doesn't use any loops?
 * Hint: Remember the modulus operator.
 *
 * @author Unai de la O
 */

public void increment(double seconds) {
    if (seconds >= 60) {
      this.second = seconds % 60;
      this.minute += seconds / 60;
    }
    if (seconds >= 3600) {
      this.minute = (int)seconds % 3600 / 60;
      this.hour += seconds / 3600;
    }
}
