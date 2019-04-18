import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.12
 * 
 * Escriba un método que reciba por parámetro el nombre de un archivo que almacena linealmente los
 * valores de tipo byte de una matriz.
 * 
 * Se recibirán también las dimensiones de la matriz y el método la construirá y rellenará con los
 * valores del archivo para finalmente, devolverla.
 */
public class LeerMatrizDesdeArchivo {

    public static void main(String[] args) {
        byte[][] matrizObtenida = obtenerMatrizdeBytes("C:\\pruebas-java\\datos.txt", 3, 3);
        
        // Comprueba lo que se ha obtenido.
        System.out.println(Arrays.deepToString(matrizObtenida)); 
    }

    /* Método pedido */
    public static byte[][] obtenerMatrizdeBytes(String nombreArchivo, int a, int b) {
        FileInputStream fis;
        byte[][] m = new byte[a][b];
        try{
            fis = new FileInputStream(nombreArchivo);

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    m[i][j] = (byte) fis.read();
                }
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return m;
    }
}