package main;

import main.basicprogram.task10.Kata;
import main.basicprogram.task5.Greeter;
import main.classes.task15.Canvas;

public class Model {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void selectorMenu(int value) {
        switch (value) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
                InterfaceTestClass ic = new Greeter();
                ic.execute();
            }
            case 6 -> {
            }
            case 7 -> {
            }
            case 8 -> {
            }
            case 9 -> {
            }
            case 10 -> {
                InterfaceTestClass ic = new Kata();
                ic.execute();
            }
            case 11 -> {
            }
            case 12 -> {
            }
            case 13 -> {
            }
            case 14 -> {
            }
            case 15 -> {
                InterfaceTestClass ic = new Canvas();
                ic.execute();
            }

        }

    }
}
