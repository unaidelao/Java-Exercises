/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.30
 *
 * Escriba un programa similar al del Ejercicio 4.28 pero controlando cada
 * lectura de dato. Para ello, hace falta un segundo bucle do-while dentro del
 * anterior para controlar que la lectura que se realiza es realmente un número
 * entero y, en caso contrario, dar un mensaje de error y volver a pedirlo.
 *
 * Scanner indica que no ha conseguido reconocer la entrada lanzando una
 * excepción InputMismatchException.
 *
 * Para saber si cada vez que se pide se ha conseguido leer un número se
 * utiliza una variale boolean que indique si se ha leído correctamente o no.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;
 import java.util.InputMismatchException;

 public class JuegoAdivinarNumeroException {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     // Número a adivinar entre 1 y 100
     int numeroAdivinar = (int)(Math.random() * 100 + 1);

     int numeroUsuario = 0;
     int intentosUsuario = 0;

     System.out.println("Intente adivinar un numero entre 1 y 100.");

     do {
       boolean leido;
       do {
         System.out.print("Introduzca su numero: ");
         try {
           numeroUsuario = in.nextInt();
           intentosUsuario++;
           leido = true;
         }
         catch(InputMismatchException e) {
           System.out.println("ERROR: numero entero no introducido!!");
           in.next(); // Se lee el elemento no reconocido para eliminarlo.
           leido = false;
         }
       } while (leido == false);

       if (numeroUsuario > numeroAdivinar) {
         System.out.println("Su numero es mayor. Pruebe de nuevo.");
       }
       if (numeroUsuario < numeroAdivinar) {
         System.out.println("Su numero es menor. Pruebe de nuevo.");
       }
     } while (numeroUsuario != numeroAdivinar);

     System.out.println("El numero " + numeroAdivinar + " ha sido adivinado!");
     System.out.println("Numero de intentos: " + intentosUsuario);
   }
 }
