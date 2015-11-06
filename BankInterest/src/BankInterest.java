import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ольга on 06.11.2015.
 */
public class BankInterest {
    // work in cent
    // мотивы реализации класса деньги "архетиктура корпоративных программных приложений" Мартин Фаулер
    public static void main(String[] args) {

        double money = 0;
        int currency = 0;
        int interesst = 0;

        int year = 0;
//        int month = 0;

        System.out.println("Enter the amount of the deposit: ");

        Scanner scanner = new Scanner(System.in);
        try {
            money = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }

        currency = (int) money * 100;

        System.out.println("Interest rates per :");
        try {
            interesst = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }

        System.out.println("The duration of the contribution in years");
        try {
            year = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input wrong");
        }


        scanner.close();

        // попытка выразить годы через месяц
        // это нужно реализовать через метод
//
//        int intYear = (int)year;
//        double doubleYear = year - intYear;
//        month = intYear * 12;
////        System.out.println("intYear" + intYear);
////        System.out.println("doubleYear" + doubleYear);
////        System.out.println("month" + month);
//
//        int count = 0;
//
//        do {
//            count++;
//            doubleYear = doubleYear - 0.084;
//        } while (doubleYear > 0);
////        System.out.println("count " + count);
//        month = month + count;

        for (int i = 0; i < year; i++){
            System.out.println("Year "+i+" mony "+currency+" rate "+currency*interesst/100 );
            currency = currency+currency*interesst/100;
        }
//


    }

}
