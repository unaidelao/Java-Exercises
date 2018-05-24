import java.util.ArrayList;

/**
 * Write a Java program to remove the second element from an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class RemoveElementArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    // Before removing.
    System.out.println("Before: " + al1);
    // Remove element at second position.
    al1.remove(1);
    // After removing.
    System.out.println("After: " + al1);
  }
}
