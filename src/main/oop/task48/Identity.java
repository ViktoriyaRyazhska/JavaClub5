package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class Identity {
    public static Dih4 identity(Dih4 dih4) {
        switch (dih4) {
            case IDENTITY -> {
                return IDENTITY;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case ROTATE_180 -> {
                return ROTATE_180;
            }
            case ROTATE_90_CLOCKWISE -> {
                return ROTATE_90_CLOCKWISE;
            }
            case REFLECT_VERTICAL -> {
                return REFLECT_VERTICAL;
            }
            case REFLECT_HORIZONTAL -> {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
        }
        return null;
    }
}
