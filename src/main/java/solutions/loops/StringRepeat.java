package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class StringRepeat implements Executable {

     int repeats;
     String stringToRepeat;

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder finStr= new StringBuilder();
        if(repeat<1)
        {
            throw new IllegalArgumentException("Repeat number must be higher");
        }
        finStr.append(String.valueOf(string).repeat(repeat));

        return finStr.toString();
    }


    public void getData()
    {

        System.out.println("Enter repeats number: ");
        this.repeats= Helper.getInt(1,1000);
        System.out.println("Enter string: ");
        this.stringToRepeat= Helper.getLine();
    }


    @Override

    public void execute() {
        getData();
        System.out.println(repeatStr(repeats,stringToRepeat));
    }
}
