import java.util.HashMap;
import java.util.Set;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to create a set view of the mappings contained in a map.
 *
 * @author Unai de la O Pagaegui
 */

 public class EntrysetHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("HashMap content: " + hmap);
        Set s = hmap.entrySet();
        System.out.println("HashMap Set values: " + s);
     }
 }