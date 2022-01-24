package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class TripleTrouble2 implements Executable {
    String one ="",two="",three="";
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder finStr = new StringBuilder();
        if(one.length() == two.length() && one.length()==three.length() )
        {

            for(int i = 0; i < one.length(); i++)
            {
                char[] temp = new char[]{one.charAt(i),two.charAt(i),three.charAt(i)};

                finStr.append(String.valueOf(temp));

            }

        }
        else
        {
            throw new StringIndexOutOfBoundsException("All strings must be the same size");
        }
        return finStr.toString();
    }

    public void getData(){
        System.out.println("Enter three strings of same size: ");
        this.one = Helper.getLine();
        this.two = Helper.getLine();
        this.three = Helper.getLine();

    }



    @Override
    public void execute() {
        getData();
        System.out.println(tripleTrouble(this.one,this.two,this.three));

    }
}
