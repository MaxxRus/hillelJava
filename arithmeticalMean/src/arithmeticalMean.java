import java.util.Scanner;

/**
 * Created by Ольга on 06.11.2015.
 */
public class arithmeticalMean {
    public static void main(String[] args) {
        System.out.println("Welcome this simple mean");
        int iter = 0;

        double number = 0;
        double sum = 0;
        double result = 0;

        while (true) {
            System.out.println("Input number: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                number = in.nextDouble();

            } else {
                if (in.hasNext()) {
                    String Quit = in.next();
                    if (Quit.equals("quit") || Quit.equals("q")) {
                        return;
                    }
                }
                System.out.println("Yor input not number. Try again");
            }
            sum = sum + number;
            iter++;
            result = sum / iter;
            System.out.println("Arithmetical means: " + result);
        }

    }
}
