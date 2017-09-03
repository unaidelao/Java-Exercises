/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.8
 *
 * Escriba una aplicación en la que:
 *
 *  a) Cree un PoligonoColoreado con vértices (0,0),(2,0),(2,2),(0,2) y rojo.
 *  b) Muestre la información del polígono y su perímetro por pantalla.
 *  c) Traslade el polígono 4 en el eje x, -3 en el eje y.
 *  d) Cambie el color del PoligonoColoreado a azul.
 *  e) Muestre la información del polígono por pantalla.
 *
 * Planteamiento:
 *   Para crear un PoligonoColoreado se necesita un array de puntos, por lo que
 *   lo primero que hay que hacer es crear este array y rellenarlo con los
 *   cuatro puntos.
 *
 *   Posteriormente, se crea el objeto de la clase PoligonoColoreado. Como
 *   segundo parámetro se pasa Color.RED, que es la constante para el color
 *   rojo de la clase Color del paquete java.awt
 *
 *   La clase PoligonoColoreado contiene todos los métodos de la clase Poligono
 *   por lo que se puede invocar a los métodos perimetro() y trasladar() como
 *   si estuviesen declarados en la clase PoligonoColoreado.
 *
 *   Para mostrar por pantalla la información se utilizará el método toString()
 *   En este caso Java ejecutará el método toString() de PoligonoColoreado, ya
 *   que está sobreescrito.
 */

 import java.awt.Color;

 public class PruebaPoligonoColoreado {
   public static void main(String[] args) {
     Punto[] vertices = {new Punto(0,0), new Punto(2,0), new Punto(2,2), new Punto(0,2)};
     PoligonoColoreado poligonoColoreado1 = new PoligonoColoreado(vertices, Color.RED);
     System.out.println(poligonoColoreado1);
     System.out.println("Perimetro: " + poligonoColoreado1.perimetro());
     poligonoColoreado1.trasladar(4, -3);
     poligonoColoreado1.setColor(Color.BLUE);
     System.out.println(poligonoColoreado1);
   }
 }
