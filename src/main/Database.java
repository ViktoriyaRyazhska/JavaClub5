package main;

import main.basicprogram.task10.Kata;
import main.basicprogram.task5.Greeter;
import main.classes.task15.Canvas;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public Map<Integer, InterfaceTestClass> map = new HashMap<>();;

    public Database() {
        map.put(1, new Greeter());
        map.put(2, new Kata());
        map.put(3, new Canvas());
    }

    public Map<Integer, InterfaceTestClass> getPosition(){
        return map;
    }
}
