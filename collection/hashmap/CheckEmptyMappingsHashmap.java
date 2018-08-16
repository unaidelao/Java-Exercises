import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to check whether a map contains key-value mappings (empty) or not.
 *
 * @author Unai de la O Pagaegui
 */

 public class CheckEmptyMappingsHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");

        boolean areMappingsEmpty = hmap.isEmpty();

        System.out.println("HashMap mappings empty?: " + areMappingsEmpty);
        System.out.println("Removing Hashmap mappings...");

        hmap.clear();

        areMappingsEmpty = hmap.isEmpty();

        System.out.println("HashMap mappings empty?: " + areMappingsEmpty);
     }
 }