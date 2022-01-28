package javaclub5.strings.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("In this task we will combine all the strings together. " +
                "Note: input same amount of letters like first string.");
        try {
            System.out.println("Enter first string");
            String str1 = br.readLine();
            System.out.println("Enter second string");
            String str2 = br.readLine();
            System.out.println("Enter third string");
            String str3 = br.readLine();
            System.out.println("Result: " + tripleTrouble(str1, str2, str3));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }

    public static String tripleTrouble(String one, String two, String three) {
        String s = "";
        for (int i = 0; i < one.length(); i++) {
            s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return s;
    }
}
