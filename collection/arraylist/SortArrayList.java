import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to sort a given array list.
 *
 * @author Unai de la O Pagaegui
 */
public class SortArrayList {

  public static void main(String[] args) {
    //Create al1.
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("Motorbike");
    al1.add("Truck");
    al1.add("Car");
    al1.add("Bicycle");
    al1.add("Plane");

    // Before sorting.
    System.out.println("Before: " + al1);

    // Sort al1.
    Collections.sort(al1);

    // After sorting.
    System.out.println("After: " + al1);
  }
}
