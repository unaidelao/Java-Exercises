import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.3
 *
 * Escriba un programa que combine en un único flujo de entrada, dos flujos procedentes de sendos
 * arrays con valores de tipo byte.
 * 
 * El programa creará dos arrays, dando valor a sus elementos, creará dos flujos de entrada
 * asociados a ellos y los combinará en uno solo a partir del cual se pueden leer los elementos de
 * los dos arrays para mostrarlos por pantalla.
 */
public class CombinarFlujosDeBytes {
    public static void main(String[] args) {
        // Creación de ambos arrays de bytes.
        byte[] arrayBytes1 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        byte[] arrayBytes2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        //Creación de flujos para cada array de bytes.
        ByteArrayInputStream flujo1 = new ByteArrayInputStream(arrayBytes1);
        ByteArrayInputStream flujo2 = new ByteArrayInputStream(arrayBytes2);

        // Creación de flujo que unifica los anteriores.
        SequenceInputStream flujo3 = new SequenceInputStream(flujo1, flujo2);

        // Lectura de datos.
        try{
            byte b;
            while ((b = (byte) flujo3.read()) != -1) {
                System.out.println(b);
            }
            flujo1.close();
            flujo2.close();
            flujo3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}