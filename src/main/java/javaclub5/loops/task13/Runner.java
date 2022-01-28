package javaclub5.loops.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("Enter number to sum");
        try {
            int n = Integer.parseInt(br.readLine());
            if(n>0)
                System.out.println("Result " + summation(n));
            else
                System.out.println("Wrong input, must be bigger than 0");
        } catch (IOException e) {
            System.out.println("Wrong input");
        }

    }
    public static int summation(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
