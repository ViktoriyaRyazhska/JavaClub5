package main.string.task52;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;
public class Kata4 implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);

    public static String solution(String str) {

        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which complete the solution so that it reverses the string passed into it.");
        System.out.println("You must enter string. ");
        System.out.println("Lets enter a word: ");
        try {
            String word = scan.nextLine();
            System.out.println(Kata4.solution(word));
        }catch (Exception e){
            System.out.println("Please check your input.");
        }
    }
}