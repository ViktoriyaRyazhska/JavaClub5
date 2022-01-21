package main;

import main.basicprogram.task10.Kata;
import main.basicprogram.task5.Greeter;
import main.classes.task15.Canvas;
import main.conditions.task20.BooleanToString;
import main.conditions.task25.OppositesAttract;
import main.conditions.task30.TrafficLights;
import main.loops.task35.Maps;
import main.loops.task40.Positive;
import main.loops.task45.GapInPrimes;

public class Model {
    private int value;
    InterfaceTestClass interfaceTestClass;

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
                interfaceTestClass = new Greeter();
                interfaceTestClass.execute();
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
                interfaceTestClass = new Kata();
                interfaceTestClass.execute();
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
                interfaceTestClass = new Canvas();
                interfaceTestClass.execute();
            }
            case 16 -> {

            }
            case 17 -> {

            }
            case 18 -> {

            }
            case 19 -> {

            }
            case 20 -> {
                interfaceTestClass = new BooleanToString();
                interfaceTestClass.execute();
            }
            case 21 -> {

            }
            case 22 -> {

            }
            case 23 -> {

            }
            case 24 -> {

            }
            case 25 -> {
                interfaceTestClass = new OppositesAttract();
                interfaceTestClass.execute();
            }
            case 26 -> {

            }
            case 27 -> {

            }
            case 28 -> {

            }
            case 29 -> {

            }
            case 30 -> {
                interfaceTestClass = new TrafficLights();
                interfaceTestClass.execute();
            }
            case 31 -> {

            }
            case 32 -> {

            }
            case 33 -> {

            }
            case 34 -> {

            }
            case 35 -> {
                interfaceTestClass = new Maps();
                interfaceTestClass.execute();
            }
            case 36 -> {

            }
            case 37 -> {

            }
            case 38 -> {

            }
            case 39 -> {

            }
            case 40 -> {
                interfaceTestClass = new Positive();
                interfaceTestClass.execute();
            }
            case 41 -> {

            }
            case 42 -> {

            }
            case 43 -> {

            }
            case 44 -> {

            }
            case 45 -> {
                interfaceTestClass = new GapInPrimes();
                interfaceTestClass.execute();
            }




        }

    }
}
