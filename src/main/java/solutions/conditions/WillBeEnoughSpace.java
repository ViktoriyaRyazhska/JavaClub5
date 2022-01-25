package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class WillBeEnoughSpace implements Executable {
    public static int enough(int cap, int on, int wait) {
        // your code here
        if (on > cap) throw new IllegalArgumentException("On cant be greater then cap");
        if (cap - on >= wait) return 0;
        else return Math.abs(cap - on - wait);
    }

    @Override
    public void execute() {
        System.out.println("Enter capacity, passengers and waiters");
        int cap = Helper.getInt(1, 100);
        int on = Helper.getInt(0, 100);
        int wait = Helper.getInt(0, 100);
        try {
            System.out.println(enough(cap, on, wait));
        }
        catch (IllegalArgumentException e){
            execute();
        }
    }
}
