/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.3
 *
 * Escriba un programa para representar el consumo de energía de una
 * instalación eléctrica. Para ello, se dispondrá de una clase que representa
 * los aparatos conectados en la instalación. Cada aparato tiene un consumo
 * eléctrico determinado. Al encender un aparato eléctrico, el consumo de
 * energía se incrementa en la potencia de dicho aparato. Al apagarlo, se
 * decrementa el consumo. Inicialmente, los aparatos están todos apagados.
 * Además, se desea consultar el consumo total de la instalación.
 *
 * Hacer un programa que declare tres aparatos eléctricos, una bombilla de 100
 * watios, un radiador de 2000 watios y una plancha de 1200 watios. El programa
 * imprimirá el consumo nada más crear los objetos. Posteriormente, se enciende
 * la bombilla y la plancha, y el programa imprime el consumo. Luego se apaga
 * la plancha y se enciende el radiador y se vuelve a imprimir el consumo.
 *
 * @author Unai de la O
 */

 class AparatoElectrico {
   /*
    * Variables privadas para cada uno de los aparatos eléctricos (objetos) que
    * se creen.
    */
   private int potencia;
   private boolean encendido;

   // Constructor para cada aparato eléctrico
   public AparatoElectrico(int potencia) {
     this.potencia = potencia;
     encendido = false;
   }

   /*
    * Variable estática que podrá ser accedida desde el método main() de la
    * clase ConsumoElectrico, utilizando el método estático
    * imprimeConsumoTotal() definido en esta clase.
    */
   static int consumoTotal = 0;

   static void imprimeConsumoTotal() {
     System.out.println("El consumo total actual es: " + consumoTotal);
   }

   /*
    * Setter para encender un objeto de la clase AparatoElectrico. Añade la
    * potencia del aparato que sea a consumoTotal.
    */
   void encender() {
     if (!encendido) {
      encendido = true;
      consumoTotal += potencia;
     }
   }

   /*
    * Setter para apagar un objeto desde la clase AparatoElectrico. Resta la
    * potencia del aparato que sea a consumoTotal.
    */
   void apagar() {
     if (encendido) {
      encendido = false;
      consumoTotal -= potencia;
     }
   }
 }

 class ConsumoElectrico {

   public static void main(String[] args) {
     // Se crean los distintos objetos
     AparatoElectrico bombilla = new AparatoElectrico(100);
     AparatoElectrico radiador = new AparatoElectrico(2000);
     AparatoElectrico plancha = new AparatoElectrico(1200);

     AparatoElectrico.imprimeConsumoTotal();


     bombilla.encender();
     plancha.encender();
     AparatoElectrico.imprimeConsumoTotal();

     plancha.apagar();
     radiador.encender();
     AparatoElectrico.imprimeConsumoTotal();
   }
 }
