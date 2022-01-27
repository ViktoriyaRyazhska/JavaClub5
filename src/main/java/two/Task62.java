package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task62 {

        public static double convert(int F) {
        double celsius = (F - 32) * 5/9.0;

        return celsius;
    }

    public static void task62(BufferedReader reader){
        System.out.println("Debug celsius converter");
        System.out.println("Enter temperature in fahrenheit");

        try {
            int F = Integer.parseInt(reader.readLine());
            if (convert(F) > 0)
                System.out.println(convert(F) + " above 0");
            else
                System.out.println(convert(F) + " below 0");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
