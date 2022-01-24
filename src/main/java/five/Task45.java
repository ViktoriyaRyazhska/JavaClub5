package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task45 {
    public static long[] gap(int g, long m, long n) {
        List<Long> longs = primeListWithRange(m, n);
        if (longs == null) {
            return null;
        }
        long[] mass = new long[2];
        for (int i = 1; i < Objects.requireNonNull(longs).size(); i++) {
            if (longs.get(i) - longs.get(i - 1) == g) {
                mass[1] = longs.get(i);
                mass[0] = longs.get(i - 1);
                return mass;
            }
        }
        return null;
    }


    private static List<Long> primeListWithRange(long m, long n) {
        if (m == n) {
            return null;
        }
        boolean prime = true;
        List<Long> integers = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                integers.add(i);
            }
            prime = true;
        }
        return integers;
    }

    public static void task45(BufferedReader reader) {
        System.out.println("This function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n");
        try {
            System.out.println("Enter g - number of gap, and limits m, n like : 5,2,1000 ");
            String readLine = reader.readLine();
            int[] ints = Arrays.stream(readLine.split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println("Your input is " + Arrays.toString(ints));
            System.out.println("Prime range is : " + Arrays.toString(gap(ints[0], ints[1], ints[2])));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
