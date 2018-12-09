import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Programa que lee distintos tipos de datos desde el teclado.
public class LecturaTeclado {
    public static void main(String[] args) throws IOException {
        InputStreamReader conversor;
        BufferedReader teclado;
        String linea;

        conversor = new InputStreamReader(System.in);
        teclado = new BufferedReader(conversor);

        System.out.print("Teclea un byte: ");
        linea = teclado.readLine();
        byte b = Byte.parseByte(linea);
        System.out.println("Resultado de la lectura del teclado: " + b + "\n");

        System.out.print("Teclea un int: ");
        linea = teclado.readLine();
        int i = Integer.parseInt(linea);
        System.out.println("Resultado de la lectura del teclado: " + i + "\n");

        System.out.print("Teclea un double: ");
        linea = teclado.readLine();
        double d = Double.parseDouble(linea);
        System.out.println("Resultado de la lectura del teclado: " + d + "\n");

        // Vuelve a leer un entero pero, ahora, con control de excepciones.
        boolean leido;
        do {
            try {
                System.out.print("Teclea otro int: ");
                linea = teclado.readLine();
                i = Integer.parseInt(linea);
                leido = true;
            } catch (NumberFormatException e) {
                System.out.println("No has tecleado un int. Prueba otra vez.");
                leido = false;
            }
        } while (!leido);
        System.out.println("Resultado de la lectura del teclado: " + i + "\n");

        teclado.close();
        conversor.close();
    }
}