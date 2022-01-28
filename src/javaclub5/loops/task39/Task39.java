package javaclub5.loops.task39;

import java.util.Scanner;

public class Task39 {

    //Given a non-empty array of integers, return the result of multiplying the values together in order.

    public static void start(Scanner scanner) {
        try {
            System.out.println("Enter size of your array: ");
            int a = scanner.nextInt();
            int[] arr = new int[a];
            System.out.println("Answer is" + grow(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static int grow(int[] x) {
            int mult = 1;
            for (int j : x) {
                mult = mult * j;
            }
            return mult;
        }
}