package solutions.collections;

import solutions.Executable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopBugFixing implements Executable {
    int arrSize;

    public static List CreateList(int number)
    {

        List list = new ArrayList();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }


    @Override
    public void execute() {
        System.out.println("Enter arr size");
        System.out.println(CreateList(new Scanner(System.in).nextInt()));
    }
}
