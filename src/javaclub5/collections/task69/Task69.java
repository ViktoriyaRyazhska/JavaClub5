package javaclub5.collections.task69;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task69 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        }

        public static void start(Scanner scanner) {
            System.out.println("In this task need to add string value.");
            System.out.println("This is the item pushed into the list: " + push());
        }

        public static List<String> push() {
            List<String> items = new ArrayList<>();
            items.add("apple");
            return items;
        }
}
