package javaclub5.oop.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {
   /* public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }
    */

    public static void start(BufferedReader br) {
        System.out.println("The objective of this task is to provide some way to encode a string into its leetspeak version.");
        System.out.println("Enter string to encode");
        try {
            Leetspeak myEncoder = new Leetspeak();
            String n = br.readLine();
            System.out.println("Result " + myEncoder.encode(n));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }
}
