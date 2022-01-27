package main.string.task68;

import main.InterfaceTestClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExclamationMarksSeries implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String remove(String s, int n) {
        if (n == 0) {
            return s;
        }
        for (int i = 1; i <= n; i++) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }

    @Override
    public void execute() {
        System.out.println("Please write a sentence with exclamation marks(for example \"!!!Hi !!hi!!! !hi\")");
        String s = scanner.nextLine();
        System.out.println("How many exclamation marks do you want ro remove?");
        try {
            int n = scanner.nextInt();
            System.out.println("Sentence without " + n + " exclamation marks: ");
            System.out.println(ExclamationMarksSeries.remove(s, n));
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println("Wrong input!");
        }
    }
}
