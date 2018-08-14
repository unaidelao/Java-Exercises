import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to copy all of the mappings from the specified map to another map.
 *
 * @author Unai de la O Pagaegui
 */

 public class CopyMappingsHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

        // First HashMap.
        hmap1.put(1, "Dog");
        hmap1.put(2, "Cat");
        hmap1.put(3, "Horse");
        hmap1.put(4, "Cow");
        hmap1.put(5, "Eagle");

        // Second HashMap.
        hmap2.put(6, "Spain");
        hmap2.put(7, "Portugal");
        hmap2.put(8, "Greece");
        hmap2.put(9, "Andorra");
        hmap2.put(10, "Monaco");
   
        System.out.println("First HashMap content: " + hmap1);
        System.out.println("Second HashMap content: " + hmap2);

        // Put all values into hmap2.
        hmap2.putAll(hmap1);

        System.out.println("Now, Second HashMap is: " + hmap2);
     }
 }