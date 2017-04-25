/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.20
 *
 * Escriba un enumerado para los tipos de lavado de un túnel de lavado que
 * guarde la información de los tiempos. Los tipos de lavado son básico, normal
 * y súper y el el tiempo que se tarda en cada uno es de 3, 5 y 8 minutos,
 * respectivamente. Escriba un programa que muestre su funcionamiento.
 *
 * @author Unai de la O
 */
enum TipoLavado {
  BASICO(3), NORMAL(5), SUPER(8);
  private int tiempo;
  TipoLavado(int tiempo) {
    this.tiempo = tiempo;
  }
  public int getTiempo() {
    return tiempo;
  }
}

public class TunelLavado {
  public static void main(String[] args) {
    TipoLavado lavadoSuper = TipoLavado.SUPER;

    System.out.println("El lavado " + lavadoSuper + " tarda " + lavadoSuper.getTiempo());
  }
}
