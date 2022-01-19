package javaclub5.loops.task9;

/**
 * You get an array of numbers, return the sum of all the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 *
 * @author Popova Anna
 */
public class Runner {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 20) - 5);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of positive numbers in array: " + sumOfPositiveNumbers(arr));
    }

    public static int sumOfPositiveNumbers(int[] array) {
        int resOfSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                resOfSum = resOfSum + array[i];
            }
        }
        return resOfSum;
    }
}
