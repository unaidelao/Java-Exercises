/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.4
 *
 * Escriba un programa, de nombre pares, en el que se solicite un número entero
 * al usuario y el programa escriba un mensaje por pantalla que indique si se
 * trata de un número par o de un número impar.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class Pares {
   public static boolean pares(int n) {
     return (n % 2 == 0) ? true : false;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     System.out.print("Introduzca un numero, por favor: ");
     Scanner in = new Scanner(System.in);
     int numeroUsuario = in.nextInt();

     System.out.println("El numero introducido es par?: " + pares(numeroUsuario));
   }
 }
