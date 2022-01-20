package javaclub5.conditions.task10;

/**
 *
 * Class created by Codewars
 */

public class Bob {

    /**
     * calculate the volume of a cuboid with three values:
     * @param cap - is the amount of people the bus can hold excluding the driver,
     * @param on -  is the number of people on the bus excluding the driver,
     * @param wait - is the number of people waiting to get on to the bus excluding the driver.
     * @return If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
     */
    public static int enough(int cap, int on, int wait){
        int amount = cap - on - wait;
        if (amount < 0) {
            return - amount;
        }
        return 0;
    }
}
