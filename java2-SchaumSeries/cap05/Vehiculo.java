/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.18 parte 1 de 5
 *
 * Se va a implementar un simulador de Vehículos. Existen dos tipos de Vehículo
 * : Coche2 (para diferenciarlo de la clase Coche del Ejercicio 5.15) y Camion.
 *
 * a) Sus características comunes son la matrícula y la velocidad. Al crearlos,
 *    la matrícula se recibe por parámetro y la velocidad se incializa a 0. El
 *    método toString() de los vehículos devuelve información acerca de la
 *    matrícula y la velocidad. Además, se pueden acelerar, pasando por
 *    parámetro la cantidad en km/h que se tiene que acelerar.
 *
 * b) Los coches2 tienen además un atributo para el número de puertas, que se
 *    recibe también por parámetro al crearlos. Tiene además un método que
 *    devuelve el número de puertas.
 *
 * c) Los camiones tienen un atributo de tipo Remolque que inicializa a null.
 *    Tiene un método ponRemolque() que recibe el Remolque por parámetro, y
 *    otro quitaRemolque(). Cuando se muestre la información de un camión que
 *    lleve remolque, además de la matrícula y velocidad del camión, debe
 *    aparecer la información del remolque.
 *
 * d) En esta clase hay que sobreescribir el método acelerar de manera que si
 *    el camión tiene remolque y la velocidad más la aceleración superan los
 *    100 km/h, se lance una excepción de tipo DemasiadoRapidoException.
 *
 * e) Hay que implementar la clase Remolque. Esta clase tiene un atributo de
 *    tipo entero que es el peso cuyo valor se le da en el momento de crear el
 *    objeto. Debe tener un método toString() que devuelva la información del
 *    remolque.
 *
 * f) Implementar la clase DemasiadoRapidoException.
 */

 /**
  * En esta clase Vehiculo (que será superclase de las clases Coche2 y Camion)
  * se declara e implementa la parte común de Coche2 y Camion, es decir:
  *   - los atributos matrícula y velocidad,
  *   - el constructor que inicializa los atributos,
  *   - el método acelerar() y
  *   - el método toString().
  *
  * Posteriormente se implementan las clases Coche2 y Camion que heredan de
  * Vehiculo.
  */

   public class Vehiculo {
     private String matricula;
     private double velocidad;

     public Vehiculo(String matricula) {
       this.matricula = matricula;
       velocidad = 0;
     }

     public double getVelocidad() {
       return velocidad;
     }

     /*
      * En este método acelerar() se indica que lanza la excepción para que
      * los métodos de la subclase la puedan lanzar.
      */
     public void acelerar(double vel) throws DemasiadoRapidoException {
       velocidad += vel;
     }

     public String toString() {
       return "El vehiculo con matricula " + matricula + " va a " + velocidad + " km/h";
     }
   }
