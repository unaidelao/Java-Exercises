/*
 * Think Java v.6 - Exercise 2.2
 *
 * The point of this exercise is (1) to use string concatenation
 * to display values with different types (int and String), and (2) to practice
 * developing programs gradually by adding a few statements at a time.
 *
 * 1. Create a new program named Date.java. Copy or type in something
 * like the hello world program and make sure you can compile and run it.
 *
 * 2. Following the example in Section 2.4, write a program that creates vari-
 * ables named day, date, month, and year. The variable day will contain
 * the day of the week (like Friday), and date will contain the day of the
 * month (like the 13th). What type is each variable? Assign values to
 * those variables that represent today’s date.
 *
 * 3. Display (print out) the value of each variable on a line by itself. This
 * is anintermediate step that is useful for checking that everything is working
 * so far. Compile and run your program before moving on.
 *
 * 4. Modify the program so that it displays the date in standard American
 * format, for example: Thursday, July 16, 2015.
 *
 * 5. Modify the program so it also displays the date in European format. The
 * final output should be:
 *
 * American format:
 * Thursday, July 16, 2015
 * European format:
 * Thursday 16 July 2015
 */

public class Exercise_2_2 { // I didn't name it Date.java for better organization

    public static void main (String[] args) {

        String day, date, month;
        int year;

        day = "Saturday";
        date = "20th";
        month = "January";
        year = 2017;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European format:");
        System.out.println(day + ", " + date + " " + month + " " + year);

    }
}
