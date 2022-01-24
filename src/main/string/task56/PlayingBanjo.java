package main.string.task56;

import main.InterfaceTestClass;
import main.basicprogram.task11.GrassHopper;

import java.util.Scanner;

public class PlayingBanjo implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String areYouPlayingBanjo(String name) {
        if(name.toLowerCase().charAt(0) =='r'){
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }


    @Override
    public void execute() {
        System.out.println("Create a function which answers the question \"Are you playing banjo?\".\n" +
                "If your name starts with the letter \"R\" or lower case \"r\", you are playing banjo!");
        System.out.println("Enter your name: ");
        System.out.println(PlayingBanjo.areYouPlayingBanjo(scanner.nextLine()));
    }
}