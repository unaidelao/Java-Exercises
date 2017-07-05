/**
 * Ejercicio de prueba usando try-catch-finally con manejo de excepciones.
 *
 * Se pide repetidamente al usuario un número entre 0 y 100, mediante un bucle
 * do-while.
 *
 * Se utiliza el método readLine() de la clase BufferedReader porque puede
 * lanzar la excepción IOException. Si no se hace nada con ella cuando se
 * produce, el programa finaliza.
 *
 * Así mismo, el método parseInt() puede lanzar la excepción
 * NumberFormatException, cuando parseInt() no puede convertir el texto en un
 * número entero.
 *
 * Apunte: el bloque finally siempre se ejecuta.
 */
 
 import java.io.*;
 
 public class TryCatchFinally {
   public static void main(String[] args) {
     int numero = 0;
     int intentos = 0;
     String linea;
     
     BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
     
     do {
       try {
         System.out.print("Introduzca un número entre 0 y 100: ");
         linea = teclado.readLine();
         numero = Integer.parseInt(linea);
       }
       catch(IOException e) {
         System.out.println("Error al leer del teclado!");
       }
       catch(NumberFormatException e) {
         System.out.println("Numero a introducir entre 0 y 100!");
       }
       finally {
         intentos++;
       }
     } while (numero < 0 || numero > 100);
     
     System.out.println("El numero introducido es: " + numero);
     System.out.println("Total de intentos: " + intentos);
   }
 }