/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.7
 *
 * Se desea representar las bombillas que pueda haber en una casa. Cada
 * bombilla tiene asociada un interruptor y sólo uno. Así mismo, existe un
 * interruptor general de la casa. Un interruptor tiene dos estados, ON y OFF.
 * Una bombilla luce si el interruptor general de la casa está ON y su
 * interruptor asociado también.
 *
 * Escriba una clase de nombre Bombilla que permita modelar la información
 * anterior. Para ello, la clase dispondrá de:
 *    - un método para cambiar el estado del interruptor de la bombilla.
 *    - un método para cambiar el estado del interruptor general de la casa.
 *    - un método que determina si una bombilla está luciendo o no.
 *
 * @author Unai de la O
 */
 enum Estado { ON, OFF }

 class Bombilla {
   // variable estática (de clase) para el interruptor general
   private static Estado intGen = Estado.OFF;

   // método estático para el interruptor general
   public static void accionIntGen() {
     if (intGen == Estado.OFF) {
       intGen = Estado.ON;
     }
     else {
       intGen = Estado.OFF;
     }
   }

   // variable para el interruptor de los objetos Bombilla
   private Estado intBombilla;
   // constructor de cada objeto bombilla
   public Bombilla() {
     intBombilla = Estado.OFF;
   }

   // método para el interruptor de los objetos Bombilla
   public void accionIntBombilla() {
     if (intBombilla == Estado.OFF) {
       intBombilla = Estado.ON;
     }
     else {
       intBombilla = Estado.OFF;
     }
   }

   // método para conocer si una bombilla luce
   public boolean estaEncendida() {
     return (intBombilla == Estado.ON) && (intGen == Estado.ON);
   }

   // MAIN
   public static void main(String[] args) {
     Bombilla b1 = new Bombilla();
     Bombilla b2 = new Bombilla();
     Bombilla b3 = new Bombilla();

     System.out.printf("%nTras crear los objetos bombilla%n");
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));
     System.out.println("b2 encendida: " + (b2.estaEncendida() ? "SI" : "NO"));
     System.out.println("b3 encendida: " + (b3.estaEncendida() ? "SI" : "NO"));

     System.out.printf("%nSe acciona el interruptor general%n");
     Bombilla.accionIntGen();
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));
     System.out.println("b2 encendida: " + (b2.estaEncendida() ? "SI" : "NO"));
     System.out.println("b3 encendida: " + (b3.estaEncendida() ? "SI" : "NO"));

     System.out.printf("%nSe acciona b1 y b3%n");
     b1.accionIntBombilla();
     b3.accionIntBombilla();
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));
     System.out.println("b2 encendida: " + (b2.estaEncendida() ? "SI" : "NO"));
     System.out.println("b3 encendida: " + (b3.estaEncendida() ? "SI" : "NO"));

     System.out.printf("%nSe acciona de nuevo el interruptor general%n");
     Bombilla.accionIntGen();
     System.out.println("b1 encendida: " + (b1.estaEncendida() ? "SI" : "NO"));
     System.out.println("b2 encendida: " + (b2.estaEncendida() ? "SI" : "NO"));
     System.out.println("b3 encendida: " + (b3.estaEncendida() ? "SI" : "NO"));
   }
 }
