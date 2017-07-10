/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.8
 *
 * Escriba un método, de nombre cambioEnMonedas, que reciba como parámetro un
 * valor real que indica una cantidad de dinero en euros. El método imprime por
 * pantalla la cantidad de monedas de cada tipo en que se debe devolver la
 * cantidad de dinero indicada.
 *
 * @author Unai de la O
 */

 public class CambioMonedas {
   public static void cambioEnMonedas(double dinero) {
     // Para pasar el dinero introducido a céntimos de euro
     int vueltas = (int)(dinero * 100);

     System.out.println("La cantidad de " + dinero + " euros devuelve...");

     /*
      * Comienza por las monedas de 2 euros (200 céntimos) y utiliza el módulo
      * para utilizarlo con las siguientes monedas.
      */
     if (vueltas >= 200) {
       System.out.println(vueltas/200 + " monedas de 2 euros.");
       vueltas %= 200;
     }
     if (vueltas >= 100) {
       System.out.println(vueltas/100 + " monedas de 1 euro.");
       vueltas %= 100;
     }
     if (vueltas >= 50) {
       System.out.println(vueltas/50 + " monedas de 50 centimos.");
       vueltas %= 50;
     }
     if (vueltas >= 20) {
       System.out.println(vueltas/20 + " monedas de 20 centimos.");
       vueltas %= 20;
     }
     if (vueltas >= 10) {
       System.out.println(vueltas/10 + " monedas de 10 centimos.");
       vueltas %= 10;
     }
     if (vueltas >= 5) {
       System.out.println(vueltas/5 + " monedas de 5 centimos.");
       vueltas %= 5;
     }
     if (vueltas >= 2) {
       System.out.println(vueltas/2 + " monedas de 2 centimos.");
       vueltas %= 2;
     }
     if (vueltas >= 1) {
       System.out.println(vueltas/1 + " monedas de 1 centimo.");
       vueltas = 0; // Pues ya no habría más vueltas que dar.
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     cambioEnMonedas(5.37);
   }
 }
