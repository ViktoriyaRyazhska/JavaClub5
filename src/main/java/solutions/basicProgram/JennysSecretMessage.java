package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;

public class JennysSecretMessage implements Executable {

    public String greet(String name) {

        if(name.equals("Johnny")){
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);

    }

    @Override
    public void execute() {
        System.out.println("What's your name?");
        String str = Helper.getLine();
        System.out.println(greet(str));

    }
}
