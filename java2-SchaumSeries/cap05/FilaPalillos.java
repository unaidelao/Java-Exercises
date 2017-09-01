/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.3 parte 2 de 3
 *
 * Esta clase, FilaPalillos, trata todo lo referente a una fila de palillos. En
 * el constructor se recibe el número de palillos que contiene la fila.
 */

 public class FilaPalillos {
   private int numPalillos;

   // constructor
   public FilaPalillos(int tamaño) {
     numPalillos = tamaño;
   }

   /*
    * Este método recibe el número de palillos que se quitan de la fila. Si se
    * pretenden quitar más palillos de los que hay, devuelve false; si no, los
    * quita y devuelve true.
    */
    public boolean quitaPalillos(int cuantos) {
      if (cuantos > numPalillos) {
        return false;
      }
      else {
        numPalillos -= cuantos;
        return true;
      }
    }

    /*
     * Este método devuelve en forma de String tantos palillos como tenga la
     * fila.
     */
     public String toString() {
       // se utiliza un String auxiliar para acumular palillos
       String s = "";
       for (int i = 0; i < numPalillos; i++) {
         s += "|";
       }
       return s;
     }

     /*
      * Este método recibe los palillos a añadir a la fila. (No se utilizará en
      * este programa, pero se añade para una posible reutilización para otro
      * juego).
      */
      public void añadePalillos(int cuantos) {
        numPalillos += cuantos;
      }

      /*
       * Este método devuelve cuántos palillos tiene la fila.
       */
       public int cuantosPalillos() {
         return numPalillos;
       }
 }
