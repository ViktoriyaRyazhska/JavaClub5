package solutions.loops;

import solutions.Executable;

import java.util.Scanner;

public class StringRepeat implements Executable {

     int repeats;
     String stringToRepeat;

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


    public void getData()
    {

        System.out.println("Enter repeats number: ");
        this.repeats= new Scanner(System.in).nextInt();
        System.out.println("Enter string: ");
        this.stringToRepeat= new Scanner(System.in).nextLine();
    }


    @Override
    public void execute() {
        System.out.println(repeatStr(repeats,stringToRepeat));
    }
}
