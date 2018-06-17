import java.util.ArrayList;

/**
 * Write a Java program to join two ArrayLists.
 *
 * @author Unai de la O Pagaegui
 */
public class JoinTwoArrayList {
    public static void main(String[] args) {
        //Create ArrayList1
        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("a");
        al1.add("b");
        al1.add("c");
        al1.add("d");
        al1.add("e");
        al1.add("f");
        al1.add("g");

        // Print ArrayList 1
        System.out.println("ArrayList 1: " + al1);

        //Create ArrayList2
        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("1");
        al2.add("2");
        al2.add("3");
        al2.add("4");
        al2.add("5");
        al2.add("6");
        al2.add("7");

        // Print ArrayList 2
        System.out.println("After: " + al2);

        // Join both in ArrayList 3
        ArrayList<String> al3 = new ArrayList<String>();

        al3.addAll(al1);
        al3.addAll(al2);

        // Print ArrayList 3
        System.out.println("Joined ArrayList: " + al3);
    }
}