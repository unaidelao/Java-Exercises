import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.38
 * 
 * Escriba un método, de nombre actualizarArchivoPrecios, que reciba por parámetro el nombre de
 * un archivo que almacena un conjunto de parejas de valores correspondientes a una referencia de
 * artículo y a su precio.
 * 
 * El método actualizará los precios de forma que los superiores a 100 euros se decrementen en un
 * 50% y los inferiores se incrementen en un 50%.
 * 
 * El método capturará y tratará todas las excepciones que puedan producirse.
 */
public class ActualizaArchivoPrecios {
    public static void main(String[] args) {
        String rutaFichero ="";

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la ruta del fichero a actualizar: ");
        rutaFichero = sc.nextLine();
        sc.close();

        actualizarArchivoPrecios(rutaFichero);
    }

    public static void actualizarArchivoPrecios(String ruta) {
        int referencia;
        double precio;
        boolean eof = false;
        RandomAccessFile fichero = null;
        try {
            fichero = new RandomAccessFile(ruta, "rw");

            do {
                try {
                    referencia = fichero.readInt();
                    precio = fichero.readDouble();

                    if (precio > 100.0) {
                        precio *= 1.5;
                    } else {
                        precio *= 0.5;
                    }
                    // Se retroceden 8 bytes (el tamaño del double) para poder sobrescribirlo.
                    fichero.seek(fichero.getFilePointer()-8);
                    fichero.writeDouble(precio);
                } catch (EOFException e) {
                    eof = true;
                    fichero.close();
                }
            } while (!eof);
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encontró el fichero!!");
        } catch (IOException e) {
            System.out.println("Error: no pudo procederse a la lectura o escritura del fichero!!");
        }
    }
}