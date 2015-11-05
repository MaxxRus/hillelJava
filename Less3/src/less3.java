import java.util.Scanner;

/**
 * Created by ITHILLEL3 on 05.11.2015.
 */
public class less3 {


    public static void main(String[] args) {
//        double res = add(2,3);
//       // System.out.println(res);
//        double res1 =add(2.2, 3.2);
//       // System.out.println(res1);
//        int i =10;
//        int[] arr;
//        int[] arr1;
//        arr = new int[i];
//        System.out.println(arr[1]);
//        arr[0] = 100;
//        System.out.println(arr[0]);
//        arr1 = new int[]{1,2,3};
//        for (int j = 0; j < arr.length; j++){
//            System.out.println(arr1[j]);
//        }
//        for (int j : arr1) {
//            System.out.println(j);
//        }


        int [][] arr2 =  new int [5][5];
        arr2[0][1]= 3;
        for(int[] a : arr2){
            for(int elem:a){
                System.out.print(elem);
            }
            System.out.print("\n");
        }



        //int[] test new int[20];
        //arr.length





    }

    public static double add (int first, int second) {
        System.out.println("integer");
        double resalt = first + second;
        return resalt;
    }

    public static double add (double first, double second) {
        System.out.println("double");
        double resalt = first + second;
        return resalt;
    }

}
