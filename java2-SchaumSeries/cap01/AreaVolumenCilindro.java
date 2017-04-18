/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.12
 *
 * Escriba un programa para calcular el área y el volumen de un cilindro.
 * Para ello declare una constante que guarde el valor de PI. Declare, también
 * variables para el diámetro y la altura del cilindro. Suponga para el ejemplo
 * que el cilindro tiene un diámetro de 15,5 cm y una altura de 42,4cm.
 *
 * @author Unai de la O
 */

public class AreaVolumenCilindro {
  public static void main(String[] args) {
    final double PI = 3.14;

    double diametro = 15.5;
    double altura = 42.4;
    double radio = diametro / 2;

    double area = (2 * PI * radio * radio) + (2 * PI * radio * altura);
    double volumen = PI * radio * radio * altura;

    System.out.println("La altura del cilindro es " + altura + " cms");
    System.out.println("El radio del cilindro es " + radio + " cms");
    // las siguientes impresiones quedan mejor con printf()
    System.out.printf("Su area es %.2f cm^2\n", area);
    System.out.printf("Y su volumen es %.2f cm^3\n", volumen);
  }
}
