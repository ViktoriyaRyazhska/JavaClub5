package solutions.basicProgram;

import solutions.Executable;

import java.util.Scanner;

public class PixelArt implements Executable {
    int wallLength;
    int pixelSize;

    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength < 0 || pixelSize < 0)
        {
            throw new ArithmeticException("Enter data greater than 0");
        }

        return wallLength % pixelSize == 0;

    }
    public void getData()
    {
        System.out.print("Enter wall length: ");
        this.wallLength= new Scanner(System.in).nextInt();
        System.out.print("Enter pixel size: ");
        this.pixelSize= new Scanner(System.in).nextInt();

    }

    @Override
    public void execute() {
        getData();
        System.out.println("The answer is "+isDivisible(this.wallLength, this.pixelSize));
    }
}
