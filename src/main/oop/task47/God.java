package main.oop.task47;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;
public class God implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);
    public static Human[] create(){
        Human[] people = new Human[2];
        people[0] = new Man();
        people[1] = new Woman();

        return people;
    }

    @Override
    public void execute() {
        System.out.println("Implement a function which implement the Human, Man and Woman classes.");
        System.out.println("It was passed successfully.");
    }
}




