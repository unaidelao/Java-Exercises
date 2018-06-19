import java.util.ArrayList;

/**
 * Write a Java program to print all the elements of a ArrayList using the
 * position of the elements.
 *
 * @author Unai de la O Pagaegui
 */
public class PrintArrayListUsingPositions {
    public static void main(String[] args) {
        //Create ArrayList1
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("orange");
        al1.add("lemon");
        al1.add("apple");
        al1.add("pineapple");
        al1.add("melon");

        // Print ArrayList 1 using element positions
        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + " ");
        }
        System.out.println();
    }
}