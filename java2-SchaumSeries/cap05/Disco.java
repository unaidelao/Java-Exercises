/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.13 parte 2 de 2
 *
 * Escriba una clase Disco que herede de la clase Multimedia ya realizada. La
 * clase Disco tiene, aparte de los elementos heredados, un atributo para
 * almacenar el género al que pertenece (rock, pop,funky, etc.).
 *
 * La clase debe tener un método para obtener el nuevo atributo y debe
 * sobreescribir el método toString() para que devuelva, además de la
 * información heredada, la nueva información.
 */

 public class Disco extends Multimedia {
   private Genero genero;

   public Disco(String titulo, String autor, Formato formato, double duracion,
   Genero genero) {
     // llamada al constructor de la superclase
     super(titulo, autor, formato, duracion);
     this.genero = genero;
   }

   public Genero getGenero() {
     return genero;
   }

   public String toString() {
     return super.toString() + "\nGenero: " + genero;
   }
 }
