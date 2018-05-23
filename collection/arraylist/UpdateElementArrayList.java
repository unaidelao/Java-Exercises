import java.util.ArrayList;

/**
 * Write a Java program to update specific array element by given element.
 *
 * @author Unai de la O Pagaegui
 */
public class UpdateElementArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    // Before updating
    System.out.println("Before: " + al1);
    // Update element at second position.
    al1.set(1, "Light Red");
    // After updating.
    System.out.println("After: " + al1);
  }
}
