/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.16
 *
 * Escriba una aplicación que pida por teclado la matrícula de un coche y
 * pregunte si el coche es con cambio automático o no. Posteriormente, debe
 * crear un coche con las características indicadas por el usuario y mostrarlo.
 * Acelerar el coche en 60 km/h, si es un coche con cambio manual, cambiar la
 * marcha a tercera y volverlo a mostrar.
 *
 * PLANTEAMIENTO: Para leer por teclado se utiliza la clase Scanner. Se declara
 * un objeto de tipo Coche, superclase de las otras dos que nos sirve para
 * almacenar tanto una referencia a un CocheCambioAutomatico como a un
 * CocheCambioManual. Se almacena la matrícula en una variable; la respuesta a
 * si tiene cambio automático o no, en otra. De esta última, se compara el
 * primer carácter con 's' o 'S' para permitir mayúsculas.
 *
 * Dependiendo de la respuesta del usuario se creará un objeto
 * CocheCambioAutomatico o un CocheCambioManual, cualquiera de ellos se
 * guardará en la referencia declarada de tipo Coche, realizándose así un
 * cambio de tipo a la superclase, que se realiza automáticamente.
 *
 * Para acelerar el coche, se llama al método acelerar(). En caso de que esté
 * referenciado a un CocheCambioAutomatico, por ligadura dinámica se llama al
 * método sobreescrito.
 *
 * Si se trata de un CocheCambioManual se debe llamar al método cambiaMarcha()
 * para poner la tercera. Para comprobar que realmente se trata de un
 * CocheCambioManual se utiliza el operador instanceof, éste nos dice si es
 * posible la conversión de tipo a la subclase; en caso de que así sea, todavía
 * se debe hacer esta conversión de tipo explícitamente.
 *
 * Para mostrar el coche por pantalla se utiliza el método toString(). No es
 * necesario llamar explícitamente a este método ya que Java lo llama
 * automáticamente cuando detecta que se necesita un String en lugar de un
 * objeto de otro tipo.
 */

 import java.util.Scanner;

 public class PruebaCoche {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     Coche cocheDePrueba;
     String matricula;
     String esAutomatico;

     System.out.print("Indique la matricula: ");
     matricula = in.nextLine();

     System.out.print("Tiene cambio automatico? (s/n): ");
     esAutomatico = in.nextLine();
     if (esAutomatico.charAt(0) == 's' || esAutomatico.charAt(0) == 'S') {
       cocheDePrueba = new CocheCambioAutomatico(matricula);
     }
     else {
       cocheDePrueba = new CocheCambioManual(matricula);
     }

     System.out.println(cocheDePrueba);
     System.out.println();
     cocheDePrueba.acelerar(60);
     if (cocheDePrueba instanceof CocheCambioManual) {
       // conversión de tipo a la subclase explícita
       ((CocheCambioManual)cocheDePrueba).cambiaMarcha(3);
     }

     System.out.println(cocheDePrueba);
   }
 }
