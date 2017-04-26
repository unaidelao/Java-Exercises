/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.22
 *
 * Escriba un programa que solicite al usuario el tamaño del lado de un
 * triángulo equilátero y calcule su perímetro y su área.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class TrianguloEquilatero {
   public static void main(String[] args) {
     // Declaración de variables
     double lado, altura, perimetro, area;
     // El usuario introduce el lado del triángulo
     Scanner in = new Scanner(System.in);
     System.out.print("Introduzca el lado del triangulo: ");
     lado = in.nextDouble();
     //Cálculos necesarios
     perimetro = lado * 3;
     // Necesitamos obtener la altura mediante Pitágoras
     altura = Math.sqrt(lado * lado - (lado / 2.0) * (lado / 2.0));
     area = lado * altura / 2;

     // Imprimimos en pantalla los resultados
     System.out.println("El lado del triangulo es " + lado + " cms");
     System.out.println("Su perimetro es " + perimetro + " cms");
     System.out.printf("Y su area es de %.2f cms^2\n", area);
   }
 }
