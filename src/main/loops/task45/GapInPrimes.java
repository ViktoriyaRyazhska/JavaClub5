package main.loops.task45;

import main.InterfaceTestClass;

import java.util.*;
import java.util.stream.LongStream;

public class GapInPrimes implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

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

    @Override
    public void execute() {
        int first = 0;
        long second = 0;
        long third = 0;
        System.out.println("The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1.\n" +
                " From 3 to 5 the gap is 2. From 7 to 11 it is 4. \n" +
                "Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43");
        System.out.println("I need from you 3 digits");
        System.out.println("Please insert: g -> (integer >= 2) which indicates the gap we are looking for");
        try {
            first = scanner.nextInt();
            System.out.println("Please insert: m -> (integer > 2) which gives the start of the search (m inclusive)");
            second = scanner.nextInt();
            System.out.println("Please insert: n -> (integer >= m) which gives the end of the search (n inclusive)");
            third = scanner.nextInt();

            System.out.println(Arrays.toString(GapInPrimes.gap(first, second, third)));
        }catch (InputMismatchException | NumberFormatException exception){
            System.out.println("Wrong input!");
        }
    }
}