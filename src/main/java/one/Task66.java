package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task66 {
    public static String correct(String string) {
        string = string.replaceAll("1", "I");
        string = string.replaceAll("0", "O");
        return string.replaceAll("5", "S");
    }

    public static void task66() {
        System.out.println("The task is to replace all 1, 0, 5 to I, O, S in string.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set string:");
            System.out.println("Answer: " + correct(reader.readLine()));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
