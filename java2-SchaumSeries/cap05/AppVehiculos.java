/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.19
 *
 * Utilizando las clases del ejercicio 5.18, implemente una aplicación que:
 *
 * a) Declare y cree un array de 4 vehículos.
 * b) Cree 2 camiones y 2 coches (de la clase Coche2) y los añada al array.
 * c) Suponiendo que no se sabe en qué celdas están los coches y en cuáles los
 *    camiones:
 *      1. Ponga un remolque de 5000 kg a los camiones del array.
 *      2. Acelere todos los vehículos.
 *      3. Escriba por pantalla la información de todos los vehículos.
 *
 * PLANTEAMIENTO: Para poder almacenar en un array de objetos de tipo Coche2 y
 * Camion, hay que declarar el array de tipo Vehiculo, ya que Coche2 y Camion
 * heredan de ella. Y por las propiedades de la herencia, algo declarado del
 * tipo de la superclase puede referenciar a un objeto creado como instancia de
 * una subclase.
 *
 * Suponiendo que no se conoce la posición de los camiones y los coches (como
 * pide el ejercicio) se debe recorrer el array preguntando a cada objeto si es
 * de tipo Camion. Para los objetos que sean camiones hay que hacer una
 * conversión a la subclase Camion para poder llamar al método ponRemolque(),
 * ya que este método no pertenece a la clase Vehiculo.
 *
 * Para acelerarlos a todos se llama al método acelerar() que está implementado
 * en la clase Vehiculo, es heredado por Coche2 y sobreescrito por Camion.
 * Cuando se llama a acelerar() con una referencia a Camion, se ejecuta el
 * método acelerar() de Camion por ligadura dinámica. Hay que capturar las
 * excepciones que se puedan lanzar con una sentencia try-catch.
 *
 * Para escribir la información por pantalla se llama al método toString().
 * Otra vez es la ligadura dinámica la que se encarga de llamar al método
 * toString() implementado en Camion cuando se esté referenciando a un Camion y
 * al método toString() implementado en Vehiculo cuando se referencie a un
 * Coche2. Este método hereda, ya que no se ha sobreescrito en Coche2.
 */

 public class AppVehiculos {
   public static void main(String[] args) {
     // se crea un array de tipo Vehiculo con tamaño para cuatro en total
     Vehiculo[] vehiculos = new Vehiculo[4];
     // se añaden dos coches2 y dos camiones
     vehiculos[0] = new Coche2("1020COC",4);
     vehiculos[1] = new Camion("9010CAM");
     vehiculos[2] = new Coche2("1122COC",5);
     vehiculos[3] = new Camion("1020CAM");

     // se procede a poner remolque de 5000 kg a cada camión
     for (Vehiculo v : vehiculos) {
       // se comprueba que sea de tipo Camion
       if (v instanceof Camion) {
         // se convierte a Camion para poder llamar a ponRemolque()
         ((Camion)v).ponRemolque(new Remolque(5000));
       }
     }

     /*
      * Se procede a acelerar todos los vehículos.
      *
      * El try-catch va dentro del for, si estuviese al revés, cuando se
      * lanzase una excepción, no se seguirían acelerando el resto de vehículos
      */
     for (Vehiculo v : vehiculos) {
       try {
         v.acelerar(80);
       }
       catch(DemasiadoRapidoException e) {
         System.out.println("Error: algun vehiculo se ha acelerado de mas");
       }
     }

     // se imprime la información de todos los vehículos
     for (Vehiculo v : vehiculos) {
       // se llama automáticamente al método toString()
       System.out.println(v);
     }
   }
 }
