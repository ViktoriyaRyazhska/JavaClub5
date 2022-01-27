package main.loops.task41;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Arrays;
import java.util.Scanner;

public class MyHead implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String[] fixTheMeerkat(String[] arr) {
        String[] newArray = new String[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--){
            newArray[count] = arr[i];
            count++;
        }
        return newArray;
    }
    @Override
    public void execute() {
        System.out.println("Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). " +
                "It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).\n" +
                "Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics");

        try {
            String[] wrongArray = new String[3];
            System.out.println("Enter first wrong body part: ");
            wrongArray[0] = scanner.nextLine();
            System.out.println("Enter second wrong body part: ");
            wrongArray[1] = scanner.nextLine();
            System.out.println("Enter third wrong body part: ");
            wrongArray[2] = scanner.nextLine();

            System.out.println("Here is the correct body of our animal: ");
            System.out.println(Arrays.toString(MyHead.fixTheMeerkat(wrongArray)));        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }


    }
}