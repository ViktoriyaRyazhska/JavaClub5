package javaclub5.strings.task16;

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
            System.out.println("Enter string to corrcet the mistakes");
            String str2 = br.readLine();
            System.out.println("Result: " + correct(str2));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }
    public static String correct(String string) {
        if(string ==null || string.isEmpty()) {
            return string;
        }

        string = string.replace("1","I").replace("0","O").replace("5","S");

        return string;
    }
}
