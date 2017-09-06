/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.12
 *
 * Escriba una aplicación donde:
 *  a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10.
 *  b) Se creen tres películas y se añadan a la lista.
 *  c) Se muestre la lista por pantalla.
 *  d) Se cree un objeto de tipo Pelicula introduciendo el título y el autor de
 *     una de las películas de la lista; para el resto de los argumentos se
 *     utilizan valores no significativos.
 *  e) Busque la posición de este objeto en la lista.
 *  f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
 *     junto con la posición en la que se encuentra.
 */

 public class PruebaListaMultimedia {
   public static void main(String[] args) {
     ListaMultimedia lista = new ListaMultimedia(10);
     Pelicula peli;
     int pos;

     /*
      * El método add() recibe objetos de tipo Multimedia. Como Pelicula hereda
      * de Multimedia, son aceptados también.
      */
     lista.add(new Pelicula("Gattaca","Andrew Niccol",Formato.DVD,121,"Ethan Hawke","Uma Thurman"));
     lista.add(new Pelicula("El Padrino","Coppola",Formato.DVD,178,"Marlon Brando","Diane Keaton"));
     lista.add(new Pelicula("Batman Begins","Chris Nolan",Formato.DVD,140,"Chris Bale","Katie Holmes"));

     System.out.println(lista.toString());

     // se crea el objeto con título y autor; resto de argumentos no interesan
     peli = new Pelicula("Regreso al futuro","Robert Zemeckis",null,0,"","");
     // se añade a la lista
     lista.add(peli);
     // se recoge el lugar que ocupa peli en el array
     pos = lista.indexOf(peli);
     // imprime todos los datos de "Regreso al futuro"
     System.out.println("Posicion " + pos + "\n" + lista.get(pos));
   }
 }
