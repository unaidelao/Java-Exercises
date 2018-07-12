import java.util.ArrayList;

/**
 * Write a Java program to trim the capacity of an array list the current
 * list size.
 *
 * @author Unai de la O Pagaegui
 */
public class TrimToSizeArrayList {
    public static void main(String[] args) {
        //Create ArrayList1
        ArrayList<String> al1 = new ArrayList<String>(10);

        al1.add("dog");
        al1.add("horse");
        al1.add("bird");
        al1.add("cat");
        al1.add("mouse");
        al1.add("elephant");
        al1.add("rhino");

        // Trim to size ArrayList 1
        al1.trimToSize();

        // Print ArrayList 1 again
        System.out.println("Trimmed to size ArrayList 1: " + al1);
    }
}