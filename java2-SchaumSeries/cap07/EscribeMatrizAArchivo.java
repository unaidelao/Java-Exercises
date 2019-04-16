import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.11
 * 
 * Escriba un método que reciba por parámetro una matriz con valores de tipo byte y almacene su
 * contenido de forma lineal en un archivo cuyo nombre también se recibirá por parámetro.
 * 
 * La lectura de los elementos de la matriz se realizará con flujos de lectura sobre los elementos
 * de su segunda dimensión.
 */
public class EscribeMatrizAArchivo {

    public static void main(String[] args) {
        byte[][] datos = {{3, 6, 9}, {8, 4, 6}};
        escribirMatrizByteEnArchivo(datos, "C:\\pruebas-java\\res.txt");
    }

    /* Método pedido */
    public static void escribirMatrizByteEnArchivo(byte[][] matriz, String nombreArchivo) {
        FileOutputStream fos;
        ByteArrayInputStream filaMatriz;
        try {
            fos = new FileOutputStream(nombreArchivo);

            for (int i = 0; i < matriz.length; i++) {
                filaMatriz = new ByteArrayInputStream(matriz[i]);
                byte numero;

                while ((numero = (byte)filaMatriz.read()) != -1) {
                    fos.write(numero);
                }
            }
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}