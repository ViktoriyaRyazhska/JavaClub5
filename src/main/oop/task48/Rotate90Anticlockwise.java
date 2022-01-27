package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class Rotate90Anticlockwise {
    public static Dih4 rotate90Anticlockwise(Dih4 dih4) {
        switch (dih4) {
            case IDENTITY -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return REFLECT_VERTICAL;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return REFLECT_HORIZONTAL;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return ROTATE_180;
            }
            case ROTATE_180 -> {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_90_CLOCKWISE -> {
                return IDENTITY;
            }
            case REFLECT_VERTICAL -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_HORIZONTAL -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
        }
        return null;
    }
}
