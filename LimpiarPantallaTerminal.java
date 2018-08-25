import java.util.*;

/*
 * Programa que muestra con un sencillo programa cómo limpiar una terminal de Linux.
 */
public class Prueba {


  public static void main(String[] args) {
    try {
      imprimeMorralla();
      pideNumero();
    }
    catch (Exception e) {
      System.out.println("Eres un poquito troll, ¿no?");
      pideNumero();
    }
    
    limpiaPantalla();
    
    System.out.println("Limpiaste la pantalla\nFin de la prueba.");
  }
  
  
  public static void imprimeMorralla() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Toma morralla en la pantalla...");
    }
  }
  
  
  public static void pideNumero() {
    System.out.print("\nPulsa 1 para limpiar la pantalla: ");
    int entrada = 0;
    Scanner sc = new Scanner(System.in);
    entrada = sc.nextInt();
    
    while (entrada != 1) {
      System.out.println("\nEso es que no quieres limpiar la pantalla.");
      System.out.print("Vuelve a pulsar a ver: ");
      entrada = sc.nextInt();
    }
  }
  
  
  public static void limpiaPantalla() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
