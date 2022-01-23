package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class OppositeNumbers implements Executable {
    int number;

    public static int opposite(int number)
    {

        return number* (-1);
    }

    public void getData()
    {
        System.out.println("Enter number which should be opposite: ");
        this.number = new Scanner(System.in).nextInt();

    }


    @Override
    public void execute() {
        getData();
        System.out.println(opposite(this.number));
    }
}
