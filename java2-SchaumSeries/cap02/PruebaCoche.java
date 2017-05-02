/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.4
 *
 * Escribir un programa que tenga una instancia de mi coche, que es un Rolls
 * Royce de color dorado. El programa ha de imprimir un mensaje que diga de qué
 * modelo y color es mi coche.
 *
 * @author Unai de la O
 */

 enum TipoDeCoche { MINI, UTILITARIO, FAMILIAR, DEPORTIVO }
 enum ModalidadDeSeguro { TERCEROS, TODO_RIESGO }

 public class PruebaCoche {
   // Definición de la clase
   String modelo;
   String color;
   boolean pinturaMetalizada;
   int matricula;
   TipoDeCoche tipo;
   int fechaFabricacion;
   ModalidadDeSeguro seguro;

   // Constructor. Solo recoge modelo y color para probar en este ejercicio
   public PruebaCoche(String modelo, String color) {
     this.modelo = modelo;
     this.color = color;
   }

   // Método para imprimir valores del objeto creado
   public void imprimeCoche() {
        System.out.printf("Modelo: %s%nColor: %s%n", modelo, color);
    }

   // MAIN
   public static void main(String[] args) {
      PruebaCoche vehiculo1 = new PruebaCoche("Rolls Royce", "dorado");
      vehiculo1.imprimeCoche();
   }
 }
