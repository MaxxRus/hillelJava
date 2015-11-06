import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 07.11.2015.
 */
public class checkerboardPattern {
    public static void main(String[] args) {
        System.out.println("Welcome draw checkerboard pattern");
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
                if ((i % 2 != 0) && (j % 2 == 0) || (i % 2 == 0) && (j % 2 != 0)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
