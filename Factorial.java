/*
 * Programa que calcula un factorial de un número, usando un bucle for.
 * Por ejemplo, 5! = 5 * 4 * 3 * 2 * 1.
 */

import javax.swing.JOptionPane;

public class Factorial {

  public static void main(String[] args) {

    /*
     * A continuación, se utiliza Long como tipo de dato porque los factoriales
     * son números muy grandes. Aún así el tipo Long se quedaría corto muy rápido,
     * debiendo utilizar, por ejemplo, la clase BigInteger de la API.
     */
    Long resultado = 1L;

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, por favor"));

    for (int i = numero; i > 0; i--) {
      resultado *= i;
    }
    System.out.println("El factorial de " + numero + " es " + resultado + ".");
  }
}
