package main.loops.task36;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingSheep implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        try {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] == true) {
                    count++;
                }
            }
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return count;
    }

    @Override
    public void execute() {
        System.out.println("Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).");
        System.out.println("!!!Fill all your sheep 'true' or 'false' through a comma without spaces");
        System.out.println("Enter list of sheep: ");
        try {
            String s = scanner.nextLine();
            ArrayList<String> myStringList = new ArrayList<String>(Arrays.asList(s.split(",")));
            List<Boolean> myBooleanList = myStringList.stream().map(Boolean::parseBoolean).collect(Collectors.toList());
            Boolean[] array = myBooleanList.toArray(new Boolean[myBooleanList.size()]);
            System.out.println("You have " + CountingSheep.countSheeps(array) + " sheep");
        } catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }


    }
}