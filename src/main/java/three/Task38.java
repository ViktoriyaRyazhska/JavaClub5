package three;

import java.io.BufferedReader;

public class Task38{

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for(int point : classPoints) {
            sum += point;
        }
        return sum / classPoints.length < yourPoints;
    }


    public static void task38(BufferedReader reader) {
        System.out.println("The task is to calculate the average test scores from your peers', and compare your score");
        try {
            System.out.println("Enter your peers' scores, separated by space: ");
            String[] s = reader.readLine().split("[ , ]");
            int[] p = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                p[i] = Integer.parseInt(s[i]);
            }
            System.out.println("set your average score: ");
            int p2 = Integer.parseInt(reader.readLine());

            if (betterThanAverage(p, p2)) {
                System.out.println("Congratulations! You better then average!");
            }
            System.out.println("You lower then average! Try hard in your study!");
        } catch (Exception e) {
            System.out.println("Wrong input, please ensure you enter your peers  values separate by \"space\" or \"comma\"!..");
        }
    }
}
