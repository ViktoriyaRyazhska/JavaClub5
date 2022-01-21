package javaclub5.conditions.task11;

import javaclub5.conditions.task10.Bob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Consider a sequence where the first two numbers are 0 and 1 and the next number of the sequence is the
 * sum of the previous 2 modulo 3. Write a function that finds the nth number of the sequence.
 * Constraints:
 *
 *     1 ≤ N ≤ 10^19
 *
 * @author Rostyslav Ros
 */

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println(" Input number of the sequence");
        try {
            int number = Integer.parseInt(reader.readLine());
            int result = Solution.sequence(number);
            System.out.printf("the %dth number of the sequence will be %d", number, result);

        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }

    }
}
