package javaclub5.loops.tesk43;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 18:25
 */
public class CodeWarsMath {
    public static int nearestSq(final int n) {
        if (n < 0) throw new IllegalArgumentException("Only positive number!");
        double sqrt = Math.sqrt(n);
        int iL = (int) Math.floor(sqrt);
        int iR = (int) Math.ceil(sqrt);

        if(iL==iR) return iL*iL;

        int leftKv = iL*iL;
        int rightKv = iR*iR;

        if (n-leftKv<rightKv-n) return leftKv;
        else return rightKv;
    }
}
