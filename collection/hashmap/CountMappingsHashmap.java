import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to count the number of key-value (size) mappings in a map.
 *
 * @author Unai de la O Pagaegui
 */

 public class CountMappingsHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("The HashMap has a size of " + hmap.size() + ".");
     }
 }