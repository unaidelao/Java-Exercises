/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.18 parte 3 de 5
 *
 * Clase Camion
 */

 /**
  * En esta clase Camion se añade el atributo remolque de tipo Remolque y los
  * métodos para poner y quitar el remolque. Además, se sobreescribe el método
  * toString() para mostrar la información del remolque, si lo tiene.
  *
  * Al sobreescribir el método acelerar() se lanza una excepción de tipo
  * DemasiadoRapidoException que hay que indicar en la cabecera mediante una
  * cláusula throws: Java no permite, en un método que sobreescribe a otro,
  * lanzar una excepción que no se está lanzando en el método sobreescrito.
  *
  * Por este motivo, en el método acelerar() de la superclase Vehiculo, se ha
  * indicado en la cláusula throws que se pueden lanzar este tipo de
  * excepciones, aunque no se esté lanzando.
  */
 public class Camion extends Vehiculo {
   private Remolque remolque;

   public Camion(String matricula) {
     // llamada al constructor de la superclase
     super(matricula);
     remolque = null;
   }

   public void ponRemolque(Remolque r) {
     remolque = r;
   }

   public void quitaRemolque() {
     remolque = null;
   }

   public void acelerar(double vel) throws DemasiadoRapidoException {
     if (remolque != null && getVelocidad() + vel > 100) {
       throw new DemasiadoRapidoException();
     }
     else {
       super.acelerar(vel);
     }
   }

   public String toString() {
     if (remolque != null) {
       return super.toString() + ". Lleva un " + remolque.toString();
     }
     else {
       return super.toString();
     }
   }
 }
