/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.11
 *
 * Escriba una clase ListaMultimedia para almacenar objetos de tipo multimedia.
 * La clase debe tener un atributo que sea un array de objetos Multimedia y un
 * entero para contar cuántos objetos hay almacenados. Además, tiene un
 * constructor y los siguientes métodos:
 *
 * a) el constructor recibe por parámetro un entero indicando el número máximo
 *    de objetos que va a almacenar.
 * b) int size(): devuelve el número de objetos que hay en la lista.
 * c) boolean add(Multimedia m): añade el objeto al final de la lista y
 *    devuelve true, en caso de que la lista esté llena, devolverá false.
 * d) Multimedia get(int posición): devuelve el objeto situado en la posición
 *    especificada.
 * e) int indexOf(Multimedia m): devuelve la posición del objeto que se
 *    introduce por parámetro, si no se encuentra, devolverá -1.
 * f) String toString(): devuelve la información de los objetos que están en la
 *    lista.
 *
 * Planteamiento:
 * a) En el constructor se crea el array con el tamaño especificado y se
 *    inicializa el contador a 0. Se implementa el método llena() para uso
 *    interno, por lo que es un método privado.
 * b) El número de objetos se almacena en el contador, así que simplemente se
 *    devuelve el valor del atributo.
 * c) Este método se usa en add(), donde en el caso de que no esté llena, se
 *    almacena el objeto en la celda indicada por contador y se incrementa éste
 * d) En get() se comprueba que la posición sea válida y se devuelve el objeto.
 *    Si no fuese una posición válida, se lanzaría una excepción de tipo
 *    IndexOutOfBoundsException.
 * e) En indexOf() se busca el elemento recibido por parámetro. Para comparar
 *    el parámetro con los objetos de la lista se utiliza el método equals()
 *    de Multimedia.
 * f) En el método toString() se utiliza un String para ir acumulando las
 *    llamadas al método toString() de los objetos multimedia. Finalmente se
 *    devuelve el String.
 */

 public class ListaMultimedia {
   private Multimedia[] lista;
   private int contador;
 }

 public ListaMultimedia(int size) {
   lista = new Multimedia[size];
   contador = 0;
 }

 public int size() {
   return contador;
 }

 private boolean llena() {
   return contador == lista.length;
 }

 public boolean add(Multimedia m) {
   if (llena()) {
     return false;
   }
   else {
     lista[contador] = m;
     contador++;
     return true;
   }
 }

 public Multimedia get(int posicion) {
   if (posicion < 0 || posicion >= contador) {
     throw new IndexOutOfBoundsException();
   }
   else {
     return lista[posicion];
   }
 }

 public int indexOf(Multimedia m) {
   // solo se recorre hasta la celda que indique contador
   for (int i = 0; i < contador; i++) {
     if (m.equals(lista[i])) {
       return i;
     }
   }
   // esta sentencia solo se ejecuta si nunca se cumple la condición del if
   return -1;
 }

 public String toString() {
   String s = "";
   for (int i = 0; i < contador; i++) {
     /* si lista[i] referencia a una Pelicula, por ligadora dinámica llamará a
      *toString() de Pelicula.
      */
     s += lista[i].toString() + "\n\n";
   }
   return s;
 }
