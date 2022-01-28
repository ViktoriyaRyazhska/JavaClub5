package main.string.task58;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Triple implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String tripleTrouble(String one, String two, String three) {
        String[] one1 = one.split("");
        String[] two1 = two.split("");
        String[] three1 = three.split("");
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            newString.append(one1[i]).append(two1[i]).append(three1[i]);
        }
        return newString.toString();
    }

    @Override
    public void execute() {
        System.out.println("Please write three strings to combine the first letters of all of its " +
                "in one string(strings must be the same length!)");
        System.out.println("Enter the first string:");
        try {
            String first = scanner.nextLine();
            System.out.println("Enter the second string:");
            String second = scanner.nextLine();
            System.out.println("Enter the third string:");
            String third = scanner.nextLine();
            if (first.length() != second.length() && first.length() != third.length() && third.length() != second.length()) {
                System.out.println("The lines must be the same length! Try to enter the strings again!");
                System.out.println("Enter the first string:");
                first = scanner.nextLine();
                System.out.println("Enter the second string:");
                second = scanner.nextLine();
                System.out.println("Enter the third string:");
                third = scanner.nextLine();
            }
            System.out.println("Result: " + Triple.tripleTrouble(first, second, third));
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
    }
}
