package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

public class CorrectMistakes implements Executable {
    String text="";

    public static String correct(String string) {

        return string.replaceAll("1","I").replaceAll("5","S").replaceAll("0","O");
    }
    public void getData()
    {
        System.out.println("Enter text: ");
        this.text = new Scanner(System.in).nextLine();

    }

    @Override
    public void execute() {
        getData();
        System.out.println(correct(this.text));
    }
}
