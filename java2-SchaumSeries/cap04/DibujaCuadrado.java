/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.16
 *
 * Escriba un método de nombre dibujaCuadrado que dibuje un cuadrado por cuatro
 * mediante caracteres *, como el que se muestra:
 *
 *    * * * *
 *    * * * *
 *    * * * *
 *    * * * *
 *
 * @author Unai de la O
 */

 public class DibujaCuadrado {
   public void dibujaCuadrado() {
     for (int i = 0; i < 4; i++) {
       System.out.println("* * * *");
     }
   }

   // MAIN y prueba del programa
   public static void main(String[] args) {
     // Se instancia la clase
     DibujaCuadrado ejemplo = new DibujaCuadrado();
     // Se llama al método del objeto creado
     ejemplo.dibujaCuadrado();
   }
 }
