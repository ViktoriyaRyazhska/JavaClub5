package javaclub5.loops.task32;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 17:08
 */
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        if(string==null || string.equals("")) throw new IllegalArgumentException("string must not be empty");
        if (repeat<0) throw new IllegalArgumentException("repeat must be positive");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            s.append(string);
        }
        return s.toString();
    }
}
