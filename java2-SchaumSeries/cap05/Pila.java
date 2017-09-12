/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.20 parte 2 de 3
 *
 * Clase Pila
 *
 * Esta clase hereda de ColeccionSimple y sobreescribe el método anadir(). Para
 * esta clase, anadir() consiste en añadir por el principio de la lista.
 */

 public class Pila extends ColeccionSimple {

   /*
    * Java entiende que se llama al constructor de la superclase por defecto:
    * super().
    */
   public Pila() {

   }

   // se sobreescribe el método anadir(), que estaba sin implementar
   public void anadir(Object o) {
     getLista().addFirst(o);
   }
 }
