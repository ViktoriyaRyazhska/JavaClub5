package javaclub5.basicprogram.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    public static void start(BufferedReader br) {
        try {
            System.out.println("Enter your number to convert to binary");
            int i = Integer.parseInt(br.readLine());
            System.out.println("Result: " + toBinary(i));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }

    }
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

}
