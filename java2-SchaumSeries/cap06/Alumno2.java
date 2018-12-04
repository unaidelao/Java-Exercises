/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.35
 *
 * Añada a la clase Alumno (Ejercicio 6.34) un método, de nombre pasaDeCurso,
 * que indique si el alumno podrá acceder al siguiente curso. Se considera que
 * un alumno puede pasar de curso si su nota media final es mayor o igual que
 * 5.0 y tiene menos de 3 asignaturas suspensas.
 *
 * PLANTEAMIENTO: Para determinar el número de asignaturas suspensas, se hace
 * una ordenación de las calificaciones finales del alumno. Asumiendo que el
 * alumno siempre cursa más de tres asignaturas, se comprueba el valor de la
 * tercera posición del array (índice 2). Si el valor de esta posición es
 * inferior a 5.0, y por estar el array ordenado, significa que el alumno no ha
 * logrado superar tres de sus materias. Para comprobar que la nota media es
 * superior a 5.0, basta con llamar al método que la calcula y hacer la
 * correspondiente comparación.
 */

 import java.util.Arrays;

 public class Alumno2 {
   int numeroPersonal;
   String apellido1, apellido2, nombre;
   int numAsignaturas;
   double[] notasFinales;
   double notaMediaFinal;

   public Alumno2(int numPer, String ap1, String ap2, String nom, int numAsig) {
     numeroPersonal = numPer;
     apellido1 = ap1;
     apellido2 = ap2;
     nombre = nom;
     numAsignaturas = numAsig;
     notasFinales = new double[numAsignaturas];
   }

   public Alumno2(int numPer, String ap1, String ap2, String nom, int numAsig,
                 double[] notasF, double nmf) {
     numeroPersonal = numPer;
     apellido1 = ap1;
     apellido2 = ap2;
     nombre = nom;
     numAsignaturas = numAsig;
     notasFinales = notasF;
     notaMediaFinal = nmf;
   }

   public int obtenerNp() {
     return numeroPersonal;
   }

   public String toString() {
     String resul = "NP: " + numeroPersonal + "\n" +
                    " Nombre: " + nombre +
                    " Apellido1: " + apellido1 +
                    " Apellido1: " + apellido2 + "\n" +
                    " Nota Media Final: " + notaMediaFinal + "\n";
     return resul;
   }

   public double obtenerNotaMediaFinal() {
     return notaMediaFinal;
   }

   // Método para asignar notas a un objeto Alumno2.
   public void asignarNotas(double[][] notas2Eval) {
     if ((notas2Eval == null) ||
         notas2Eval.length != 2 ||
         notas2Eval[0].length != numAsignaturas ||
         notas2Eval[1].length != numAsignaturas) {
           throw new IllegalArgumentException("Parametro ingresado no valido");
     }
     // Calcula la nota final de cada asignatura.
     for (int asig = 0; asig < numAsignaturas; asig++) {
       notasFinales[asig] = (notas2Eval[0][asig] * 0.6) + (notas2Eval[1][asig] * 0.4);
     }
     // Calcula la nota media final.
     for (double nota : notasFinales) {
       notaMediaFinal += nota;
     }
     notaMediaFinal /= numAsignaturas;
   }

   // Método para comprobar si un alumno pasa de curso o no.
   public boolean pasaDeCurso() {
     // Se ordena el array que contiene las notas finales del alumno.
     Arrays.sort(notasFinales);

     if (notasFinales[2] >= 5 && obtenerNotaMediaFinal() >= 5.0)
        return true;
     else
        return false;
   }
 }
