import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.10
 *
 * Escriba un método, de nombre obtenerSumaNumerosArchivo, que reciba por parámetro el nombre de
 * un archivo que almacenará enteros positivos (es decir, números naturales). El método leerá todos
 * los valores del archivo, calculará su suma y la devolverá. No se capturará ninguna excepción.
 */
public class SumarNumerosDesdeArchivo {

    public static void main(String[] args) {
        File documento;
        try {
            documento = new File("C:\\Users\\pruebas-java\\bucle100.txt");
            System.out.println("Suma: " + obtenerSumaNumerosArchivo(documento));

        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al acceder al archivo.");
        }
    }

    /* Método pedido */
    public static int obtenerSumaNumerosArchivo(File f) throws IOException {
        FileInputStream lector = new FileInputStream(f);
        int num = lector.read();
        int suma = 0;

        while (num != -1) {
            suma += num;
            num = lector.read();
        }
        lector.close();
        return suma;
    }
}
