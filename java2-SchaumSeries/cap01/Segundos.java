/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.21
 *
 * Escriba que solicite al usuario una cantidad en segundos y la convierta a
 * días, horas, minutos y segundos.
 *
 * @author Unai de la O
 */
 
 import java.util.Scanner;
 
 public class Segundos {
	 public static void main(String[] args) {
     // Declaración de variables
     int segundosUsuario, segundos, minutos, horas, dias;
     
     // Se instancia un nuevo objeto de la clase Scanner
     Scanner in = new Scanner(System.in);
     
     // Se solicitan los datos al usuario
     System.out.print("Introduzca los segundos, por favor: ");
     segundosUsuario = in.nextInt();
     
     // Cálculos
     dias = (segundosUsuario / 3600) / 24;
     horas = segundosUsuario / 3600;
     minutos = (segundosUsuario % 3600) / 60;
     segundos = (segundosUsuario % 3600) % 60;
     
     // Imprimir resultados por pantalla
     System.out.printf("%d segundos = %d dias, %d horas, %d minutos y %d segundos\n",
                        segundosUsuario, dias, horas, minutos, segundos);
     
   }
 }