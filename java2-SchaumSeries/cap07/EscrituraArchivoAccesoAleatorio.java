import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.36
 * 
 * Escriba un programa que escriba 4 veces el valor 1 en un archivo y después, 5 veces el valor 2.
 * A continuación, se mostrará el contenido del archivo por pantalla.
 * 
 * Se continuará haciendo que todos los valores 2 del archivo se sustituyan por el valor 3.
 * Finalmente, se mostrará el nuevo contenido del archivo y el programa finalizará.
 */
public class EscrituraArchivoAccesoAleatorio {
    public static void main(String[] args) {
        String nombreFichero = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la ruta completa nombre del fichero a crear: ");
        nombreFichero = sc.nextLine();
        sc.close();

        try {
            RandomAccessFile fichero = new RandomAccessFile(nombreFichero, "rw");

            for (int i = 0; i < 10; i++) {
                if (i < 5) {
                    fichero.writeInt(1);
                } else {
                    fichero.writeInt(2);
                }
            }

            // Regresamos al inicio del fichero y se imprimen sus valores.
            fichero.seek(0);
            for (int i = 0; i < 10; i++) {
                System.out.println("Pos. " + i + ", Valor: " + fichero.readInt());
            }
            System.out.println();

            // Nos colocamos en el primer 2 (es decir, 5 posiciones de 4 bytes cada una).
            fichero.seek(5 * 4);
            // Y se sobrescribe con 3.
            for (int i = 0; i < 10; i++) {
                fichero.writeInt(3);
            }

            // Se vuelve a la posición inicial y se imprimen de nuevo todos los valores.
            fichero.seek(0);
            for (int i = 0; i < 10; i++) {
                System.out.println("Pos. " + i + ", Valor: " + fichero.readInt());
            }
            System.out.println();

            // Se cierra el flujo.
            fichero.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}