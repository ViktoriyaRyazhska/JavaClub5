package javaclub5.basicprogram.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }

    public static void start(BufferedReader n) {
        try {
            System.out.println("Enter your nuber to convert to binary");
            int i = Integer.parseInt(n.readLine());
            System.out.println(Integer.valueOf(Integer.toBinaryString(i)));

        } catch (IOException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
        }

    }

}
