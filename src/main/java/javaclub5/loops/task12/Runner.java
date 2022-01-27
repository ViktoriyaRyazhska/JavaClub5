package javaclub5.loops.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Enter number to find nearest square number");
        try {
            int n = Integer.parseInt(br.readLine());
            if (n >= 0)
                System.out.println("Result " + nearestSq(n));
            else
                System.out.println("Wrong input, must be bigger than 0");
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }
    }
        public static int nearestSq (final int num){
            int num1 = (int) Math.sqrt(num);
            if(num1 * num1 == num)
                return num;

            else{
                int floorSquare = num1 * num1;
                int ceilingSquare = (num1 + 1) * (num1 + 1);
                if(Math.abs(floorSquare-num) <= Math.abs(ceilingSquare -num) )
                    return floorSquare;
                else
                    return ceilingSquare;
            }

        }
}
