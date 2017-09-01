/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.3 parte 3 de 3
 *
 * Esta clase, JuegoPalillos, trata con lo referente al juego. Contiene un
 * array de FilaPalillos. En el constructor se recibe un array que contiene en
 * cada celda el número de palillos de cada fila, por tanto, la longitud del
 * array recibido es el número de filas que tiene el juego.
 */

 public class JuegoPalillos {
   private FilaPalillos[] filas;

   // constructor
   public JuegoPalillos(int[] palillos) {
     filas = new FilaPalillos[palillos.length];
     for (int i = 0; i < filas.length; i++) {
       // cada celda del array es un objeto de tipo FilaPalillos que se crea
       filas[i] = new FilaPalillos(palillos[i]);
     }
   }

   /*
    * Este método recibe el número de palillos que se quitan de la fila. Si se
    * pretenden quitar más palillos de los que hay, devuelve false; si no, los
    * quita y devuelve true.
    */
    public boolean quitaPalillos(int fila, int cuantos) {
      if (fila < 0 || fila >= filas.length) {
        return false;
      }
      else {
        return filas[fila].quitaPalillos(cuantos);
      }
    }

    // Este método devuelve true si no queda ningún palillo en ninguna fila.
    public boolean finDeJuego() {
      for (int i = 0; i < filas.length; i++) {
        /* en cuanto una fila no tenga 0 palillos, se devuelve false, si sale
         * del for es porque todas tienen 0.
         */
         if (filas[i].cuantosPalillos() != 0) return false;
      }
      return true;
    }

    /*
     * Este método devuelve en forma de String la información de los palillos
     * que quedan en el juego. Para ello se utiliza el método toString() de
     * FilaPalillos.
     *
     * Nota: al método toString() lo llama automáticamente Java cuando necesita
     * un String.
     */
     public String toString() {
       String s = "";
       for (int i = 0; i < filas.length; i++) {
         s += i + " " + filas[i] + "\n";
       }
       return s;
     }
 }
