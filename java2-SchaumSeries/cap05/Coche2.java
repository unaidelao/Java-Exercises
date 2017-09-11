/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.18 parte 2 de 5
 *
 * Clase Coche2
 */

 /**
  * En esta clase Coche2 se añade el atributo numPuertas y el método para
  * devulverlo. En el constructor se llama al constructor de la superclase.
  */
 public class Coche2 extends Vehiculo {
   private int numPuertas;

   public Coche2(String matricula, int puertas) {
     super(matricula);
     numPuertas = puertas;
   }

   public int getPuertas() {
     return numPuertas;
   }
 }
