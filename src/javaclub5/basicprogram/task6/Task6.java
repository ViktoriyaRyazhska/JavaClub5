package javaclub5.basicprogram.task6;

public class Task6 {
    /*
    Given a non-negative integer n, write a function to_binary/ToBinary
    which returns that number in a binary format.
    */
    public static void main(String[] args) {
        System.out.println(toBinary(1));  /* should return 1 */
        System.out.println(toBinary(5));  /* should return 101 */
        System.out.println(toBinary(11)); /* should return 1011 */
    }

    public static int toBinary(int n){
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
