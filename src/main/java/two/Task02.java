package two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task02{

    public static int multiplying (int a, int b) {
        return a * b;
    }

    public static void task02() {
        System.out.println("Multiplying of two numbers and return result.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter first number:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Enter second number:");
            int b = Integer.parseInt(reader.readLine());
            System.out.println("Result: " + multiplying(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
