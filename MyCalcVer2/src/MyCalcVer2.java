/**
 * Created by Ольга on 04.11.2015.
 */

import java.util.Scanner;

public class MyCalcVer2 {

    public static void main(String[] args) {
        System.out.println("Welcome this simple calc");

        double first = 0;
        double second = 0;
        char operand;

        while (true) {
            System.out.println("Input first number: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                first = in.nextDouble();
                //System.out.println(first);
                break;
            } else {
                if (in.hasNext()) {
                    String Quit = in.next();
                    if (Quit.equals("quit") || Quit.equals("q")) {
                        return;
                    }
                }
                System.out.println("Yor input not number. Try again");
            }
        }

        while (true) {
            System.out.println("Input second number: ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                second = in.nextDouble();
                //System.out.println(second);
                break;
            } else {
                if (in.hasNext()) {
                    String Quit = in.next();
                    if (Quit.equals("quit") || Quit.equals("q")) {
                        return;
                    }
                }
                System.out.println("Yor input not number. Try again");
            }
        }

        while (true) {
            System.out.println("Input operand + or - or * or / : ('quit for exit')");
            Scanner in = new Scanner(System.in);

            if (in.hasNext()) {
                operand = in.next().charAt(0);
                if (operand == '+' || operand == '-' ||
                        operand == '*' || operand == '/') {
                    break;
                } else {
                    if (in.hasNext()) {
                        String Quit = in.next();
                        if (Quit.equals("quit") || Quit.equals("q")) {
                            return;
                        }
                    }
                    System.out.println("Yor input not number. Try again");
                }
                System.out.println("Yor input not number. Try again");
            }
        }

        switch (operand) {
            case '+':
                System.out.println("Sum is:" + (first + second));
                break;
            case '-':
                System.out.println("Differense is: " + (first - second));
                break;
            case '*':
                System.out.println("Multiplication is: " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Division is 0 not allowed");
                } else {
                    System.out.println("Division is: " + (first / second));
                }
                break;
        }



    }
}

