import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to swap two elements in an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class SwapElementsArrayList {
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

        // Before swap.
        System.out.println("Before: " + al1);

        // Swap elements 2("c") and 5("f") of al1.
        Collections.swap(al1, 2, 5);

        // After swap.
        System.out.println("After: " + al1);
    }
}