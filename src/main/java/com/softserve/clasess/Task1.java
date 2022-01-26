package main.java.com.softserve.clasess;

import lombok.*;
import main.java.com.softserve.ReadConsole;

public class Task1 extends ReadConsole {

    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static
    class EncapsulationDemo {
        private @Getter
        @Setter
        int number;
        private @Getter
        @Setter
        String stringValue;
        private @Getter
        @Setter
        Object anObject;
    }

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo(1, "car", "BMW");
        System.out.println(encapsulationDemo.getNumber());
        System.out.println(encapsulationDemo.getStringValue());
        System.out.println(encapsulationDemo.anObject);
    }

}
