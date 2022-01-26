package three;

import java.io.BufferedReader;

public class Task33 {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] years = new int[3];
        years[0] = humanYears;

        if(humanYears < 1) {
            return new int[]{0,0,0};
        }

        if(humanYears == 1) {
            years[1] = years[2] = 15;
        }
        if(humanYears == 2) {
            years[1] = years[2] = 24;
        }
        if(humanYears >= 3) {
            years[1] = 24 + (humanYears - 2) * 4;
            years[2] = 24 + (humanYears - 2) * 5;
        }
        return years;
    }


    public static void task33(BufferedReader reader) {
        System.out.println("The task is to figure out ages of cat and dog according to humans years. Consider that the animals appeared in the same year.");
        try {
            System.out.println("Set how many years ago did you got your pets");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Human years, cat's years and dog's years are:" + humanYearsCatYearsDogYears(n) +
                    " respectively");
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
