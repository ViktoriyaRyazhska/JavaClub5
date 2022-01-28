package main.basicprogram.task4;
import java.util.Scanner;
import main.InterfaceTestClass;

public class Kata2 implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);

    public static boolean isDivisible(int wallLength, int pixelSize) {
        boolean res = false;
        if(wallLength % pixelSize == 0){
            res = true;
        }
        return res;
    }

    @Override
    public void execute() {
        System.out.println("You want your work to be perfect down to the millimeter."+"" +
                " You haven't decided on the dimensions of your piece, how large you want"+"" +
                " your pixels to be, or which wall you want to use. You just know that you want to"+
                " fit an exact number of pixels.");
        System.out.println("Enter wallLength: ");
        int  wallLength = myObj.nextInt();
        System.out.println("Enter pixelSize: ");
        int  pixelSize = myObj.nextInt();
        System.out.println(Kata2.isDivisible(pixelSize,wallLength));

    }
}
