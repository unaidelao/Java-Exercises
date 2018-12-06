import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.42
 *
 * Escriba un programa que cree un conjunto ordenado según un árbol (TreeSet) utilizando la clase
 * Alumno del ejercicio 6.34.
 * 
 * A continuación, se crearán varios objetos de la clase Alumno,
 * asignando a la mitad de ellos las calificaciones para obtener una nota media final de 10.0 y, a
 * otros, las necesarias para obtener una nota media final de 4.0.
 * 
 * Se añadirán todos los alumnos al objeto TreeSet. Finalmente, se obtendrán todos los alumnos
 * aprobados (nota media final mayor o igual que 5.0) y todos los suspensos (nota media final
 * menor que 5.0).
 */
public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<Alumno> ts = new TreeSet<>();

        // Instanciación de unos cuantos alumnos.
        Alumno juan = new Alumno(01, "López", "García", "Juan", 3, new double[]{10.0,10.0,10.0}, 10.0);
        Alumno ana = new Alumno(02, "Torres", "Tejada", "Ana", 3, new double[]{10.0,10.0,10.0}, 10.0);
        Alumno javier = new Alumno(03, "Zurita", "Quevedo", "Javier", 3, new double[]{4.0,4.0,4.0}, 4.0);
        Alumno isabel = new Alumno(05, "Benavente", "Librado", "Isabel", 3, new double[]{4.0,4.0,4.0}, 4.0);

        ts.add(juan);
        ts.add(ana);
        ts.add(javier);
        ts.add(isabel);

        //System.out.println(ts);

        SortedSet<Alumno> aprobados = ts.tailSet(new Alumno(0,null,null,null,0,null,5.0));
        SortedSet<Alumno> suspensos = ts.headSet(new Alumno(0,null,null,null,0,null,5.0));

        System.out.print("===Set de alumnos APROBADOS===:\n");
        System.out.println(aprobados);
        System.out.println("===Set de alumnos SUSPENSOS===:\n");
        System.out.println(suspensos);
    }
}