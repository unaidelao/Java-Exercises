/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.2
 *
 * Escriba una aplicación que cree un objeto de tipo Examen, lo muestre por
 * pantalla, modifique su fecha y hora y lo vuelva a mostrar por pantalla.
 */

 public class PruebaExamen {
   public static void main(String[] args) {
     Fecha fecha = new Fecha(1, 4, 2005);
     Hora hora = new Hora(17, 30);
     Examen examenMates = new Examen("Examen de Mates", "A101", fecha, hora);
     System.out.println(examenMates.toString());
     examenMates.setFecha(new Fecha(1, 6, 2005));
     examenMates.setHora(new Hora(9, 0));
     System.out.println(examenMates.toString());
   }
 }
