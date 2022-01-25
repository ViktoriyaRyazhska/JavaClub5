package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Arrays;

public class MyHeadIsInTheWrongEnd implements Executable {
    @Override
    public void execute() {
        System.out.println("Reverse 1 and 3 strings of array");
        String[] arr = {"", "", ""};
        System.out.println("Enter the fist line: ");
        arr[0] = Helper.getLine();
        System.out.println("Enter the second line: ");
        arr[1] = Helper.getLine();
        System.out.println("Enter the third line: ");
        arr[2] = Helper.getLine();
        reverse(arr);
        System.out.println("The string is: " + Arrays.toString(arr));
    }

    public void reverse(String[] arr){
        String a = arr[0];
        arr[0] = arr[2];
        arr[2] = a;
    }
}
