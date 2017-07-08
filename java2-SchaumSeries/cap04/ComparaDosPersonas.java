/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.7
 *
 * Escriba un programa, de nombre ComparaDosPersonas, que pida nombre y
 * apellidos de dos personas y los escriba ordenados alfabéticamente, teniendo
 * en cuenta los dos apellidos y, si fuera necesario, el nombre.
 *
 * Pista:
 *    compareToIgnoreCase() compara sin tener en cuenta mayúsculas ni
 * minúsculas, devolviendo número negativo si el valor de la cadena es menor
 * que el valor de la cadena pasada como parámetro; positivo si el valor de la
 * cadena es mayor que el valor de la cadena pasada por parámetro; devuelve
 * cero si las cadenas son iguales.
 *
 *    equalsIgnoreCase() compara una cadena de texto ignorando mayúsculas y
 * minúsculas, devolviendo true si las cadenas comparadas son iguales y false
 * si no lo son.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class ComparaDosPersonas {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     // Se piden los datos al usuario
     System.out.println("Vamos a comparar y ordenar nombres y apellidos.");

     System.out.print("Nombre de la primera persona: ");
     String p1nombre = in.nextLine();
     System.out.print("Primer apellido de la primera persona: ");
     String p1apellido1 = in.nextLine();
     System.out.print("Segundo apellido de la primera persona: ");
     String p1apellido2 = in.nextLine();

     System.out.print("Nombre de la segunda persona: ");
     String p2nombre = in.nextLine();
     System.out.print("Primer apellido de la segunda persona: ");
     String p2apellido1 = in.nextLine();
     System.out.print("Segundo apellido de la segunda persona: ");
     String p2apellido2 = in.nextLine();

     /*
      * Se comparan los datos: si el primer apellido de la primera persona es
      * alfabéticamente anterior al de la segunda persona o si el primer
      * apellido de ambas son iguales y los apellidos de la segunda persona ya
      * están en orden alfabético, o los apellidos de la primera persona son
      * iguales entre sí, los de la segunda también y el nombre de la primera
      * es anterior al de la segunda, imprimirá primero los datos de la primera
      * persona y seguido los de la segunda.
      *
      * En caso contrario, imprimirá la segunda y después la primera persona.
      */
     if ((p1apellido1.compareToIgnoreCase(p2apellido1) < 0) ||
       (p1apellido1.equalsIgnoreCase(p2apellido1) &&
       p1apellido2.compareToIgnoreCase(p2apellido2) < 0) ||
       (p1apellido1.equalsIgnoreCase(p2apellido1) &&
       p1apellido2.equalsIgnoreCase(p2apellido2) &&
       p1nombre.compareToIgnoreCase(p2nombre) < 0)) {
         System.out.println(p1nombre + " " + p1apellido1 + " " + p1apellido2);
         System.out.println(p2nombre + " " + p2apellido1 + " " + p2apellido2);
       }
       else {
         System.out.println(p2nombre + " " + p2apellido1 + " " + p2apellido2);
         System.out.println(p1nombre + " " + p1apellido1 + " " + p1apellido2);
       }
   }
 }
