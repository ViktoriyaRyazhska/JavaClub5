package main.java.com.softserve.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void sayHello1() {
        String expected = "Hello, Andriy Igor Olena Zhenya Mykola! Welcome to Lviv, Lvivska!";
        String[] name = {"Andriy", "Igor", "Olena", "Zhenya", "Mykola"};
        String city = "Lviv";
        String state = "Lvivska";
        String words = Task3.sayHello(name, city, state);
    }

}