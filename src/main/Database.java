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

import java.util.HashMap;
import java.util.Map;

public class Database {
    public Map<Integer, InterfaceTestClass> map = new HashMap<>();;

    public Database() {
//        map.put(1, new /* назва класу*/);
//        map.put(2, new /* назва класу*/);
//        map.put(3, new /* назва класу*/);
//        map.put(4, new /* назва класу*/);
        map.put(5, new Greeter());
//        map.put(6, new /* назва класу*/);
//        map.put(7, new /* назва класу*/);
//        map.put(8, new /* назва класу*/);
//        map.put(9, new /* назва класу*/);
        map.put(10, new Kata());
//        map.put(11, new /* назва класу*/);
//        map.put(12, new /* назва класу*/);
//        map.put(13, new /* назва класу*/);
//        map.put(14, new /* назва класу*/);
        map.put(15, new Canvas());
//        map.put(16, new /* назва класу*/);
//        map.put(17, new /* назва класу*/);
//        map.put(18, new /* назва класу*/);
//        map.put(19, new /* назва класу*/);
        map.put(20, new BooleanToString());
//        map.put(21, new /* назва класу*/);
//        map.put(22, new /* назва класу*/);
//        map.put(23, new /* назва класу*/);
//        map.put(24, new /* назва класу*/);
        map.put(25, new OppositesAttract());
//        map.put(26, new /* назва класу*/);
//        map.put(27, new /* назва класу*/);
//        map.put(28, new /* назва класу*/);
//        map.put(29, new /* назва класу*/);
        map.put(30, new TrafficLights());
//        map.put(31, new /* назва класу*/);
//        map.put(32, new /* назва класу*/);
//        map.put(33, new /* назва класу*/);
//        map.put(34, new /* назва класу*/);
        map.put(35, new Maps());
//        map.put(36, new /* назва класу*/);
//        map.put(37, new /* назва класу*/);
//        map.put(38, new /* назва класу*/);
//        map.put(39, new /* назва класу*/);
        map.put(40, new Positive());
//        map.put(41, new /* назва класу*/);
//        map.put(42, new /* назва класу*/);
//        map.put(43, new /* назва класу*/);
//        map.put(44, new /* назва класу*/);
        map.put(45, new GapInPrimes());
//        map.put(46, new /* назва класу*/);
//        map.put(47, new /* назва класу*/);
//        map.put(48, new /* назва класу*/);
//        map.put(49, new /* назва класу*/);
//        map.put(50, new /* назва класу*/);
//        map.put(51, new /* назва класу*/);
//        map.put(52, new /* назва класу*/);
//        map.put(53, new /* назва класу*/);
//        map.put(54, new /* назва класу*/);
//        map.put(55, new /* назва класу*/);
//        map.put(56, new /* назва класу*/);
//        map.put(57, new /* назва класу*/);
//        map.put(58, new /* назва класу*/);
//        map.put(59, new /* назва класу*/);
//        map.put(60, new /* назва класу*/);
//        map.put(61, new /* назва класу*/);
//        map.put(62, new /* назва класу*/);
//        map.put(63, new /* назва класу*/);
//        map.put(64, new /* назва класу*/);
//        map.put(65, new /* назва класу*/);
//        map.put(66, new /* назва класу*/);
//        map.put(67, new /* назва класу*/);
//        map.put(68, new /* назва класу*/);
//        map.put(69, new /* назва класу*/);
//        map.put(70, new /* назва класу*/);
//        map.put(71, new /* назва класу*/);
//        map.put(72, new /* назва класу*/);
    }

    public Map<Integer, InterfaceTestClass> getPosition(){
        return map;
    }
}
