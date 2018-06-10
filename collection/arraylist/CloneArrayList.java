import java.util.ArrayList;

/**
 * Write a Java program to clone an array list to another array list.
 *
 * @author Unai de la O Pagaegui
 */
public class CloneArrayList {
    public static void main(String[] args) {
        //Create ArrayList1
        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("dog");
        al1.add("horse");
        al1.add("bird");
        al1.add("cat");
        al1.add("mouse");
        al1.add("elephant");
        al1.add("rhino");

        // Print ArrayList 1
        System.out.println("ArrayList 1: " + al1);

        //Create cloned ArrayList
        ArrayList<String> clonedArrayList = new ArrayList<String>();

        clonedArrayList = (ArrayList<String>) al1.clone();

        // Print cloned ArrayList
        System.out.println("Cloned ArrayList: " + clonedArrayList);

    }
}