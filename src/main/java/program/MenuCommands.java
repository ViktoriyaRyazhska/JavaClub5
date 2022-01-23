package program;

import solutions.Executable;

import solutions.*;

import solutions.basicProgram.*;
import solutions.classes.Battle;

import solutions.classes.Block;
import solutions.conditions.*;
import solutions.loops.BeginnerLostWithoutMap;
import solutions.loops.CatDogYears;
import solutions.loops.SheepCounter;
import solutions.loops.StringRepeat;
import solutions.oop.Leetspeak.Leetspeak;
import solutions.strings.*;


import java.util.Map;
import java.util.TreeMap;

public class MenuCommands {
    private final Map<String, Executable> options;

    public MenuCommands() {
        this.options = new TreeMap<>();

        options.put("You can't code under pressure", new YouCantCodeUnderPressure());
        options.put("Volume of a cuboid", new VolumeOfCuboid());
        options.put("Beginner series number clock", new BeginnerSeriesNumberClock());
        options.put("Grasshopper", new Grasshopper());
        options.put("PixelArt", new PixelArt());
        options.put("Year to century", new CenturyToYear());
        options.put("IsDivisible", new IsDivisible());
        options.put("Rock Paper Scissors", new RockPaperScissors());
        options.put("Battle fighters", new Battle());
        options.put("Will be enough space", new WillBeEnoughSpace());
        options.put("Convert bool to str", new BoolConverter());
        options.put("Transportation on vacation",new TransportationOnVacation());
        options.put("Making basical math operation", new BasicalMath());
        options.put("Beginner lost without map",new BeginnerLostWithoutMap());
        options.put("Fibonacci numbers modulo 3", new FibonacciModulo());
        options.put("Block", new Block());
        options.put("CatDogYears", new CatDogYears());
        options.put("Leetspeak", new Leetspeak());
        options.put("SortAndStar", new SortAndStar());
        options.put("Find the position", new FindThePosition());
        options.put("Repeating the string", new StringRepeat());
        options.put("Count sheep", new SheepCounter());



        options.put("Exit", new Exit());
    }

    public Map<String, Executable> getOptions() {
        return options;
    }
}
