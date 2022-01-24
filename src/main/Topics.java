package main;

import java.util.List;
import java.util.Scanner;

public class Topics {
    public boolean exit;
    int choice;
    int min = 0;
    int max = 7;
    int decision;

    public void runMenu() {
        printHeader();
        while (!exit) {
            iterate(getList());
            choice = getInput();
            performAction(choice);
        }
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0 -> {
                exit = true;
                System.out.println("Thank you for using our application.");
            }
            case 1 -> {
                max = 11;
                System.out.println("Please make next selection: ");
                iterate(getListOne());
                decision = getInput();
                exit = true;
            }
            case 2 -> {
                min = 12;
                max = 17;
                System.out.println("Please make next selection: ");
                iterate(getListTwo());
                decision = getInput();
                exit = true;
            }
            case 3 -> {
                min = 18;
                max = 31;
                System.out.println("Please make next selection: ");
                iterate(getListTree());
                decision = getInput();
                exit = true;
            }
            case 4 -> {
                min = 32;
                max = 46;
                System.out.println("Please make next selection: ");
                iterate(getListFour());
                decision = getInput();
                exit = true;
            }
            case 5 -> {
                min = 47;
                max = 50;
                System.out.println("Please make next selection: ");
                iterate(getListFive());
                decision = getInput();
                exit = true;
            }
            case 6 -> {
                min = 51;
                max = 68;
                System.out.println("Please make next selection: ");
                iterate(getListSix());
                decision = getInput();
                exit = true;
            }
            case 7 -> {
                min = 69;
                max = 72;
                System.out.println("Please make next selection: ");
                iterate(getListSeven());
                decision = getInput();
                exit = true;
            }
            default -> System.out.println("Wrong input!");

        }
    }

    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;


        while (choice < min || choice > max) {
            try {
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > max || choice < min) {
                    System.out.println("Your input out of border.");
                    System.out.println("Please try again");
                }

            } catch (NumberFormatException ex) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    private void printHeader() {
        System.out.println("+---------------------------------------+");
        System.out.println("|             Welcome to our            |");
        System.out.println("|            Menu Application           |");
        System.out.println("+---------------------------------------+");
        System.out.println();
    }

    private static List<String> getList() {
        return List.of(
                "Please make a selection: ",
                "1: \"Basic program\"",
                "2: \"Classes\"",
                "3: \"Conditions\"",
                "4: \"Loops\"",
                "5: \"OOP\"",
                "6: \"String\"",
                "7: \"Collections\"",
                "0: Exit"
        );
    }

    private static List<String> getListOne() {
        return List.of(
                "1: \"You Can't Code Under Pressure\"",
                "2: \"Multiplying two numbers\"",
                "3: \"Volume of a Cuboid\"",
                "4: \"Number Drills: Pixelart planning\"",
                "5: \"Jenny's secret message\"",
                "6: \"Convert to Binary\"",
                "7: \"Beginner Series\"",
                "8: \"Century From Years\"",
                "9: \"Return Negative\"",
                "10: \"Age Range Compatibility Equation\"",
                "11: \"Grasshopper \""
        );
    }

    private static List<String> getListTwo() {
        return List.of(
                "12: \"Lombok Encapsulation\"",
                "13: \"Static electrickery\"",
                "14: \"Fractions class\"",
                "15: \"Simple Drawing Board\"",
                "16: \"Two fighters, one winner\"",
                "17: \"Building blocks\""
        );
    }

    private static List<String> getListTree() {
        return List.of(
                "18: \"Opposite number\"",
                "19: \"Is n divisible by x and y?\"",
                "20: \"Convert a Boolean to a String\"",
                "21: \"Do I get a bonus?\"",
                "22: \"How old will I be in 2099?\"",
                "23: \"Rock Paper Scissors!\"",
                "24: \"Basic Mathematical Operations\"",
                "25: \"Opposites Attract\"",
                "26: \"Convert boolean values to strings 'Yes' or 'No'.\"",
                "27: \"Will there be enough space?\"",
                "28: \"The Modulo-3 Sequence\"",
                "29: \"Switch it Up!\"",
                "30: \"Thinkful - Logic Drills: Traffic light\"",
                "31: \"Transportation on vacation \""
        );
    }

    private static List<String> getListFour() {
        return List.of(
                "32: \"String repeat\"",
                "33: \"Cat years, Dog years\"",
                "34: \"Get the mean of an array\"",
                "35: \"Beginner - Lost Without a Map\"",
                "36: \"Counting sheep...\"",
                "37: \"Reversed sequence \"",
                "38: \"How good are you really?\"",
                "39: \"Reduce but Grow\"",
                "40: \"Sum of positive\"",
                "41: \"My head is at the wrong end!\"",
                "42: \"Twice as old\"",
                "43: \"Find Nearest square number\"",
                "44: \"Grasshopper - Summation\"",
                "45: \"Gap in Primes\"",
                "46 \"21 Sticks\""
        );
    }

    private static List<String> getListFive() {
        return List.of(
                "47: \"Basic subclasses - Adam and Eve\"",
                "48: \"Rotations and reflections I\"",
                "49: \"L3375p34k\"",
                "50: \"TDD Area Calculations\""
        );
    }

    private static List<String> getListSix() {
        return List.of(
                "51: \"Convert a Number to a String!\"",
                "52: \"Reversed Strings\"",
                "53: \"Welcome to the City\"",
                "54: \"Opposite number\"",
                "55: \"Replace all dots\"",
                "56: \"Are You Playing Banjo?\"",
                "57: \"Remove String Spaces\"",
                "58: \"Triple Trouble\"",
                "59: \"Find the position!\"",
                "60: \"Fake Binary\"",
                "61: \"Parse nice int from char problem\"",
                "62: \"Grasshopper - Debug\"",
                "63: \"Abbreviate a Two Word Name\"",
                "64: \"All Star Code Challenge\"",
                "65: \"Sort and Star\"",
                "66: \"Correct the mistakes of the character recognition software\"",
                "67: \"altERnaTIng cAsE <=> ALTerNAtiNG CaSe\"",
                "68: \" Remover of marks (from left to right)\""
        );
    }

    private static List<String> getListSeven() {
        return List.of(
                "69: \"Push a hash/an object into array\"",
                "70: \"Unfinished Loop\"",
                "71: \"Filtering even numbers (Bug Fixes)\"",
                "72: \"Interactive Dictionary\""
        );
    }

    public void iterate(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

}