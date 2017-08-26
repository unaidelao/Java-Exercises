/**
 * Clase Hora del ejercicio 5.1 (Examen.java)
 */

public class Hora {
  private int hora;
  private int minuto;

  public Hora(int hora, int minuto) {
    if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
      throw new IllegalArgumentException();
    }
    else {
      this.hora = hora;
      this.minuto = minuto;
    }
  }

  public int getHora() {
    return hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public String toString() {
    // Si el minuto es menor que 10, se añade un 0 antes
    return hora + ":" + (minuto < 10 ? "0" : "") + minuto;
  }
}
