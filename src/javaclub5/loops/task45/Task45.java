package javaclub5.loops.task45;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task45 {
    public static void start (Scanner scanner){
    try {
        System.out.println("In this task we will try to find the first pair of two prime numbers.");
        System.out.println("Enter the gap you are looking for: ");
        int g = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number what gives the start of the search: ");
        long m = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter amount from 1 to 1100000: ");
        long n = Integer.parseInt(scanner.nextLine());
        System.out.println("This is the first pair of two prime numbers spaced with a gap: "
                + Arrays.toString(gettingPrimes(g, m, n)));
    } catch (NumberFormatException e) {
        System.out.println("Not number entered.");
    }
}

    public static long[] gettingPrimes(int g, long m, long n) {

        if (n > 1100000) {
            System.out.println("Entered number is over 110000!");
            return null;
        }

        List<Long> numbers = new ArrayList<>();

        long i = 0;

        for (long j = m; j <= n; j++) {
            int counter = 0;
            for (i = j; i >= 1; i--) {
                if (j % i == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                numbers.add(j);
            }
        }
        System.out.println("Prime numbers from " + m + " to " + n + " are :");

        long[] array = new long[numbers.size()];
        for (int k = 0; k < numbers.size(); k++) {
            array[k] = numbers.get(k);
        }
        System.out.println(numbers);
        long[] arr = new long[2];

        for (int a = 0, b = 1; b < array.length; a++, b++) {
            if (array[b] - array[a] == g) {
                arr[0] = array[a];
                arr[1] = array[b];
                return arr;
            }
        }
        return null;
    }
}
