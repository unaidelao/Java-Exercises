import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to test if a map contains a mapping for the specified key.
 *
 * @author Unai de la O Pagaegui
 */

 public class ContainskeyHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("HashMap content: " + hmap);
        System.out.println("Does HashMap contains 3 as a key?: " + checkKey(hmap, 3));
        System.out.println("Does HashMap contains 23 as a key?: " + checkKey(hmap, 23));

     }

     public static String checkKey(HashMap h, int key) {
        return h.containsKey(key) ? "Yes!" : "No!";
     }
 }