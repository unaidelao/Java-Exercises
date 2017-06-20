/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.14
 *
 * Escriba un método que dado un objeto de la clase String cuente diferentes
 * tipos de caracteres. El método imprimirá el número de letras, dígitos y
 * espacios en blanco de la cadena. Haga un programa que escriba el conteo de
 * la cadena "Hola, vivo en Marquina 123, 5-7".
 *
 * Consejo: el envoltorio (wrapper) Character tiene funciones que trabajan
 * sobre caracteres. Se usarán los métodos isLetter(), isDigit() e
 * isWhitespace() para comprobar el tipo de un carácter. Para examinar cada
 * carácter del String, se recorre con un bucle for. Pero el bucle for espera
 * una secuencia de un tipo base. Con el método toCharArray() de la clase
 * String, se puede obtener un array de caracteres a partir de un String.
 *
 * @author Unai de la O
 */
 
 class ContarLetras {
   /*
    * Método para contar las letras, dígitos y espacios de un String.
    * Requiere que se le pase como argumento un String dado.
    */
    static void conteo(String s) {
      // Variables que servirán de acumuladores para el conteo.
      int totalLetras = 0;
      int totalDigitos = 0;
      int totalEspacios = 0;
      
      /*
       * Enhanced for loop, utilizando el método toCharArray() para convertir
       * el String en un array de caracteres y así poder ejecutar el bucle.
       *
       * Se utilizan métodos propios del wrapper Character con los que, dado el
       * caso, se incrementará el acumulador preciso para el conteo.
       */
       for (char c : s.toCharArray()) {
         if (Character.isLetter(c)) {
           totalLetras++;
         }
         else if (Character.isDigit(c)) {
           totalDigitos++;
         }
         else if (Character.isWhitespace(c)) {
           totalEspacios++;
         }
       }
       
       // Una vez concluido el bucle, se imprimen los resultados.
       System.out.println("Total de letras: " + totalLetras);
       System.out.println("Total de digitos: " + totalDigitos);
       System.out.println("Total de espacios: " + totalEspacios);
    }
    
    // MAIN
    public static void main(String[] args) {
      conteo("Hola, vivo en Marquina 123, 5-7");
    }
 }