package javaclub5.strings.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *The code provided is supposed replace all the dots . in the specified String str with dashes -
 * But it's not working properly.
 * Task
 * Fix the bug so we can all go home early.
 * Notes
 * String str will never be null.
 *
 * @author Rostyslav Ros
 */


public class Runner {
    public static void main(String[] args) {
        start();
    }

    /**
     * Replaces all the dots . in the specified String str with dashes -
     * @param str - specified String,
     * @return String without dots
     */
    public static String replaceDots(String str) {
        return str.replaceAll("\\.", "-");
    }

    /**
     * main method of Class
     *
     */
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a string");
        try {
            String word = reader.readLine();
            System.out.println("String without dots: " + replaceDots(word));
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
