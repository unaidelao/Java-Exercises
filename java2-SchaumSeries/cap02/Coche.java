/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 2.1
 *
 * Defina una clase que represente a un coche. En la definición se debe incluir
 *  - el modelo
 *  - el color
 *  - si la pintura es metalizada o no,
 *  - la matrícula
 *  - el tipo de coche, que puede ser MINI, UTILITARIO, FAMILIAR o DEPORTIVO
 *  - el año de fabricación
 *  - la modalidad del seguro, que puede ser a terceros o a todo riesgo.
 *
 * @author Unai de la O
 */

enum TipoDeCoche { MINI, UTILITARIO, FAMILIAR, DEPORTIVO }
enum ModalidadDeSeguro { TERCEROS, TODO_RIESGO }

public class Coche {
  String modelo;
  String color;
  boolean pinturaMetalizada;
  int matricula;
  TipoDeCoche tipo;
  int fechaFabricacion;
  ModalidadDeSeguro seguro;
}
