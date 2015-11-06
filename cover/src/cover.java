import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ITHILLEL3 on 05.11.2015.
 */
public class cover {
    public static void main(String[] args) {
        System.out.println("Welcome draw cover");
        int a = 0;
        int b = 0;

        System.out.println("Input height: ");

        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }

        System.out.println("Input widtht: ");

        try {
            b = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }
        scanner.close();


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((i == 0) || (i == a - 1) || (j == 0) || (j == b - 1) || (i==j) ||(i==b-1-j)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }

    }


    }
