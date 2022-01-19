package one;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task01 {
    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static void task1() {
        System.out.println("The task is to double the integer and return it.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: " + doubleInteger(i));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}