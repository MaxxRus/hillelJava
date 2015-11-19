import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 19.11.2015.
 */
public class toSiVer2 {
    public static void main(String[] args) {
        System.out.println("Input value: ");
        double value = Input();
        int valueInt = (int)value;
        int[] res = new int[3]
        double[] valueDou = new double[3];
        int count = 0;
        while (res[count]==0){
            res[count] = valueInt/1000;
            count++;
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
}
