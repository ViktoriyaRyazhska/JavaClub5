package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAndStar implements Executable {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }


    @Override
    public void execute() {
        System.out.println("Program sort the given array and return the first word\n" +
                "Editing it like this: 'Reta' - 'R***e***t***a'.\n" +
                "To stop writing words enter empty string");
        ArrayList<String> s = new ArrayList<String>();
        while (true ){
            String a = Helper.getLine();
            if (a.equals("")){break;}
            s.add(a);
        }
        String[] s1 = s.toArray(new String[0]);
        System.out.println("Result is: " + twoSort(s1));
        Helper.promptEnterKey();
    }
}