package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Task52 {
    public static String reg(String inputString){
        return ((Pattern.matches("[a-zA-Z]+", inputString) ?
                new StringBuffer(inputString).reverse().toString() : "Invalid value"));
    }

    public static void task52(BufferedReader reader){
    System.out.println("Reversed string");
    System.out.println("Enter value");
    try {
        String inputString = reader.readLine();
        System.out.println(reg(inputString));
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
