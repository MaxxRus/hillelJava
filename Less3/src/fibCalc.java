/**
 * Created by ITHILLEL3 on 09.11.2015.
 */
public class fibCalc {
    public static void main(String[] args) {
       // System.out.println(sumProcedure(15000));
        System.out.println(calculateFib(50));
    }
    public static long[] cache = new long[51];

    public static long calculateFib(int num) {
        if (cache[num]!=0){
            return cache[num];
        } else if (num == 0 || num == 1){
            cache[num] = 1;
            return 1;
        } else {
            long res = calculateFib(num - 2) + calculateFib(num - 1);
            cache[num] = res;
            return res;
        }



//        if (num == 0 || num == 1) {
//            return 1;
//
//        } else {
//            return calculateFib(num - 2) + calculateFib(num - 1);
//        }
    }

    public static long sumProcedure(long peek) {
        int i = 0;
        long sum = 0;
        while ( i <= peek){
            sum = sum +i;
            i++;
        }
        return sum;
//        if (peek == 1){
//            return 1;
//        } else {
//            return peek + sumProcedure(peek - 1);
//        }

    }
}
