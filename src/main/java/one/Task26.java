package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task26 {
    public static String boolToWord(boolean b) {
        if(b)
            return "Yes";
        return "No";
    }

    public static void task26(BufferedReader reader) {
        System.out.println("The task is to convert boolean values to strings 'Yes' or 'No'");
        try {
            System.out.println("Set parameter (true or false)");
            boolean bool = Boolean.getBoolean(reader.readLine());
            System.out.println("Answer: " + boolToWord(bool));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
