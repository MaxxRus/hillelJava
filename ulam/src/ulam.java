import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 19.11.2015.
 */
public class ulam {
    public static void main(String[] args) {
        System.out.println("Input number");
        int volum = Input();
        if (volum % 2 == 0) {
            System.out.println("Number even");
            return;
        }
        int count = 1;
        int i, j = 0;
        i = volum / 2;
        j = volum / 2;
        char current = 'r';
        int[][] ulam = new int[volum][volum];
        System.out.println(Arrays.deepToString(ulam));
        while (count < (volum * volum)) {

            ulam[i][j] = count++;
            System.out.println(Arrays.deepToString(ulam));
            switch (current) {
                case 'r':

                    if (i == j) {
                        current = 'u';
                    }
                    j++;
                    break;

                case 'u':
                    if (volum + i == j) {
                        current = 'l';
                    }
                    i--;
                    break;

                case 'l':
                    if (i == j) {
                        current = 'd';
                    }
                    j--;
                    break;

                case 'd':
                    if (i == volum + j) {
                        current = 'r';
                    }
                    i++;
                    break;

            }

        }


        System.out.println(Arrays.deepToString(ulam));
    }

    public static int Input() {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }
        return a;

    }
}
