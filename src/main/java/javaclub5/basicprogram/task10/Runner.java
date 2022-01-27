package javaclub5.basicprogram.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Age Range Compatibility Equation
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }
    public static String datingRange(int age) {
        if (age <= 14) {
            int min = age - age/10;
            int max = age + age/10;
            return (min + "-" + max);

        } else {
            int min = (age) / 2 + 7;
            int max = (age - 7) * 2;
            return (min + "-" + max);
        }
    }
        public static void start(BufferedReader br) {
            try {
                System.out.println("Enter number to search dating range: ");
                int age = Integer.parseInt(br.readLine());
                System.out.println(datingRange(age));
                } catch (IOException e) {
                System.out.println("Wrong input");
                e.printStackTrace();
            }
        }
}
