package solutions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
}