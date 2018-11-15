import java.io.*;

public class CrearEliminarArchivo {
	public static void main(String args[]) {
		System.out.println("Comienza el programa...\n");
		try {
			File f = crearArchivo();
			comprobaciones(f);
			
			eliminarArchivo(f);
			comprobaciones(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static File crearArchivo() throws FileNotFoundException, IOException {
		System.out.println("=== Se crea el fichero ===");
		File fichero = new File ("test.txt");
		fichero.createNewFile();
		return fichero;
	}
	
	public static void eliminarArchivo(File fichero) {
		System.out.println("\n=== Se elimina el fichero ===");
		fichero.delete();
	}
	
	public static void comprobaciones(File fichero) {
		System.out.println("Nombre del fichero: " + fichero.getName());
		System.out.println("Ruta absoluta del fichero: " + fichero.getAbsolutePath());
		System.out.println("Existencia del fichero: " + fichero.exists());
	}
}