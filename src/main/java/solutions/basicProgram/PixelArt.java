package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class PixelArt implements Executable {
    int wallLength;
    int pixelSize;

    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength < 0 || pixelSize <= 0)
        {
            throw new ArithmeticException("Enter data greater than 0");
        }

        return wallLength % pixelSize == 0;

    }
    public void getData()
    {
        System.out.print("Enter wall length: ");
        this.wallLength= Helper.getInt(0,1000000);
        System.out.print("Enter pixel size: ");
        this.pixelSize= Helper.getInt(0,100000);

    }

    @Override
    public void execute() {
        getData();
        System.out.println("The answer is "+isDivisible(this.wallLength, this.pixelSize));
    }
}
