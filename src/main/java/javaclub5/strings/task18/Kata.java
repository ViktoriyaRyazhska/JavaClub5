package javaclub5.strings.task18;

public class Kata {

    public static String remove(String s, int n) {
        return s.replaceAll("\\!", String.valueOf(n));

    }
}
