package solutions.basicProgram;

import solutions.Executable;

import java.util.Scanner;

public class BeginnerSeriesNumberClock implements Executable {
    int hours;
    int minutes;
    int seconds;
    int past(int h, int m, int s) {
        return ((h*60+m)*60+s)*1000;
    }
    void readData() {
        System.out.println("Enter hours , minutes and seconds:");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        seconds = scanner.nextInt();
        if(hours<0||minutes<0||seconds<0){
            System.out.println("Enter variables higher than 0!");
        }

    }

    @Override
    public void execute() {
        readData();
        System.out.println(past(hours,minutes,seconds));
    }
}
