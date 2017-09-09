/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.15 parte 1 de 3.
 *
 * a) Escriba una clase Coche de la que van a heredar CocheCambioManual y
 *    CocheCambioAutomatico. Los atributos de los coches son la matrícuoa, la
 *    velocidad y la marcha. Para este ejercicio no se permite la marcha atrás,
 *    por tanto no se permiten ni velocidad negativa, ni marcha negativa. En el
 *    constructor se recibe el valor de la matrícula por parámetro y se
 *    inicializa el valor de la velocidad y la marcha a 0.
 *
 *    Además, tendrá los siguientes métodos:
 *      ·getMatricula(): devuelve el valor de la matrícula.
 *      ·getMarcha(): devuelve el valor de la marcha.
 *      ·getVelocidad(): devuelve el valor de la velocidad.
 *      ·acelerar(): recibe por parámetro un valor al acelerar el coche.
 *      ·frenar(): recibe por parámetro un valor al frenar el coche.
 *      ·toString(): devuelve en forma de String la información del coche.
 *      ·cambiaMarcha(): recibe por parámetro la marcha a la que se tiene que
 *       cambiar el coche. Este método es protected, para que puedan acceder a
 *       él las clases que heredan de Coche, pero no las clases de otros
 *       paquetes.
 *
 * b) La clase CocheCambioManual sobreescribe el método cambiaMarcha() y lo
 *    hace público, para que pueda ser llamado desde cualquier clase. No
 *    permite que se cambie a una marcha negativa.
 *
 * c) La clase CocheCambioAutomatico sobreescribe los métodos acelerar() y
 *    frenar() para que cambie automáticamente de marcha conforme se va
 *    acelerando y frenando.
 *
 * PLANTEAMIENTO
 * a) La clase Coche tiene tres atributos: matrícula de tipo String, velocidad
 *    de tipo double y marcha de tipo int. Los tres se declaran con modificador
 *    de acceso privado para que no se pueda acceder desde otras clases. El
 *    método cambiaMarcha() se declara protected porque se necesita acceder a
 *    él desde las subclases, pero no es un método que vayan a tener todos los
 *    tipos de coche.
 *
 *    El resto de los métodos y el constructor se declaran públicos, ya que son
 *    métodos a los que se puede acceder desde cualquier clase.
 *
 *    En el método acelerar() si se recibe un parámetro negativo, se llama a
 *    frenar() con el parámetro negativo. Si es positivo se añade a la
 *    velocidad el valor recibido por parámetro.
 *
 *    En el método frenar() si se recibe un parámetro negativo se llama a
 *    acelerar() con el parámetro en negativo. Si es positivo, si es positivo
 *    se sustrae a la velocidad el valor recibido por parámetro. Si se queda
 *    con una cantidad negativa, se le da el valor de 0.
 *
 * b) La clase CocheCambioManual recibe en el constructor la matrícula que pasa
 *    al constructor de la superclase. Sobreescribe el método accesible el
 *    método cambiaMarcha() y le da acceso público ya que, para un coche con
 *    cambio manual, debe ser un método accesible desde cualquier clase. En el
 *    caso de que reciba por parámetro una cantidad negativa, lanza una
 *    excepción IllegalArgumentException. Si no es así, para cambiar a otra
 *    marcha, llama al método cambiaMarcha() de la superclase, ya que al tener
 *    el atributo marcha el modificador de acceso privado, no se puede acceder
 *    al atributo directamente.
 *
 *    Este cambio de visibilidad se permite porque el método se está haciendo
 *    más accesible, nunca se permitiría que se hiciera menos accesible.
 *
 * c) La clase CocheCambioAutomatico recibe en el constructor la matrícula que
 *    pasa al constructor de la superclase.
 *
 *    Sobreescribe los métodos acelerar() y frenar(), según se va acelerando o
 *    frenando se cambia la marcha. Lo primero que se hace es llamar al método
 *    sobreescrito, después se obtiene la velocidad llamando al método
 *    getVelocidad() heredado, ya que el atributo tiene modificador de acceso
 *    privado. Dependiendo de cuál sea la velocidad, se cambia la marcha. Para
 *    ello se utiliza el método cambiaMarcha() que es protected, y por tanto,
 *    puede ser accedido desde la subclase. Al atributo no se podría acceder
 *    directamente porque es privado.
 */

 public class Coche {
   // variables de la clase
   private String matricula;
   private double velocidad;
   private int marcha;

   // constructor
   public Coche(String matricula) {
     this.matricula = matricula;
     velocidad = 0;
     marcha = 0;
   }

   // getters
   public String getMatricula() {
     return matricula;
   }

   public double getVelocidad() {
     return velocidad;
   }

   public int getMarcha() {
     return marcha;
   }

   // acelerar()
   public void acelerar(int vel) {
     if (vel < 0) {
       frenar(-vel);
     }
     else {
       velocidad += vel;
     }
   }

   // frenar()
   public void frenar(int vel) {
     if (vel < 0) {
       acelerar(-vel);
     }
     else {
       velocidad -= vel;
       if (velocidad < 0) {
         velocidad = 0;
       }
     }
   }

   // cambiaMarcha()
   protected void cambiaMarcha(int marcha) {
     this.marcha = marcha;
   }

   // toString()
   public String toString() {
     return "Matricula: " + matricula + "\nVelocidad: " + velocidad + "\nMarcha: " + marcha;
   }
 }
