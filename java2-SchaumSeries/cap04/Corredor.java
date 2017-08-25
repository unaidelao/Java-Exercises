/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.50
 *
 * Escriba una clase, de nombre Corredor, teniendo en cuenta las siguientes
 * especificaciones:
 *   a) La clase tendrá un atributo entero de nombre energía.
 *   b) La clase tendrá un método constructor que reciba por parámetro una
 *      cantidad de energía que asignará al atributo.
 *   c) La clase tendrá un método, de nombre recargarEnergia, que recibirá por
 *      parámetro una cantidad de energía que será sumada al atributo energía.
 *   d) La clase tendrá un método, de nombre correr, que mostrará por pantalla
 *      un mensaje y decrementará la energía en 10 unidades. Antes de proceder
 *      al decremento, el método comprobará que la energía del corredor es
 *      igual o superior a 10 unidades. Si no es así, el método lanzará una
 *      excepción de tipo AgotadoExcepcion.
 */

 /*
  * Clase para la excepción AgotadoExcepcion
  */
  class AgotadoExcepcion extends Exception {
    public AgotadoExcepcion(String s) {
      super (s);
    }
  }

  /*
   * Clase del corredor
   */
   public class Corredor {
     int energia = 0;

     // Constructor
     public Corredor(int energia) {
       this.energia = energia;
     }

     // Método para recargar la energía del corredor
     public void recargarEnergia(int energia) {
       this.energia += energia;
     }

     // Método para que el corredor corra
     public void correr() throws AgotadoExcepcion {
       if (energia < 10) {
         throw new AgotadoExcepcion("Agotado...(energia = " + energia + ")");
       }
       System.out.println("Corriendo...(energia = " + energia + ")");
       energia -= 10;
     }
   }
