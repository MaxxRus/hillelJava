import java.util.Scanner;

/**
 * Created by Ольга on 18.11.2015.
 */
public class repetitionNumber {
    public static void main(String[] args) {
        int a;
        while (true) {
            System.out.println("Input number: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextInt()) {
                a = in.nextInt();
                //System.out.println(a);
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
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.println("You number repetition " + i);
            }

        }
    }
}
