import java.util.ArrayList;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.41
 *
 * Escriba un método, de nombre obtenerArrListSinCadenasRepetidas, que reciba por parámetro un
 * objeto ArrayList<String> con cadenas de caracteres y elimine de él las sucesivas repeticiones
 * de cada cadena.
 */
public class ObtenerArrListSinCadenasRepetidas {
    public static void obtenerArrListSinCadenasRepetidas(ArrayList<String> arrList) {
        // Se lanza excepción en caso de recibir un ArrayList nulo.
        if (arrList == null) {
            throw new IllegalArgumentException("ArrayList nulo. Esto no se permite.");
        }

        for (int i = 0; i < arrList.size(); i++) {
            // Si el índice de la última ocurrencia para el string es distinto que la propia de
            // su posición actual, es que el string está repetido y, por tanto, se elimina.
            if (arrList.lastIndexOf(arrList.get(i)) != i) {
                arrList.remove(i);
            }
        }
    }

    // MAIN y prueba del programa
    public static void main(String[] args) {
        ArrayList<String> arrListPrueba = new ArrayList<>();
        arrListPrueba.add("Pedro");
        arrListPrueba.add("Juan");
        arrListPrueba.add("Felipe");
        arrListPrueba.add("Arturo");
        arrListPrueba.add("Juan");
        arrListPrueba.add("Felipe");
        arrListPrueba.add("Javier");

        // Se imprime arrListPrueba original.
        System.out.println(arrListPrueba);

        obtenerArrListSinCadenasRepetidas(arrListPrueba);

        // Se imprime arrListPrueba tras ejecutar el método pedido en el ejercicio.
        System.out.println(arrListPrueba);
    }
}