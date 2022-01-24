package three;

// Task38. How good are you really?
public class Task38 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for(int point : classPoints) {
            sum += point;
        }
        return sum / classPoints.length < yourPoints;
    }
}