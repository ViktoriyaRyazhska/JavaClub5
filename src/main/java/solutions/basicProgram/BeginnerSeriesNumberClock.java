package solutions.basicProgram;

import program.helper.Helper;
import solutions.Executable;


public class BeginnerSeriesNumberClock implements Executable {
    int hours;
    int minutes;
    int seconds;

    int past(int h, int m, int s) {
        return ((h * 60 + m) * 60 + s) * 1000;
    }

    void readData() {
        System.out.println("Enter hours , minutes and seconds:");
        hours = Helper.getInt(0, 24);
        minutes = Helper.getInt(0, 60);
        seconds = Helper.getInt(0, 60);
    }

    @Override
    public void execute() {
        readData();
        System.out.println(past(hours, minutes, seconds));
    }
}
