package javaclub5.strings.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }
    public static void start(BufferedReader br)
    {
        try {
            System.out.println("Enter string to remove spaces");
            String str = br.readLine();
            System.out.println("Result: " + noSpace(str));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
