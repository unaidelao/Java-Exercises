import java.io.*;

public class LeerFicheroBinarioAleatorio {
    public static void main(String[] args) throws IOException {
        File fichero = new File("prueba.dat");

        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, departamento, posicion;
        double salario;

        char[] apellido = new char[10];

        char aux;

        // inicializamos la posición en 0
        posicion = 0;

        while(true) {
            file.seek(posicion); 
            id = file.readInt(); // obtendo el id de la persona
            for (int i = 0; i < apellido.length; i++) {
                aux = file.readChar(); // se irá recorriendo todos los caracteres del apellido
                apellido[i] = aux; // y añadiéndolos al array de caracteres apellido
            }
            String apellidoMontado = new String(apellido); // convierto a String el array de caracteres
            departamento = file.readInt(); // obtengo el departamento
            salario = file.readDouble(); // obtengo el salario

            System.out.println("ID: " + id + ", Apellido: " + apellidoMontado + ", Departamento: " + departamento + ", Salario: " + salario);
            posicion += 36; // actualización del valor para posicionarme en el siguiente registro. Cada persona ocupa 36 bytes: 4+20+4+8

            // si se llega al final del archivo .dat, se sale del bucle infinito
            if (file.getFilePointer() == file.length()) {
                break;
            }
        }

        // se cierra el flujo
        file.close();
    }
}