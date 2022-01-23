package solutions.strings;

import solutions.Executable;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String city = scanner.nextLine();
        String state = scanner.nextLine();
        System.out.println(sayHello(new String[]{name,surname},city,state));
    }
}
