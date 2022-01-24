package main.basicprogram.task9;
import java.util.Scanner;
import main.InterfaceTestClass;

public class MakeNegative implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static int makeNegative(int x) {

        int result = x;
        if(result>0){
            result*=-1;

        }
        else if(result == 0){
            result*=0;
        }
        return result;

    }
    @Override
    public void execute() {
        System.out.println("In this simple assignment you are given a number and have "+
                "to make it negative. But maybe the number is already negative?\n");
        System.out.println("Enter x: ");
        int  x = myObj.nextInt();

    }
}
