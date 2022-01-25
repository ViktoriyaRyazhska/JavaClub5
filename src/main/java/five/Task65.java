package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Task65 {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        for (int i = 0; i < s[0].length(); i++) {
            sb.append(prefix);
            sb.append(s[0].charAt(i));
            prefix = "***";
        }
        return sb.toString();
    }

    public static void task65(BufferedReader reader) {
        System.out.println("This program returned sorted massive of string, and have \"***\" between each of its first letters.");
        try {
            System.out.println("Enter massive of string for example : one,two,free,four,five,six ");
            String readLine = reader.readLine();
            String[] str = readLine.split(",");
            System.out.println("Result is :" + Task65.twoSort(str));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}

