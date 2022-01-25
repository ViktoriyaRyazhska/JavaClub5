package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

public class MultiplyingTwo implements Executable{
    int num1,num2;
    @Override
    public void execute() {
getData();
        System.out.println("the result is "+multiply(this.num1,this.num2));
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public void getData(){
        System.out.println("enter first number");

        this.num1 = Helper.getInt(1000000);
        System.out.println("enter second number");
        this.num2 = Helper.getInt(1000000);
    }
}
