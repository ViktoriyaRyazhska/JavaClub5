package javaclub5.basicprogram.task9;

import java.util.Scanner;

public class Task9 {
    public int makeNegative(int x) {
        int m = 0 - x;
        if (x < 0 || x == 0) {
            return x;
        }
        return m;
    }
/*
    public static void main(String[] args) {
        Task9 obj = new Task9();
        Scanner sc = new Scanner(System.in);

        try {
            int x= sc.nextInt();
            System.out.println(obj.makeNegative(x));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
    */
}
