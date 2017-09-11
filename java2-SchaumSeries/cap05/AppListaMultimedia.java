/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.17
 *
 * Escriba una aplicación donde:
 *
 * a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10 (
 *    ListaMultimedia del Ejercicio 5.11)
 * b) Se creen tres discos y se añadan a la lista (Disco del Ejercicio 5.13)
 * c) Se creen tres películas y se añadan a la lista (Pelicula del Ejercicio
 *    5.10)
 * d) Trabajando con la lista y suponiendo que no se sabe en qué posiciones
 *    están los discos y las películas:
 *      1. Se muestre la lista por pantalla.
 *      2. Se calcule la duración total de los objetos de la ListaMultimedia.
 *      3. Se muestre cuántos discos hay de rock.
 *      4. Se obtenga cuántas películas no tienen actriz principal.
 */

 public class AppListaMultimedia {

   public static void main(String[] args) {

     // crear la lista con tamaño máximo de 10
     ListaMultimedia lista = new ListaMultimedia(10);

     // se añaden tres discos
     lista.add(new Disco("Load","Metallica",Formato.CDAUDIO,75,Genero.ROCK));
     lista.add(new Disco("Philarmonics","Agnes Obel",Formato.MP3,65,Genero.POP));
     lista.add(new Disco("Kind of Blue","Miles Davis",Formato.CDAUDIO,45,Genero.JAZZ));

     // se añaden tres películas
     lista.add(new Pelicula("Gattaca","Andrew Niccol",Formato.DVD,121,"Ethan Hawke","Uma Thurman"));
     lista.add(new Pelicula("El Padrino","Coppola",Formato.DVD,178,"Marlon Brando","Diane Keaton"));
     lista.add(new Pelicula("Batman Begins","Chris Nolan",Formato.DVD,140,"Chris Bale","Katie Holmes"));

     /*
      * Se muestra la lista.
      *
      * LLamará automáticamente al método toString() de Disco o de Película
      * según corresponda, por ligadura dinámica.
      */
     System.out.println(lista.toString());

     /*
      * Variable tipo acumulador para obtener la duración total de la lista y
      * bucle for para conseguirlo.
      *
      * El método getDuracion() lo heredan los objetos Pelicula y Disco desde
      * su superclase Multimedia.
      */
     double duracionTotal = 0;
     for (int i = 0; i < lista.size(); i++) {
       duracionTotal += lista.get(i).getDuracion();
     }
     System.out.println("Duracion total de la lista: " + duracionTotal);

     // se calculan cuántos discos de rock hay
     int totalDiscosRock = 0;
     for (int i = 0; i < lista.size(); i++) {
       // se comprueba que sea de tipo Disco
       if (lista.get(i) instanceof Disco) {
         // convierte a Disco para poder llamar a getGenero()
         Disco disco = (Disco) lista.get(i);
         if (disco.getGenero() == Genero.ROCK) {
           totalDiscosRock++;
         }
       }
     }
     System.out.println("Total discos de Rock: " + totalDiscosRock);

     // se calculan cuántas películas hay sin actriz
     int totalPelisSinActriz = 0;
     for (int i = 0; i < lista.size(); i++) {
       // se comprueba que sea de tipo Pelicula
       if (lista.get(i) instanceof Pelicula) {
         // convierte a Pelicula para poder llamar a getActriz()
         Pelicula peli = (Pelicula) lista.get(i);
         if (peli.getActriz() == null) {
           totalPelisSinActriz++;
         }
       }
     }
     System.out.println("Total pelis sin actriz: " + totalPelisSinActriz);
   }
 }
