package three;

//Task43. Find Nearest square number
public class Task43 {

    public static int nearestSq(final int n) {
        int sqUp = n;
        int sqDown = n;

        while (true) {
            if (Math.sqrt(sqUp) - Math.floor(Math.sqrt(sqUp)) == 0) {
                return sqUp;
            } else {
                sqUp++;
            }

            if (Math.sqrt(sqDown) - Math.floor(Math.sqrt(sqDown)) == 0) {
                return sqDown;
            } else {
                sqDown--;
            }
        }
    }
}