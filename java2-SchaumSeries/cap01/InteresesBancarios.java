/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.13
 *
 * Escriba un programa que escriba en la pantalla cuánto le dará su banco
 * después de seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75%
 * anual. Recuerde que al pagarle los intereses el banco le retendrá el 18%
 * para Hacienda. Utilice variables para manejar las cantidades y realizar
 * los cálculos. Escriba los mensajes apropiados para entender todos los
 * cálculos.
 *
 * @author Unai de la O
 */

public class InteresesBancarios {
  public static void main(String[] args) {
    final double IMPUESTO_HACIENDA = 18.0;
    final int MESES_POR_ANNO = 12;

    double capital = 2000.0;
    double interesAplicadoAnual = 2.75;
    int mesesInvertidos = 6;

    double interesesGanados = capital * interesAplicadoAnual
    / 100 * mesesInvertidos / MESES_POR_ANNO;

    double retenidoHacienda = interesesGanados * IMPUESTO_HACIENDA / 100;
    double interesesFinales = interesesGanados - retenidoHacienda;

    System.out.printf("Capital invertido: %.2f€\n", capital);
    System.out.printf("Interés aplicado anual: %.2f%%\n",interesAplicadoAnual);
    System.out.printf("Intereses ganados a los %d meses: %.2f€\n",
    mesesInvertidos, interesesGanados);
    System.out.printf("Retenciones Hacienda: %.2f€\n", retenidoHacienda);
    System.out.printf("Intereses ganados finalmente: %.2f€\n",
    interesesFinales);
  }
}
