package javaclub5.conditions.task28;

import java.util.Scanner;

public class Task28 {
    /*
    Consider a sequence where the first two numbers are 0 and 1 and the next number
    of the sequence is the sum of the previous 2 modulo 3. Write a function that finds
    the nth number of the sequence.
     */
    public static int sequence(int n) {
        int [] arr = new int[n];
        arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = ((arr[i - 2] + arr[i - 1]) % 3);
            }
        }
        return arr[n - 1];
    }


    public static void main(Scanner scanner) {
        System.out.println("Enter number of sequence: ");
        try{
            int a = scanner.nextInt();
            int b = sequence(a);
            System.out.println("sequence ("+a+")"  + "\n" +b);
        }catch (Exception e) {
            System.out.println("Put correct number");
        }
    }
}
