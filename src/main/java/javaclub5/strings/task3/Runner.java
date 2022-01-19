package javaclub5.strings.task3;

import java.util.Scanner;

/**
 * Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person.
 * Note that name will be an array consisting of one or more values that should be joined together with one space
 * between each, and the length of the name array in test cases will vary.
 * <p>
 * Example:
 * sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
 * This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 *
 * @author Popova Anna
 */

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fullname = new String[2];
        System.out.println("Enter your name and surname: ");

        for (int i = 0; i < fullname.length; i++) {
            fullname[i] = sc.nextLine();
            System.out.println(fullname[i]);
        }
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();

        System.out.println(sayHello(fullname, city, state));

    }

    public static String sayHello(String[] fullname, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", fullname), city, state);
    }
}
