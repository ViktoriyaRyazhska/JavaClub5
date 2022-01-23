package javaclub5.conditions.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Implement a function which convert the given boolean value into its string representation.
 *
 * @author Dmytro Prudius
 */

public class BooleanToString {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Enter a logical value: ");

        try{
            boolean b = Boolean.parseBoolean(br.readLine());
            System.out.println("Result: " + convert(b));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
//        boolean value = true;
//        int result = booleanToInt(value);
//        try {
//            result = Integer.parseInt(br.readLine());
//            System.out.println("Result: " + convert(value));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

    }
//    private static int booleanToInt(boolean b){
//        if (b)
//            return 1;
//        return 0;
//    }

    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }
}
