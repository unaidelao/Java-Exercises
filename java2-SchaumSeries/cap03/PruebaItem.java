/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.6
 *
 * Escriba una clase de nombre Item, que acepta un nombre en su constructor.
 * Cada ítem debe disponer de un número que servirá como identificador único
 * de cada objeto. La clase Item dispondrá de un método para obtener el
 * identificador y otro para obtener el nombre. Haga un programa de prueba que
 * genere tres ítems, "uno", "dos" y "tres" y luego escriba los nombres e
 * identificadores de cada ítem.
 *
 * @author Unai de la O
 */

 class Item {
   private String nombre;
   private int id;
   private static int contador = 0;

   public Item(String nombre) {
     this.nombre = nombre;
     /*
      * Se usa ++ prefijo para que incremente la variable contador antes de
      * crear el objeto. Si se usase ++ sufijo, crearía el objeto y despúes
      * incrementaría la variable contador, teniendo como resultado que el
      * primer objeto creado tendría un id == 0 y el segundo tendría el id == 1
      */
     id = ++contador;
   }

   public String getNombre() {
     return nombre;
   }

   public int getId() {
     return id;
   }
 }

 class PruebaItem {
   public static void main(String[] args) {
     Item item1 = new Item("uno");
     Item item2 = new Item("dos");
     Item item3 = new Item("tres");

     System.out.println("Item " + item1.getNombre() + " id: " + item1.getId());
     System.out.println("Item " + item2.getNombre() + " id: " + item2.getId());
     System.out.println("Item " + item3.getNombre() + " id: " + item3.getId());
   }
 }
