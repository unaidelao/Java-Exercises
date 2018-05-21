import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from an
 * given array list.
 *
 * @author Unai de la O Pagaegui
 */
public class RetrieveElementArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    // Retrieves the second element of al1 ArrayList.
    String element = al1.get(3);

    // Print result.
    System.out.println("The second element is " + element);
  }

}
