/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.34
 *
 * Escriba un programa que lea el primer carácter almacenado en un archivo de
 * nombre "C:/misArchivos/alfabeto.txt" y, a continuación, lo muestre por
 * pantalla.
 *
 * Planteamiento: El programa trata de abrir un flujo de lectura sobre el
 * fichero solicitado. A continuación, el programa utiliza el método read()
 * para obtener el primer carácter del citado archivo.
 *
 * El intento de apertura de un flujo de lectura sobre un archivo puede generar
 * una excepción de la clase FileNotFoundException si el fichero no existe o no
 * tiene permiso de lectura. Por su parte, la lectura del primer carácter puede
 * ocasionar una excepción de la clase IOException si ocurre algún error de
 * lectura sobre el flujo.
 *
 * Para notificar convenientemente uno y otro error, se capturan y procesan las
 * excepciones por separado.
 */

 import java.io.FileReader;
 import java.io.FileNotFoundException;
 import java.io.IOException;

 public class LecturaArchivoExterno {
   public static void main(String[] args) {
     FileReader lectura = null;
     try {
       lectura = new FileReader("C:/misArchivos/alfabeto.txt");
       // primer carácter de la lectura del archivo externo
       char c = (char)lectura.read();
       System.out.println("Primer caracter: " + c);
     }
     // captura las excepciones de tipo FileNotFoundException
     catch(FileNotFoundException fnfE) {
       System.out.println("El archivo no se pudo abrir para su lectura");
     }
     // captura las excepciones de tipo IOException
     catch(IOException ioE) {
       System.out.println("Error de lectura");
     }
     finally {
       try {
         lectura.close();
       }
       // se supone que no se lanza. Si se lanza, se ignora
       catch(IOException ioE) {}
     }
   }
 }

 /*
  * Comentario: Dado que la clase FileNotFoundException deriva de IOException,
  * su manejador debe ser incluido antes. Cuando se genera una excepción se
  * recorren todos los bloques catch{} hasta que alguno de ellos pueda procesar
  * la excepción.
  *
  * Un bloque catch{} actuará como manejador de la excepción que puede capturar
  * y también de todas sus excepciones derivadas. Por eso, si se escribiera
  * primero el bloque catch{} de IOException se procedería también a tratar en
  * él la excepción de tipo FileNotFoundException.
  *
  * Por último, el bloque finally{} siempre se ejecuta por lo que, ocurra lo
  * que ocurra, se cerrará el archivo.
  */
