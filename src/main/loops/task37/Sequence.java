package main.loops.task37;

import main.InterfaceTestClass;


import java.util.Scanner;

public class Sequence implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which returns an array of integers from n to 1 where n>0.");
        System.out.println("You must enter one digit. ");
        System.out.println("Lets enter digit: ");
        try {
            int n = scan.nextInt();
            System.out.println(Sequence.reverse(n));
        } catch (Exception e) {
            System.out.println("Please check your input.");
        }
    }
}