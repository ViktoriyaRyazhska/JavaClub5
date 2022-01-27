package javaclub5.strings.task15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Sort and Star
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("In this task we will sort the array, then split each letter of the first word with ***.");
        System.out.println("Enter array size:");
        try {
            int amount = Integer.parseInt(br.readLine());
            String[] words = new String[amount];
            System.out.println("Enter the words you wanna add to the array:");
            for (int i = 0; i < words.length; i++) {
                words[i] = br.readLine();
            }

            System.out.println("This is the result: " + twoSort(words));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }

    }

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}