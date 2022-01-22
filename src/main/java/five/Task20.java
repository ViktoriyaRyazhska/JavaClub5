package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task20 {
    public static class BooleanToString {
        public static String convert(boolean b) {
            if (b) {
                return "true";
            } else {
                return "false";
            }
        }
    }

    public static void task20(BufferedReader reader) {
        System.out.println("Function which convert the given boolean value into its string representation");
        try {
            System.out.println("Enter your boolean value please !");
            boolean parseBoolean = Boolean.parseBoolean(reader.readLine());
            System.out.println("Your string is : " + BooleanToString.convert(parseBoolean));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
