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
        public static String datingRange(final int age) {
            if (age <= 14) {
                double min = age - 0.10 * age;
                double max = age + 0.10 * age;
                return (Math.floor(min) + " " + Math.floor(max));

            } else {
                double min = ((double)age) / 2 + 7;
                double max = (age - 7) * 2;
                return (Math.floor(min) + " " + Math.floor(max));
            }
        }
        public static void start(BufferedReader br) {
            try {
                System.out.println("Enter number to search dating range: ");
                int age = Integer.parseInt(br.readLine());
                System.out.println(datingRange(age));
                System.out.println(datingRange(age));
                } catch (IOException e) {
                System.out.println("Wrong input");
                e.printStackTrace();
            }
        }
}
