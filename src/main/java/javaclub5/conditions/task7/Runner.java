package javaclub5.conditions.task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Your task is to create a function that does four basic mathematical operations.
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 *
 * @author Popova Anna
 */

public class Runner {

    public static void start(BufferedReader br) {
        try {
            System.out.println("Program will do arithmetic operation, please enter operation sign(/, +, -, *): ");
            String sign = br.readLine();
            System.out.println("Please, enter first value: ");
            int value1 = Integer.parseInt(br.readLine());
            System.out.println("Please, enter second value: ");
            int value2 = Integer.parseInt(br.readLine());
            System.out.println("Arithmetical result: " + arithmeticResult(sign, value1, value2));
        } catch (ArithmeticException a) {
            System.out.println("Can't divide ny 0!");
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }

    public static int arithmeticResult(String sign, int value1, int value2) {
        int result = 0;
        switch (sign) {
            case "-":
                result = value1 - value2;
                break;
            case "+":
                result = value1 + value2;
                break;
            case "/":
                if (value2 == 0) {
                    System.out.println("Can't divide by zero!");
                    return 0;
                }
                result = value1 / value2;
                break;
            case "*":
                result = value1 * value2;
                break;
        }
        return result;

    }

//    public static int res(String sign, int value1, int value2) {
//
//    }
}
