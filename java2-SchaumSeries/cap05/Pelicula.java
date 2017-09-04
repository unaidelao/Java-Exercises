/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.10
 *
 * Escriba una clase Pelicula que herede de la clase Multimedia anterior. La
 * clase Pelicula tiene, además de los atributos heredados, un actor principal
 * y una actriz principal. Se permite que uno de los dos sea nulo, pero no los
 * dos. La clase debe tener dos métodos para obtener los dos nuevos atributos y
 * debe sobreescribir el método toString() para que devuelva, además de la
 * información heredada, la nueva información.
 *
 * Planteamiento: la clase Pelicula hereda de Multimedia.
 *   En el constructor se reciben los valores de los atributos de la superclase
 * y los dos nuevos. Se debe controlar que los valores de los dos nuevos
 * atributos (actor y actriz principal) no sean ambos nulos. En el caso de que
 * ambos sean nulos, se lanzará una excepción IllegalArgumentException.
 *   Se sobreescribe el método toString() y se añaden los dos nuevos métodos.
 */

 public class Pelicula extends Multimedia {
   private String actorPrincipal;
   private String actrizPrincipal;

   public Pelicula(String titulo, String autor, Formato formato,
   double duracion, String actor, String actriz) {
     // llamada al constructor de la superclase
     super(titulo, autor, formato, duracion);
     if (actor == null && actriz == null) {
       throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
     }
     actorPrincipal = actor;
     actrizPrincipal = actriz;
   }

   public String getActor() {
     return actorPrincipal;
   }

   public String getActriz() {
     return actrizPrincipal;
   }

   public toString() {
     String s = "Protagonizado por ";
     if (actrizPrincipal != null) {
       s += actrizPrincipal;
       if (actorPrincipal != null) {
         s += " y " + actorPrincipal;
       }
     }
     else {
       // no puede ocurrir que actrizPrincipal y actorPrincipal sean nulos a la vez.
       assert actorPrincipal != null;
       s += actorPrincipal;
     }
     // llamada al método toString() de la superclase
     return super.toString() + "\n" + s;
   }
 }
