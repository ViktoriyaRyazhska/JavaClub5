package solutions.strings;

import program.helper.Helper;
import solutions.Executable;

public class WelcomeToCity implements Executable {
    public String sayHello(String[] name, String city, String state) {
        StringBuilder sb = new StringBuilder();
        for (String s : name) {
            sb.append(" ");
            sb.append(s);
        }
        return "Hello," + sb + "! Welcome to " + city + ", " + state + "!";
    }

    @Override
    public void execute() {
        String name = Helper.getLine();
        String surname = Helper.getLine();
        String city = Helper.getLine();
        String state = Helper.getLine();
        System.out.println(sayHello(new String[]{name,surname},city,state));
    }
}
