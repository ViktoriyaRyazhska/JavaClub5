package main.loops.task34;

import main.InterfaceTestClass;

import java.util.Scanner;

public class GetAverage implements InterfaceTestClass {
    Scanner myObj = new Scanner(System.in);
    public static int getAverage(int[] marks,int size){

        int sum = 0;
        for(int i = 0;i<size;i++){
            sum+=marks[i];
        }
        return sum/size;
    }

    @Override
    public void execute() {
        System.out.println("It's the academic year's end, fateful moment of your school report. The averages must be calculated. "+"" +
                "All the students come to you and entreat you to calculate"+"" +
                " their average for them. Easy ! You just need to write a script.");

        System.out.println("Enter size: ");
        int size = myObj.nextInt();
        int[] marks = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter value: ");
            marks[i] = myObj.nextInt();
        }
        System.out.println(GetAverage.getAverage(marks,size));



    }
}
