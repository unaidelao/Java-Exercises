/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.21
 *
 * Escriba un método de nombre dibujaRombo, que reciba un entero como
 * parámetro. El método debe dibujar un rombo como el que se muestra en el
 * siguiente dibujo después de comprobar que el valor que recibe como argumento
 * , que indica la altura del rombo, es un impar mayor o igual que 3.
 *
 * Por ejemplo, si el valor del parámetro es 5 dibujará:
 *
 *          *
 *        * * *
 *      * * * * *
 *        * * *
 *          *
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class DibujaRombo {
   public static void dibujaRombo(int a) {
     /*
      * Planteamiento similar al del ejercicio 4.20 (DibujaTriangulo3.java),
      * llevando la cuenta de los espacios y asteriscos que deben imprimirse en
      * cada fila.
      *
      * Primero se imprime la parte superior y luego la inferior.
      */
     int espacios = a / 2;
     int asteriscos = 1;
     // Si n es impar mayor o igual a 3
     if (a % 2 == 1 && a >= 3) {
       // parte superior del rombo
       for (int i = 0; i < (a + 1) / 2; i++) { // bucle para los espacios
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

       /*
        * Se asignan nuevos valores a las variables espacios y asteriscos para
        * poder hacer la parte inferior del rombo.
        */
        espacios = 1;
        asteriscos = a - 2;

        // parte inferior del rombo
        for (int i = 0; i < a / 2; i++) {
          for (int j = 0; j < espacios; j++) { // bucle para los espacios
            System.out.print("  ");
          }
          for (int k = 0; k < asteriscos; k++) { // bucle para los asteriscos
            System.out.print("* ");
          }
          System.out.println(); // fin de línea
          espacios += 1;
          asteriscos -= 2;
        }
      }
      else {
        System.out.println("La altura debe ser impar mayor o igual a 3!!");
      }
    }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Ingresa la altura del rombo: ");
     int inputUsuario = in.nextInt();

     dibujaRombo(inputUsuario);
   }
 }
