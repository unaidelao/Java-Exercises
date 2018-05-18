import java.util.ArrayList;

/**
 * Write a Java program to insert an element into the array list at the first
 * position.
 *
 * @author Unai de la O Pagaegui
 */
public class InsertElementArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    // Before adding
    System.out.println("Before: " + al1);
    // Adds the element at 0 position.
    al1.add(0, "Red");
    // After adding.
    System.out.println("After: " + al1);
  }
}
