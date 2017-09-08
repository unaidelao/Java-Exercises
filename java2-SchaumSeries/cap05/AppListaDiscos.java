/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.14
 *
 * Escriba una aplicación donde:
 *   a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10.
 *   b) Se creen tres discos y se añadan a la lista.
 *   c) Se muestre la lista por pantalla.
 *   d) Se cree un objeto de tipo Disco introduciendo el título y el autor de
 *      uno de los discos de la lista, para el resto de los argumentos se
 *      utilizan valores no significativos.
 *   e) Busque la posición de este objeto en la lista.
 *   f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
 *      junto con la posición en la que se encuentra.
 */

 public class AppListaDiscos {
   public static void main(String[] args) {
     ListaMultimedia lista = new ListaMultimedia(10);
     Disco disco;
     int posicion;

     lista.add(new Disco("Load","Metallica",Formato.CDAUDIO,75,Genero.ROCK));
     lista.add(new Disco("Philarmonics","Agnes Obel",Formato.MP3,65,Genero.POP));
     lista.add(new Disco("Kind of Blue","Miles Davis",Formato.CDAUDIO,45,Genero.JAZZ));

     System.out.println(lista.toString());

     disco = new Disco("Kind of Blue","Miles Davis",null,0,null);
     posicion = lista.indexOf(disco);
     System.out.println("Posicion " + posicion + "\n" + lista.get(posicion));
   }
 }
