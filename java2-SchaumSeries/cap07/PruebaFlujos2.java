import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * === Ejercicio 7.41 ===
 * 
 * Se pide escribir una clase, de nombre PruebaFlujos2 donde se defina un método estático de
 * nombre almacenarColPuntosEnArchivo que reciba una colección de objetos de la clase Punto.
 * 
 * El método también recibirá por parámetro el nombre de un archivo para volcar sobre él la
 * información de los objetos "Punto" contenidos en la colección.
 * 
 * El método no capturará ninguna excepción.
 * 
 * === Ejercicio 7.42 ===
 * 
 * Añada a la clase anterior un método estático, de nombre obtenerArrayListDeArchivo, que reciba
 * por parámetro el nombre de un archivo con los datos correspondientes a varios objetos de la
 * clase Punto.
 * 
 * El método construirá y devolverá un objeto ArrayList<Punto> con los datos de los puntos leídos
 * del archivo especificado.
 * 
 * El método no capturará ninguna excepción.
 * 
 * === Ejercicio 7.43 ===
 * Añada a la clase anterior un método main() para comprobar el funcionamiento de los métodos
 * estáticos de los dos ejercicios anteriores.
 * 
 * Se crearán varios objetos Punto que se almacenarán en un array. A partir del array se obtendrá
 * una colección para guardar sus elementos en un archivo.
 * 
 * Para finalizar, se obtendrá un objeto ArrayList<Punto> con los objetos Punto creados a partir
 * de los datos almacenados en el archivo.
 * 
 * === Ejercicio 7.44 ===
 * Escriba un método, de nombre almacenarColPuntosComoObjetos, que reciba por parámetro una
 * colección de objetos Punto y el nombre del archivo donde se almacenarán.
 * 
 * El método escribirá directamente cada objeto Punto al archivo.
 * 
 * === Ejercicio 7.45 ===
 * Escriba un método, de nombre obtenerArrayListDeArchivoComoObjeto, que reciba por parámetro el
 * nombre de un archivo donde se encuentran almacenados varios objetos de la clase Punto.
 * 
 * El método leerá los objetos del archivo y los almacenará en un ArrayList que será devuelto.
 * 
 * === Ejercicio 7.46 ===
 * Escriba un método, de nombre escribirArrayListEnArchivo, que reciba por parámetro un objeto
 * ArrayList de objetos Punto, así como el nombre del archivo donde se almacenará.
 * 
 * El método almacenará directamente el objeto ArrayList sobre el archivo recibido.
 * 
 * No se capturará ninguna excepción que pueda producirse.
 * 
 * === Ejercicio 7.47 ===
 * Escriba un método, de  nombre leerArrayListDeArchivo, que reciba por parámetro el nombre de
 * un archivo en el que se ha escrito previamente un objeto ArrayList que almacenaba objetos de
 * la clase Punto.
 * 
 * El método leerá el objeto ArrayList del archivo y lo devolverá.
 * 
 * No se capturará ninguna excepción que pueda producirse.
 */
public class PruebaFlujos2 {
    // Parte correspondiente al ejercicio 7.43.
    public static void main(String[] args) {
        Punto[] arrayPuntos = {new Punto(0,1,"Rojo"), new Punto(1,1,"Verde"), new Punto(1,0,"Azul")};

        String rutaFichero = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la ruta del fichero a crear: ");
        rutaFichero = sc.nextLine();
        sc.close();

        try {
            almacenarColPuntosEnArchivo((Arrays.asList(arrayPuntos)), rutaFichero);
        } catch (IOException e) {
            System.out.println("Capturada IOException: " + e.getMessage());
        }
    }
    /*
    // Parte correspondiente al ejercicio 7.41.
    public static void almacenarColPuntosEnArchivo(Collection<Punto> puntos, String ruta) throws IOException {
        PrintWriter fichero = new PrintWriter(new BufferedWriter(new FileWriter(ruta)));

        Iterator<Punto> iterPuntos = puntos.iterator();

        while(iterPuntos.hasNext()) {
            Punto temp = iterPuntos.next();
            fichero.println(temp.obtenerCoordX());
            fichero.println(temp.obtenerCoordY());
            fichero.println(temp.obtenerColor());
        }
        fichero.close();
    } */

    // Parte correspondiente al ejercicio 7.44.
    public static void almacenarColPuntosEnArchivo(Collection<Punto> puntos, String ruta) throws IOException {
        FileOutputStream fos = new FileOutputStream(ruta);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Iterator<Punto> iterPuntos = puntos.iterator();

        while (iterPuntos.hasNext()) {
            Punto temp = iterPuntos.next();
            oos.writeObject(temp);
        }
        oos.close();
        fos.close();
    }

    // Parte correspondiente al ejercicio 7.42.
    public static ArrayList<Punto> obtenerArrayListDeArchivo(String ruta) throws IOException, FileNotFoundException {
        File fichero = new File(ruta);
        Scanner sc = new Scanner(fichero);
        ArrayList<Punto> alPuntos = new ArrayList<Punto>();

        while (sc.hasNextInt()) {
            Punto temp = new Punto(sc.nextInt(), sc.nextInt(), sc.next());
            alPuntos.add(temp);
        }
        sc.close();

        return alPuntos;
    }

    // Parte correspondiente al ejercicio 7.45.
    public static ArrayList<Punto> obtenerArrayListDeArchivoComoObjeto(String ruta) throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Punto> alPuntos = new ArrayList<Punto>();

        try {
            do {
                Punto temp = (Punto) ois.readObject();
                alPuntos.add(temp);
            } while (true);
        } catch (EOFException e) {
            System.out.println("Fin de archivo alcanzado.");
        }
        
        return alPuntos;
    }

    // Parte correspondiente al ejercicio 7.46.
    public static void escribirArrayListEnArchivo(ArrayList<Punto> alPuntos, String ruta) throws IOException {
        FileOutputStream fos = new FileOutputStream(ruta);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(alPuntos);

        oos.close();
        fos.close();
    }

    // Parte correspondiente al ejercicio 7.47.
    public static ArrayList<Punto> leerArrayListDeArchivo(String ruta) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Punto> temp = (ArrayList<Punto>) (ois.readObject());

        ois.close();
        fis.close();

        return temp;
    }
}