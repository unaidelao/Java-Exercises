/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.51
 *
 * Escriba una clase, de nombre Entrenamiento, en cuyo método main() se creará
 * un objeto Corredor con una energía de 50 unidades. Se hará que el corredor
 * corra hasta que se agote 3 veces. La primera vez que se agote, su energía se
 * recargará con 30 unidades; la segunda, con 10 unidades. Cuando el corredor
 * se agote por tercera vez se dará el entrenamiento por concluido.
 */

 public class Entrenamiento {
   public static void main(String[] args) {
     Corredor atleta = new Corredor(50);
     boolean continuaEntrenando = true;
     int vecesAgotado = 0;

     do {
       try {
         atleta.correr();
       }
       // El bloque catch controla las veces que el corredor se agota
       catch(AgotadoExcepcion aE) {
         vecesAgotado++;
         switch (vecesAgotado) {
           case 1: atleta.recargarEnergia(30);
                   System.out.println(aE.getMessage());
                   break;
           case 2: atleta.recargarEnergia(10);
                   System.out.println(aE.getMessage());
                   break;
           case 3: continuaEntrenando = false;
                   System.out.println("El entrenamiento ha finalizado.");
         }
       }
     } while (continuaEntrenando);
   }
 }
