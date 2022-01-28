package javaclub5.collections.Task71;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Task71 {
    private static int listOfNumbers;
    private static Object List;

    public static void start(Scanner scanner) {
        try {
            java.util.List<Integer> integerList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 41; i++) {
                integerList.add(random.nextInt(143));
            }
            System.out.println("original list: " + integerList);
            System.out.println("-----------");
            System.out.println("sorted list: " + sortedList(integerList));

        } catch (Exception e) {

        }
    }
    public static List<Integer> sortedList (List<Integer> list){
        if (list.equals(null)){
            return Collections.EMPTY_LIST;
        }
        List<Integer> secondIntList = new ArrayList<>();
        for (Integer listNumbs : list){
            if (listNumbs%2 != 0){
                secondIntList.add(listNumbs);
            }
        }
        return secondIntList;
    }
}
