/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.20
 *
 * Escriba un método de nombre dibujaTriangulo3, que reciba un entero como
 * parámetro. El método debe dibujar un triángulo como el que se muestra en el
 * siguiente dibujo después de comprobar que el valor del parámetro es un
 * número impar positivo.
 *
 * Por ejemplo, si el valor del argumento es 7 dibujará:
 *
 *          *
 *        * * *
 *      * * * * *
 *    * * * * * * *
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class DibujaTriangulo3 {
   public static void dibujaTriangulo3(int n) {
     /*
      * En la primera fila hay que imprimir tantos espacios como valga lado/2,
      * y en las siguientes uno más cada vez.
      * Los asteriscos hay que imprimirlos uno en la primera fila y, en las
      * demás, dos más por cada fila.
      */
     int espacios = n / 2;
     int asteriscos = 1;
     // Si n es impar y positivo
     if (n % 2 == 1 && n > 0) {
       for (int i = 0; i < (n + 1) / 2; i++) { // bucle para los espacios
         for (int j = 0; j < espacios; j++) {
           System.out.print("  ");
         }
         for (int k = 0; k < asteriscos; k++) { // bucle para los asteriscos
           System.out.print("* ");
         }
         System.out.println(); // fin de línea
         espacios -= 1;
         asteriscos += 2;
       }
     }
     else {
       System.out.println("El lado no es un numero impar positivo!!");
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Ingresa el lado del triangulo: ");
     int inputUsuario = in.nextInt();

     dibujaTriangulo3(inputUsuario);
   }
 }
