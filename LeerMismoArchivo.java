// Programa que lee el contenido del presente archivo .java
import java.io.*;

public class LeerMismoArchivo {
    public static void main(String[] args) {
        String archivo = "LeerMismoArchivo.java";
        
        FileReader fileReader;
        BufferedReader buffer;
        String str;
        
        try {
            fileReader = new FileReader(archivo);
            buffer = new BufferedReader(fileReader);
            str = buffer.readLine();
            
            while (str != null) {
                System.out.println(str);
                str = buffer.readLine();
            }
            buffer.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Imposible abrir el archivo para leer.");
        }
    }
}