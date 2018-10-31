import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroBinarioAleatorio {

    private static int numeroRegistro;

    public static void main(String[] args) throws IOException {
        File fichero = new File("prueba.dat");

        RandomAccessFile file = new RandomAccessFile(fichero, "rw");

        // arrays con datos
        String[] apellidos = {"GARCIA", "PEREZ", "GIL", "LOPEZ", "FRAILE", "REY", "SUAREZ"};
        int[] departamentos = {10, 20, 30, 10, 20, 40, 30};
        double[] salarios = {950.40, 1060.70, 1530.00, 870.80, 1030.45, 2250.50, 1600.65};

        // se instancia la clase StringBuffer para trabajar con cadenas de texto
        StringBuffer buffer = null; // buffer para almacenar el apellido
        int n = apellidos.length; // total de elementos de los arrays

        for (int i = 0; i < n; i++) {
            file.writeInt(i + 1); // uso i+1 para identificar al la persona
            buffer = new StringBuffer(apellidos[i]);
            buffer.setLength(10); // 10 caracteres para el apellido. IMPORTANTE: todas las cadenas deben tener el mismo tamaño
            file.writeChars(buffer.toString()); // insertar apellido
            file.writeInt(departamentos[i]); // insertar departamento
            file.writeDouble(salarios[i]); // insertar salario
        }

        // se obtiene número de registros del archivo prueba.dat
        numeroRegistro = (int) Math.ceil((double) file.length() / (double) 36);
        // sólo a modo de información, imprimo por pantalla el número total de registros del archivo .dat
        System.out.println("Número total de registros en archivo: " + numeroRegistro);
        file.close();
    }
}