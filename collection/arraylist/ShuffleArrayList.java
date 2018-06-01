import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to shuffle elements in an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class ShuffleArrayList {

  public static void main(String[] args) {
    //Create al1.
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("a");
    al1.add("b");
    al1.add("c");
    al1.add("d");
    al1.add("e");
    al1.add("f");
    al1.add("g");

    // Before shuffle.
    System.out.println("Before: " + al1);

    // Shuffle al1.
    Collections.shuffle(al1);

    // After sorting.
    System.out.println("After: " + al1);
  }
}
