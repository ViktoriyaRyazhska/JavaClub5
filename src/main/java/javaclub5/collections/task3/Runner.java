package javaclub5.collections.task3;

import java.util.*;

/**
 * Fix the bug in Filtering method
 * The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
 * <p>
 * However, there is a bug in the method that needs to be resolved.
 *
 * @author Popova Anna
 */

public class Runner {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
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
            if (!(iter.next() % 2 == 1)) {
                iter.remove();
            }
        }
        return inputList;
    }

}
