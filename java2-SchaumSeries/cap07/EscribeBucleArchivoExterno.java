import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.9
 * 
 * Programa que escribe los 100 primeros números naturales en un archivo externo.
 */

public class EscribeBucleArchivoExterno {

    public static void main(String[] args) {
        File fichero;
        FileWriter escritura; 

        try {
            fichero = new File("C:\\Users\\pruebas-java\\bucleNumeros.txt");
            escritura = new FileWriter(fichero);

            for (int i = 1; i <= 100; i++) {
                escritura.write(String.valueOf(i) + " ");
            }
    
            escritura.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}