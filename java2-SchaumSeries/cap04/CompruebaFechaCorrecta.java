/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.12
 *
 * Escriba un método, de nombre esFechaValida, que reciba como parámetros tres
 * valores enteros con el día, mes y año de una fecha y devuelva un valor
 * booleano que indique si se trata de valores válidos para una fecha.
 *
 * Planteamiento: los valores válidos para los meses son exclusivamente entre 1
 * y 12. Se considerarán valores válidos para los años valores entre 1600 y
 * 3000. Para los días, dependerá del valor del mes de la fecha. Para comprobar
 * si se trata de un día válido se usará una variable auxiliar en la que se le
 * asigna el valor máximo de día del mes para el mes de la fecha. Mediante una
 * estructura switch a esta variable, se le asigna el valor 31 si es mes 1, 3,
 * 5, 7, 8, 10 o 12. El valor 30 si es mes 4, 6, 9 u 11. En caso de ser febrero
 * , el 2, hay que comprobar si es bisiesto, para asignarle el valor 28 o 29.
 * Un es bisiesto si es múltiplo de cuatro y no es múltiplo de cien, a no ser
 * que sea múltiplo de cuatrocientos.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CompruebaFechaCorrecta {
   public boolean esFechaValida(int dia, int mes, int anno) {
     // Variable auxiliar, que se necesita para el switch.
     int diasMes;
     // Comprobación de año correcto
     if (anno < 1600 || anno > 3000) {
       return false;
     }
     // Comprobación de mes correcto
     if (mes < 1 || mes > 12) {
       return false;
     }
     // Comprobación de día correcto
     switch (mes) {
       case 1:
       case 3:
       case 5:
       case 7:
       case 8:
       case 10:
       case 12:
         diasMes = 31;
         break;
       case 2: // febrero
         // Si es bisiesto
         if ((anno % 4 == 0) && (anno % 100 != 0) || (anno % 400 == 0)) {
           diasMes = 29;
         }
         // Si no es bisiesto
         else {
           diasMes = 28;
         }
         break;
       default: // para los meses 4, 6, 9 y 11
         diasMes = 31;
         break;
     }
     return dia >= 1 && dia <= diasMes;
   }

   // MAIN y prueba del programa.
   public static void main(String[] args) {
     CompruebaFechaCorrecta ejemplo = new CompruebaFechaCorrecta();
     boolean resultadoPrueba = ejemplo.esFechaValida(29,2,2020); // true
     System.out.println(resultadoPrueba);
   }
 }
