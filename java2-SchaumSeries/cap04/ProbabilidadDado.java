/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.29
 *
 * Escriba un programa que permita determinar la probabilidad con que aparece
 * cada uno de los valores al lanzar un dado. Para ello se lanzará el dado
 * 1.000.000 de veces y se imprimirá por pantalla cuántas veces ha aparecido
 * cada número y el porcentaje que representa respecto del total.
 *
 * @author Unai de la O
 */

 public class ProbabilidadDado {
   public static void main(String[] args) {
     // Valores del dado. De tipo double para poder sacar la probabilidad.
     double valor1 = 0;
     double valor2 = 0;
     double valor3 = 0;
     double valor4 = 0;
     double valor5 = 0;
     double valor6 = 0;

     // Veces que se tira el dado.
     double veces = 1000000;

     System.out.printf("%nDado lanzado 1.000.000 de veces.%n%n");

     for (int i = 0; i < veces; i++) {
       // Lanzamiento aleatorio del dado.
       int valorDado = (int)(Math.random()*6 + 1);
       switch (valorDado) {
         case 1:
          valor1++;
          break;
         case 2:
          valor2++;
          break;
         case 3:
          valor3++;
          break;
         case 4:
          valor4++;
          break;
         case 5:
          valor5++;
          break;
         case 6:
          valor6++;
          break;
       }
     }

     System.out.printf("\tRESULTADOS%n(veces / probabilidad)");
     System.out.println();
     System.out.printf("1: %.1f / %.3f%n", valor1, valor1 / veces);
     System.out.printf("2: %.1f / %.3f%n", valor2, valor2 / veces);
     System.out.printf("3: %.1f / %.3f%n", valor3, valor3 / veces);
     System.out.printf("4: %.1f / %.3f%n", valor4, valor4 / veces);
     System.out.printf("5: %.1f / %.3f%n", valor5, valor5 / veces);
     System.out.printf("6: %.1f / %.3f%n%n", valor6, valor6 / veces);
   }
 }
