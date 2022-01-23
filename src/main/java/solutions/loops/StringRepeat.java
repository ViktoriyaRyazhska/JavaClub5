package solutions.loops;

import solutions.Executable;

import java.util.Scanner;

public class StringRepeat implements Executable {

    final int repeats = getRepeats();
    final String string = getString();

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder finStr= new StringBuilder();
        if(repeat<1)
        {
            System.out.println("Repeat number must be higher");
            return "";
        }
        finStr.append(String.valueOf(string).repeat(repeat));

        return finStr.toString();
    }

    public int getRepeats()
    {
        System.out.println("Enter repeats number: ");
        return new Scanner(System.in).nextInt();
    }
    public String getString()
    {
        System.out.println("Enter string: ");
        return new Scanner(System.in).nextLine();
    }

    @Override
    public void execute() {
        System.out.println(repeatStr(repeats,string));
    }
}
