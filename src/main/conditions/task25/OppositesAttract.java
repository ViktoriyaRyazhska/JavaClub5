package main.conditions.task25;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        if(flower1 % 2 == 0 && flower2 % 2 != 0) return true;
        else return flower1 % 2 != 0 && flower2 % 2 == 0;
    }

}
