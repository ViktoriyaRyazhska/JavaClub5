package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task46 {
    public static int makeMove(int sticks) {
        return sticks % 4 != 0 ? sticks % 4 : 1;
    }

    public static void task46(BufferedReader reader) {
        System.out.println("The task is to create strategy of winning game \"21 sticks\" ");
        try {
            System.out.println("Set parameter:");
            System.out.println("Answer: " + makeMove(Integer.parseInt(reader.readLine())));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
