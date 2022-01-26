package main.basicprogram.task8;

import main.InterfaceTestClass;

import java.util.Scanner;

public class CenturyFromYear implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int century(int year) {
        int century = 0;

        if (year <= 100)
            century = 1;
        else if (year % 100 == 0)
            century = year / 100;
        else
            century = year / 100 + 1;
        return century;
    }

    @Override
    public void execute() {
        int year;
        System.out.println("Enter the year whose century you want to know:");
        year = scanner.nextInt();
        if (year <= 0) {
            System.out.println("Year can't be negative!");
            System.out.println("Please enter the year again:");
            year = scanner.nextInt();
        }
        System.out.println(year + " year -> " + CenturyFromYear.century(year) + " century");
    }
}
