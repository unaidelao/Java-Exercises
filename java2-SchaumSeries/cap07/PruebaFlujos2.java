import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
}