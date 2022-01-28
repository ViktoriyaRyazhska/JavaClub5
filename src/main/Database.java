package main;

import main.basicprogram.task1.CodeFast;
import main.basicprogram.task2.Kata3;
import main.basicprogram.task3.CuboidVolume;
import main.basicprogram.task8.CenturyFromYear;
import main.basicprogram.task10.Kata;
import main.basicprogram.task11.GrassHopper;
import main.basicprogram.task5.Greeter;
import main.basicprogram.task6.ParseToBinary;
import main.classes.task13.StaticElectrickery;
import main.classes.task15.Canvas;
import main.classes.task16.WarOfFighters;
import main.collections.task70.SolutionKata;
import main.collections.task71.BugFixes;
import main.conditions.task18.OppositeNumber;
import main.conditions.task20.BooleanToString;
import main.conditions.task21.BonusTime;
import main.conditions.task23.RockPaperScissors;
import main.conditions.task25.OppositesAttract;
import main.conditions.task26.BooleanToYesOrNo;
import main.conditions.task28.ModuloThreeSequence;
import main.conditions.task30.TrafficLights;
import main.conditions.task31.Transportation;
import main.loops.task33.CatYearsDogYears;
import main.loops.task35.Maps;
import main.loops.task36.CountingSheep;
import main.loops.task38.BestStudent;
import main.loops.task40.Positive;
import main.loops.task41.MyHead;
import main.loops.task43.CodeWarsMath;
import main.loops.task45.GapInPrimes;
import main.loops.task46.Sticks;
import main.oop.task48.ControllerTask48;
import main.oop.task50.Calculator;
import main.string.task51.NumberToString;
import main.string.task53.Hello;
import main.string.task55.Dinglemouse;
import main.string.task56.PlayingBanjo;
import main.string.task58.Triple;
import main.string.task60.FakeBinary;
import main.string.task61.CharProblem;
import main.string.task63.AbbreviateTwoWords;
import main.string.task65.SortAndStar;
import main.string.task66.CharacterRecognition;
import main.string.task68.ExclamationMarksSeries;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public Map<Integer, InterfaceTestClass> map = new HashMap<>();
    public Database() {
        programAdder();
    }

    public void programAdder(){
        map.put(1, new CodeFast());
//        map.put(2, new Kata3());
        map.put(3, new CuboidVolume());
//        map.put(4, new /* назва класу*/);
        map.put(5, new Greeter());
        map.put(6, new ParseToBinary());
//        map.put(7, new /* назва класу*/);
        map.put(8, new CenturyFromYear());
//        map.put(9, new /* назва класу*/);
        map.put(10, new Kata());
        map.put(11, new GrassHopper());
//        map.put(12, new /* назва класу*/);
        map.put(13, new StaticElectrickery());
//        map.put(14, new /* назва класу*/);
        map.put(15, new Canvas());
        map.put(16, new WarOfFighters());
//        map.put(17, new /* назва класу*/);
        map.put(18, new OppositeNumber());
//        map.put(19, new /* назва класу*/);
        map.put(20, new BooleanToString());
        map.put(21, new BonusTime());
//        map.put(22, new /* назва класу*/);
        map.put(23, new RockPaperScissors());
//        map.put(24, new /* назва класу*/);
        map.put(25, new OppositesAttract());
        map.put(26, new BooleanToYesOrNo());
//        map.put(27, new /* назва класу*/);
        map.put(28, new ModuloThreeSequence());
//        map.put(29, new /* назва класу*/);
        map.put(30, new TrafficLights());
        map.put(31, new Transportation());
//        map.put(32, new /* назва класу*/);
        map.put(33, new CatYearsDogYears());
//        map.put(34, new /* назва класу*/);
        map.put(35, new Maps());
        map.put(36, new CountingSheep());
//        map.put(37, new /* назва класу*/);
        map.put(38, new BestStudent());
//        map.put(39, new /* назва класу*/);
        map.put(40, new Positive());
        map.put(41, new MyHead());
//        map.put(42, new /* назва класу*/);
        map.put(43, new CodeWarsMath());
//        map.put(44, new /* назва класу*/);
        map.put(45, new GapInPrimes());
        map.put(46, new Sticks());
//        map.put(47, new /* назва класу*/);
        map.put(48, new ControllerTask48());
//        map.put(49, new /* назва класу*/);
        map.put(50, new Calculator());
        map.put(51, new NumberToString());
//        map.put(52, new /* назва класу*/);
        map.put(53, new Hello());
//        map.put(54, new /* назва класу*/);
        map.put(55, new Dinglemouse());
        map.put(56, new PlayingBanjo());
//        map.put(57, new /* назва класу*/);
        map.put(58, new Triple());
//        map.put(59, new /* назва класу*/);
        map.put(60, new FakeBinary());
        map.put(61, new CharProblem());
//        map.put(62, new /* назва класу*/);
        map.put(63, new AbbreviateTwoWords());
//        map.put(64, new /* назва класу*/);
        map.put(65, new SortAndStar());
        map.put(66, new CharacterRecognition());
//        map.put(67, new /* назва класу*/);
        map.put(68, new ExclamationMarksSeries());
//        map.put(69, new /* назва класу*/);
        map.put(70, new SolutionKata());
        map.put(71, new BugFixes());
//        map.put(72, new /* назва класу*/);
    }


    public Map<Integer, InterfaceTestClass> getPosition(){
        return map;
    }
}
