package program;

import solutions.Executable;

import solutions.*;

import solutions.basicProgram.*;
import solutions.classes.Battle;

import solutions.classes.Block;
import solutions.collections.LoopBugFixing;
import solutions.conditions.*;
import solutions.loops.*;
import solutions.oop.AdamEndEve;
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
        options.put("Transportation on vacation", new TransportationOnVacation());
        options.put("Making basical math operation", new BasicalMath());
        options.put("Beginner lost without map", new BeginnerLostWithoutMap());
        options.put("Fibonacci numbers modulo 3", new FibonacciModulo());
        options.put("Block", new Block());
        options.put("CatDogYears", new CatDogYears());
        options.put("Leetspeak", new Leetspeak());
        options.put("SortAndStar", new SortAndStar());
        options.put("Find the position", new FindThePosition());
        options.put("Repeating the string", new StringRepeat());
        options.put("Count sheep", new SheepCounter());
        options.put("Count positive numbers", new SumOfPozitive());
        options.put("Grasshopper summation", new GrassshoperSummation());
        options.put("Triple trouble 2 ", new TripleTrouble2());
        options.put("Opposite number ", new OppositeNumbers());
        options.put("Grasshoper debug", new GrasshopperDebug());
        options.put("Correct mistakes", new CorrectMistakes());
        options.put("Loop bug fixing", new LoopBugFixing());
        options.put("Beginner reduce but grow", new BeginnerReduceButGrow());
        options.put("Find nearest square number", new NearestSquareNumber());
        options.put("Adam and Eve", new AdamEndEve());
        options.put("Welcome to city",new WelcomeToCity());
        options.put("Remove string spaces",new RemoveSpaces());
        options.put("Exit", new Exit());
    }

    public Map<String, Executable> getOptions() {
        return options;
    }
}
