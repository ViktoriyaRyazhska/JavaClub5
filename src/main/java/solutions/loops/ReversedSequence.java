package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;

public class ReversedSequence implements Executable {
    @Override
    public void execute() {
        System.out.println("Function that returns an array of integers from n to 1 where n>0.");
        int n;
        n = Helper.getInt(2000000000);
        System.out.println(Arrays.toString(createReversedSequence(n)));
    }

    private int[] createReversedSequence(int n) {
        int[] seq = new int[n];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = seq.length - i;
        }
        return seq;
    }
}