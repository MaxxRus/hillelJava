import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 18.11.2015.
 */
public class toSiVer1 {
    public static void main(String[] args) {
        System.out.println("Input value: ");
        double value = Input();
        String numberString = String.valueOf(value);
        char[] valueChar = numberString.toCharArray();
//        System.out.println(Arrays.toString(valueChar));
        int index = 0;
        for (int i = 0; i < valueChar.length; i++) {
            if (valueChar[i] == '.') {
                index = i;
            }

        }
        System.out.println(index);
        char[] valueInt = Arrays.copyOf(valueChar, index);
//        System.out.println(Arrays.toString(valueInt));
        char[] valueDou = Arrays.copyOfRange(valueChar, index + 1, valueChar.length);
//        System.out.println(Arrays.toString(valueDou));
        char[] valueIntRevers = Revers(valueInt);
//        System.out.println(Arrays.toString(valueIntRevers));
        System.out.println(Arrays.deepToString(Killo(valueIntRevers, getFactor(valueIntRevers))));
        for (int i = 0; i<getFactor(valueIntRevers);i++){

        }
    }


    public static double Input() {
        double input = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }
        return input;

    }

    public static char[] Revers(char[] numberChar) {
        char[] res = new char[numberChar.length];

        for (int i = 0; i < numberChar.length; i++) {
            res[i] = numberChar[numberChar.length - 1 - i];
        }
        return res;
    }

    public static char[][] Killo(char[] value, int factor) {
        char[][] res = new char[factor][3];
        int count = 0;
        for (int i = 0; i < factor; i++) {
            res[i] = Arrays.copyOfRange(value, count, count + 3);
            count = count + 3;
        }
//        System.out.println(Arrays.deepToString(res));
        return res;
    }

    private static int getFactor(char[] value) {
        int factor;
        if (value.length % 3 == 0) {
            factor = value.length / 3;
        } else {
            factor = value.length / 3 + 1;
        }
        return factor;
    }


}
