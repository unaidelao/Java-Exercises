/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.20 parte 3 de 3
 *
 * Clase Cola
 *
 * Esta clase hereda de ColeccionSimple y sobreescribe el método anadir(). Para
 * esta clase, anadir() consiste en añadir por el final de la lista.
 */

 public class Cola extends ColeccionSimple {

   /*
    * Java entiende que se llama al constructor de la superclase por defecto:
    * super().
    */
   public Cola() {

   }

   // se sobreescribe el método anadir(), que estaba sin implementar
   public void anadir(Object o) {
     getLista().addLast(o);
   }
 }
