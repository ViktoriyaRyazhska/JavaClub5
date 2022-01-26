package main.java.com.softserve.clasess;

import lombok.*;
import main.java.com.softserve.ReadConsole;

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
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo(1, "car", "BMW");
        System.out.println(encapsulationDemo.getNumber());
        System.out.println(encapsulationDemo.getStringValue());
        System.out.println(encapsulationDemo.anObject);
    }

}
