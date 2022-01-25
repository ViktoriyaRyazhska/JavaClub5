package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.ArrayList;
import java.util.Arrays;

public class GapInPrimes implements Executable {
    @Override
    public void execute() {
        System.out.println("Program that finds the first gap (g) between two prime numbers in" +
                " a given range (m, n)." +
                "\nThe gap means that between those two nums shouldn't be any other " +
                "\nprime nums.");
        System.out.println("Enter the g: ");
        int g = Helper.getInt(2, 2000000000);
        System.out.println("Enter the m: ");
        long m = Helper.getLong(2, 2000000000);
        System.out.println("Enter the n: ");
        long n = Helper.getLong(m, 2000000000+1);
        long[] longs = gapInPrimes(g, m, n);
        if (longs == null){
            System.out.println("No such gaps");
        } else {
            System.out.println("The gap is: " + Arrays.toString(longs));
        }
    }

    public long[] gapInPrimes(int g, long m, long n) {
        long[] nums = null;
        if ((m&1) == 0){
            m++;
        }

        long current;

        for (long i = m; i < n-g; i+=2) {
            if (isPrime(i) && isPrime(i+g)){
                boolean isGap = true;
                for (long j = i+2; j < i+g; j+=2) {
                    if (isPrime(j)){
                        isGap = false;
                        break;
                    }
                }
                if (isGap) {
                    nums = new long[]{i, i + g};
                    break;
                }
                i = i+g;
            }
        }

        return nums;
    }

    private boolean isPrime(long n){
            // Corner case
            if (n <= 1)
                return false;

            // Check from 2 to square root of n
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    return false;

            return true;
    }
}
