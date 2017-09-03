/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.7
 *
 * Escriba una clase PoligonoColoreado que herede de la clase Poligono del
 * ejercicio 5.5. En esta clase se debe añadir un atributo color y métodos para
 * cambiar y obtener el color. El método toString() se tiene que modificar para
 * que devuelva el color del polígono además de los vértices que lo componen.
 */

 /*
  * Más adelante en el programa, el método toString() de la clase Color del
  * paquete java.awt, al escribirlo, devuelve: java.awt.Color[r=0,g=0,b=0]. Es
  * preferible usar esta clase por si en un futuro se representa gráficamente.
  */
 import java.awt.Color;

 public class PoligonoColoreado extends Poligono {
   private Color color;

   // constructor
   public PoligonoColoreado(Punto[] vertices, Color color) {
     // llamada al constructor de la superclase
     super(vertices);
     this.color = color;
   }

   // setter para el color
   public void setColor(Color color) {
     this.color = color;
   }

   // getter para el color
   public Color getColor() {
     return color;
   }

   /*
    * Sobreescritura del método toString(). Éste método añade la información
    * del color y llama al método toString() de la superclase.
    */
   return "Poligono con color " + color + "\n" + super.toString();
 }
