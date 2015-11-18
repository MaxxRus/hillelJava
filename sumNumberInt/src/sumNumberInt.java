import java.util.Scanner;

/**
 * Created by Ольга on 18.11.2015.
 */
public class sumNumberInt {
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
        String aString = Integer.toString(a);
        char[] achaes = aString.toCharArray();
//        System.out.println(aString);
//        System.out.println(aString.length());

        int res = 0;
        for (int i = 0; i < aString.length(); i++) {
            int k = achaes[i] - '0';
            res = res + k;
        }
        System.out.println("Sum number = " + res);
    }
}
