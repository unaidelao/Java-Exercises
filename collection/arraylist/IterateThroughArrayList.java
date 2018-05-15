import java.util.ArrayList;

/**
 * Write a Java program to iterate through all elements in an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class IterateThroughArrayList {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("White");
    al1.add("Black");
    al1.add("Yellow");
    al1.add("Orange");
    al1.add("Blue");

    for (String s : al1) {
      System.out.println(s);
    }
  }
}
