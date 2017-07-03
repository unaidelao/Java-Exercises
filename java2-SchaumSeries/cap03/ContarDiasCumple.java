/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.20
 *
 * Escriba un programa que determine cuántas veces una persona celebra su
 * cumpleaños en lunes. El programa debe imprimir las fechas en que el
 * cumpleaños cae en lunes los primeros 40 años de su vida y el total de ellas.
 * Suponga el ejemplo de una persona que nació el 4 de abril de 1965 y tiene 40
 * años.
 *
 * Planteamiento: mediante la clase GregorianCalendar, se construye la fecha
 * deseada. Con un bucle for se recorren los 40 años, añadiendo cada año
 * mediante el método roll(). Para cada fecha, se obtiene el día de la semana y
 * se compara si es lunes (Calendar.MONDAY), en cuyo caso se imprime la fecha
 * en formato día/mes/año. Además, se proporcionará un contador.
 */

 import java.util.GregorianCalendar;
 import java.util.Calendar;

 public class ContarDiasCumple {
   public static void main(String[] args) {
     int contadorLunes = 0;

     // Se crea la fecha de nacimiento del usuario
     GregorianCalendar gc = new GregorianCalendar(1965, Calendar.APRIL, 4);

     System.out.println("Cumples que caen en lunes:");
     System.out.println("--------------------------");

     for (int i = 0; i < 40; i++) {
       /*
        * Con roll() avanzamos primero un año a la fecha de nacimiento, para
        * que este día no figure como cumpleaños.
        */
       gc.roll(Calendar.YEAR, 1);

       if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
         contadorLunes++;

         // Se suma 1 a Calendar.MONTH porque enero es 0 y diciembre es 11
         System.out.println(gc.get(Calendar.DAY_OF_MONTH) + "/" + gc.get((Calendar.MONTH)+1) + "/" + gc.get(Calendar.YEAR));
       }
     }
     System.out.println("Cumples celebrados en lunes: " + contadorLunes);
   }
 }
