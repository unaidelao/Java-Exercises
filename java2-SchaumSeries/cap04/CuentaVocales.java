/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 4.25
 *
 * Escriba un programa que cuente el número de vocales que aparecen en un texto
 * que se solicita al usuario.
 *
 * @author Unai de la O
 */

 import java.util.Scanner;

 public class CuentaVocales {
   public static void main(String[] args) {
     int vocal_A = 0;
     int vocal_E = 0;
     int vocal_I = 0;
     int vocal_O = 0;
     int vocal_U = 0;
     int vocal_a = 0;
     int vocal_e = 0;
     int vocal_i = 0;
     int vocal_o = 0;
     int vocal_u = 0;

     Scanner in = new Scanner(System.in);
     System.out.println("Introduzca texto para contar sus vocales:");
     String s = in.nextLine();

     for (int i = 0; i < s.length(); i++) {
       switch (s.charAt(i)) {
         case 'A':
           vocal_A++;
           break;
         case 'E':
           vocal_E++;
           break;
         case 'I':
           vocal_I++;
           break;
         case 'O':
           vocal_O++;
           break;
         case 'U':
           vocal_U++;
           break;
         case 'a':
           vocal_a++;
           break;
         case 'e':
           vocal_e++;
           break;
         case 'i':
            vocal_i++;
            break;
         case 'o':
           vocal_o++;
           break;
         case 'u':
            vocal_u++;
            break;
       }
     }
     System.out.println("\'A\' aparece " + vocal_A + " veces.");
     System.out.println("\'E\' aparece " + vocal_E + " veces.");
     System.out.println("\'I\' aparece " + vocal_I + " veces.");
     System.out.println("\'O\' aparece " + vocal_O + " veces.");
     System.out.println("\'U\' aparece " + vocal_U + " veces.");
     System.out.println("\'a\' aparece " + vocal_a + " veces.");
     System.out.println("\'e\' aparece " + vocal_e + " veces.");
     System.out.println("\'i\' aparece " + vocal_i + " veces.");
     System.out.println("\'o\' aparece " + vocal_o + " veces.");
     System.out.println("\'u\' aparece " + vocal_u + " veces.");
   }
 }
