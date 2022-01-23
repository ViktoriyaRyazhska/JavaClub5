package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

public class YouCantCodeUnderPressure implements Executable {

    @Override
    public void execute() {
        System.out.println("Doubling integer that you write");

        int i = Helper.getInt(2147483647/2);
        i = multiply(i);
        System.out.println(i);
    }

    public int multiply(int i){
        return i<<1;
    }
}
