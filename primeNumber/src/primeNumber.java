import java.util.Scanner;

/**
 * Created by Ольга on 07.11.2015.
 */
public class primeNumber {
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
        if (a == 1 || a == 2) {
            System.out.println("You number prime");
        } else {
            if (a % 2 == 0) {
                System.out.println("You number not prime");
            } else for (int i = 3; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    System.out.println("You number not prime");
                } else {
                    System.out.println("You number prime");
                    break;
                }
            }
        }
    }

}
