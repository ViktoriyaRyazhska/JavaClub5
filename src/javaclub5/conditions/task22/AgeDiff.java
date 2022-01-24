package javaclub5.conditions.task22;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 11:26
 */
public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int year = yearTo - birth;
        if (year == 0) return "You were born this very year!";
        if (year > 0)
            return "You are " + year + " year" + getEnd(year) + " old.";
        else{
            year=(-1) * year;
            return "You will be born in " + year + " year" + getEnd(year) + ".";
        }

    }

    private static String getEnd(int year) {
        return year==1?"":"s";
    }
}
