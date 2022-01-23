package solutions.basicProgram;

import solutions.Executable;

import java.util.Scanner;

public class CenturyToYear implements Executable {
    int year;
    public static int century(int number) {
        if(number < 0)
        {
            System.out.println("Invalid number");
            return -1;
        }
        else if(number % 100==0)
        {
            return number/100;
        }
        else
        {
            return number/100 + 1;
        }
    }

    public void getData()
    {
        System.out.print("Enter a year: ");
        this.year = new Scanner(System.in).nextInt();

    }


    @Override
    public void execute() {
        getData();
        System.out.println("It's a "+century(this.year)+" century");
    }
}
