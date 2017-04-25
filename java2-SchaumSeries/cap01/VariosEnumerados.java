/**
 * Programación en Java 2, Serie Schaum
 *
 * Ejercicio 1.19
 *
 * Escriba en Java los siguientes tipos enumerados:
 *
 * (a) Los días laborales
 * (b) Los tres primeros meses del año
 * (c) Las calificaciones de un alumno
 * (d) Los colores primarios
 * (e) Las notas musicales
 * (f) Los colores del arco iris
 * (g) Los colores RGB
 *
 * @author Unai de la O
 */

public class VariosEnumerados {
  // a
  enum DiasLaborables { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES }
  // b
  enum TresPrimerosMeses { ENERO, FEBRERO, MARZO }
  // c
  enum CalificacionesAlumno { SUSPENSO, APROBADO, BIEN, NOTABLE, SOBRESALIENTE,
    MATRICULA_HONOR }
  // d
  enum ColoresPrimarios { MAGENTA, CIAN, AMARILLO }
  // f
  enum NotasMusicales { DO, RE, MI, FA, SOL, LA, SI }
  // g
  enum RGB { RED, GREEN, BLUE }
}
