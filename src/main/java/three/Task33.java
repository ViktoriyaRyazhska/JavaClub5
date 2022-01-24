package three;

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

}