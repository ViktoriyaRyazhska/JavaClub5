package javaclub5.strings.task13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Abbreviate a Two Word Name
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static String abbrevName(String name) {
        String[] ab = name.split(" ");
        return (ab[0].charAt(0) + "." + ab[1].charAt(0)).toUpperCase();
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }
    public static void start(BufferedReader br) {
        System.out.println("In this task we will convert name and surname into initials.");
        try {
            System.out.println("Enter your name and surname: ");
            String name = br.readLine();
            System.out.println(abbrevName(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
