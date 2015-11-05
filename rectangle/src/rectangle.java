import java.util.Scanner;

/**
 * Created by Ольга on 05.11.2015.
 */
public class rectangle {
    public static void main(String[] args) {
        System.out.println("Welcome draw rectangle");
        int a = 0;
        int b = 0;

        while (true) {
            System.out.println("Input height rectangle: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextInt()) {
                a = in.nextInt();
                System.out.println(a);
                break;
            } else {
                if (in.hasNext()) {
                    String Quit = in.next();
                    if (Quit.equals("quit") || Quit.equals("q")) {
                        return;
                    }
                }
                System.out.println("Yor input not integer. Try again");
            }
        }

        while (true) {
            System.out.println("Input width rectangle: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextInt()) {
                b = in.nextInt();
                System.out.println(b);
                break;
            } else {
                if (in.hasNext()) {
                    String Quit = in.next();
                    if (Quit.equals("quit") || Quit.equals("q")) {
                        return;
                    }
                }
                System.out.println("Yor input not integer. Try again");
            }
        }
        int i, j;
        for (i = 0; i < a; i++) {
            if (i == 0) {
                for (j = 0; j < b; j++) {
                    if (j < b ) {
                        System.out.print('*');
                    } else {
                        System.out.println('*');
                    }

                }
            }
            if (i >= 0 || i < a) {
                for (j = 0; j < b; j++) {
                    if (i == 0 && i == a ) {
                        if (i == a ) {
                            System.out.println('*');
                        } else {
                            System.out.print('*');
                        }
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            if (i == a ) {
                for (j = 0; j < b; j++) {
                    if (j == b){
                        System.out.println('*');
                    }
                    System.out.print('*');
                }
            }
        }
    }

}

