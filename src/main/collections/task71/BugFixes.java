package main.collections.task71;

import main.InterfaceTestClass;
import main.string.task66.CharacterRecognition;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class BugFixes implements InterfaceTestClass {

    Scanner scanner = new Scanner(System.in);
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> newlistOfNumbers = new ArrayList<Integer>();

        for (int i = 0; i < listOfNumbers.size(); i++)

            if (listOfNumbers.get(i)%2 != 0)
            {
                newlistOfNumbers.add(listOfNumbers.get(i));
            }

        return newlistOfNumbers;
    }

    @Override
    public void execute() {
        System.out.println("The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.");
        System.out.println("!!!Enter all numbers through a comma without spaces");
        System.out.println("Enter list of numbers: ");
        String s = scanner.nextLine();
        List<String> myStringList = new ArrayList<String>(Arrays.asList(s.split(",")));
        List<Integer> myIntegerList = myStringList.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(BugFixes.filterOddNumber(myIntegerList));
    }
}
