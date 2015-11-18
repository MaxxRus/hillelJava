import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 18.11.2015.
 */
public class pointBelongsToRectangle {
    public static void main(String[] args) {
        int[] coordinates = new int[6];
        System.out.println("Input coordinates rectangle");
        System.out.println("Top left corner x = ");
        coordinates[0] = Input();
        System.out.println("Top left corner y = ");
        coordinates[1] = Input();
        System.out.println("lower right corner x = ");
        coordinates[2] = Input();
        System.out.println("lower right corner y = ");
        coordinates[3] = Input();
        System.out.println("Input coordinates point");
        System.out.println("x = ");
        coordinates[4] = Input();
        System.out.println("y = ");
        coordinates[5] = Input();

        if (Belongs(coordinates)) {
            System.out.println("belongs");
        }else {
            System.out.println("not belongs");
        }

    }

    public static boolean Belongs(int[] coordinates) {
        if (((coordinates[0] <= coordinates[4])&&(coordinates[4] <= coordinates[2])) &&
                ((coordinates[1] <= coordinates[5])&&(coordinates[5] <= coordinates[3]))){
            return true;
        } else {
            return false;
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
