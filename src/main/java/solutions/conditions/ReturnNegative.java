package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class ReturnNegative implements Executable {
        public  int makeNegative(final int x) {

            return -Math.abs(x); // Your code here.

        }

    @Override
    public void execute() {
        System.out.println("Program takes int and return it always negative");
        int i = Helper.getInt(-20000000, 20000000);
        System.out.println("Result is: " + makeNegative(i));
    }
}
