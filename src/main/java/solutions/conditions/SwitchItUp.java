package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class SwitchItUp implements Executable {
    @Override
    public void execute() {
        System.out.println("When provided in number 0-9, return it in words");
        int i=0;
        i = Helper.getInt(0,9);
        System.out.println("In words: " + IntToWords(i));
        Helper.promptEnterKey();
    }

    private String IntToWords(int i) {
        if (i>9 || i<0 ) return ("Wrong input!");
        switch (i){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
        return "Zero";
    }
}
