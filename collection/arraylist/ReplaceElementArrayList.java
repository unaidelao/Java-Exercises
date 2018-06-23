import java.util.ArrayList;

/**
 * Write a Java program to replace the second element of a ArrayList with
 * the specified element.
 *
 * @author Unai de la O Pagaegui
 */
public class ReplaceElementArrayList {
    public static void main(String[] args) {
        //Create ArrayList1
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("first");
        al1.add("second");
        al1.add("third");

        // Print ArrayList 1
        System.out.println("After replace element: " + al1);

        // New element
        String element = "replaced";

        al1.set(1, element);

        // Print ArrayList 1 again
        System.out.println("Before replace element: " + al1);

    }
}