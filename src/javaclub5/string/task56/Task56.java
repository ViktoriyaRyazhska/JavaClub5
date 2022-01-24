package javaclub5.string.task56;


import java.util.Scanner;

public class Task56 {
    /*
    Create a function which answers the question "Are you playing banjo?".
    If your name starts with the letter "R" or lower case "r", you are playing banjo!

    The function takes a name as its only argument, and returns one of the following strings:
    name + " plays banjo"
    name + " does not play banjo"
     */
    public static String banjo(String name){

        if(name.startsWith("R") || name.startsWith("r")){
           return name + " plays banjo.";
        }else
            return  name + " does not play banjo.";
    }

    public static void main(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println(banjo(name));
    }
}

