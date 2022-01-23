package solutions.collections;

import solutions.Executable;

import java.util.List;
import java.util.Scanner;

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
        System.out.println((CreateList(new Scanner(System.in).nextInt())));
        System.out.println(filterOddNumber(CreateList(new Scanner(System.in).nextInt())));
    }
}
