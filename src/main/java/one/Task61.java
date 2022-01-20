package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task61 {
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }

    public static void task61() {
        System.out.println("The task is to convert first character of string to integer value.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set string which starts with integer:");
            System.out.println("Answer: " + howOld(reader.readLine()));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
