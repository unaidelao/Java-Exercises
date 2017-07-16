/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.14
 *
 * Escriba un programa que solicite al usuario un número entero positivo. El
 * programa debe presentar en pantalla la descomposición en factores primos de
 * de dicho número. Por ejemplo, si el número es 28, debe escribir 28 = 2 * 2 *
 * 7.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class FactoresPrimos {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Descomposicion en factores primos.");
     System.out.print("Introduzca numero: ");
     int numeroUsuario = in.nextInt();

     int divisor = 2;
     System.out.print(numeroUsuario + " = ");

     while (numeroUsuario > divisor) {
       if (numeroUsuario % divisor == 0) {
         numeroUsuario /= divisor;
         System.out.print(divisor + " * ");
       }
       else {
         divisor++;
       }
     }
     System.out.println(divisor);
   }
 }
