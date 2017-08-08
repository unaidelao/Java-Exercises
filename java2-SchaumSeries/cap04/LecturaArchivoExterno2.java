/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.35
 *
 * Escriba un programa que lea el primer carácter almacenado en un archivo de
 * nombre "C:/misArchivos/archivo1" y "/archivo2".
 *
 * Planteamiento: El método utiliza dos bloques try{} catch{} para crear un
 * flujo de lectura y obtener el primer carácter de cada uno de los archivos.
 * En los dos bloques catch{} sólo se captura la correspondiente excepción que
 * se lanzaría si alguno de los dos archivos no estuviera disponible para su
 * lectura. Ninguno de los dos bloques catch{} captura la excepción que podría
 * derivarse de la operación de lectura sobre los archivos, cuyo tratamiento se
 * deja a un bloque catch{} más externo. De esta forma se consigue tratar de
 * una forma individual el posible error en el momento de creación de un flujo
 * de escritura sobre cada archivo y de forma conjunta la ocurrencia de un
 * error de lectura.
 */

 import java.io.FileReader;
 import java.io.FileNotFoundException;
 import java.io.IOException;

 public class LecturaArchivoExterno2 {
   public static void main(String[] args) {
     FileReader lectura = null;
     try {
       try {
         lectura = new FileReader("C:/misArchivos/archivo1.txt");
         char c = (char)lectura.read();
         System.out.println("Primer caracter archivo1: " + c);
       }
       catch(FileNotFoundException fnfE) {
         System.out.println("El archivo1.txt no se pudo abrir para su lectura");
       }
       finally {
         try {
           lectura.close();
         }
         catch(IOException ioE) {}
       }
       try {
         lectura = new FileReader("C:/misArchivos/archivo2.txt");
         // primer carácter de la lectura del archivo1
         char c = (char)lectura.read();
         System.out.println("Primer caracter archivo1: " + c);
       }
       catch(FileNotFoundException fnfE) {
         System.out.println("El archivo1.txt no se pudo abrir para su lectura");
       }
       finally {
         try {
           lectura.close();
         }
         catch(IOException ioE) {}
       }
     // captura de las excepciones de tipo IOException
   } catch(IOException ioE) {
        System.out.println("Error de lectura en alguno de los dos archivos");
     }
  }
}
