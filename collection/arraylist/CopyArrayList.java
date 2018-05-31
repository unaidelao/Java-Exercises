import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to copy one array list into another.
 *
 * @author Unai de la O Pagaegui
 */
public class CopyArrayList {

  public static void main(String[] args) {
    // Create al1.
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("Motorbike");
    al1.add("Truck");
    al1.add("Car");
    al1.add("Bicycle");
    al1.add("Plane");

    // Prints al1.
    System.out.println("Initial al1: " + al1);

    // Create al2.
    ArrayList<String> al2 = new ArrayList<String>();

    al2.add("New York");
    al2.add("Paris");
    al2.add("Madrid");
    al2.add("Berlin");
    al2.add("Tokio");

    // Prints al2.
    System.out.println("Initial al2: " + al2);

    // Copy al1 values into al2.
    Collections.copy(al1, al2);

    // Prints al1 again.
    System.out.println("Final al1: " + al1);

    // Prints al2 again.
    System.out.println("Final al2: " + al2);
  }
}
