import java.io.*;

/**
 * Programación en Java 2 - Serie Schaum
 *
 * Ejercicio 7.16
 * 
 * Escriba un método que reciba por parámetro el número correspondiente a un mes del año y la letra
 * correspondiente al día de la semana en que cae el día 1 de ese mes ('L' para lunes, 'M' para
 * martes, 'X' para miércoles, etc.).
 * 
 * El método escribirá en un archivo un calendario para ese mes que estará formado por todos los
 * días del mes seguidos de la letra correspondiente al día de la semana en que caen.
 * 
 * El método comprobará que los parámetros recibidos son correctos y obtendrá el nombre
 * concatenando a la palabra "mes" el número de mes recibido más la extensión ".txt".
 */
public class EscribeCalendarioMes {

    public static void main(String[] args) {
        // Invocación de escribeMesCalendario(int mes, char diaInicioChar).
    }

    public static void escribeMesCalendario(int mes, char diaInicioChar) throws IOExcepcion {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("¡Número de mes no válido!");
        }

        String diaInicioStr = String.valueOf(diaInicioChar);
        String dias = "LMXJVSD";

        if (dias.indexOf(diaInicioStr.toUpperCase()) == -1) {
            throw new IllegalArgumentException("¡Letra de día no válida!");
        }

        DataOutputStream flujoEscritura = new DataOutputStream(
            new BufferedOutputStream(
            new FileOutputStream("C:\\pruebas-java\\mes" + mes + ".txt")));
        
        int totalDiasMes = 0;
        switch (mes) {
            case 2:
                totalDiasMes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                totalDiasMes = 30;
                break;
            default:
                totalDiasMes = 31;
                break;
        }

        for (int i = 0; i < totalDiasMes; i++) {
            char dia = dias.charAt((dias.indexOf(diaInicioChar) + 1) % 7);
            flujoEscritura.writeChar((char)dia);
            flujoEscritura.writeInt(i+1);
        }
        flujoEscritura.close();
    }
}