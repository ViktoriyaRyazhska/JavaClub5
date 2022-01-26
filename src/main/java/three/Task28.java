package three;

import java.io.BufferedReader;

public class Task28 {

    public static int sequence(int n) {
        int[] nums = new int[]{0, 1, 1, 2, 0, 2, 2, 1};
        return nums[(n-1)%8];
    }

    public static void task28(BufferedReader reader) {
        System.out.println("The task is to write a function that finds the nth number of the sequence, where the first two numbers are 0 and 1 and the next number of the sequence is the sum of the previous 2 modulo 3.");
        try {
            System.out.println("Set parameter:");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Result " + sequence(n));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

