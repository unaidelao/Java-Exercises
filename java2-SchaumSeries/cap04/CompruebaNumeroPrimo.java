/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.13
 *
 * Escriba un método, de nombre esPrimo, que reciba un número entero por
 * parámetro y devuelva un booleano que indique si se trata de un número primo
 * o no.
 *
 * Planteamiento: Para comprobar que se trata de un número primo hay que
 * comprobar que no tiene divisores distintos de la unidad y del propio número.
 * Se irá comprobando si tiene algún divisor a partir del 2 en adelante, si se
 * encuentra algún número que lo divida, el método ejecutará una sentencia
 * return con el valor false, pues si al menos tiene un divisor no es primo.
 *
 * Mediante un for se comprobará para todos los números entre el 2 y los
 * menores que el valor pasado como argumento. Si al finalizar la ejecución del
 * for en ningún momento se ha ejecutado la sentencia return, será porque no
 * tenía ningún divisor y se ejecutará la sentencia return con el valor true.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CompruebaNumeroPrimo {
   public static boolean esPrimo(int n) {
     if (n % 2 == 0) {
       return false;
     }
     int divisor = 3;
     boolean esPrimo = true;

     while (divisor * divisor <= n) {
       if (n % divisor == 0) {
         return false;
       }
       divisor += 2;
     }
     return true;
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Escriba un numero para comprobar si es primo: ");
     int numeroUsuario = in.nextInt();

     if (esPrimo(numeroUsuario)) {
       System.out.println("Resultado: " + numeroUsuario + " es primo.");
     }
     else {
       System.out.println("Resultado: " + numeroUsuario + " no es primo.");
     }
   }
 }
