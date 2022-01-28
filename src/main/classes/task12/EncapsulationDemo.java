package main.classes.task12;

import main.InterfaceTestClass;
import main.basicprogram.task2.Kata3;

import java.util.Scanner;

public class EncapsulationDemo implements InterfaceTestClass {
    Scanner scan = new Scanner(System.in);
    public int number;
    public String stringValue;
    public Object anObject;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public EncapsulationDemo() {
    }

    public EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }
    @Override
    public void execute() {
        System.out.println("This task is a challenge created for me to learn how to use lombok.");
        System.out.println("It was passed successfully.");

    }
}
