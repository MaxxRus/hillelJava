import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ольга on 19.11.2015.
 */
public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimens = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < twoDimens.length; i++) {
            for (int j = 0; j < twoDimens[i].length; j++) {
                twoDimens[i][j] = (int) Math.floor(rand.nextInt(40) - 20);
            }
        }
        System.out.println(Arrays.deepToString(twoDimens));
        System.out.println(SumArray(twoDimens));
        System.out.println(MeanArray(twoDimens));
        System.out.println((MinElement(twoDimens)));
        System.out.println((MaxElement(twoDimens)));
        System.out.println(CountElement(twoDimens));

        for (int i = 0 ; i<twoDimens.length;i++){
            int sum = 0;
            for(int j = 0; j<twoDimens[i].length;j++){
                sum = sum + twoDimens[i][j];
            }
            System.out.println("sum line " + i+ " eq "+ sum);
        }

    }

    public static int SumArray(int[][] twoDimens) {
        int sum = 0;
        for (int i = 0; i < twoDimens.length; i++) {
            for (int j = 0; j < twoDimens[i].length; j++) {
                sum = sum + twoDimens[i][j];
            }
        }
        return sum;
    }



    public static double MeanArray(int[][] twoDimens) {
        double mean = 0;
        mean = SumArray(twoDimens) / (twoDimens.length * twoDimens[0].length);
        return mean;
    }

    public static int MinElement(int[][] twoDimens) {
        int min = twoDimens[0][0];
        for (int i = 0; i < twoDimens.length; i++) {
            for (int j = 0; j < twoDimens[i].length; j++){
                if (min > twoDimens[i][j]){
                    min = twoDimens[i][j];
                }
            }
        }
        return min;

    }

    public static int MaxElement(int[][] twoDimens) {
        int max = twoDimens[0][0];
        for (int i = 0; i < twoDimens.length; i++) {
            for (int j = 0; j < twoDimens[i].length; j++){
                if (max < twoDimens[i][j]){
                    max = twoDimens[i][j];
                }
            }
        }
        return max;

    }

    public static int CountElement(int[][] twoDimens) {
        int count = 0;
        for (int i = 0; i < twoDimens.length; i++) {
            for (int j = 0; j < twoDimens[i].length; j++){
                if ( twoDimens[i][j]>0){
                    count++;
                }
            }
        }
        return count;

    }


}
