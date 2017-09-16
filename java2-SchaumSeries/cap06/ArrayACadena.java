/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.11
 *
 * Escriba un método que reciba como parámetro un array de cadenas y devuelva
 * la cadena resultante de concatenar las contenidas en el array.
 */
 
 public class ArrayACadena {
   
   public static String arrayACadena(String[] arrStr) {
     if (arrStr == null) {
       throw new IllegalArgumentException("Argumento no válido!!");
     }
     String concatenado = "";
     for (String s : arrStr) {
       if (s != null) {
         concatenado += s;
       }
     }
     return concatenado;
   }
   
   // MAIN y prueba del programa
   public static void main(String[] args) {
     String[] arrCadPrueba = {"Edificio", "Yo", "Cifra", "Parque", "Risa"};
     
     System.out.println(arrayACadena(arrCadPrueba));
   }
 }