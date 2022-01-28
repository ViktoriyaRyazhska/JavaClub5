package javaclub5.basicprogram.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implement a function which multiplies two numbers.
 *
 * @author Popova Anna
 */
public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("Program expecting from you two numbers to enter to multiply them: ");
        try {
            System.out.println("Enter first number: ");
            int firstNum = Integer.parseInt(br.readLine());
            System.out.println("Enter second number: ");
            int secondNum = Integer.parseInt(br.readLine());
            System.out.println("Result: " + multiplyTwoNums(firstNum, secondNum));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int multiplyTwoNums(int a, int b) {
        return a * b;
    }
}
