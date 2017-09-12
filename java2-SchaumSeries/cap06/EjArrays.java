/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 6.1
 *
 * Escriba una clase, de nombre EjArrays, cuyo método main() implemente un
 * programa que lleve a cabo las siguientes acciones:
 *
 * a) Declarar y construir un array de enteros, de nombre arrDig1, que almacene
 *    los números del 0 al 9 en orden creciente.
 *
 * b) Declarar y construir un array de enteros, de nombre arrDig2, que almacene
 *    los números del 9 al 0.
 *
 * c) Declarar y construir un array de caracteres, de nombre arrCh1, que
 *    almacene las 5 vocales en minúscula.
 *
 * d) Declarar y construir un array de caracteres, de nombre arrCh2, que
 *    almacene las 5 primeras letras del abecedario en minúscula.
 *
 * e) Concatenar las vocales del array arrCh1 a una cadena de caracteres de
 *    nombre cadCh1.
 *
 * f) Obtener una cadena de caracteres, de nombre cadCh2, con las letras del
 *    array arrCh2.
 *
 * g) Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras
 *    letras del abecedario.
 *
 * h) Mostrar por pantalla un texto donde se intercalan las vocales con las 5
 *    primeras letras del abecedario.
 *
 * i) Mostrar por pantalla el resultado de sumar cada posición del array
 *    arrDig1 con su correspondiente en el array arrDig2.
 *
 * PLANTEAMIENTO
 * a) Se declara el array arrDig1 y se inicializa de forma estática con sus
 *    elementos especificado directamente los números del 0 al 9.
 *
 * b) Se declara y construye el array arrDig2 como un array de enteros de 10
 *    variables. Se recorren las posiciones mediante un bucle para asignar los
 *    números del 9 al 0. Las posiciones del array se recorren en orden
 *    ascendente, por lo que es necesario calcular apropiadamente el valor
 *    asignado en cada iteración del bucle. Se aprovecha el atributo length del
 *    array y la variable índice para conseguirlo.
 *
 * c) Al igual que arrDig1, el array arrCh1 se declara estáticamente con sus
 *    elementos, en este caso las 5 vocales minúsculas.
 *
 * d) El array arrCh2 se declara y construye como un array de 5 variables de
 *    tipo char. Para asignar las 5 primeras letras del abecedario a sus
 *    posiciones se utiliza un bucle que las recorra secuencialmente y se
 *    aprovecha la disposición consecutiva de las letras en el código Unicode
 *    para ir obteniendo las siguientes letras. Internamente, un carácter se
 *    almacena como el valor entero correspondiente a su código Unicode. Por
 *    ello, incrementar en una unidad este valor equivale a pasar al siguiente
 *    carácter del citado código.
 *
 * e) Para obtener una cadena con las 5 vocales se declara un objeto String al
 *    que se van concatenando dentro de un bucle las vocales del array arrDig1.
 *
 * f) La cadena de caracteres con las 5 primeras letras del abecedario se
 *    obtiene aprovechando un constructor de la clase String que recibe por
 *    parámetro un array de caracteres. Para la solución se emplea el array
 *    arrCh2.
 *
 * g) Para mostrar las dos cadenas, basta con imprimirlas directamente con el
 *    método System.out.println().
 *
 * h) Para mostrar las primeras letras del abecedario intercaladas con las 5
 *    vocales, se utiliza un bucle para ir obteniendo el carácter en la misma
 *    posición de cada cadena. Estos caracteres se irán concatenando a una
 *    nueva cadena que finalmente se mostrará por pantalla.
 *
 * i) Para sumar las posiciones de los arrays de enteros, se utiliza un bucle
 *    para recorrerlas y que, en cada iteración, muestre la suma de dos de sus
 *    posiciones.
 */

 public class EjArrays {
   public static void main(String[] args) {
     // a
     int[] arrDig1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

     // b
     int[] arrDig2 = new int[10];
     for (int i = 0; i < arrDig2.length; i++) {
       arrDig2[i] = arrDig2.length -1 -i;
     }

     // c
     char[] arrCh1 = {'a', 'e', 'i', 'o', 'u'};

     // d
     char[] arrCh2 = new char[5];
     for (int i = 0; i < arrCh2.length; i++) {
       arrCh2[i] = (char)('a' + i);
     }

     // e
     String cadCh1 = "";
     for (int i = 0; i < arrCh1.length; i++) {
       cadCh1 += arrCh1[i];
     }

     // f
     String cadCh2 = new String(arrCh2);

     // g
     System.out.println("Cadena con 5 vocales: " + cadCh1);
     System.out.println("Cadena con 5 letras abecedario: " + cadCh2);

     // h
     String intercaladas = "";
     for (int i = 0; i < cadCh1.length(); i++) {
       intercaladas += cadCh1.charAt(i);
       intercaladas += cadCh2.charAt(i);
     }
     System.out.println("Vocales y letras intercaladas: " + intercaladas);

     // i
     for (int i = 0; i < arrDig1.length; i++) {
       System.out.println(arrDig1[i] + " + " + arrDig2[i] + " es " + (arrDig1[i] + arrDig2[i]));
     }
   }
 }
