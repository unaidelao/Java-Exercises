import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.37
 * 
 * Escriba un método, de nombre escribirArchivoPrecios, que reciba por parámetro un array de
 * valores enteros correspondientes a referencias de artículos y un array de valores reales
 * correspondientes a los precios de los artículos anteriores.
 * 
 * El método recibirá también el nombre de un archivo sobre el que se escribirá cada referencia
 * de artículo, seguida de su precio.
 * 
 * El método no capturará ninguna excepción
 */
public class EscribeArchivoPrecios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce la ruta del fichero a crear: ");
        String rutaFichero = sc.nextLine();
        sc.close();

        int[] refs = {1, 2, 3, 4, 5};
        double[] refsPrecios = {5.15, 10.50, 3.99, 2.00, 8.50};

        try {
            escribirArchivoPrecios(refs, refsPrecios, rutaFichero);
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
}