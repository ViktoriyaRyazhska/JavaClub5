package main.string.task67;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;
public class StringUtils implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 90 && arr[i] >= 65) {
                arr[i] += 32;
            } else if (arr[i] <= 122 && arr[i] >= 97) {
                arr[i] -= 32;
            }
        }
        return new String(arr);

    }

    @Override
    public void execute() {
        System.out.println("Implement a function where each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.");
        System.out.println("You must enter a word or sentence. ");
        System.out.println("Lets enter a word or sentence: ");
        try {
            String str = scan.nextLine();
            System.out.println(StringUtils.toAlternativeString(str));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}