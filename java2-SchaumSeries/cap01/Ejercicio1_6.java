/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.6
 *
 * Escriba un programa que escriba en pantalla cuánto le costará comprar unas
 * deportivas cuyo precio de catálogo es de 85,00€, si sabe que puede conseguir
 * una rebaja del 15%.
 *
 * @author Unai de la O
 */

 public class Ejercicio1_6 {
   public static void main(String[] args) {
     double precio = 85.0;
     double descuento = 1 - 0.15;
     double precioFinal = precio * descuento; // 72.25

     System.out.println(precioFinal);
   }
 }
