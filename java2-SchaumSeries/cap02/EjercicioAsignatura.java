/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.7
 *
 * Escriba un programa que disponga de una clase para representar las
 * asignaturas de una carrera. Una asignatura tiene un nombre, un código
 * numérico y el curso en el cual se imparte. Los valores iniciales han de
 * proporcionarse en el constructor. La clase ha de tener métodos para obtener
 * los valores de los atributos. El programa ha de construir un objeto con los
 * siguientes valores:
 *    nombre "Matemáticas"
 *    código 1017
 *    curso 1
 *
 * A continuación, el programa ha de imprimir los valores por pantalla.
 *
 * @author Unai de la O
 */
 
 class Asignatura {
	 private String nombre;
	 private int codigo;
	 private int curso;
	 
	 // Constructor
	 public Asignatura(String nombre, int codigo, int curso) {
		 this.nombre = nombre;
		 this.codigo = codigo;
		 this.curso = curso;
	 }
	 
	 // Métodos get
	 public String getNombre() {
		 return nombre;
	 }
	 
	 public int getCodigo() {
		 return codigo;
	 }
	 
	 public int getCurso() {
		 return curso;
	 }
 }
 
 public class EjercicioAsignatura {
	 public static void main(String[] args) {
		 Asignatura matesPrimero = new Asignatura("Matematicas", 1017, 1);
		 
		 System.out.println("Asignatura de prueba");
		 System.out.println("--------------------");
		 System.out.println("Nombre: " + matesPrimero.getNombre());
		 System.out.println("Codigo: " + matesPrimero.getCodigo());
		 System.out.println("Curso: " + matesPrimero.getCurso());
	 }
 }