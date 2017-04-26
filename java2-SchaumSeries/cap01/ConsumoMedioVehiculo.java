/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.23
 *
 * Escriba un programa para calcular el consumo medio de un automóvil. Para
 * ello el programa debe solicitar información sobre las tres últimas veces que
 * se repostó combustible. De la primera solicitará el precio del litro del
 * combustible, el total pagado en llenar el depósito y el número de kilómetros
 * que marcaba el cuentakilómetros. De la segunda vez sólo solicitará el
 * precio del litro del combustible y el total pagado en llenar el depósito, y
 * de la tercera vez, solicitará el valor que indicaba el cuentakilómetros. Con
 * estos datos debe calcular el consumo por cada 100 km y el coste por km.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class ConsumoMedioVehiculo {
   public static void main(String[] args) {
     double precioLitro;
     double litros = 0;
     double pagado;
     double coste = 0;
     int kmsInicio, kmsFinal, kms;

     Scanner in = new Scanner(System.in);

     System.out.print("Precio/litro del primer repostaje: ");
     precioLitro = in.nextDouble();
     System.out.print("Coste del primer repostaje: ");
     pagado = in.nextDouble();
     System.out.print("Cifra del cuentakilometros en el primer repostaje: ");
     kmsInicio = in.nextInt();
     litros = pagado / precioLitro;
     coste = pagado;

     System.out.println();

     System.out.print("Precio/litro del segundo repostaje: ");
     precioLitro = in.nextDouble();
     System.out.print("Coste del segundo repostaje: ");
     pagado = in.nextDouble();
     litros += pagado / precioLitro;
     coste += pagado;

     System.out.println();

     System.out.print("Cifra del cuentakilometros en el tercer repostaje: ");
     kmsFinal = in.nextInt();
     kms = kmsFinal - kmsInicio;

     System.out.println("Consumo medio = " + litros / kms * 100 + " l/100km");
     System.out.println("Gasto medio = " + coste / kms + " euros/km");
   }
 }
