import java.io.File;
import java.util.Arrays;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.31
 * 
 * Escriba un programa que muestre los nombres de los archivos con extensión .java de un directorio.
 */
public class MuestraArchivosPorExtension {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\unai\\Desktop\\pruebas-java");

        String[] resultado = file.list();
        //Directorio completo.
        System.out.println("== DIRECTORIO COMPLETO ==");
        System.out.println(Arrays.deepToString(resultado));

        // Directorio filtrado.
        System.out.println("== DIRECTORIO FILTRADO ==");
        for (String s : resultado) {
            if (s.endsWith(".java")) {
                System.out.println(s);
            }
        }
    }
}