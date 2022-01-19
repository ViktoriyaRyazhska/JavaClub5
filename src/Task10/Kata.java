package Task10;

public class Kata {
    public static String datingRange(int age) {
        int min = age / 2 + 7;
        int max = (age - 7) * 2;

        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        }
        return min + "-" + max;
    }
}
