import java.util.HashMap;
import java.util.Map;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to associate the specified value with the specified key in a HashMap.
 *
 * @author Unai de la O Pagaegui
 */

 public class AssociateValueKeyHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        for (Map.Entry element : hmap.entrySet()) {
            System.out.println(element.getKey() + " --> " + element.getValue());
        }
     }
 }