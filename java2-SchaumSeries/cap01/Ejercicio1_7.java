/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.7
 *
 * Escriba un programa que escriba en pantalla cuánto le dará su banco después
 * de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual.
 * Recuerde que al pagarle los intereses el banco le retendrá el 18% para
 * Hacienda.
 *
 * @author Unai de la O
 */

 public class Ejercicio1_7 {
   public static void main(String[] args) {
     double capital = 2000.0;
     double intereses = 0.0275;
     double interesesSobreCapital = capital * intereses;
     double hacienda = 0.18;
     double deducidoHacienda = interesesSobreCapital * hacienda;
     double gananciaTotal = interesesSobreCapital - deducidoHacienda;

     System.out.println(gananciaTotal);
   }
 }
