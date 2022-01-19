package javaclub5.loops.task8;

/**
 * Given a non-empty array of integers, return the result of multiplying the values together in order.
 * Example:[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 *
 * @author Popova Anna
 */

public class Runner {

    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) + 1);
            System.out.println(arr[i] + " ");
        }
        System.out.println(multiplyNumsInArray(arr));
    }

    public static int multiplyNumsInArray(int[] array) {
        int resOfMultiply = 1;
        for (int i = 0; i < array.length; i++) {
            resOfMultiply = resOfMultiply * array[i];
        }
        return resOfMultiply;
    }
}
