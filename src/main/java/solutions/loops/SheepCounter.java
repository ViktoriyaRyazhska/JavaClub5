package solutions.loops;

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
        int arrSize= new Scanner(System.in).nextInt();
        if(arrSize == 0)
        {
            throw new NegativeArraySizeException("The number must be greater than 0");
        }
        else {
            this.arrayOfSheeps = new Boolean[arrSize];
            for (int i = 0; i < arrSize; i++) {
                System.out.println("Enter bool number: "+(i+1));
                this.arrayOfSheeps[i] = new Scanner(System.in).nextBoolean();
            }
        }
    }


    @Override
    public void execute() {
        getData();
        System.out.println("There are: "+Counter(this.arrayOfSheeps)+" sheep");
    }
}
