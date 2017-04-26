/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.24
 *
 * Escriba un programa que calcule cuánto le dará su banco después de realizar
 * una imposición a plazo fijo. Para ello el programa debe pedir la cantidad
 * que desea invertir, el tipo de interés anual que le paga el banco por el
 * dinero y el plazo que se mantiene la inversión. El programa debe calcular
 * el dinero que se obtiene después de dicho plazo. Recuerde que al pagarle
 * los intereses, el banco le retendrá el 18% para Hacienda. Escriba los
 * mensajes apropiados para que el usuario pueda seguir el proceso de cálculo
 * realizado.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class InteresesBancarios2 {
   public static void main(String[] args) {
     final double RETENCIONES = 18;
     final int MESES_ANUAL = 12;

     Scanner in = new Scanner(System.in);

     System.out.print("Capital a ingresar: ");
     double capitalInvertido = in.nextDouble();

     System.out.print("Interes anual que ofrece el banco: ");
     double interesBanco = in.nextDouble();

     System.out.print("Meses que dura la inversion: ");
     int mesesInvertidos = in.nextInt();

     double interesesGanados = capitalInvertido * interesBanco / 100 * mesesInvertidos / MESES_ANUAL;

     double retenidoHacienda = interesesGanados * RETENCIONES / 100;
     double interesesCobrados = interesesGanados - retenidoHacienda;

     System.out.println();
     System.out.println("Calculo de intereses bancarios con retenciones");
     System.out.println("----------------------------------------------");
     System.out.printf("Interes ofrecido por banco: %.2f%%\n", interesBanco);
     System.out.printf("Intereses a los %d meses: %.2f euros\n", mesesInvertidos, interesesGanados);
     System.out.printf("Retenido para Hacienda: %.2f euros\n", retenidoHacienda);
     System.out.printf("Intereses a cobrar: %.2f euros\n", interesesCobrados);
     System.out.println();
   }
 }
