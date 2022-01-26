package main.loops.task33;

import main.InterfaceTestClass;

import java.util.Arrays;
import java.util.Scanner;

public class CatYearsDogYears implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0, dogYears = 0;
        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        }
        if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        }
        if (humanYears >= 3) {
            catYears = 4 * (humanYears - 2) + 24;
            dogYears = 5 * (humanYears - 2) + 24;
        }
        return new int[]{humanYears, catYears, dogYears};
    }

    @Override
    public void execute() {
        int humanYears;
        System.out.println("If you want to know the age of your cat and dog " +
                "knowing how old they are in human years, please enter human years: ");
        humanYears = scanner.nextInt();
        System.out.println(" [human years,cat years,dog years]: " + Arrays.toString(CatYearsDogYears.humanYearsCatYearsDogYears(humanYears)));
    }
}
