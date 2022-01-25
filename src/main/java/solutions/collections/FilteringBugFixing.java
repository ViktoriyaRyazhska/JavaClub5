package solutions.collections;

import program.helper.Helper;
import solutions.Executable;

import java.util.List;

import static solutions.collections.LoopBugFixing.CreateList;

public class FilteringBugFixing implements Executable {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }

    @Override
    public void execute() {
        System.out.println("Enter arr size");
        List<Integer> list = CreateList(Helper.getInt(1,100));
        System.out.println(list);
        System.out.println(filterOddNumber(list));
    }
}
