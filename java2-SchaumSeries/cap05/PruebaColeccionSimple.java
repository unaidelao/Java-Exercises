/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.21
 *
 * Escriba una aplicación en la que se implementen dos métodos:
 *
 * a) rellenar(): recibe por parámetro un objeto de tipo ColeccionSimple y
 *    añade los números del uno al diez.
 *
 * b) imprimirYVaciar(): recibe por parámetro un objeto de tipo ColeccionSimple
 *    y va extrayendo e imprimiendo los datos de la colección hasta que se
 *    quede vacía.
 *
 * c) En la aplicación principal:
 *      1. Crear un objeto de tipo Pila, llamar a los métodos rellenar() e
 *         imprimirYVaciar() pasando este objeto por parámetro.
 *      2. Crear un objeto de tipo Cola, llamar a los métodos rellenar() e
 *         imprimirYVaciar() pasando este objeto por parámetro.
 *      3. Por último, añadir a la pila varios objetos de distinto tipo. Llamar
 *         a imprimirYVaciar() pasando este objeto por parámetro.
 */

 public class PruebaColeccionSimple {

   public static void rellenar(ColeccionSimple c) {
     for (int i = 1; i <= 10; i++) {
       // Java se encarga de convertir de int a Integer.
       c.anadir(i);
     }
   }

   public static void imprimirYVaciar(ColeccionSimple c) {
     while (!c.estaVacia()) {
       // se llama automáticamente al método toString() del objeto que devuelve
       System.out.println(c.extraer());
     }
   }

   public static void main(String[] args) {
     Pila p = new Pila();
     // p se convierte a ColeccionSimple automáticamente
     rellenar(p);
     System.out.println("Datos de la pila");
     imprimirYVaciar(p);

     // c se convierte a ColeccionSimple automáticamente
     Cola c = new Cola();
     rellenar(c);
     System.out.println("Datos de la cola");
     imprimirYVaciar(c);

     // al añadir objetos de distinto tipo se convierten de forma apropiada
     p.anadir("Primero");
     p.anadir(new Boolean(true));
     p.anadir(7.5);
     p.anadir(c);
     System.out.println("Datos de la pila con objetos de distinto tipo");
     imprimirYVaciar(p);
   }
 }
