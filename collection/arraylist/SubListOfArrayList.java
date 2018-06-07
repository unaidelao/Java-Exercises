import java.util.ArrayList;

/**
 * Write a Java program to extract a portion of an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class SubListOfArrayList {

  public static void main(String[] args) {
    //Create al1.
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("Car");
    al1.add("Banana");
    al1.add("Apple");
    al1.add("Grape");
    al1.add("Truck");
    al1.add("Plane");
    al1.add("Bike");

    // Prints al1.
    System.out.println("Original: " + al1);

    // Creates a sublist of al1 (only fruits).
    ArrayList<String> fruits = new ArrayList<String>(al1.subList(1, 4));

    // Prints fruits ArrayList.
    System.out.println("SubList: " + fruits);
  }
}
