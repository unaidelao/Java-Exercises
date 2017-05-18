/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.18
 *
 * Escriba una clase que represente un reloj que señale la hora, el minuto y el
 * segundo. La clase dispondrá de dos constructores, uno sin parámetros que
 * pone el reloj a 0:0:0 y otro al que se le pasa la hora, los minutos y los
 * segundos.
 *
 * Se proporcionarán los siguientes métodos:
 *  - Uno que da la hora, los minutos y los segundos, separados por el carácter
 *    ":", en una cadena.
 *  - Otro que también da la hora pero en formato 24 horas (como el anterior)
 *    o en formato 12, en cuyo caso debe distinguir entre "am" o "pm", también
 *    en una cadena.
 *  - Un método para poner el reloj en hora. Se le pasa la hora y los minutos,
 *    poniendo los segundos a 0.
 *  - Un método para poner el reloj en hora al que, además, se le pasan los
 *    segundos.
 *
 * @author Unai de la O
 */

 // Enumeración previa para definir 24h o 12h
 enum FormatoHora {H24, H12}

 public class Reloj {
   // Variables de instancia
   private int hora, minutos, segundos;

   // Constructores
   public Reloj() {
     hora = 0;
     minutos = 0;
     segundos = 0;
   }

   public Reloj(int hora, int minutos, int segundos) {
     this.hora = hora;
     this.minutos = minutos;
     this.segundos = segundos;
   }

   // Getters
   public String getReloj() {
     return hora + ":" + minutos + ":" + segundos;
   }

   public String getReloj(FormatoHora formato) {
     if (formato == FormatoHora.H12 && hora >= 12) {
       return (hora - 12) + ":" + minutos + ":" + segundos + "am";
     }
     else {
       return getReloj() + "pm";
     }
   }

   // Setters
   public void setReloj(int hora, int minutos) {
     this.hora = hora;
     this.minutos = minutos;
     this.segundos = 0;
   }

   public void setReloj(int hora, int minutos, int segundos) {
     this.hora = hora;
     this.minutos = minutos;
     this.segundos = segundos;
   }

   // MAIN y test del programa
   public static void main(String[] args) {
     Reloj reloj1 = new Reloj();
     Reloj reloj2 = new Reloj(16,15,45);
     System.out.println("Reloj 1 -> " + reloj1.getReloj());
     System.out.println("Reloj 2 formato 12h -> " + reloj2.getReloj(FormatoHora.H12));
     System.out.println("Reloj 2 formato 24h -> " + reloj2.getReloj(FormatoHora.H24));
     reloj1.setReloj(5,30);
     System.out.println("Reloj 1 modificado -> " + reloj1.getReloj());

   }
 }
