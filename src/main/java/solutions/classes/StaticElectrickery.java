package solutions.classes;

import program.helper.Helper;
import solutions.Executable;

public class StaticElectrickery implements Executable {

    public static final StaticElectrickery INST = new StaticElectrickery();

    private static final int ONE_HUNDRED = 100;

    private final int value;

    public StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    @Override
    public void execute() {
        System.out.println("Program adds 100 to your num");
        int i = Helper.getInt(0, 20000000);
        i = StaticElectrickery.INST.plus100(i);
        System.out.println(i);
    }
}
