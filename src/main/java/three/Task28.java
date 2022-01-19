// Task28. The Modulo-3 Sequence
public class Solution {
    public static int sequence(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n-1];

    }
}

/*      The Modulo-3 Sequence
Consider a sequence where the first two numbers are 0 and 1 and the next number of the sequence is the sum of the previous 2 modulo 3. Write a function that finds the nth number of the sequence.
Constraints:

    1 ? N ? 10^19

Example:
sequence(1);
0
sequence(2);
1
sequence(3);
1

*/
