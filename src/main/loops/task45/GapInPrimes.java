package main.loops.task45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class GapInPrimes {
    public static boolean isPrime(long num) {
        return num > 1 && LongStream.rangeClosed(2, (long)Math.sqrt(num)).noneMatch(div-> num % div== 0);
    }

    public static long[] gap(int g, long m, long n) {
        long[] arr = new long[(int) (n - m + 1)];
        List<Long> primeNumbers = new ArrayList<Long>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = m + i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPrime((int) arr[i]))
                primeNumbers.add((arr[i]));
            else
                continue;
        }
        arr = new long[2];
        for (int i = 1; i < primeNumbers.size(); i++) {
            if ((primeNumbers.get(i) - primeNumbers.get(i - 1)) == g) {
                arr[0] = primeNumbers.get(i - 1);
                arr[1] = primeNumbers.get(i);
                return arr;
            } else
                continue;
        }
        return null;
    }

}