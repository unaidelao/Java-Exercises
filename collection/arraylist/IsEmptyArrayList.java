import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not.
 *
 * @author Unai de la O Pagaegui
 */
public class IsEmptyArrayList {
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
        System.out.println("Removing elements from al1...");
        al1.clear();

        // Print ArrayList 1 again with empty values
        System.out.println("Updated ArrayList 1: " + al1);
        
        // Check if ArrayList 1 is empty
        System.out.println("Is ArrayList 1 empty?: " + al1.isEmpty());

        // Check if ArrayList 2 is empty
        System.out.println("Is ArrayList 2 empty?: " + al2.isEmpty());
    }
}