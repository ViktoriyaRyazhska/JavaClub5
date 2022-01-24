package main.loops.task46;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;

import java.util.Scanner;

public class Sticks implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void execute() {
        System.out.println("Code as fast as you can! You need to double the integer and return it");
        System.out.println("Enter some number: ");
        System.out.println(CodeFast.doubleInteger(scanner.nextInt()));
    }
}