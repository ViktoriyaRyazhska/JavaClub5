package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class OppositesAttract implements Executable {
    public boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    @Override
    public void execute() {
        System.out.println("Check whether you are in love with a person. To use this program" +
                "\nEach of you should find a flower and enter the number" +
                "\nOf petals in both of them. \"\\u2661\"");
        System.out.println("Enter the first flower: ");
        int flower1 = Helper.getInt(20000000);
        System.out.println("Enter the second flower");
        int flower2 = Helper.getInt(20000000);
        System.out.println("Result is: " + isLove(flower1, flower2));
    }
}
