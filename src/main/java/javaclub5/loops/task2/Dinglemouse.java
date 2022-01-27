package javaclub5.loops.task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Dinglemouse {

    public static void start(BufferedReader reader) {
        System.out.println("You have a cat and a dog. " +
                "You got them at the same time as kitten/puppy. That was humanYears years ago.");
        System.out.println("How many years do you have a dog and cat?");
        try {
            int years = Integer.parseInt(reader.readLine());
            int [] result = humanYearsCatYearsDogYears(years);
            System.out.println("Their respective ages now: \nCat: " + result[1] + "\nDog: " + result[2]);
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        for (int i = 1; i <= humanYears; i++) {
            switch (i) {
                case 1: {
                    catYears = 15;
                    dogYears = 15;
                    break;
                }
                case 2: {
                    catYears += 9;
                    dogYears += 9;
                    break;
                }
                default: {
                    catYears += 4;
                    dogYears += 5;
                }
            }
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}
