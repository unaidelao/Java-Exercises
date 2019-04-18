import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.14
 * 
 * Escriba un método que reciba por parámetro un array de cadenas de caracteres y vuelque su
 * contenido en un archivo cuyo nombre también se recibirá por parámetro.
 * 
 * Las cadenas quedarán separadas en el archivo por un asterisco.
 * 
 * El método no capturará ninguna excepción que pueda producirse.
 */
public class LeerStringsDeArchivo {

    public static void main(String[] args) {
        try {
            String ruta = "C:\\Users\\pagae\\Desktop\\pruebas-java\\texto.txt";
            String[] res = leeStrings(ruta);

            for (String s : res) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] leeStrings(String nombreArchivo) throws IOException {
        FileReader lector = new FileReader(nombreArchivo);
        String temp = "";
        int caracterLeido;

        while ((caracterLeido = lector.read()) != -1) {
            char c = (char)caracterLeido;
            temp += c;
        }
        lector.close();
        return temp.split("\\*");
    }
}