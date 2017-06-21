/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.18
 *
 * Escriba un método que, dada una cadena de caracteres, cuente cuántas veces
 * aparece la misma en dicho texto. Por ejemplo, para la cadena "En un lugar de
 * la mancha, de cuyo nombre no quiero acordarme", si se cuenta cuántas veces
 * aparece "o", o dicho de otra forma, cuántas palabras acaban en "o", debería
 * indicar que son 3.
 *
 * Consejo: se puede utilizar el método indexOf() que devuelve la posición en
 * que empieza el texto buscado dentro del original. Para buscarlo más de una
 * vez, se usa el mismo método, donde el segundo argumento permite indicar a
 * partir de qué posición empezar a buscar.
 *
 * @author Unai de la O
 */

 class EncontrarTextoEnCadena {
   static String frase = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";

   /*
    * Método que busca texto dentro de una cadena y devuelve las veces que se
    * repite.
    *
    * Requiere un String (s) y otro String (objetivo), que será el texto a
    * encontrar.
    *
    * Se declara la variable conteo, que será el número de retorno; y la
    * variable posición, para utilizarla como segundo argumento del método
    * indexOf() y como marcador para ir encontrando el texto objetivo dentro de
    * la cadena dada.
    */
   static int conteoDeTexto(String texto, String objetivo) {
     int conteo = 0;
     int posicion = 0;

     while ((posicion = texto.indexOf(objetivo, posicion)) >= 0) {
       posicion += objetivo.length();
       conteo++;
     }
     return conteo;
   }

   // MAIN
   public static void main(String[] args) {
     System.out.println("El texto \"de\" aparece " + conteoDeTexto(frase, "de") + " veces.");
   }
 }
