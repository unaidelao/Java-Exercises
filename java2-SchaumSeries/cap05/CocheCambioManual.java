/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.15 parte 2 de 3.
 *
 * Subclase CocheCambioManual, que hereda de la superclase Coche.
 */

 public class CocheCambioManual extends Coche {

   public CocheCambioManual(String matricula) {
     // llamada al constructor de la superclase
     super(matricula);
   }

   // se sobreescribe con un modificador de acceso público
   public void cambiaMarcha(int marcha) {
     if (marcha < 0) {
       throw new IllegalArgumentException();
     }
     else {
       super.cambiaMarcha(marcha);
     }
   }
 }
