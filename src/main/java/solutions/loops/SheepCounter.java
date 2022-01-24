package solutions.loops;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class SheepCounter implements Executable {
    Boolean[] arrayOfSheeps;


    static public int Counter(Boolean[] arrayOfSheeps)
    {
        int counter=0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null) {
                if (arrayOfSheep) {
                    counter += 1;
                }

            }
        }
        return counter;
    }
    public void getData()
    {

        System.out.println("Enter array size: ");
        int arrSize= Helper.getInt(1,10000);

            this.arrayOfSheeps = new Boolean[arrSize];
            for (int i = 0; i < arrSize; i++) {
                System.out.println("Enter bool number: "+(i+1));
                this.arrayOfSheeps[i] = Helper.getBool();

        }
    }


    @Override
    public void execute() {
        getData();
        System.out.println("There are: "+Counter(this.arrayOfSheeps)+" sheep");
    }
}
