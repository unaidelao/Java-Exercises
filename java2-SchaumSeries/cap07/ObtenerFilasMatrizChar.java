import java.util.Arrays;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.15
 * 
 * Escriba un método que reciba por parámetro una matriz de caracteres.
 * 
 * El método devolverá un array con las cadenas de caracteres correspondientes a los elementos
 * situados a lo largo de la segunda dimensión (filas) de la matriz.
 */
public class ObtenerFilasMatrizChar {

    public static void main(String[] args) {
        char[][] datos = {{'a','b','c','d'}, {'w','x','y','z'}, {'U','N','A','I'}};
        System.out.println(Arrays.deepToString(obtenerFilas(datos)));
    }

    /* Método pedido */
    public static String[] obtenerFilas(char[][] arr) {
        String[] resultado = new String[arr.length];

        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j];
            }
            resultado[i] = temp;
            temp = "";
        }

        return resultado;
    }
}