/**
 * Clase Fecha del ejercicio 5.1 (Examen.java)
 */

 /*
  * En esta clase Fecha podría utilizarse el método esFechaValida() del
  * ejercicio 4.12
  */
 public class Fecha {
   private int dia;
   private int mes;
   private int anno;

   public Fecha(int dia, int mes, int anno) {
     this.dia = dia;
     this.mes = mes;
     this.anno = anno;
   }

   public int getDia() {
     return dia;
   }

   public int getMes() {
     return mes;
   }

   public int getAnno() {
     return anno;
   }

   public String toString() {
     return dia + "/" + mes + "/" + anno;
   }
 }
