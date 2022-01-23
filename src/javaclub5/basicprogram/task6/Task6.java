package javaclub5.basicprogram.task6;

import java.util.Scanner;

public class Task6 {
    /*
    Given a non-negative integer n, write a function to_binary/ToBinary
    which returns that number in a binary format.
    */
    public static void main(String[] args) {
//        System.out.println(toBinary(1));  /* should return 1 */
//        System.out.println(toBinary(5));  /* should return 101 */
//        System.out.println(toBinary(11)); /* should return 1011 */
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program convert a non-negative integer n in a binary format.");
        int dig = 0;
        while (true) {
            System.out.println("Please enter non-negative integer number (or 'Exit' for finish):");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) break;
            try {
                dig = Integer.parseInt(str);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (dig < 0 || dig>=1024) {
                System.out.println("Only non-negative integer number and < 1024!");
            } else System.out.println(toBinary(dig));
        }
    }

    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static int toBinary1(int n) {
        String str = Integer.toBinaryString(n);
        char[] chars = str.toCharArray();

        int result = 0;
        for(int i=chars.length - 1; i>=0; i--)
            if(chars[i]=='1')
                result += Math.pow(10, (chars.length-i - 1));
        return result;
//        return Integer.parseInt(s, 2);
    }
}
