import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 18.11.2015.
 */
public class revers {
    public static void main(String[] args) {
        int number;
        System.out.println("Input number to revers");
        number = Input();

        String numberString = Integer.toString(number);
        char[] numberChar = numberString.toCharArray();
        char[] res = new char[numberChar.length];

        for (int i = 0; i <= numberChar.length-1; i++){
            res[i] = numberChar[numberChar.length-1-i];
            System.out.print(res[i]);
        }

    }
    public static int Input(){
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
