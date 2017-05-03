/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.6
 *
 * Escriba un programa que instancie un semáforo de la clase Semáforo del
 * ejercicio anterior. El programa mostrará por pantalla el color del semáforo.
 * Luego pondrá el semáforo en ámbar y volverá a imprimir el color.
 *
 * @author Unai de la O
 */
 
 enum ColorSemaforo { ROJO, AMBAR, VERDE }
 
 class Semaforo {
	 ColorSemaforo color = ColorSemaforo.ROJO;
	 boolean estaParpadeando = false;
	 
	 // No se establece un constructor específico. Se usa el de por defecto
 }
 
 public class PruebaSemaforo {
	 public static void main(String[] args) {
		 Semaforo semaforo1 = new Semaforo();
		 
		 System.out.println("El Semaforo 1 tiene color " + semaforo1.color);
		 
		 semaforo1.color = ColorSemaforo.AMBAR;
		 
		 System.out.println("Ahora tiene color " + semaforo1.color);
	 }
 }