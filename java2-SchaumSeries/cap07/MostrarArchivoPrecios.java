import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.39
 * 
 * Escriba un método, de nombre mostrarArchivoPrecios, que reciba por parámetro el nombre de un
 * archivo que almacena una serie de referencias y precios de artículos.
 * 
 * El método leerá los valores del archivo y los mostrará por pantalla.
 */
public class MostrarArchivoPrecios {
    public static void main(String[] args) {
        String rutaFichero ="";

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la ruta del fichero a mostrar: ");
        rutaFichero = sc.nextLine();
        sc.close();

        try {
            mostrarArchivoPrecios(rutaFichero);
        } catch (IOException e) {
            System.out.println("Error: no pudo procederse a la lectura o escritura del fichero!!");
        }
    }

    public static void mostrarArchivoPrecios(String ruta) throws IOException {
        int referencia;
        double precio;
        boolean eof = false;
        RandomAccessFile fichero = new RandomAccessFile(ruta, "rw");;

        do {
            try {
                referencia = fichero.readInt();
                System.out.println("REFERENCIA: " + referencia);

                precio = fichero.readDouble();
                System.out.println("PRECIO: " + precio + "\n");

            } catch (EOFException e) {
                eof = true;
                fichero.close();
            }
        } while (!eof);
    }
}