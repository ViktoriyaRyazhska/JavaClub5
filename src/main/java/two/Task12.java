package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task12 {
    private int number;
    private String stringValue;
    private Object anObject;

    public Task12(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public Task12() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }


    public static void task12() {
        System.out.println("Encapsulation if information");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter life expectancy");

            int numValue = Integer.parseInt(reader.readLine());
            if (numValue > 0) {
                System.out.println("Enter name of test object");
            } else {
                System.out.println("Invalid value");
            }

            String stringV = reader.readLine();
            if (Pattern.matches("[a-zA-Z]+", stringV)) {
                System.out.println("Enter type of test object (exp: rat, mouse, monkey...)");
            } else {
                System.out.println("Invalid value");
            }

            String ob = reader.readLine();
            if ((Pattern.matches("[a-zA-Z]+", ob))) {

                Task12 demo = new Task12(numValue, stringV, ob);
                System.out.println(demo.getNumber());
                System.out.println(demo.getName());
                System.out.println(demo.getAnObject());

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}


