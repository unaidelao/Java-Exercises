import java.io.*;

public class PruebaArchivos {
	public static void main(String[] args) {
		// Parte de escritura
		String nombreArchivo = "prueba.txt";
		FileWriter escribir;
		
		try {
			escribir = new FileWriter(nombreArchivo);
			for (char c = 'a'; c <= 'z'; c++) {
				escribir.write(c);
			}
			escribir.close();
		} catch (IOException e) {
			System.out.println("Imposible abrir el archivo para escribir.");
		}
		
		// Parte de lectura
		FileReader leer;
		int c;
		
		try {
			leer = new FileReader(nombreArchivo);
			c = leer.read();
			while (c != -1) {
				System.out.print((char) c);
				c = leer.read();
			}
			leer.close();
		} catch (IOException e) {
			System.out.println("Imposible abrir el archivo para leer.");
		}
	}
}