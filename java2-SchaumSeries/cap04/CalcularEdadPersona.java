/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.11
 *
 * Escriba un programa, de nombre CalcularEdadPersona, que calcule la edad de
 * una persona solicitando su fecha de nacimiento.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;
 import java.util.GregorianCalendar;

 public class CalcularEdadPersona {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     // Se utiliza la clase GregorianCalendar para obtener la fecha actual.
     GregorianCalendar gc = new GregorianCalendar();
     int diaActual = gc.get(GregorianCalendar.DAY_OF_MONTH);
     // Para el mes se pone +1 porque van numerados del 0 al 11.
     int mesActual = gc.get(GregorianCalendar.MONTH) + 1;
     int annoActual = gc.get(GregorianCalendar.YEAR);

     // Se pide la fecha de nacimiento al usuario
     System.out.println("Vamos a calcular su edad...");
     System.out.print("Introduzca su dia de nacimiento: ");
     int diaNacimiento = in.nextInt();
     System.out.print("Introduzca su mes de nacimiento: ");
     int mesNacimiento = in.nextInt();
     System.out.print("Introduzca su anno de nacimiento: ");
     int annoNacimiento = in.nextInt();

     // Procesamiento de la información
     int edadUsuario = annoActual - annoNacimiento;
     if (mesActual < mesNacimiento) {
       edadUsuario--;
     }
     else if (mesActual == mesNacimiento && diaActual < diaNacimiento) {
       edadUsuario--;
     }
     // Se imprime por pantalla la edad actual del usuario
     System.out.println("Su edad es de " + edadUsuario + ".");
  }
 }
