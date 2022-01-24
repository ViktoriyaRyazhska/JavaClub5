package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class BoolConverter implements Executable {

    boolean b;

    public static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public void getData()
    {
        System.out.println("Enter 'true' or 'false' to get it string representation");
        this.b = Helper.getBool();

    }

    @Override
    public void execute() {
        getData();
        System.out.println(convert(this.b));
    }
}
