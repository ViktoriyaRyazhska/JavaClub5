package javaclub5.basicprogram.task9;

import java.util.Scanner;

public class Task9 {
    public static int makeNegative(int x) {
        int m = 0 - x;
        if (x < 0 || x == 0) {
            return x;
        }
        return m;
    }

    public static void main(Scanner sc) {
        try {
            System.out.println("Enter number:");
            int x= sc.nextInt();
            System.out.println(makeNegative(x));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }

}
