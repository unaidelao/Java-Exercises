/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 3.2
 *
 * Escriba una clase de nombre Constantes que declare las siguientes:
 *
 *    Velocidad de la luz, c: 2,9979 · 10^8 m/s
 *    Constante Universal de Gravitación, G: 6,67 · 10^-11 N m^2/kg^2
 *    Constante de Planck, h: 6,6262 · 10^-34 J·s
 *
 * Escribir asimismo un programa llamado pruebaConstantes, que cree un objeto
 * de la clase Constantes y luego imprima los valores de las constantes y sus
 * dimensiones.
 *
 * @author Unai de la O
 */
 
 class Constantes {
   public final double C = 2.9979E08; // VELOCIDAD DE LA LUZ, C (m/s)
   public final double G = 6.67E-11; // CTE. DE GRAVITACIÓN (N m^2/kg^2)
   public final double H = 6.6262E-34; // CTE. DE PLANCK (J·s)
   
 }
 
 class PruebaConstantes {
   public static void main(String[] args) {
     Constantes ejemplo = new Constantes();
     
     System.out.println("Velocidad de la luz: " + ejemplo.C + " m/s");
     System.out.println("Constante gravitacion: " + ejemplo.G + " N m^2/kg^2");
     System.out.println("Constante de Planck: " + ejemplo.H + " J·s");
   }
 }