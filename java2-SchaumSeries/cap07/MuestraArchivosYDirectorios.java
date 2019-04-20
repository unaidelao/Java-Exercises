import java.io.File;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.30
 * 
 * Se pide escribir un programa que muestre los archivos y directorios situados en un directorio.
 */
public class MuestraArchivosYDirectorios {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\unai\\Desktop\\pruebas-java");

        String[] resultado = file.list();

        for(String s : resultado) {
            System.out.println(s);
        }
    }
}