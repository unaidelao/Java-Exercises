/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.3 parte 1 de 3
 *
 * Escriba una aplicación para jugar al juego de los palillos. Éste es un juego
 * para dos personas que consta de un número determinado de palillos organizado
 * por filas. Cada jugador puede quitar por turnos todos los palillos que
 * quiera, pero de una sola fila. El jugador que quite el último palillo
 * pierde. La aplicación debe estar preparada para que sea fácil de modificar
 * el número de filas y el número de palillos por fila.
 *
 * La aplicación constará de tres clases: MainPalillos, FilaPalillos y
 * JuegoPalillos.
 */

 /*
  * En esta clase, MainPalillos, se escribe la aplicación. Se crea un
  * JuegoPalillos, en este caso con 7, 5 y 3 palillos en cada fila y
  * posteriormente en un buble, se muestra el juego. Se pide al usuario la fila
  * y el número de palillos que desea quitar mientras que se acabe el juego.
  *
  * Se controlan las posibles excepciones de entrada y no se cambia de turno si
  * quitarPalillos() devuelve false.
  */

  import java.util.Scanner;
  import java.util.InputMismatchException;

  public class MainPalillos {
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      int[] palillos = { 7, 5, 3 };
      JuegoPalillos juego;
      // para almacenar los nombres de los jugadores
      String[] jugador = new String[2];
      jugador[0] = "Jugador 1";
      jugador[1] = "Jugador 2";
      int turno = 0;
      int fila;
      // para la cantidad de palillos a quitar por turno
      int cuantos;
      juego = new JuegoPalillos(palillos);

      do {
        try {
          System.out.println(juego);
          System.out.println(jugador[turno] + ", elige fila");
          fila = lector.nextInt();
          System.out.println(jugador[turno] + ", ¿palillos a quitar?");
          cuantos = lector.nextInt();

          if (juego.quitaPalillos(fila, cuantos)) {
            // para cambiar de turno
            turno = (turno + 1) % 2;
          }
          else {
            System.out.println("Introduce bien la fila y los palillos");
          }
        }
        catch (InputMismatchException e) {
          System.out.println("Por favor, Introduce un número.");
          lector.next();
        }
        catch (Exception exc) {
          System.out.println("Se ha producido un error " + exc.toString());
        }
      }
      while (!juego.finDeJuego());

      System.out.println("El ganador ha sido " + jugador[turno]);
    }
  }
