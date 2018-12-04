/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.34
 *
 * Sea la clase Alumno, añada a la clase un método, de nombre asignarNotas, que
 * reciba por parámetro una matriz de valores reales con las notas que el
 * alumno ha obtenido en dos evaluaciones realizadas.
 *
 * La primera dimensión de la matriz corresponderá al número de evaluaciones y,
 * por tanto, sólo podrá contener 2 posiciones.
 *
 * La segunda dimensión calculará la nota final para cada una de las
 * asignaturas. El método calculará la nota final para cada una de las
 * asignaturas teniendo en cuenta que la nota de la primera evaluación tiene un
 * peso del 60% y la segunda el 40% restante. El método también determinará la
 * nota media final del alumno.
 */

 public class Alumno implements Comparable<Alumno> {
   int numeroPersonal;
   String apellido1, apellido2, nombre;
   int numAsignaturas;
   double[] notasFinales;
   double notaMediaFinal;

   public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
     numeroPersonal = numPer;
     apellido1 = ap1;
     apellido2 = ap2;
     nombre = nom;
     numAsignaturas = numAsig;
     notasFinales = new double[numAsignaturas];
   }

   public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig,
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

   // Método añadido por requerimiento del ejercicio.
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
   
   // Es necesario desarrollar el método compareTo() para implementar la interfaz Comparable<>
   public int compareTo(Alumno alumno2) {
     if ((int) (obtenerNotaMediaFinal()*100 - alumno2.obtenerNotaMediaFinal()*100) == 0) {
       return obtenerNp() - alumno2.obtenerNp();
     }
    return (int) (obtenerNotaMediaFinal() - alumno2.obtenerNotaMediaFinal());
    }
 }
