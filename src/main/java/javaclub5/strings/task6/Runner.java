package javaclub5.strings.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo! *
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * @author Rostyslav Ros
 */


public class Runner {
    public static void main(String[] args) {
        start();
    }

    /**
     * The function takes a name as its only argument, and returns one of the following strings:     *
     * name + " plays banjo"
     * name + " does not play banjo"
     * @param name - name of person
     *
     */
    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().charAt(0) == 'r') {
            return name + " plays banjo";
        }
        else return name + " does not play banjo";
    }

    /**
     * main method of Class
     *
     */
    public static void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a name");
        try {
            String name = reader.readLine();
            System.out.println(areYouPlayingBanjo(name));
        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
