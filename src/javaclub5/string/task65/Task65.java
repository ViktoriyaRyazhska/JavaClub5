package javaclub5.string.task65;

import javaclub5.loops.task34.Task34;

import java.util.Arrays;
import java.util.Scanner;


public class Task65 {
    public String sortAndStar(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
    }

    public static void main(Scanner sc) {
        try {
            System.out.println("Enter string:");
            String nextLine = sc.nextLine();
            String[] str = nextLine.split(" ");
            Task65 obj = new Task65();
            System.out.println("First word:" + obj.sortAndStar(str));
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.exit(1);
        }
    }
}
