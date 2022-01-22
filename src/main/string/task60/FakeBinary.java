package main.string.task60;

import main.InterfaceTestClass;

import java.util.Scanner;

public class FakeBinary implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    @Override
    public void execute() {
        System.out.println("Given a string of digits, I will replace any digit below 5 with '0' and any digit 5 and above with '1'.\n Return the resulting string.");
        System.out.println("Please write any digits you want.");
        String digits = scanner.nextLine();
        System.out.println(FakeBinary.fakeBin(digits));
    }
}
