import java.util.Scanner;

public class ReglaConScanner {

    public static void main (String[] args) {
        int age;
        String name;

        Scanner in = new Scanner(System.in);


        System.out.print("What is your age? ");
        age = in.nextInt();
        /*
         * Lo siguiente es necesario si se lee un int o double antes de un
         * String, porque Scanner, al usar el método nextLine() lo primero que
         * va a leer es precisamente un \n, así que de no poner esto, retornaría
         * un String vacío, pues nextLine() lee hasta el próximo \n.
         *
         * Si Scanner va a leer un String y luego un int o double, no hay
         * necesidad de indicar in.nextLine() entre medias.
         */

        in.nextLine();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d.\n", name, age);

    }
}
