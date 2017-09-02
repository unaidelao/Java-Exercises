/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.6
 *
 * Escriba una aplicación que:
 *  a) Cree un polígono de cuatro vértices, que serán (0,0),(2,0),(2,2),(0,2).
 *  b) Muestre la información del polígono y su perímetro por pantalla.
 *  c) Traslade el polígono 4 en el eje x, -3 en el eje y.
 *  d) Muestre la información del polígono y su perímetro por pantalla.
 *  e) Escale el polígono por 3 en el eje x y por 0.5 en el eje y.
 *  f) Muestre la información del polígono y su perímetro por pantalla.
 */

 public class PruebaPoligono {
   public static void main(String[] args) {
     Punto[] vertices = {new Punto(0,0), new Punto(2,0), new Punto(2,2), new Punto(0,2)};
     Poligono poligono1 = new Poligono(vertices);

     // cuando se necesita un String, se llama automáticamente al método toString()
     System.out.println(poligono1);
     // impresión por pantalla del perímetro
     System.out.println("Perimetro: " + poligono1.perimetro());
     // se traslada el polígono
     poligono1.trasladar(4, -3);
     // se imprimen de nuevo los valores
     System.out.println(poligono1);
     // y el perímetro, que no debe cambiar
     System.out.println("Perimetro: " + poligono1.perimetro());
     // se escala el polígono
     poligono1.escalar(3, 0.5);
     // se imprimen de nuevo los valores
     System.out.println(poligono1);
     // y finalmente el perímetro, que sí debe haber cambiado escalarlo antes
     System.out.println("Perimetro: " + poligono1.perimetro());
   }
 }
