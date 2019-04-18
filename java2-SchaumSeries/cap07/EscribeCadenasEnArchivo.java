import java.io.FileWriter;
import java.io.IOException;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.13
 * 
 * Escriba un método que reciba por parámetro un array de cadenas de caracteres y vuelque su
 * contenido en un archivo cuyo nombre también se recibirá por parámetro.
 * 
 * Las cadenas quedarán separadas en el archivo por un asterisco.
 * 
 * El método no capturará ninguna excepción que pueda producirse.
 */
public class EscribeCadenasEnArchivo {

    public static void main(String[] args) {
        String[] arr = {"Cadena 1", "Segunda cadena", "Fin del documento"};
        try {
            arrayCadenasEnArchivo(arr, "C:\\pruebas-java\\resultado.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /* Método pedido */
    public static void arrayCadenasEnArchivo(String[] arr, String nombreArchivo) throws IOException {
        FileWriter fw = new FileWriter(nombreArchivo);

        for (String cadena : arr) {
            fw.write(cadena);
            fw.write("*");
        }
        fw.close();
    }
}