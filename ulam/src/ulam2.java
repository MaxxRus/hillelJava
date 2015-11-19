//import java.util.InputMismatchException;
//import java.util.Scanner;
//
///**
// * Created by Ольга on 19.11.2015.
// */
//public class ulam2 {
//    public static void main(String[] args) {
//        System.out.println("Input number");
//        int volum = Input();
//        if (volum % 2 == 0) {
//            System.out.println("Number even");
//            return;
//        }
//        int[][] ulam = new int[volum][volum];
//        int count =0;
//        int i = 0;
//        int j = 0;
//        while (count<(volum*volum)){
//            ulam[volum/2+i][volum/2+j] = count++;
//            if ((i>j)& (i>=-j)){
//                i++;
//                j++;
//            }else {
//                if(i==j)&&(i>=0)){
//
//                }
//            }
//
//        }
//                           if i > j
//        i >= -j ? j += 1 : i += 1
//        elsif i == j
//        i >= 0 ? j += 1 : i += 1
//        else
//        i > -j ? i -= 1 : j -= 1
//        end
//                end
//        data
//                end
//    }
//    public static int Input() {
//        int a = 0;
//        Scanner scanner = new Scanner(System.in);
//        try {
//            a = scanner.nextInt();
//        } catch (InputMismatchException ex) {
//            System.out.println("Input wrong");
//        }
//        return a;
//
//    }
//}
