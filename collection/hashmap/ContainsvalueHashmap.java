import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to test if a map contains a mapping for the specified value.
 *
 * @author Unai de la O Pagaegui
 */

 public class ContainsvalueHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("HashMap content: " + hmap);
        System.out.println("Does HashMap contains Horse as a value?: " + checkValue(hmap, "Horse"));
        System.out.println("Does HashMap contains Bird as a value?: " + checkValue(hmap, "Bird"));

     }

     public static String checkValue(HashMap h, String key) {
        return h.containsValue(key) ? "Yes!" : "No!";
     }
 }