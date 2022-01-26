package main.string.task53;

import main.InterfaceTestClass;

import java.util.Scanner;

public class Hello implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String sayHello(String [] name, String city, String state){
        return "Hello, " + name[0] + " " + name[1] + "! Welcome to " + city + ", " + state + "!";
    }

    @Override
    public void execute() {
        String [] name = new String[2];
        String city;
        String state;
        System.out.print("Enter your name: ");
        name[0] = scanner.nextLine();
        System.out.print("Enter your surname: ");
        name[1] = scanner.nextLine();
        System.out.print("Enter your city: ");
        city = scanner.nextLine();
        System.out.print("Enter your state: ");
        state = scanner.nextLine();
        System.out.println(Hello.sayHello(name, city,state));
    }
}
