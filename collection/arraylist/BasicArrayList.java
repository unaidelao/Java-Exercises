import java.util.ArrayList;

/**
 * Basic ArrayList exercise.
 * Write a Java program to create a new array list, add some colors (string)
 * and print out the collection.
 *
 * @author Unai de la O Pagaegui
 */
public class BasicArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    System.out.println(al1.toString());
    // Also: System.out.println(al1);
  }
}
