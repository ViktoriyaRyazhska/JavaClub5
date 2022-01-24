package javaclub5.string.task58;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 22:39
 */
public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
        if (one.isEmpty() || two.isEmpty() || three.isEmpty()) throw new NullPointerException("Not null!!!");
        if(one.length()!=two.length() || two.length()!=three.length()) throw new IllegalArgumentException("All words have to be the same length");
        String result="";
        for (int i = 0; i < one.length(); i++) {
            result = result + one.charAt(i)+two.charAt(i)+three.charAt(i);
        }
        return result;
    }
}
