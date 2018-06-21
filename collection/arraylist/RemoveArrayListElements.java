import java.util.ArrayList;

/**
 * Removes ArrayList elements from one to another.
 *
 * @author Unai de la O Pagaegui
 */
public class RemoveArrayListElements {
    public static void main(String[] args) {
        // Create al1
    ArrayList<String> al1 = new ArrayList<String>();

    al1.add("first");
    al1.add("1");
    al1.add("second");
    al1.add("2");
    al1.add("third");
    al1.add("3");

    // Print al1
    System.out.println("ArrayList 1: " + al1);

    // Create al2
    ArrayList<String> al2 = new ArrayList<String>();

    al2.add("1");
    al2.add("2");
    al2.add("3");

    // Print al2
    System.out.println("ArrayList 2: " + al2);

    // Create al3, that will be al1 - al2.
    ArrayList<String> al3 = new ArrayList<String>();

    al3.addAll(al1);
    al3.addAll(al2);

    // Print al3
    System.out.println("ArrayList 3 before removing: " + al3);

    // Final al3
    al3.removeAll(al2);

    // Print final al3
    System.out.println("Final ArrayList 3: " + al3);
    }
    
}
