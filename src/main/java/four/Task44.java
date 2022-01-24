package four;

import java.io.BufferedReader;
import java.util.Arrays;

public class Task44 {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <=n; i ++){
            result = result+i;
        }
        return result;
    }

    public static void task44(BufferedReader reader) {
        System.out.println("Write a program that finds the summation of every number from" +
                " 1 to num. The number will always be a positive integer greater than 0.");


        try {
            System.out.println("Set int  parameter value1:");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Answer: summation of every number "+x+" is --> " +summation(x));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
