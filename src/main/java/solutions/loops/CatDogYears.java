package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;

public class CatDogYears implements Executable {

        public static int[] humanYearsCatYearsDogYears(final int humanYears) {
            int[] ints = {humanYears, 0, 0};
            for (int j = 1; j < ints.length; j++) {

            for (int i = 0; i<humanYears; i++) {
                if (i == 0) {
                    ints[j] += 15;
                } else if (i == 1) {
                    ints[j] += 9;
                } else {
                    ints[j] += j+3;
                }
            }}
            return ints;
        }

    public CatDogYears() {}

    @Override
    public void execute() {
        System.out.println("Program will return cat's and dog years relative to human once." +
                " Enter human years:");
        int a = Helper.getInt(100);
        int[] ints = humanYearsCatYearsDogYears(a);
        System.out.println("Human years: " +  ints[0] +"\n"
                            +"Cat years: " +  ints[1] +"\n"
                            +"Dog years: " +  ints[2] +"\n"
        );
        Helper.promptEnterKey();
    }
}