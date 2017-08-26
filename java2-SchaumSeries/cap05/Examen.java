/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 5.1
 *
 * Realice una clase, de nombre Examen, para guardar información sobre los
 * exámenes de un centro educativo. La información que se guarda en un examen
 * es: el nombre de la asignatura, el aula, la fecha y la hora. Para guardar la
 * fecha y la hora hay que realizar dos clases, Fecha y Hora.
 *
 * La clase Fecha guarda día, mes y año. Todos los valores se reciben en el
 * constructor por parámetro. Además, esta clase debe tener un método que
 * devuelva cada uno de los atributos y un método toString() que devuelva la
 * información de la fechaa en forma de String.
 *
 * La clase Hora guarda hora y minuto. También recibe los valores para los
 * atributos por parámetro en el constructor, tiene métodos que devuelven cada
 * uno de los atributos y un método toString().
 *
 * Nota: se incluyen métodos setters y getters.
 * Nota 2: las clases Fecha y Hora se han creado en archivos a parte.
 */

 public class Examen {
   private String asignatura;
   private String aula;
   private Fecha fecha;
   private Hora hora;

   public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
     this.asignatura = asignatura;
     this.aula = aula;
     this.fecha = fecha;
     this.hora = hora;
   }

   public void setAsignatura(String asignatura) {
     this.asignatura = asignatura;
   }

   public void setAula(String aula) {
     this.aula = aula;
   }

   public void setFecha(Fecha fecha) {
     this.fecha = fecha;
   }

   public void setHora(Hora hora) {
     this.hora = hora;
   }

   public String getAsignatura() {
     return asignatura;
   }

   public String getAula() {
     return aula;
   }

   public Fecha getFecha() {
     return fecha;
   }

   public Hora getHora() {
     return hora;
   }

   public String toString() {
     return "Asignatura: " + asignatura +
            "\nAula: " + aula +
            "\nFecha: " + fecha.toString() +
            "\nHora: " + hora.toString();
   }
 }
