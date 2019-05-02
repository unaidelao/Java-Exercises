import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.41
 * 
 * Se pide escribir una clase, de nombre PruebaFlujos2 donde se defina un método estático de
 * nombre almacenarColPuntosEnArchivo que reciba una colección de objetos de la clase Punto.
 * 
 * El método también recibirá por parámetro el nombre de un archivo para volcar sobre él la
 * información de los objetos "Punto" contenidos en la colección.
 * 
 * El método no capturará ninguna excepción.
 */
public class PruebaFlujos2 {

    public PruebaFlujos2() {

    }

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
}