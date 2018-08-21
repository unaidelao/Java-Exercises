import java.util.HashMap;

/**
 * Basic Hashmap exercise.
 * 
 * Write a Java program to get a shallow copy of a HashMap instance.
 *
 * @author Unai de la O Pagaegui
 */

 public class CloneHashmap {
     public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        HashMap<Integer, String> clonedHmap = new HashMap<Integer, String>();

        hmap.put(1, "Dog");
        hmap.put(2, "Cat");
        hmap.put(3, "Horse");
        hmap.put(4, "Cow");
        hmap.put(5, "Eagle");
   
        System.out.println("Original HashMap content: " + hmap);

        clonedHmap = (HashMap)hmap.clone();

        System.out.println("Cloned HashMap content:" + clonedHmap);
     }
 }