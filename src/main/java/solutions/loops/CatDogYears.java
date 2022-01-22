package solutions.loops;

public class CatDogYears {

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

}
