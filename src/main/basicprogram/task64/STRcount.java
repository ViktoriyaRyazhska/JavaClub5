package main.basicprogram.task64;

import main.InterfaceTestClass;

import java.util.Scanner;

public class STRcount implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static int strCount(String str, String letter) {
        int sum = 0;
        char[] chars = str.toCharArray();
        char c=str.charAt(0);//returns h.

        for(int i = 0;i<chars.length;i++){
            if(chars[i]=='c'){
                sum+=1;
            }
        }

        return sum;
    }
    @Override
    public void execute() {
        System.out.println("Create a function that accepts 2 string arguments and returns an integer of the count of"+"" +
                " occurrences the 2nd argument is found in the first one.");
        System.out.println("Write your str: ");
        String str = scanner.nextLine();
        System.out.println("Write your letter: ");
        String letter = scanner.nextLine();

    }
}
