/*
 * Think Java v.6 - Exercise 2.3
 *
 * The point of this exercise is to (1) use some of the arithmetic
 * operators, and (2) start thinking about compound entities (like time of day)
 * that are represented with multiple values.
 *
 * 1. Create a new program called Time.java. From now on, we won’t remind
 * you to start with a small, working program, but you should.
 *
 * 2. Following the example program in Section 2.4, create variables named
 * hour, minute, and second. Assign values that are roughly the current
 * time. Use a 24-hour clock so that at 2pm the value of hour is 14.
 *
 * 3. Make the program calculate and display the number of seconds since
 * midnight.
 *
 * 4. Calculate and display the number of seconds remaining in the day.
 *
 * 5. Calculate and display the percentage of the day that has passed. You
 * might run into problems when computing percentages with integers, so
 * consider using floating-point.
 *
 * 6. Change the values of hour, minute, and second to reflect the current
 * time. Then write code to compute the elapsed time since you started
 * working on this exercise.
 *
 * Hint: You might want to use additional variables to hold values during the
 * computation. Variables that are used in a computation but never displayed
 * are sometimes called “intermediate” or “temporary” variables.
 */

public class Exercise_2_3 {
  public static void main (String[] args) {
    int hour, minute, second;

    hour = 10;
    minute = 15;
    second = 30;

    int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;

    System.out.println("At time " + hour + ":" + minute + ":" + second +
    " there have passed " + secondsSinceMidnight + " seconds since midnight.");

    int totalSecondsPerDay = 86400; // 24 hours * 60 minutes * 60 seconds

    int secondsRemainingInDay = totalSecondsPerDay - secondsSinceMidnight;

    System.out.println("So, there are still " + secondsRemainingInDay +
    " seconds remaining in the day.");

    int completedDayPercentage = secondsSinceMidnight * 100 / totalSecondsPerDay;

    System.out.println("The percentage of the day that has passed is "
    + completedDayPercentage + " %.");

    int actualHour, actualMinute, actualSecond;
    actualHour = 10;
    actualMinute = 40;
    actualSecond = 30;

    int actualSecondsPassed = (actualHour * 3600) + (actualMinute * 60) + actualSecond;

    System.out.println("The elapsed time since I started working in this exercise is "
    + (actualSecondsPassed - secondsSinceMidnight) + " seconds.");

  }
}
