package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task36 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for(Boolean bool : arrayOfSheeps)
            if (bool != null && bool)
                counter++;
        return counter;
    }

    public static void task36() {
        System.out.println("The task is to count true statements in boolean array.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Set array in format like this:");
        System.out.println("true false true true");
        try {
            String[] str = reader.readLine().split(" ");
            Boolean[] bools = new Boolean[str.length];
            for(int i = 0; i < str.length; i++) {
                bools[i] = Boolean.parseBoolean(str[i]);
            }
            System.out.println("Answer: " + countSheeps(bools));
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }

    }
}
