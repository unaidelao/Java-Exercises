/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.5
 *
 * Escriba una clase llamada Elemento, que disponga de un atributo con su
 * nombre. La clase debe contener un método llamado numeroDeElementos(), que
 * devuelve el número total de elementos que se han instanciado.
 *
 * @author Unai de la O
 */

 class Elemento {
   /*
    * Explicación: la variable contador y el método numeroDeElementos(), se
    * declaran como estáticos ya que, si no, no podría utilizarse el método
    * numeroDeElementos() tal y como se hace en el println() del método main, y
    * a su vez, el método numeroDeElementos() no podría utilizar a su vez de
    * forma estática la variable contador.
    */
   private String nombre;

   private static int contador = 0;

   public Elemento(String nombre) {
     this.nombre = nombre;
     contador++;
   }
   public static int numeroDeElementos() {
     return contador;
   }
 }

 class PruebaElementos {
   public static void main(String[] args) {
   Elemento O = new Elemento("Oxigeno");
   Elemento F = new Elemento("Fluor");
   Elemento Au = new Elemento("Oro");

   System.out.println("Elementos: " + Elemento.numeroDeElementos());
   }
 }
