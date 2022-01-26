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
        namesOfSolutions.get(0).add("Volume of a cuboid");
        namesOfSolutions.get(0).add("You can't code under pressure");
        namesOfSolutions.get(0).add("Grasshopper");
        namesOfSolutions.get(0).add("MultiplyingTwo");
        namesOfSolutions.get(0).add("PixelArt");
        namesOfSolutions.get(0).add("Return to main menu");
        //сюди всі рішення з basicprograms

        topics.add("Classes");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(1).add("Block");
        namesOfSolutions.get(1).add("Battle fighters");
        namesOfSolutions.get(1).add("Plus 100");
        namesOfSolutions.get(1).add("Return to main menu");


        //сюди всі рішення з Classes і т.д.

        topics.add("Collections");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(2).add("Loop bug fixing");
        namesOfSolutions.get(2).add("Remove even numbers");
        namesOfSolutions.get(2).add("Return to main menu");




        topics.add("Conditions");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(3).add("Switch it up");
        namesOfSolutions.get(3).add("Making basical math operation");
        namesOfSolutions.get(3).add("Convert bool to str");
        namesOfSolutions.get(3).add("Fibonacci numbers modulo 3");
        namesOfSolutions.get(3).add("IsDivisible");
        namesOfSolutions.get(3).add("Opposite number");
        namesOfSolutions.get(3).add("Rock Paper Scissors");
        namesOfSolutions.get(3).add("Transportation on vacation");
        namesOfSolutions.get(3).add("Will be enough space");
        namesOfSolutions.get(3).add("Return to main menu");




        topics.add("Loops");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(4).add("Beginner lost without map");
        namesOfSolutions.get(4).add("Beginner reduce but grow");
        namesOfSolutions.get(4).add("CatDogYears");
        namesOfSolutions.get(4).add("Gap in primes");
        namesOfSolutions.get(4).add("Grasshopper");
        namesOfSolutions.get(4).add("My head is in the wrong end");
        namesOfSolutions.get(4).add("Find nearest square number");
        namesOfSolutions.get(4).add("Reversed sequence");
        namesOfSolutions.get(4).add("Count sheep");
        namesOfSolutions.get(4).add("Repeating the string");
        namesOfSolutions.get(4).add("Count positive numbers");
        namesOfSolutions.get(4).add("Return to main menu");



        topics.add("OOP");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(5).add("Leetspeak");
        namesOfSolutions.get(5).add("Adam and Eve");
        namesOfSolutions.get(5).add("Return to main menu");


        topics.add("Strings");
        namesOfSolutions.add(new ArrayList<>());
        namesOfSolutions.get(6).add("Alternating case");
        namesOfSolutions.get(6).add("Get initials from name");
        namesOfSolutions.get(6).add("Correct mistakes");
        namesOfSolutions.get(6).add("Find the position");
        namesOfSolutions.get(6).add("Grasshopper");
        namesOfSolutions.get(6).add("Number to string");
        namesOfSolutions.get(6).add("Opposite number");
        namesOfSolutions.get(6).add("Parse int from char");
        namesOfSolutions.get(6).add("Remove string spaces");
        namesOfSolutions.get(6).add("Replace all dots");
        namesOfSolutions.get(6).add("SortAndStar");
        namesOfSolutions.get(6).add("Triple trouble 2");
        namesOfSolutions.get(6).add("Welcome to city");
        namesOfSolutions.get(6).add("Return to main menu");






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
        options.put("Triple trouble 2", new TripleTrouble2());
        options.put("Opposite number", new OppositeNumbers());
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
        options.put("Get initials from name", new AbbreviateATwoWordName());


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