package javaclub5.conditions.task12;

import javaclub5.conditions.task11.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * When provided with a number between 0-9, return it in words. *
 * Input :: 1 *
 * Output :: "One". *
 * If your language supports it, try using a switch statement.
 *
 * @author Rostyslav Ros
 */

public class Runner {
    public static void main(String[] args) {
        start();
    }

    /**
     * main method of Class
     *
     */
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Input number ");
        try {
            int number = Integer.parseInt(reader.readLine());
            System.out.println("The result will be: " + switchItUp(number));

        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param number - number between 0-9.
     * @return number in words.
     */

    public static String switchItUp(int number) {
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Wrong number";
        }
    }
}
