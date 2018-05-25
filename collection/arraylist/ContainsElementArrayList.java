import java.util.ArrayList;

/**
 * Write a Java program to search an element in an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class ContainsElementArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("Car");
    al1.add("Truck");
    al1.add("Boat");
    al1.add("Plane");
    al1.add("Bike");

    // Print ArrayList.
    System.out.println("ArrayList al1: " + al1);

    // Invoke method
    System.out.print("Contains \"Plane\"?: ");
    System.out.println(containsElement(al1, "Plane"));

    System.out.print("Contains \"Dog\"?: ");
    System.out.println(containsElement(al1, "Dog"));
  }

  public static boolean containsElement(ArrayList<String> a, String s) {
    return a.contains(s);
  }
}
