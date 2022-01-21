package main;

import main.basicprogram.task5.Greeter;

public class Model {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void selectorMenu(int value){
        switch (value) {
            case 1 -> {
                InterfaceTestClass interfaceTestClass = new Greeter();
                interfaceTestClass.execute();
            }
            case 2 -> System.out.println("Like a dog");
        }

    }
}
