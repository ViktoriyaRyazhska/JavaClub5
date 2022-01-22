package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static String datingRange(int age) {
        double min, max;

        if (age < 15) {
            min = age - 0.1 * age;
            max = age + 0.1 * age;
        } else {
            min = (age >> 1) + 7;
            max = (age - 7) * 2;
        }

        return (int) min + "-" + (int) max;
    }

    public static void task10(BufferedReader reader) {
        System.out.println("Age Range Compatibility Equation");
        try {
            System.out.println("Enter your age please !");
            String age = reader.readLine();
            System.out.println("Your range equation: " + datingRange(Integer.parseInt(age)));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
