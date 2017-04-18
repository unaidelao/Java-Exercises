/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.11
 *
 * Escriba un programa que defina dos variables enteras para describir las
 * longitudes de los lados de un rectángulo. El programa debe calcular y
 * escribir en la pantalla las longitudes de los lados, el perímetro y el área
 * del rectángulo. (Suponga que el rectángulo mide 15cm de alto y 25cm de
 * ancho).
 *
 * @author Unai de la O
 */

public class Rectangulo {
  public static void main(String[] args) {
    int alto = 15;
    int ancho = 25;

    int perimetro = (2 * alto) + (2 * ancho);
    int area = alto * ancho;

    System.out.println("La altura del rectangulo es " + alto + " cm");
    System.out.println("La anchura del rectangulo es " + ancho + " cm");
    System.out.println("Su perimetro es " + perimetro + " cm");
    System.out.println("Y su area es " + area + " cm^2");
  }
}
