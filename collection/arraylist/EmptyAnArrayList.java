import java.util.ArrayList;

/**
 * Write a Java program to empty an array list.
 *
 * @author Unai de la O Pagaegui
 */
public class EmptyAnArrayList {
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

        //Create ArrayList2
        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("green");
        al2.add("yellow");
        al2.add("black");
        al2.add("white");
        al2.add("blue");
        al2.add("red");
        al2.add("orange");

        // Print ArrayList 1
        System.out.println("ArrayList 2: " + al2);

        // Empty al1 with clear()
        al1.clear();

        // Show again ArrayList 1
        System.out.println("ArrayList 1 (clear): " + al1);

        // Empty al1 with removeAll()
        al2.removeAll(al2);

        // Show again ArrayList 2
        System.out.println("ArrayList 2 (remove all): " + al2);
    }
}