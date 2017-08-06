/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.33
 *
 * Escriba un programa que genere un números aleatorios entre 0 y 99 hasta
 * obtener 5 números impares. Estos números impares se almacenarán en un array
 * y se mostrarán al final del programa. El programa también indicará el número
 * de valores aleatorios que ha sido necesario generar hasta obtener los 5
 * valores impares.
 *
 * Planteamiento: El programa declara un array donde se almacenarán los 5
 * valores impares obtenidos. Se utiliza un bucle infinito donde se irán
 * generando valores aleatorios. Cuando el valor corresponda a un número impar
 * se incluirá en el array, incrementando una variable índice para la inserción
 * del siguiente elemento. Cuando se hayan obtenido 5 valores impares, o lo que
 * es lo mismo, cuando la variable índice alcance la longitud del array, se
 * lanzará una excepción para notificar la situación que incluirá un mensaje
 * con el número de valores aleatorios que ha sido necesario generar. El
 * lanzamiento de la excepción provocará un salto a la primera sentencia del
 * manejador de la excepción, interrumpiendo así la ejecución del bucle
 * infinito. El manejador de la excepción mostrará el mensaje del objeto
 * excepción y, a continuación, los impares generados aleatoriamente.
 */

 import java.util.Arrays;

 public class ArrayImparesAleatorios {
   public static void main(String[] args) {
     int[] impares = new int[5];
     try {
       int intentos = 0, i = 0;
       while (true) {
         int numeroAleatorio = (int)(Math.random() * 100);
         intentos++;
         if (numeroAleatorio % 2 != 0) {
           impares[i++] = numeroAleatorio;
         }
         if (i == 5) {
           throw new Exception("Creados 5 impares en " + intentos + " intentos");
         }
       }
     }
     catch(Exception e) {
       System.out.println(e.getMessage());
       System.out.println("Los impares creados son: " + Arrays.toString(impares));
     }
   }
 }
