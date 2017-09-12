/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.20 parte 1 de 3
 *
 * Una pila y una cola son estructuras muy similares. En ambas se añaden
 * elementos por uno de los extremos y se extraen elementos por uno de los
 * extremos también. La diferencia es que en la pila se añaden y se extraen
 * por el mismo extremo y en la cola por extremos distintos.
 *
 * Aprovechando esto, escriba una superclase de ambas que implemente la parte
 * común que se llame ColeccionSimple. Los métodos son los siguientes:
 *
 * estaVacia(): devuelve true si la colección está vacía y false si no lo está.
 * extraer(): devuelve y elimina el primer elemento de la colección.
 * primero(): devuelve el primer elemento de la colección.
 * anadir(): añade un objeto por el extremo que corresponda.
 * toString(): devuelve en forma de String la información de la colección.
 *
 * Posteriormente escriba las clases Pila y Cola que hereden de ColeccionSimple
 * implementando la parte que las diferencia. Esta ColeccionSimple debe
 * almacenar objetos de cualquier tipo, es decir, objetos de tipo Object.
 *
 * PLANTEAMIENTO: Para implementar la clase ColeccionSimple se va a utilizar
 * una LinkedList de Object. En Java todas las clases heredan de Object, por lo
 * que permite almacenar objetos de cualquier tipo (los tipos primitivos se
 * envolverán en sus clases correspondientes). La relación será de composición.
 *
 * En esta clase se indicará que contiene un método anadir(), pero no se
 * implementará, ya que es diferente para las dos subclases. Este método es
 * abstracto. Es donde se fuerza la herencia.
 *
 * El resto de los métodos se implementan mediante una llamada al método
 * correspondiente de LinkedList, obteniendo los elementos por el principio de
 * la lista.
 *
 * El atributo lista es privado en ColeccionSimple y las subclases necesitan
 * acceder a él para añadir elementos. Para solucionar este problema, se
 * implementa en la clase ColeccionSimple un método getLista() que sea
 * protected.
 */

 import java.util.LinkedList;

 // declaración de clase abstracta
 public abstract class ColeccionSimple {
   // LinkedList declarado que almacene Object
   private LinkedList<Object> lista;

   // constructor
   public ColeccionSimple() {
     lista = new LinkedList<Object>();
   }

   // método abstracto, especificado pero no implementado
   public abstract void anadir(Object o);

   public Object extraer() {
     return lista.removeFirst();
   }

   public boolean estaVacia() {
     return lista.isEmpty();
   }

   public Object primero() {
     return lista.getFirst();
   }

   public String toString() {
     return lista.toString();
   }

   // método protected para que puedan acceder a él las subclases
   protected LinkedList<Object> getLista() {
     return lista;
   }
 }
