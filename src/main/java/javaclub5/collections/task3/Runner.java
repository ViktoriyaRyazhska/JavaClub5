package javaclub5.collections.task3;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt(100));
        }
        System.out.println(numbers);

        System.out.println(removeEvenNumbers(numbers));
    }

    public static List<Integer> removeEvenNumbers(List<Integer> inputList) {
        if (inputList == null) {
            return Collections.EMPTY_LIST;
        }

        Iterator<Integer> iter = inputList.iterator();
        while (iter.hasNext()) {
            if (!(iter.next() % 2 == 0)) {
                iter.remove();
            }
        }
        return inputList;
    }

}
