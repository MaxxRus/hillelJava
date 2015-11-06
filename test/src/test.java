/**
 * Created by Ольга on 06.11.2015.
 */
public class test {
    public static void main(String[] args) {
        double year = 1.5;
        int month;
        int intYear = (int)year;
        double doubleYear = year - intYear;
        month = intYear * 12;
        System.out.println(intYear);
        System.out.println(doubleYear);
        int count = 0;

        do{
            count++;
            doubleYear = doubleYear - 0.084;
        }while (doubleYear > 0);
        System.out.println("count " + count);

    }


}
