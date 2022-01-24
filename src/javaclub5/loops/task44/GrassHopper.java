package javaclub5.loops.task44;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 19:14
 */
public class GrassHopper {
    public static int summation(int n) {
        if (n < 0) throw new IllegalArgumentException("Only positive number!");
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
