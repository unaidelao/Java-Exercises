/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.19
 *
 * Añada al ejercicio anterior un método para poner la hora especificando si es
 * AM o es PM.
 *
 * @author Unai de la O
 */

 // Enums. La segunda es creada para la especificación de este ejercicio
 enum FormatoHora {H24, H12}
 enum FormatoAMPM {AM, PM}

 public class Reloj2 {
   // Variables de instancia
   private int hora, minutos, segundos;

   // Constructores
   public Reloj2() {
     hora = 0;
     minutos = 0;
     segundos = 0;
   }

   public Reloj2(int hora, int minutos, int segundos) {
     this.hora = hora;
     this.minutos = minutos;
     this.segundos = segundos;
   }
   
   /*
    * El ejercicio pedía crear un método setter, pero me apetecía practicar con
    * un constructor.
    */
   public Reloj2(int hora, int minutos, int segundos, FormatoAMPM f) {
     if (f == FormatoAMPM.AM) {
       if (hora > 12) {
         this.hora = hora - 12;
       }
       else {
         this.hora = hora;
       }
       this.minutos = minutos;
       this.segundos = segundos;
     }
     
     if (f == FormatoAMPM.PM) {
       if (hora < 12) {
         this.hora = hora + 12;
       }
       else {
         this.hora = hora;
       }
       this.minutos = minutos;
       this.segundos = segundos;
     }
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
     Reloj2 reloj1 = new Reloj2();
     Reloj2 reloj2 = new Reloj2(16,15,45);
     Reloj2 reloj3 = new Reloj2(7,30,0,FormatoAMPM.PM);
     System.out.println("Reloj 1 -> " + reloj1.getReloj());
     System.out.println("Reloj 2 formato 12h -> " + reloj2.getReloj(FormatoHora.H12));
     System.out.println("Reloj 2 formato 24h -> " + reloj2.getReloj(FormatoHora.H24));
     reloj1.setReloj(5,30);
     System.out.println("Reloj 1 modificado -> " + reloj1.getReloj());
     System.out.println("Reloj 3 -> " + reloj3.getReloj());

   }
 }
