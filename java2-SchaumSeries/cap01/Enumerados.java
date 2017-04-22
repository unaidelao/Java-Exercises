/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.18
 *
 * Escriba un programa que defina un enumerado para los días de la semana. En
 * el programa defina una variable del enumerado y asígnele el valor del día
 * que corresponde al martes. A continuación, escriba por pantalla dicha
 * variable y escriba el valor del enumerado correspondiente al domingo.
 *
 * @author Unai de la O
 */

public class Enumerados {
  enum DiasSemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO,
                    DOMINGO }

  public static void main(String[] args) {
    DiasSemana dia1 = DiasSemana.MARTES;
    System.out.println("El valor de dia1 es " + dia1);
    System.out.println("Último día: " + DiasSemana.DOMINGO);
  }
}
