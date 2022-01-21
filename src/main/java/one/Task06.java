package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task06 {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static void task6() {
        System.out.println("The task is to convert integer to binary.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: " + toBinary(i));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
