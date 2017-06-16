/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.8
 *
 * Escriba un programa que utilice la clase Bombilla del apartado anterior.
 * Para ello, se creará una Bombilla y se imprimirá por pantalla si luce o no.
 * Luego, se pulsa el interruptor de la Bombilla y se vuelve a imprimir el
 * estado de la misma. Por último, se pulsa el interruptor general y se imprime
 * el estado.
 *
 * @author Unai de la O
 */
 class PruebaBombilla {
   public static void main(String[] args) {
     Bombilla b1 = new Bombilla();

     System.out.printf("%nCreada bombilla b1%n");
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));

     System.out.printf("%nInterruptor de la bombilla pulsado%n");
     b1.accionIntBombilla();
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));

     System.out.printf("%nInterruptor general de la casa accionado%n");
     Bombilla.accionIntGen();
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));
   }
 }
