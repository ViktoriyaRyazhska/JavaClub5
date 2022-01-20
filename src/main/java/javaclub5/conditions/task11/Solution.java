package javaclub5.conditions.task11;

/**
 *
 * Class created by Codewars
 */

public class Solution {

    /**
     * calculate the volume of a cuboid with three values:
     * @param n - number of the sequence.
     * @return finds the nth number of the sequence.
     */
    public static int sequence(int n) {
        int [] sequenceArray = new int[n];
        sequenceArray[0] = 0;
        if (n > 1) {
            sequenceArray[1] = 1;
            for (int i = 2; i < n; i++) {
                sequenceArray[i] = ((sequenceArray[i - 2] + sequenceArray[i - 1]) % 3);
            }
        }
        return sequenceArray[n - 1];
    }
}
