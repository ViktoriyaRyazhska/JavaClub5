package main.collections.task70;

import main.InterfaceTestClass;

import java.util.*;

public class SolutionKata implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }

    @Override
    public void execute() {
        System.out.println("This dish is too boring to explain :)");
        System.out.println("Rather..");
        System.out.println("Please wait...I'll tell you some joke..");
        try {
            Thread.sleep(2000);
            System.out.println("Give me one more second..");
            Thread.sleep(3000);
            System.out.println("Ok..Let's go!");
            System.out.println("Why do fathers take an extra pair of socks when they go golfing?");
            Thread.sleep(4000);
            System.out.println("In case they get a hole in one!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
