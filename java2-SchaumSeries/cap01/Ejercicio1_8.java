/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.8
 *
 * Escriba un programa que escriba en pantalla cuánto le dará su banco después
 * de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual.
 * Recuerde que al pagarle los intereses el banco le retendrá el 18% para
 * Hacienda. Escriba los mensajes apropiados para entender todos los cálculos.
 *
 * @author Unai de la O
 */

 public class Ejercicio1_8 {
   public static void main(String[] args) {
     double capital = 2000.0;
     double intereses = 0.0275;
     double interesesSobreCapital = capital * intereses;
     double hacienda = 0.18;
     double deducidoHacienda = interesesSobreCapital * hacienda;
     double gananciaFinal = interesesSobreCapital - deducidoHacienda;

     System.out.println("Calculo de intereses:");
     System.out.println("Dinero ingresado: " + capital);
     System.out.println("Interes anual: 2.75%");
     System.out.println("Ganancia bruta: " + interesesSobreCapital);
     System.out.println("Deducido Hacienda: " + deducidoHacienda);
     System.out.println("Ganancia final: " + gananciaFinal);
   }
 }
