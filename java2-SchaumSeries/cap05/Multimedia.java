/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.9 parte 2 de 2
 *
 * Escriba una clase Multimedia para almacenar información de objetos de tipo
 * multimedia (películas, discos, mp3...). Esta clase contiene título, autor,
 * formato y duración como atributos. El formato puede ser uno de los
 * siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos
 * los atributos se pasa por parámetro en el momento de crear el objeto.
 *
 * Esta clase tiene, además, un método para devolver cada uno de los atributos
 * y un método toString() que devuelve la información del objeto. Por último,
 * un método equals() que recibe un objeto de tipo Multimedia y devuelve true
 * en caso de que el título y el autor sean iguales a los del objeto que llama
 * al método y false en caso contrario.
 *
 * Planteamiento: para el formato de los objetos Multimedia se ha creado un
 * tipo enumerado de nombre Formato, con los valores indicados anteriormente,
 * en un archivo aparte para que pueda ser utilizado por otras clases.
 */

 public class Multimedia {
   private String titulo;
   private String autor;
   private Formato formato;
   private double duracion;

   public Multimedia(String titulo, String autor, Formato formato, double duracion){
     this.titulo = titulo;
     this.autor = autor;
     this.formato = formato;
     this.duracion = duracion;
   }

   public String getTitulo() {
     return titulo;
   }

   public String getAutor() {
     return autor;
   }

   public Formato getFormato() {
     return formato;
   }

   public double getDuracion() {
     return duracion;
   }

   public String toString() {
     return "Titulo: " + titulo + " Autor: " + autor + "\n" + "Formato: " + formato + " Duracion: " + duracion;
   }

   public boolean equals(Multimedia m) {
     return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
   }
 }
