import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to get the value of a specified key in a map.
 *
 * @author Unai de la O Pagaegui
 */

 public class GetValueOfKeyHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("HashMap content: " + hmap);

        String valueKey2 = (String)hmap.get(2);
        System.out.println("Key 2 value: " + valueKey2);

        String valueKey4 = (String)hmap.get(4);
        System.out.println("Key 4 value: " + valueKey4);

     }
 }