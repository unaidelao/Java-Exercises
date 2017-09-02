/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.5
 *
 * Utilizando la clase Punto del ejercicio anterior, escriba la clase Poligono.
 * Ésta tiene como atributo un array de objetos Punto. Se consideran adyacentes
 * los objetos Punto que estén en celdas consecutivas del array y los puntos
 * que están en la primera y última celda. Esta clase debe contener los
 * siguientes métodos:
 *
 * a) el constructor, recibirá por parámetro un array con los objetos Punto que
 *    definen el polígono.
 * b) trasladar(), recibe por parámetro el desplazamiento en la coordenada x y
 *    el desplazamiento en la coordenada y.
 * c) escalar(), recibe por parámetro el factor de escala para la coordenada X
 *    y el factor de escala para la coordenada y.
 * d) numVertices(), devuelve el número de vértices del polígono.
 * e) toString(), devuelve la información de los puntos del polígono, uno en
 *    cada línea.
 * f) perimetro(), devuelve el perímetro del polígono.
 *
 * Planteamiento:
 * a) En el constructor hay que controlar que el número de vértices del
 *    polígono no sea menor que 3. En caso contrario se lanza una excepción de
 *    tipo IllegalArgumentException.
 * b) Para trasladar el polígono, se recorre el array desplazando cada uno de
 *    los puntos.
 * c) Para escalar se hace lo mismo, pero multiplicando su coordenada x por el
 *    factor x y su coordenada y por el factor y.
 * d) El número de vértices coincide con la longitud del array.
 * e) El método toString() llama al método toString() de cada uno de los puntos
 *    y los concatena en un String auxiliar que devuelve al terminar el método.
 * f) El perímetro se calcula utilizando el método distancia() de la clase
 *    Punto. Se calcula y suma la distancia de cada Punto con su Punto
 *    siguiente, sin olvidarse de la distancia entre el Punto de la celda 0 y
 *    el de la última celda.
 */

 public class Poligono {
   private Punto[] vertices;

   // constructor
   public Poligono(Punto[] valor) {
     if (valor.length < 3) {
       /*
        * IllegalArgumentException hereda de RuntimeException, por eso no es
        * necesario indicarlo en la cabecera del método.
        */
       throw new IllegalArgumentException();
     }
     else {
       vertices = valor;
     }
   }

   /*
    * Este método, además de escalar, traslada. Por ejemplo, un polígono
    * formado por los vértices (1,1),(1,2),(2,2),(2,1) al escalarlo por 2 en el
    * eje x y por 3 en el eje y pasaría a estar en el (2,3),(2,6),(4,6),(4,3),
    * con lo que se ha escalado (es el doble de ancho y el triple de alto),
    * pero también se ha trasladado.
    */
   public void escalar(double x, double y) {
     double valX, valY;
     for (Punto p : vertices) {
       valX = p.getX();
       valY = p.getY();
       p.setX(valX * x);
       p.setY(valY * y);
     }
   }

   // método trasladar(). Solo traslada el polígono.
   public void trasladar(double x, double y) {
     double valX, valY;
     for (Punto p : vertices) {
       valX = p.getX();
       valY = p.getY();
       p.setX(valX + x);
       p.setY(valY + y);
     }
   }

   // devuelve el número de vértices de un polígono
   public int numVertices() {
     return vertices.length;
   }

   // calcula el perímetro de un polígono
   public double perimetro() {
     double total = 0;
     for (int i = 0; i < vertices.length - 1; i++) {
       // le suma a total la distancia de un punto respecto al siguiente
       total += vertices[i].distancia(vertices[i + 1]);
     }
     // le suma a total la distancia del último vértice respecto del primero
     // pues es lo que falta hacer que no hace el bucle for
     total += vertices[0].distancia(vertices[vertices.length - 1]);
     return total;
   }

   // método toString()
   public String toString() {
     String texto = "";
     for (Punto p : vertices) {
       texto += p + "\n";
     }
     return texto;
   }
 }
