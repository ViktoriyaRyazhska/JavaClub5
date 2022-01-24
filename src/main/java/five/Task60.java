package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task60 {
    public static String fakeBin(String numberString) {
        if (numberString.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : numberString.split("")) {
            if (Integer.parseInt(s) < 5) {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        return sb.toString();
    }

    public static void task60(BufferedReader reader) {
        System.out.println("This program should replace any digit below 5 with '0' and any digit 5 and above with '1'.");
        try {
            System.out.println("Enter your string of number");
            String str = reader.readLine();
            System.out.println("Binary line is :" + fakeBin(str));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
