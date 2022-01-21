package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task21 {
    public static String bonusTime(final int salary, final boolean bonus) {
        if(bonus) return "\u00A3" + salary * 10;
        return "\u00A3" + salary;
    }

    public static void task21() {
        System.out.println("The task is to check will employee receive a bonus or not and return final salary.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameters (salary, bonus (1 - will receive):");
            int i = Integer.parseInt(reader.readLine());
            boolean b = Integer.parseInt(reader.readLine()) == 1;

            System.out.println("Answer: " + bonusTime(i, b));
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }
}
