package javaclub5.loops.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Get the mean of an array
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static void start(BufferedReader br) {
        try {
            System.out.println("Enter length of array: ");
            int a = Integer.parseInt(br.readLine());
            int[] array1 = new int[a];
            for (int mark : array1) {
                System.out.println("Enter mark: ");
                array1[mark] = Integer.parseInt(br.readLine());
            }
            System.out.println("Mean of an marks: " + getAverage(array1));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        int res = (int) Math.round((double) sum / marks.length);
        return res;
    }
}

