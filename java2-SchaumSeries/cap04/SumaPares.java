/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.15
 *
 * Escriba un método que escriba en pantalla el valor de la suma de los n
 * primeros números pares.
 *
 * @author Unai de la O
 */

 /*
  * Este ejercicio trata de una Progresión Aritmética.
  * La fórmula para el término n es: a(n) = a(1) + (n-1)·d
  * La fórmula para la suma de n términos es: S = (a(1) + a(n) / 2)·n
  */

 import java.util.Scanner;

 public class SumaPares {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     int a1 = 2;
     int d = 2;
     int an;
     int suma = 0;

     System.out.println("Suma de los primeros \"n\" numeros pares.");
     System.out.println("Progresion Aritmetica 2,4,6,8,...");
     System.out.print("Introduzca el valor de \"n\", por favor: ");
     int n = in.nextInt(); // n es la cantidad de primeros números pares

     // Cálculo de a(n)
     an = a1 + (n - 1) * d;

     // Cálculo de la suma de n términos
     suma = ((a1 + an) / 2) * n;

     // Imprime en pantalla el resultado de la suma de n términos
     System.out.println("Suma = " + suma);
   }
 }
