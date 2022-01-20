package main.string.task65;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }
}
