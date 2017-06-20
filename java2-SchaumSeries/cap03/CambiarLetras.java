/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.15
 *
 * Escriba un método que, dado un String, devuelve otro objeto String en el que
 * se cambian todas las vocales minúsculas del original por la letra 'a'.
 *
 * @author Unai de la O
 */
 
 class CambiarLetras {
   static String texto = "Texto para probar cadena.";
   
   // Método que sustituye las vocales por la 'a'
   static String sustituirVocal(String texto) {
     texto = texto.replace('e', 'a');
     texto = texto.replace('i', 'a');
     texto = texto.replace('o', 'a');
     texto = texto.replace('u', 'a');
     
     return texto;
   }
   
   // MAIN y prueba del método creado
   public static void main(String[] args) {
     System.out.println("Texto original");
     System.out.println("--------------");
     System.out.println(texto);
     System.out.println();
     
     System.out.println("Texto usando metodo sustituirVocal()");
     System.out.println("------------------------------------");
     System.out.println(sustituirVocal(texto));
   }
 }