package javaclub5.classes.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 /**
 *
 * The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.
 * But it's not working properly.
 * Task
 * Fix the code so we can all go home early.
 * Restrictions
 *     Do not modify the constructor
 *     Do not modify the plus100 method
 *     Do not modify the ONE_HUNDRED declaration
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
        System.out.println("Input a number to increment by 100");
        try {
            int number = Integer.parseInt(reader.readLine());
            Dinglemouse dinglemouse = Dinglemouse.INST;
            System.out.println(dinglemouse.plus100(number));
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }

    }
}
