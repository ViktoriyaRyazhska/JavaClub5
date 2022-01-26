package three;

import java.io.BufferedReader;

public class Task53{

    public static String sayHello(String [] name, String city, String state){
        StringBuilder welcome = new StringBuilder("Hello, ");

        for (int i = 0; i < name.length; i++) {
            welcome.append(name[i]);
            if (!name[i].equals(name[name.length - 1])) {
                welcome.append(" ");
            }
        }

        return welcome.append("! Welcome to ")
                .append(city)
                .append(", ")
                .append(state)
                .append("!")
                .toString();
    }

    public static void task53(BufferedReader reader) {
        System.out.println("The task is to Create a method sayHello that takes as input a name, city, and state to welcome a person.");
        try {
            System.out.println("Enter your name separated by space: ");
            String[] name = reader.readLine().split("[ ,]");
            System.out.println("Enter your city: ");
            String city = reader.readLine();
            System.out.println("Enter your state: ");
            String state = reader.readLine();
            System.out.println(sayHello(name, city, state));
        } catch (Exception e) {
            System.out.println("Wrong input!..");
        }
    }
}
