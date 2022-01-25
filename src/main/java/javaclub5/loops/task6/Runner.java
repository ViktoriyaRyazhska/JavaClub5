package javaclub5.loops.task6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * Build a function that returns an array of integers from n to 1 where n>0.
 *
 * Example : n=5 --> [5,4,3,2,1]
 *
 * @author Rostyslav Ros
 */

public class Runner {

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println("Build an array of integers from n to 1 where n>0");
        System.out.println(" Input number n");
        try {
            int number = Integer.parseInt(reader.readLine());
            int [] result = reverse(number);
            System.out.println("Your array will be:");
            System.out.println(Arrays.toString(result));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }

    /**
     * Returns an array of integers from n to 1 where n>0
     * @param n - number where n>0.
     * @return an array of integers from n to 1
     */
    public static int[] reverse(int n){
        int[] resultArray = new int[n];
        int j = 0;
        for (int i = n; i > 0; i--) {
            resultArray[j] = i;
            j++;
        }
        return resultArray;
    }
}
