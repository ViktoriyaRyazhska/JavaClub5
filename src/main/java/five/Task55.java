package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task55 {
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }

    public static void task55(BufferedReader reader) {
        System.out.println("Write a line in which the characters will be corrected . to -");
        try {
            String str = reader.readLine();
            System.out.println("Line is " + replaceDots(str));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

}
