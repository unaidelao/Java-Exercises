/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.28
 *
 * Escriba un programa que juegue con el usuario a adivinar un número. El
 * ordenador debe generar un número entre 1 y 100 y el usuario tiene que
 * intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor
 * el ordenador debe decirle si el número que tiene que adivinar es mayor o
 * menor que el que ha introducido. Cuando consiga adivinarlo, debe indicárselo
 * e imprimir en pantalla el número de veces que el usuario ha intentado
 * adivinar el número. Si el usuario introduce algo que no es un número, debe
 * indicarlo de esta forma en pantalla y contarlo como un intento.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class JuegoAdivinarNumero {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     // Número a adivinar entre 1 y 100
     int numeroAdivinar = (int)(Math.random() * 100 + 1);

     int numeroUsuario = 0;
     int intentosUsuario = 0;

     System.out.println("Intente adivinar un numero entre 1 y 100.");

     do {
       System.out.print("Introduzca su numero: ");
       numeroUsuario = in.nextInt();
       intentosUsuario++;

       if (numeroUsuario > numeroAdivinar) {
         System.out.println("Su numero es mayor. Pruebe de nuevo.");
       }
       if (numeroUsuario < numeroAdivinar) {
         System.out.println("Su numero es menor. Pruebe de nuevo.");
       }
     } while (numeroUsuario != numeroAdivinar);
     
     System.out.println("El numero " + numeroAdivinar + " ha sido adivinado!");
     System.out.println("Numero de intentos: " + intentosUsuario);
   }
 }
