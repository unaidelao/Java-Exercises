/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.15 parte 3 de 3.
 *
 * Subclase CocheCambioAutomatico, que hereda de la superclase Coche.
 */

 public class CocheCambioAutomatico extends Coche {

   public CocheCambioAutomatico(String matricula) {
     super(matricula);
   }

   public void acelerar(int vel) {
     // se llama al método acelerar() de la superclase
     super.acelerar(vel);

     if (getVelocidad() < 10) {
       cambiaMarcha(1);
     }
     else if (getVelocidad() < 30) {
       cambiaMarcha(2);
     }
     else if (getVelocidad() < 50) {
       cambiaMarcha(3);
     }
     else if (getVelocidad() < 80) {
       cambiaMarcha(4);
     }
     else {
       cambiaMarcha(5);
     }
   }

   public void frenar(int vel) {
     super.frenar(vel);

     if (getVelocidad() < 5) {
       cambiaMarcha(1);
     }
     else if (getVelocidad() < 20) {
       cambiaMarcha(2);
     }
     else if (getVelocidad() < 40) {
       cambiaMarcha(3);
     }
     else if (getVelocidad() < 60) {
       cambiaMarcha(4);
     }
     else {
       cambiaMarcha(5);
     }
   }
 }
