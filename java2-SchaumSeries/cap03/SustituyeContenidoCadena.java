/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.17
 *
 * (1) Escriba un método que, dada una cadena de caracteres, sustituya todas las
 * ocurrencias del texto "es" por "no por".
 *
 * (2) Escriba un segundo método que sustituya todos los grupos de dígitos por
 * un único carácter asterisco.
 *
 * Es decir, si la cadena es "esto1234es5678bueno900", el primer método debe
 * devolver "no porto1234no por5678bueno900" y el segundo debe devolver "esto
 * *es*bueno*".
 *
 * (3) Escriba el programa que permita comprobar que funciona correctamente.
 *
 * Consejo: Usar el método replaceAll(String, String), utilizando para el caso
 * de los dígitos la expresión regular \d+ (¡ojo!, para escribir expresiones
 * regulares hay que poner doble barra invertida).
 *
 * @author Unai de la O
 */
 
 class SustituyeContenidoCadena {
   // Método pedido en apartado (1)
   static String sustituyeTexto(String s) {
     return s.replaceAll("es", "no por");
   }
   
   // Método pedido en apartado (2)
   static String sustituyeDigitos(String s) {
     return s.replaceAll("\\d+", "*");
   }
   
   // MAIN y programa pedido en apartado (3)
   public static void main(String[] args) {
     String texto = "esto1234es5678bueno900";
     
     System.out.println("Texto base: " + texto);
     System.out.println("sustituyeTexto(texto): " + sustituyeTexto(texto));
     System.out.println("sustituyeDigitos(texto): " + sustituyeDigitos(texto));
   }
 }