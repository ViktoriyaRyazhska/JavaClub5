package main.conditions.task30;

import main.InterfaceTestClass;

import java.util.Scanner;

public class TrafficLights implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String updateLight(String current) {
        String trafficLight = "";
        if (current.equalsIgnoreCase("green")) trafficLight = "yellow";
        else if (current.equalsIgnoreCase("yellow")) trafficLight = "red";
        else if (current.equalsIgnoreCase("red")) trafficLight = "green";
        else {
            System.out.println("WRONG INPUT. YOU WILL BE QUITED!! Sorry..");
        }
        return trafficLight;
    }

    @Override
    public void execute() {
        System.out.println("You're writing code to control your town's traffic lights. \n" +
                "You need a function to handle each change from green, to yellow, to red, and then to green again. ");
        System.out.println("I'll return a string representing the state the light should change to");
        System.out.println("Please specify color: ");
        String color = scanner.nextLine();
        System.out.println(TrafficLights.updateLight(color));
    }
}
