package javaclub5.basicprogram.task7;

/**
 * Clock shows h hours, m minutes and s seconds after midnight.
 *
 * Your task is to write a function which returns the time since midnight in milliseconds.
 * @author Dmytro Prudius
 */
public class Runner{
    public static void main(String[] args) {
      Past(0,1,1);
    }

    public static int Past(int h, int m, int s) {
         int convertHours = h * 60 * 60 * 1000;
         int convertMinutes = m * 60 * 1000;
         int convertSeconds = s * 1000;
        return convertHours + convertMinutes + convertSeconds;
    }
}


