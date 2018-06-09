import java.util.ArrayList;

/**
 * Write a Java program to compare two array list.
 *
 * @author Unai de la O Pagaegui
 */
public class CompareTwoArrayList {

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
    System.out.println("ArrayList 1: " + al1);

    //Create al2.
    ArrayList<String> al2 = new ArrayList<String>();

    al2.add("Car");
    al2.add("1");
    al2.add("Apple");
    al2.add("2");
    al2.add("Rocket");
    al2.add("7");

    // Prints al2.
    System.out.println("ArrayList 2: " + al2);

    // Create result ArrayList of integers.
    ArrayList<Integer> result = new ArrayList<Integer>();
    // Store the comparison result as 1 true, 0 false.
    for (String s : al1) {
      result.add(al2.contains(s) ? 1 : 0);
    }

    // Prints result ArrayList.
    System.out.println("Result: " + result);
  }
}
