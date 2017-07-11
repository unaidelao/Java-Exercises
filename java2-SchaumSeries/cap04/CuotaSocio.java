/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.9
 *
 * Escriba un programa, de nombre CuotaSocio, que calcule la cuota que se debe
 * abonar en un club. La cuota es de 500 euros. Tendrán un 50% de descuento las
 * personas mayores de 65 años y un 25% los menores de 18 años si los padres no
 * son socios y 35% si los padres son socios.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CuotaSocio {
   public static void main(String[] args) {
     final double CUOTA = 500;
     // Cuota con descuento del 50% para mayores de 65 años
     final double CUOTA_JUBILADO = CUOTA - (CUOTA * 0.5);
     // Cuota con descuento para menores de familiar socio
     final double CUOTA_MENOR_SOCIO = CUOTA - (CUOTA * 0.35);
     // Cuota con descuento para menores sin familiar socio
     final double CUOTA_MENOR_NO_SOCIO = CUOTA - (CUOTA * 0.25);

     Scanner in = new Scanner(System.in);

     int edadSocio;

     System.out.print("Introduzca la edad del candidato a socio:");
     edadSocio = in.nextInt();

     if (edadSocio >= 65) {
       System.out.println("La cuota final es de " + CUOTA_JUBILADO);
     }
     else if (edadSocio < 18) {
       System.out.println("Tiene familiar socio?(si/no)");
       String respuesta = in.next(); // obtiene sólo la primera letra
       if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("SI")) {
         System.out.println("La cuota final es de " + CUOTA_MENOR_SOCIO);
       }
       else {
         System.out.println("La cuota final es de " + CUOTA_MENOR_NO_SOCIO);
       }
     }
     else {
       System.out.println("La cuota final es de " + CUOTA);
     }
   }
 }
