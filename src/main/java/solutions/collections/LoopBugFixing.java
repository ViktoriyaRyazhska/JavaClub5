package solutions.collections;

import program.helper.Helper;
import solutions.Executable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopBugFixing implements Executable {


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
        System.out.println(CreateList(Helper.getInt(1,10000)));
    }
}
