import java.util.ArrayList;

/**
 * Write a Java program to increase the size of an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class IncreaseArrayListCapacity {
    public static void main(String[] args) {
        //Create ArrayList1 with 3 elements
        ArrayList<String> al1 = new ArrayList<String>(3);
        al1.add("dog");
        al1.add("horse");
        al1.add("bird");

        // Increase capacity of al1
        al1.ensureCapacity(7);

        // Add rest of elements
        al1.add("cat");
        al1.add("mouse");
        al1.add("elephant");
        al1.add("rhino");

        // Print ArrayList 1
        System.out.println("ArrayList 1: " + al1);
    }
}