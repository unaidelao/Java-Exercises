/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.5
 *
 * Escriba una clase que represente un Semáforo, que podrá estar rojo, ámbar o
 * verde. La clase tendrá un atributo llamado color, inicialmente a rojo.
 * También dispondrá de un atributo que determine si el semáforo está
 * parpadeando. Inicialmente, el semáforo no está parpadeando.
 *
 * @author Unai de la O
 */

 enum ColorSemaforo { ROJO, AMBAR, VERDE }
 
 public class Semaforo {
	 ColorSemaforo color = ColorSemaforo.ROJO;
	 boolean estaParpadeando = false;
 }