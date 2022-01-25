package main.java.com.softserve.basicprogram;

import main.java.com.softserve.ReadConsole;

import java.io.IOException;

public class BasicProgram extends ReadConsole {

    public static void main(String[] args) {

        text();
        try {
            switch (br.readLine()) {
                case "1":
                    Task1.main(args);
                    break;

                case "2":
                    Task2.main(args);
                    break;

                case "7":
                    Task7.main(args);
                    break;

                case "8":
                    Task8.main(args);
                    break;

                case "9":
                    Task9.main(args);
                    break;

                default:
                    System.err.println("You need to put number with 1 to 11");
                    BasicProgram.main(args);

            }
        } catch (IOException e) {
            e.printStackTrace();
            BasicProgram.main(args);
        }

    }

    private static void text() {
        System.out.println("Please select TASK number: ");
        System.out.println("1" + "  =>you-cant-code-under-pressure-number-1");
        System.out.println("2" + "  =>function-3-multiplying-two-numbers");
        System.out.println("3" + "  =>volume-of-a-cuboid");
        System.out.println("4" + "  =>thinkful-number-drills-pixelart-planning");
        System.out.println("5" + "  =>jennys-secret-message");
        System.out.println("6" + "  =>convert-to-binary");
        System.out.println("7" + "  =>beginner-series-number-2-clock");
        System.out.println("8" + "  =>century-from-year");
        System.out.println("9" + "  =>return-negative");
        System.out.println("10" + "  =>age-range-compatibility-equation");
        System.out.println("11" + "  =>grasshopper-debug");
    }

}
