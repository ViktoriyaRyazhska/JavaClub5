package main.conditions.task28;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModuloThreeSequence implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int sequence(int n) {
        int[] seq = new int[n + 2];

        seq[0] = 0;
        seq[1] = 1;

        if (n > 1) {
            for (int i = 2; i < n; i++) {
                seq[i] = (seq[i - 2] + seq[i - 1]) % 3;
            }
        }
        return seq[n - 1];
    }

    @Override
    public void execute() {
        int n;
        System.out.println("Consider a sequence where the first two numbers " +
                "are 0 and 1 and the next number of the sequence is the sum of the previous 2 modulo 3.");
        System.out.println("Please enter the number of the sequence you want to know: ");
        try {
            n = scanner.nextInt();
            System.out.println("Result: " + ModuloThreeSequence.sequence(n));
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println("Wrong input!");
        }
    }
}
