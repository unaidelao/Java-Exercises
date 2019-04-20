import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.32
 * 
 * Escriba un método, de nombre copiarArchivo, que reciba por parámetro dos rutas correspondientes
 * a un archivo de origen y a un archivo de destino. El método copiará el archivo origen en la
 * ubicación de destino.
 * 
 * La ruta de destino puede consistir en un directorio o en un archivo. En el primer caso, el
 * archivo se copiará en el directorio especificado, manteniendo su nombre; en el segundo, se
 * tomará como nombre del archivo copia el que especifique su ruta.
 * 
 * Además, el método recibirá un tercer parámetro que actuará de bandera en caso de que la ruta
 * destino especifique un archivo y éste exista. Si la bandera es cierta, el archivo destino será
 * reemplazado por el que le copie; en caso contrario, la operación de copia terminará.
 * 
 * El método generará una excepción DestinoProtegidoExcepcion, si la bandera de reemplazo vale
 * false y el archivo de destino ya existe.
 */
public class CopiarArchivo {
    public static void main(String[] args) {
        String origen = "";
        String destino = "";
        boolean reemplazar = false;

        Scanner sc = new Scanner(System.in);

        // Pide origen.
        System.out.print("Introduzca el ORIGEN del archivo: ");
        origen = sc.nextLine();

        // Pide el destino.
        System.out.print("Introduzca el DESTINO del archivo: ");
        destino = sc.nextLine();

        // Pregunta si se reemplaza el archivo destino.
        System.out.println("REEMPLAZAR archivo de destino? (s/n): ");
        String input = sc.next();
        sc.close();

        if (input.equals("s") || input.equals("S")) {
            reemplazar = true;
        } else if (input.equals("n") || input.equals("N")) {
            reemplazar = false;
        } else {
            System.out.println("Asignado valor \"n\" a REEMPLAZAR.");
        }

        // Copia archivo.
        try {
            copiarArchivo(origen, destino, reemplazar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /*
     * Método para copiar un archivo.
     */
    private static void copiarArchivo(String origen, String destino, boolean reemplazar) throws DestinoProtegidoExcepcion, IllegalArgumentException, FileNotFoundException, IOException {
                                                        
        if (origen == null) {
            throw new IllegalArgumentException("Error: Ruta del archivo de origen no válido!");
        }

        if (destino == null) {
            throw new IllegalArgumentException("Error: Ruta del archivo de destino no válido!");
        }

        File origenFile = new File(origen);
        File destinoFile = new File(destino);

        FileInputStream fis;
        FileOutputStream fos;

        boolean esDestinoUnArchivo = destinoFile.isFile();
        boolean esDestinoUnDirectorio = destinoFile.isDirectory();

        if (esDestinoUnDirectorio) {
            destinoFile = new File(destinoFile.getAbsolutePath() + "/" + origenFile.getName());

            if (esDestinoUnArchivo && !reemplazar) {
                throw new DestinoProtegidoExcepcion("Error: el archivo ya existe y no se quiere sobrescribir!");
            }
        }

        try {
            fis = new FileInputStream(origenFile);
            fos = new FileOutputStream(destinoFile);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Error: no se pudo abrir el archivo!");
        }

        try {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            throw new IOException("Error en la copia del archivo!");
        }
        
    }

}

/*
 * Excepción personalizada.
 */
class DestinoProtegidoExcepcion extends Exception {
    private static final long serialVersionUID = 1L;

    public DestinoProtegidoExcepcion(String mensaje) {
        super(mensaje);
    }
}