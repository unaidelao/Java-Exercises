import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.2
 *
 * Escriba un programa que cree un array de bytes con los dígitos del 0 al 9 y, a continuación,
 * defina sobre él un flujo de entrada para leer sus valores. La lectura se realizará de forma que
 * después de leer un valor del flujo, se descartará la lectura del siguiente.
 */
public class LeerValoresParesArrayBytes {
    public static void main(String[] args) throws IOException {
        // Se crea el array de bytes pedido.
        byte[] arrayBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Instanciación de la clase ByteArrayInputStream para poder leer el anterior.
        ByteArrayInputStream flujoLectura = new ByteArrayInputStream(arrayBytes);

        // El método available() de la clase ByteArrayInputStream retorna el número de bytes que
        // quedan por leer en el flujo de lectura.
        while (flujoLectura.available() != 0) {
            byte b = (byte) flujoLectura.read();
            System.out.println(b);
            // Nos saltamos el byte siguiente.
            flujoLectura.skip(1);
        }
        flujoLectura.close();
    }
}