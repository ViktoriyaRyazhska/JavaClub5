package main.java.com.softserve.clasess;

import lombok.*;
import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;
import main.java.com.softserve.basicprogram.Task3;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start1classes;

public class Task1 extends ReadConsole {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static
    class EncapsulationDemo {
        private int number;
        private String stringValue;
        private Object anObject;
    }

    public static void main(String[] args) {

        start1classes();
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo(1, "car", "BMW");
        System.out.println("number: " + encapsulationDemo.getNumber());
        System.out.println("stringValue: " + encapsulationDemo.getStringValue());
        System.out.println("anObject: " + encapsulationDemo.anObject);

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task1.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task1.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
