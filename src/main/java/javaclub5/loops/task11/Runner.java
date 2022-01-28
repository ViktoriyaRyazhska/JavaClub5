package javaclub5.loops.task11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Twice as old
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static int TwiceAsOld(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            if ((a - i) / ((double) (b - i)) == 2) {
                result = i;
                break;
            }
        }
        for (int i = 0; i < a * 2; i++) {
            if ((a + i) / ((double) (b + i)) == 2) {
                result = i;
                break;
            }
        }
        return result;

    }

    public static void start(BufferedReader br) {
        System.out.println("Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).");
        try {
            System.out.println("Enter current father's age: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("current age of his son: ");
            int a = Integer.parseInt(br.readLine());
            System.out.println(TwiceAsOld(a, b));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }
}
