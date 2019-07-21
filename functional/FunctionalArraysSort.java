import java.util.Arrays;

public class FunctionalArraysSort {
    public static void main(String[] args) {
        String[] words = { "capazo", "uno", "cinco", "alumbramiento", "edificio" };

        System.out.printf("Antes de ordenar: %s%n", Arrays.toString(words));

        Arrays.sort(words);
        System.out.printf("Orden propio de Arrays.sort(): %s%n", Arrays.toString(words));

        // He aquí la implementación funcional.
        Arrays.sort(words, (first, second) -> Integer.compare(first.length(), second.length()));
        System.out.printf("Tras ordenar por LONGITUD: %s%n", Arrays.toString(words));

    }
}