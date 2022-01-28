package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class DoIGetABonus implements Executable {
        public String bonusTime(final int salary, final boolean bonus) {
            return "\u00A3" + (bonus ? 10 : 1) * salary;
        }

    @Override
    public void execute() {
        System.out.println("Program takes salary and condition: true or false." +
                "\nIf true you get salary*10 if no than the same salary ");
        System.out.println("Enter the salary: ");
        int i = Helper.getInt(200000000);
        System.out.println("Enter is there any bonus (true or false):");
        boolean b = Helper.getBool();
        String salary = bonusTime(i, b);
        System.out.println("Your salary is: " + salary);
    }
}
