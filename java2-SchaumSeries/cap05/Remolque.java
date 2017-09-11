/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.18 parte 4 de 5
 *
 * Clase Remolque. Esta clase no hereda de la superclase Vehiculo ya que la
 * clase Camion tiene una relación de composición con esta clase.
 */

 public class Remolque {
   private int peso;

   public Remolque(int peso) {
     this.peso = peso;
   }

   public String toString() {
     return "Remolque con un peso de " + peso + " kg.";
   }
 }
