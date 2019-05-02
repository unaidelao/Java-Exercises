import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.40
 * 
 * Escriba un programa que verifique el funcionamiento de los métodos de los tres ejercicios
 * anteriores.
 */
public class PruebaMetodosAccesoAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce la ruta del fichero a crear: ");
        String rutaFichero = sc.nextLine();
        sc.close();

        int[] refs = {1, 2, 3, 4, 5};
        double[] refsPrecios = {5.15, 10.50, 3.99, 2.00, 8.50};

        try {
            escribirArchivoPrecios(refs, refsPrecios, rutaFichero);
            mostrarArchivoPrecios(rutaFichero);
            actualizarArchivoPrecios(rutaFichero);
            mostrarArchivoPrecios(rutaFichero);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escribirArchivoPrecios(int[] referencias, double[] precios, String ruta) throws IOException {
        RandomAccessFile fichero = new RandomAccessFile(ruta, "rw");

        if (referencias.length == precios.length) {
            fichero.writeChars("Creado fichero con información:\n\n");
            for (int i = 0; i < referencias.length; i++) {
                fichero.writeInt(referencias[i]);
                fichero.writeDouble(precios[i]);
            }
        } else {
            System.out.println("Warning: Arrays con tamaños distintos.");
        }
        fichero.close();
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