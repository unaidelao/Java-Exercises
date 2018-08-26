import java.util.HashMap;
import java.util.Set;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to get a set view of the keys contained in the HashMap.
 *
 * @author Unai de la O Pagaegui
 */

 public class KeysetHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("HashMap content: " + hmap);
        Set s = hmap.keySet();
        System.out.println("HashMap keySet values: " + s);
     }
 }