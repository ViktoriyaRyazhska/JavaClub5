package program;

import program.helper.Helper;
import solutions.Executable;

import solutions.*;

import solutions.basicProgram.*;
import solutions.classes.Battle;

import solutions.classes.*;
import solutions.collections.*;
import solutions.conditions.*;
import solutions.loops.*;
import solutions.strings.*;
import solutions.oop.Leetspeak.Leetspeak;
import solutions.oop.AdamEndEve;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MenuCommands {
    private final Map<String, Executable> options;

    private final ArrayList<String> topics  = new ArrayList<>();
    private final ArrayList<ArrayList<String>>  namesOfSolutions = new ArrayList<>();
    private String state = "Menu";
    private Integer intState = -1;



    public MenuCommands() {
        this.options = new TreeMap<>();

        topics.add("Basic programs");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(0).add("Beginner series number clock");
        //сюди всі рішення з basicprograms
        namesOfSolutions.get(0).add("Return to main menu");

        topics.add("Classes");
        namesOfSolutions.add(new ArrayList<>());
        //сюди всі рішення з Classes і т.д.
        namesOfSolutions.get(1).add("Block");



        topics.add("Exit");


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
        options.put("Count positive numbers", new SumOfPositive());
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
        options.put("Parse int from char",new ParseInt());
        options.put("Alternating case",new AlternatingCase());
        options.put("Remove even numbers",new FilteringBugFixing());
        options.put("Replace all dots", new ReplaceAllDots());
        options.put("Number to string" , new NumberToString());
        options.put("Reversed sequence", new ReversedSequence());
        options.put("My head is in the wrong end", new MyHeadIsInTheWrongEnd());
        options.put("Gap in primes", new GapInPrimes());
        options.put("Switch it up", new SwitchItUp());
        options.put("Plus 100" , new StaticElectrickery());
        options.put("MultiplyingTwo" , new MultiplyingTwo());


        options.put("Exit", new Exit());
    }


    public Map<String, Executable> getOptions() {
        return options;
    }

    public ArrayList<String> getCommandsList(){
        if (intState == -1){
            return topics;
        } else {
            return namesOfSolutions.get(intState);
        }
    }

    public String getState(){
        return state;
    }

    public void executeCommand(String command){

        //не трограти має бути саме в такому порядку
        if (options.containsKey(command)) {
            options.get(command).execute();
            Helper.promptEnterKey();
            return;
        }

        if (topics.contains(command)) {
            state = command;
            intState = topics.indexOf(command);
            return;
        }

        if (command.equals("Return to main menu")){
            state = "Menu";
            intState = topics.indexOf(command);
        }
    }
}