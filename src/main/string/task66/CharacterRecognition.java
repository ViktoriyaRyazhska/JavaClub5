package main.string.task66;

import main.InterfaceTestClass;
import main.basicprogram.task1.CodeFast;
import main.string.task61.CharProblem;

import java.util.Scanner;

public class CharacterRecognition implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String correct(String string) {
        return string.replace("5","S").replace("1","I").replace("0","O");
    }

    @Override
    public void execute() {
        System.out.println("Your task is correct the errors in the digitised text. You only have to handle the following mistakes:\n" +
                "S is misinterpreted as 5\n" +
                "O is misinterpreted as 0\n" +
                "I is misinterpreted as 1");
        System.out.println("Enter incorrect text, I'll make it better: ");
        try {
            System.out.println(CharacterRecognition.correct(scanner.nextLine()));
        }
        catch (Exception e) {
            System.out.println("Check if your input is correct");
            System.err.println(e.getMessage());
        }
    }
}
