package javaclub5.conditions.task21;

public class Kata {
    public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + salary * (bonus ? 10 : 1);
    }
}
