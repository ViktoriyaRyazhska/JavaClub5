package three;

import java.io.BufferedReader;

//  Task08. Century From Year
public class Task08 {
    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        }
        return number / 100 + 1;
    }

    public static void task08(BufferedReader reader) {
        System.out.println("The task is to return the century of given year.");
        try {
            System.out.println("Set the year to figure out century:");
            int number = Integer.parseInt(reader.readLine());
            System.out.println(number + "-th year is from " + century(number) + " century!");
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

/*      //Century From Year
he first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
        Task

        Given a year, return the century it is in.
        Examples

        1705 --> 18
        1900 --> 19
        1601 --> 17
        2000 --> 20
*/
