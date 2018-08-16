import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to remove all of the mappings from a map.
 *
 * @author Unai de la O Pagaegui
 */

 public class RemoveMappingsHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");

        System.out.println("HashMap content: " + hmap);
        System.out.println("Removing Hashmap mappings...");

        hmap.clear();

        System.out.println("Now, HashMap content: " + hmap);
     }
 }