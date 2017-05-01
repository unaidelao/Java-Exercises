/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.3
 *
 * Añadir a la clase Coche del Ejercicio 2.1 un método de nombre imprimeCoche
 * que imprima el modelo y el color del coche.
 *
 * @author Unai de la O
 */

 enum TipoDeCoche { MINI, UTILITARIO, FAMILIAR, DEPORTIVO }
 enum ModalidadDeSeguro { TERCEROS, TODO_RIESGO }

 public class Coche2 {
   String modelo;
   String color;
   boolean pinturaMetalizada;
   int matricula;
   TipoDeCoche tipo;
   int fechaFabricacion;
   ModalidadDeSeguro seguro;

   /*
    * En este ejemplo el método es de instancia
    * Para invocarlo habría que utilizar la sentencia:
    *  coche.imprimirDatosCoche();
    */
   public void imprimeCoche() {
       System.out.printf("Modelo: %s%nColor: %s%n", modelo, color);
   }
 }
