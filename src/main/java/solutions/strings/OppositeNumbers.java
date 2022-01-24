package solutions.strings;

import program.helper.Helper;
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
        this.number = Helper.getInt(100000);

    }


    @Override
    public void execute() {
        getData();
        System.out.println(opposite(this.number));
    }
}
