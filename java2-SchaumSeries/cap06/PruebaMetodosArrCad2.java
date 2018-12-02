import java.util.ArrayList;
import java.util.Arrays;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.40
 *
 * Añada a la clase PruebaMetodosArrCad2 los tres métodos anteriores como métodos estáticos e
 * incluya en el método main() de la clase las sentencias necesarias para comprobar su correcto
 * funcionamiento.
 */
public class PruebaMetodosArrCad2 {

    public static int[] obtenerLongCadenas(String[] arrayStr) {
        if (arrayStr == null) {
            throw new IllegalArgumentException("Argumento no válido!!");
        }
        int[] resultado = new int[arrayStr.length];
   
        for (int i = 0; i < arrayStr.length; i++) {
             resultado[i] = arrayStr[i].length();
        }
        return resultado;
    }
    
    public static String[] obtenerArrCad5VocalesAL(String[] arrayStr) {
        if (arrayStr == null) {
            throw new IllegalArgumentException("Parametro pasado no valido!!");
        }
        // Se construye el objeto ArrayList para objetos String.
        ArrayList<String> arrListCad5Vocales = new ArrayList<String>();
   
        for (String str : arrayStr) {
            if (str != null) {
                String tempStr = new String(str.toUpperCase());
                if (tempStr.indexOf('A') != -1 &&
                    tempStr.indexOf('E') != -1 &&
                    tempStr.indexOf('I') != -1 &&
                    tempStr.indexOf('O') != -1 &&
                    tempStr.indexOf('U') != -1) {
                        arrListCad5Vocales.add(str);
                }
            }
        }
        if (arrListCad5Vocales.size() != 0) {
            /*
             * Mediante este método se obtiene el contenido de la lista en forma de
             * array. Hay que pasar un array con capacidad suficiente para almacenar
             * los elementos de la lista.
             */
            return ((String[])arrListCad5Vocales.toArray(new String[arrListCad5Vocales.size()]));
        }
        else {
            return null;
        }
    }

    public static String[] obtenerArrCad5Vocales(String[] arrStr) {
        if (arrStr == null) {
            throw new IllegalArgumentException("Parámetro pasado a función no válido");
        }
   
        String[] arrayAux = new String[arrStr.length];
        int totalCadenas5Vocales = 0;
        int contador = 0;
   
        for (String s : arrStr) {
            if (s != null) {
                /*
                * Se utiliza este string auxiliar para no tener que llamar al método
                * toUpperCase() para la comprobación de cada vocal.
                */
                String strAux = s.toUpperCase();

                // indexOf() devuelve -1 si no se encuentra el carácter.
                if (strAux.indexOf('A') != -1 &&
                    strAux.indexOf('E') != -1 &&
                    strAux.indexOf('I') != -1 &&
                    strAux.indexOf('O') != -1 &&
                    strAux.indexOf('U') != -1) {
                        arrayAux[contador++] = s;
                        totalCadenas5Vocales++;
                }
            }
        }
   
        if (totalCadenas5Vocales != 0) {
            /*
             * Se crea un nuevo array para que el array devuelto tenga el mismo
             * tamaño que el número de cadenas con las 5 vocales.
             */
            String[] arrayStr5Vocales = new String[totalCadenas5Vocales];
            
            for (int i = 0; i < totalCadenas5Vocales; i++) {
                arrayStr5Vocales[i] = arrayAux[i];
            }
            return arrayStr5Vocales;
        }
        else {
            return null;
        }
    }

    // MAIN y prueba del programa
    public static void main(String[] args) {
        String[] arc2 = {null,
                         new String("aEiou"),
                         new String("ccc"),
                         new String("pUmilotAAAe")};
        
        String[] c5v = PruebaMetodosArrCad2.obtenerArrCad5Vocales(arc2);
        System.out.println("Cadenas con 5 vocales: " + Arrays.toString(c5v));
    }   

}