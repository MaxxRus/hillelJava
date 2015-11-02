/**
 * Created by Ольга on 01.11.2015.
 */
import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args) {
        System.out.println("Please input first number:");
        Scanner in = new Scanner(System.in);{
            double a = in.nextDouble();//считываем целое число a
            System.out.println("Your input " + a + " as a first number.");
            System.out.println("Please input second number:");
            double b = in.nextDouble();//считываем целое число b
            System.out.println("Your input " + b + " as a second number");

            System.out.println("Sum is " + (a+b) );
            System.out.println("Difference is " + (a - b) );
            System.out.println("Multiplication is " + (a*b));
            if (b == 0) {
                System.out.println("Division is 0 not allowed");
            }
            else {
                System.out.println("Division is " + (a/b));
            }
        }
    }
}
